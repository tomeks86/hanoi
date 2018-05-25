package edu.tseidler.hanoi;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import static edu.tseidler.hanoi.Stick.*;

public class Hanoi {
    private EnumMap<Stick, BlockStack> board;
    private final int blocks;

    public Hanoi(int blocks) {
        this.blocks = blocks;
        this.board = new EnumMap<>(Stick.class);
        for (Stick stick : Stick.values()) {
            this.board.put(stick, new BlockStack());
        }
        for (int i = blocks; i >= 1; i--) {
            board.get(START).push(new Block(i));
        }
    }

    public List<Move> solution() {
        return moveNSticks(Stick.START, Stick.TARGET, blocks, new LinkedList<>(), move -> {});
    }

    public List<Move> solve() {
        return moveNSticks(START, TARGET, blocks, new LinkedList<>(), this::applyMoveAndShow);
    }

    private void applyMoveAndShow(Move m) {
        System.out.println(m);
        applyMoveToBoard(m);
        System.out.println(this);
    }

    private Move moveOneBlock(Stick from, Stick to) {
        return new Move(from, to);
    }

    public void applyMoveToBoard(Move move) {
        board.get(move.getTo()).push(board.get(move.getFrom()).pop());
    }

    private List<Move> moveNSticks(Stick from, Stick to, int n, List<Move> moves, Consumer<Move> makeMove) {
        if (n == 1) {
            Move m = moveOneBlock(from, to);
            moves.add(m);
            makeMove.accept(moveOneBlock(from, to));
            return moves;
        }
        Stick temp = Stick.temp(from, to);
        moveNSticks(from, temp, n - 1, moves, makeMove);
        Move m = moveOneBlock(from, to);
        moves.add(m);
        makeMove.accept(m);
        moveNSticks(temp, to, n - 1, moves, makeMove);
        return moves;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Stick stick : Stick.values()) {
            sb.append((stick.ordinal() + 1) + ": ")
                    .append(board.get(stick))
                    .append("\n");
        }
        return sb.toString();
    }
}
