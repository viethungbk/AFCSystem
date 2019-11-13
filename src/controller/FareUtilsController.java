package controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import config.AfcConfig;
import config.BarcodeType;
import config.FareType;
import entity.Fare;
import utils.FileReader;

public class FareUtilsController {
	private ArrayList<String> listBarcodes;
	private HashMap<String, Fare> listFaresMap;
	
	public FareUtilsController() throws FileNotFoundException {
		listBarcodes = readListBarcodes(AfcConfig.FILE_BARCODE_PATH);
	}
	
	public BarcodeType checkBarcodeType(String barcode) {
		return BarcodeType.TICKET;
	}

	public FareType checkFareType(String barcode) {
		return FareType.ONEWAY_TICKET;
	}
	
	private ArrayList<String> readListBarcodes(String filePath) throws FileNotFoundException {
		ArrayList<String> listBarcodes = FileReader.readFile(filePath);
		return listBarcodes;
	}
}
