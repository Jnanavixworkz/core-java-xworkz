class IndianRupeeTester{
   
   public static void main(String args[]){
   IndianRupee indianRupee = new IndianRupee();
   
   
   indianRupee.setRupeeId(10);
   indianRupee.setRupeeName("five hundred rupees");
   indianRupee.setPrintDate(2020);
   indianRupee.setColor("Green");
   indianRupee.setSerialNo("9GB860344");
   indianRupee.setNoOfLanguages(15);
   indianRupee.setBackSidePlaceName("HAMPI");
   indianRupee.setLocation("Reserve bank of india");
   
   
   System.out.println(indianRupee.getRupeeId() + " " + indianRupee.getRupeeName() + " " + indianRupee.getPrintDate() + " " + indianRupee.getColor() + " " +
   indianRupee.getSerialNo() + " " + indianRupee.getNoOfLanguages() + " " + indianRupee.getBackSidePlaceName() + " " + indianRupee.getLocation());
   
   }
   }
   