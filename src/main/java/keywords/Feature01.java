package keywords;

import edu.wofford.*;

public class Feature01 {
	private ArgumentParser argCheck;

	public void startProgramWithArguments(String[] args) {
			argCheck = new ArgumentParser("VolumeCalculator", "Calculate the volume of a box.");
			argCheck.addArg("length", "the length of the box");
			argCheck.addArg("width", "the width of the box");
			argCheck.addArg("height", "the height of the box");
			argCheck.parse(args);
	}

	public String getLength() {
			return argCheck.getArgValue("length");
	}

	public String getWidth() {
		return argCheck.getArgValue("width");
	}

	public String getHeight() {
		return argCheck.getArgValue("height");
	}

	public String getProgramOutput() {
		int l = Integer.valueOf(argCheck.getArgValue("length"));
		int w = Integer.valueOf(argCheck.getArgValue("width"));
		int h = Integer.valueOf(argCheck.getArgValue("height"));
		int volume = l * w * h;
		return Integer.toString(volume);
	}

	public void startAbsurdProgramWithArguments(String[] args) {

	}

	public String getPet() {
		return "dog";
	}

	public String getNumber() {
		return "2";
	}

	public String getRainy() {
		return "true";
	}

	public String getBathrooms() {
		return "3.5";
	}
}
