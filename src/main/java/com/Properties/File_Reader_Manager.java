package com.Properties;

public class File_Reader_Manager {

	private File_Reader_Manager() {
	}

	public Configuration_Reader getCR() throws Throwable {

		Configuration_Reader CFR = new Configuration_Reader();
		return CFR;
	}

	public static File_Reader_Manager getFRM() {

		File_Reader_Manager FRM = new File_Reader_Manager();
		return FRM;
	}

}
