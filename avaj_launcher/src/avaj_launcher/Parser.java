package avaj_launcher;

public class Parser {
	
	public static final String[] sAircrafts = {"Baloon", "Helicopter", "JetPlane" };
	
	public int verifFirstLine(String sLine) throws MyExceptions {
		try {
			int cycle = Integer.parseInt(sLine);
			return cycle;
		}
		catch (Exception e) {
			throw new MyExceptions("\n=> Error : first line not an integer");
		}
	}
	
	public boolean regex(String sLine) {
		String reg = "^[A-Z][a-zA-Z]+[ ][A-Z][0-9]+[ ][0-9]{1,3}[ ][0-9]{1,3}[ ][0-9]{1,3}$";
		 return (sLine.matches(reg));
	}
	
	public boolean parserVerifTypes(String sTypes) {
		int i = 0;
		while (i < sAircrafts.length)
		{
			if (	sTypes.equals(sAircrafts[i]) == true)
				return true;
			i++;
		}
		return false;
	}
	
	public boolean parserVerifID(String sID, String sTypes) {
		if (sID.charAt(0) == sTypes.charAt(0))
			return true;
		return false;
	}
}
