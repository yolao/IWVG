package ticTacToe.v390.views;

import ticTacToe.v390.models.Coordinate;
import ticTacToe.v390.utils.IO;
import ticTacToe.v390.utils.LimitedIntDialog;

class CoordinateView {
	
	private String title;
	
	private Coordinate coordinate;
	
	private IO io;
	
	CoordinateView(String title, Coordinate coordinate) {
		assert title != null;
		assert coordinate != null;
		this.title = title;
		this.coordinate = coordinate;
	}

	void read() {
		io.writeln(title + " qué casilla?");
		coordinate.setRow(new LimitedIntDialog("Fila?", Coordinate.DIMENSION)
				.read() - 1);
		coordinate.setColumn(new LimitedIntDialog("Columna?",
				Coordinate.DIMENSION).read() - 1);
	}
	
	void write() {
		io.write(
				title + "[" + (coordinate.getRow() + 1) + ", "
						+ (coordinate.getColumn() + 1) + "]");

	}
}
