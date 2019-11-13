package boundary;

import controller.AfcController;

public class ScreenInterface {
	private AfcController afcController;

	public ScreenInterface() {
		afcController = new AfcController();
	}

	public void displayListProcedures() {

	}

	public void displayListStations() {

	}

	public void displayListFares() {

	}

	public int getInputProcedure() {
		return 0;
	}

	public int getInputStation() {
		return 0;
	}

	public String getInputBarcode() {
		return "";
	}

	public void getInput() {
		int procedure = getInputProcedure();
		int stationId = getInputStation();
		String barcode = getInputBarcode();

		switch (procedure) {
		case 1:
			afcController.processCheckIn(stationId, barcode);
			break;
		case 2:
			afcController.processCheckOut(stationId, barcode);
			break;

		default:
			break;
		}
	}
}
