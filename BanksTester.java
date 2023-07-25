class BanksTester{
    
	public static void main(String args[]){
	Banks banks = new Banks();
	
	banks.setBankId(1);
	banks.setBankName("Canara");
	banks.setBranch("Mandya");
	banks.setBranchCode(1603);
	banks.setAdress("Mandya");
	banks.setHelplineNo(8012345l);
	banks.setBranchManager("Keerthana");
	banks.setIfscCode("CYNB0001603");
	banks.setNoOfLockers(30);
	banks.setNoOfEmployees(300);
	banks.setTimings("9AM TO 5PM");
	banks.setWebSiteDetails("www.canarabank.com");
	
	System.out.println(banks.getBankId() + " " + banks.getBankName() + " " + banks.getBranch() + " " + banks.getBranchCode() + " " + banks.getAdress() + " " + banks.getHelplineNo() + " " + banks.getHelplineNo() + " " + banks.getBranchManager() + " " + banks.getIfscCode() + " " + banks.getNoOfLockers() + " " + banks.getNoOfEmployees() + " " +    
	banks.getTimings() + " " + banks.getWebSiteDetails());
	
	}
	}