package day17;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] chessPieces = new ChessPiece[8][8];

        //1
        setChessLine(1, chessPieces,
                ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY
        );

        //2
        setChessLine(2, chessPieces,
                ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK
        );

        //3
        setChessLine(3, chessPieces,
                ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY
        );

        //4!
        setChessLine(4, chessPieces,
                ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY
        );

        //5!
        setChessLine(5, chessPieces,
                ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY
        );

        //6!
        setChessLine(6, chessPieces,
                ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY
        );

        //7
        setChessLine(7, chessPieces,
                ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE
        );

        //8
        setChessLine(8, chessPieces,
                ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY
        );

        ChessBoard chessBoard = new ChessBoard(chessPieces);
        chessBoard.print();
    }

    private static void setChessLine(int line, ChessPiece[][] chessPieces, ChessPiece c1, ChessPiece c2, ChessPiece c3,
                                     ChessPiece c4, ChessPiece c5, ChessPiece c6, ChessPiece c7, ChessPiece c8) {
        chessPieces[line-1][0] = c1;
        chessPieces[line-1][1] = c2;
        chessPieces[line-1][2] = c3;
        chessPieces[line-1][3] = c4;
        chessPieces[line-1][4] = c5;
        chessPieces[line-1][5] = c6;
        chessPieces[line-1][6] = c7;
        chessPieces[line-1][7] = c8;
    }
}
