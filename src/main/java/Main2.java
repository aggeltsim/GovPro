import java.math.BigDecimal;

import incomes.*;




public class Main2 {
    public static void main(String[] args) {
    


     Object[][] data = {
            {"Code", "Name", "Amount"}, //0
            {"11","Taxes", new BigDecimal("62055000000")}, //1
            {"111","Taxes on Services and Products", new BigDecimal("33667000000")},
            {"112","Taxes and Duties on Imports", new BigDecimal("362000000")},
            {"113","Regular Property Taxes", new BigDecimal("2353000000")},
            {"114","Other Production Taxes", new BigDecimal("355000000")},
            {"115","Income Tax", new BigDecimal("23719000000")},
            {"116","Capital Taxes", new BigDecimal("232000000")},
            {"119","Other Current Taxes", new BigDecimal("1367000000")},
            {"12","Social Contributions", new BigDecimal("60000000")},
            {"122","Other Social Contributions", new BigDecimal("60000000")},
            {"13","Transfers", new BigDecimal("8131000000")},
            {"131","Current Domestic Transfers", new BigDecimal("322000000")},
            {"132","Current Transfers from Organizations and Member States", new BigDecimal("15000000")},
            {"133","Current Transfers from Foreign Entities", new BigDecimal("8000000")},
            {"134","Domestic Investment Grants", new BigDecimal("35000000")},
            {"135","Investment Grants from the EU", new BigDecimal("7645000000")},
            {"139","Other Capital Transfers", new BigDecimal("106000000")},
            {"14","Sales of Goods and Services", new BigDecimal("2405000000")},
            {"141","Goods Sales", new BigDecimal("2000000")},
            {"142","Provision of Services", new BigDecimal("338000000")},
            {"143","Rents", new BigDecimal("1418000000")},
            {"144","Supplies", new BigDecimal("445000000")},
            {"145","Administrative Fees", new BigDecimal("199000000")},
            {"149","Other Sales", new BigDecimal("3000000")},
            {"15","Other Current Income", new BigDecimal("2775000000")},
            {"151","Interest Income", new BigDecimal("588000000")},
            {"152","Distributed Corporate Income", new BigDecimal("356000000")},
            {"153","Natural Resource Rents", new BigDecimal("75000000")},
            {"156","Fines, Penalties and Assessments", new BigDecimal("1102000000")},
            {"159","Expense Reimbursements", new BigDecimal("654000000")},
            {"31","Fixed Assets", new BigDecimal("37000000")},
            {"311","Buildings and Related Infrastructure", new BigDecimal("37000000")},
            {"43","Debt Securities", new BigDecimal("11000000")},
            {"432","Long-term Debt Securities", new BigDecimal("11000000")},
            {"44","Loans", new BigDecimal("20000000")},
            {"442","Long-term Loans", new BigDecimal("20000000")},
            {"45","Equity and Investment Fund Shares", new BigDecimal("467000000")},
            {"451","Listed Shares", new BigDecimal("239000000")},
            {"452","Unlisted Shares", new BigDecimal("228000000")},
            {"52","Currency and Deposit Liabilities", new BigDecimal("66000000")},
            {"521","Currency in Circulation Liabilities", new BigDecimal("66000000")},
            {"53","Debt Securities (Liabilities)", new BigDecimal("25973000000")},
            {"531","Short-term Debt Securities", new BigDecimal("17000000000")},
            {"532","Long-term Debt Securities", new BigDecimal("8973000000")},
            {"54","Loans", new BigDecimal("1202027000000")},
            {"541","Short-term Loans", new BigDecimal("1200000000000")},
            {"542","Long-term Loans", new BigDecimal("2027000000")},
            {"57","Financial Derivatives", new BigDecimal("800000000")},
            {"571","Financial Derivatives", new BigDecimal("800000000")},
            {"21","Employee Benefits", new BigDecimal("14889199000")},
            {"22","Social Benefits", new BigDecimal("425136000")},
            {"23","Transfers", new BigDecimal("34741365000")},
            {"24","Purchases of Goods and Services", new BigDecimal("2039542000")},
            {"25","Subsidies", new BigDecimal("80630000")},
            {"26","Interest", new BigDecimal("7701101000")},
            {"27","Other Expenses", new BigDecimal("101553000")},
            {"29","Credits Under Allocation", new BigDecimal("17283053000")},
            {"31","Fixed Assets", new BigDecimal("2609600000")},
            {"33","Valuables", new BigDecimal("85000")},
            {"44","Loans", new BigDecimal("3741000000")},
            {"45","Equity and Investment Fund Shares", new BigDecimal("1755112000")},
            {"53","Debt Securities (Liabilities)", new BigDecimal("19375000000")},
            {"54","Loans", new BigDecimal("1203165130000")},
            {"1001","Presidency of the Republic", new BigDecimal("4638000")},
            {"1003","Hellenic Parliament", new BigDecimal("171950000")},
            {"1004","Presidency of the Government", new BigDecimal("41689000")},
            {"1007","Ministry of Interior", new BigDecimal("3830276000")},
            {"1009","Ministry of Foreign Affairs", new BigDecimal("420237000")},
            {"1011","Ministry of National Defense", new BigDecimal("6130000000")},
            {"1015","Ministry of Health", new BigDecimal("7177424000")},
            {"1017","Ministry of Justice", new BigDecimal("650803000")},
            {"1020","Ministry of Education, Religious Affairs and", new BigDecimal("6606000000")},
            {"1022","Ministry of Culture", new BigDecimal("575419000")},
            {"1024","Ministry of National Economy and", new BigDecimal("1246518464000")},
            {"1029","Ministry of Rural Development and Food", new BigDecimal("1281403000")},
            {"1031","Ministry of Environment and Energy", new BigDecimal("2341227000")},
            {"1032","Ministry of Labor and Social Security", new BigDecimal("18678084000")},
            {"1034","Ministry of Social Cohesion and", new BigDecimal("3989553000")},
            {"1036","Ministry of Development", new BigDecimal("818045000")},
            {"1039","Ministry of Infrastructure and Transport", new BigDecimal("2694810000")},
            {"1041","Ministry of Shipping and Island Policy", new BigDecimal("651864000")},
            {"1045","Ministry of Tourism", new BigDecimal("189293000")},
            {"1053","Ministry of Digital Governance", new BigDecimal("1073928000")},
            {"1055","Ministry of Migration and Asylum", new BigDecimal("475871000")},
            {"1057","Ministry of Citizen Protection", new BigDecimal("2285820000")},
            {"1060","Ministry of Climate Crisis and Civil Protection", new BigDecimal("1221116000")},
            {"1901","Decentralized Administration of Attica", new BigDecimal("13091000")},
            {"1902","Decentralized Administration of Thessaly - Central Greece", new BigDecimal("10579000")},
            {"1903","Decentralized Administration of Epirus - Western Greece", new BigDecimal("9943000")},
            {"1904","Decentralized Administration of Peloponnese -", new BigDecimal("14918000")},
            {"1905","Decentralized Administration of the Aegean", new BigDecimal("6188000")},
            {"1906","Decentralized Administration of Crete", new BigDecimal("6497000")},
            {"1907","Decentralized Administration of Macedonia - Thrace", new BigDecimal("18376000")}
        };
    TaxGoodsServices taxGoodsServices = new TaxGoodsServices(
        (String) data[2][0],      // Κωδικός
        (String) data[2][1],      // Ονομασία
        (BigDecimal) data[2][2],  // Ποσό
        "2025");                   //έτος //Taxes on Goods and Services

                        

    var tDuties = new TaxDutiesOnImports(
        (String) data[3][0],      // Κωδικός
        (String) data[3][1],      // Ονομασία
        (BigDecimal) data[3][2],  // Ποσό
        "2025"); //Έτος      //Taxes and duties on imports
    var tRegular = new TaxRegularRealEstate(
        (String) data[4][0],     // Κωδικός
        (String) data[4][1],      // Ονομασία
        (BigDecimal) data[4][2],  // Ποσό
        "2025" );//Έτος       //Property taxes
    var tProduction = new TaxProduction(
        (String) data[5][0],      // Κωδικός
        (String) data[5][1],      // Ονομασία
        (BigDecimal) data[5][2],  // Ποσό
        "2025");                 //Έτος     //Other taxes on production
    var tIncome = new TaxIncome(
        (String) data[6][0],      // Κωδικός
        (String) data[6][1],      // Ονομασία
        (BigDecimal) data[6][2],  // Ποσό
        "2025"); //Έτος      //Income taxes
    var tCapital = new TaxCapital((String) data[7][0],      // Κωδικός
        (String) data[7][1],      // Ονομασία
        (BigDecimal) data[7][2],  // Ποσό
        "2025");  //Capital taxes
    var tOther = new TaxOther((String) data[8][0],      // Κωδικός
        (String) data[8][1],      // Ονομασία
        (BigDecimal) data[8][2],  // Ποσό
        "2025");  //Other current taxes
     //Make objects of Sales
    var sGoods = new SalGoods(
        (String) data[19][0], // "141"
        (String) data[19][1],
        (BigDecimal) data[19][2],
        "2025");
    var sServices = new SalServices(
        (String) data[20][0], // "142"
        (String) data[20][1],
        (BigDecimal) data[20][2],
        "2025");
    var sRents = new SalRents(
        (String) data[21][0], // "143"
        (String) data[21][1],
        (BigDecimal) data[21][2],
        "2025");
    var sCommissions = new SalCommissions(
        (String) data[22][0], // "144"
        (String) data[22][1],
        (BigDecimal) data[22][2],
        "2025");
    var sAdmin = new SalAdministFees(
        (String) data[23][0], // "145"
        (String) data[23][1],
        (BigDecimal) data[23][2],
        "2025");
    var sOther = new SalOther(
        (String) data[24][0], // "149"
        (String) data[24][1],
        (BigDecimal) data[24][2],
        "2025");
    //Make objects of Other Current Incone
    var oInterest = new OciInterest(
        (String) data[26][0], // "151"
        (String) data[26][1],
        (BigDecimal) data[26][2],
        "2025");
    var oCorpInc = new OciCorporateDistribInc(
        (String) data[27][0], // "152"
        (String) data[27][1],
        (BigDecimal) data[27][2],
        "2025");
    var oNatRent = new OciNaturalResourceRent(
        (String) data[28][0], // "153"
        (String) data[28][1],
        (BigDecimal) data[28][2],
        "2025");
    var oFines = new OciFinesPenaltiesAssessments(
        (String) data[29][0], // "156"
        (String) data[29][1],
        (BigDecimal) data[29][2],
        "2025");
    var oReimb = new OciReimbursements(
        (String) data[30][0], // "159"
        (String) data[30][1],
        (BigDecimal) data[30][2],
        "2025");
    //Make object of social contributions
    var socContr = new ScOther(
        (String) data[10][0], 
        (String) data[10][1],
        (BigDecimal) data[10][2],
        "2025");

   System.out.println(socContr.toExplain());
    



 }


}
    




    
