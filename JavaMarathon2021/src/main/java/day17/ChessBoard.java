package day17;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print() {
        for (ChessPiece[] chessP : chessPieces) {
            for (ChessPiece chess : chessP) {
                System.out.print(chess.getDesc());
            }
            System.out.print("\n");
        }
    }
}
