import java.math.BigDecimal;

import expenses.AllocatedFunds;
import incomes.*;
import expenses.*;
import entities.*;


public class CsvTableLoader {
     Object[][] data = {
            {"Code", "Name", "Amount"}, //0
            {"11","Taxes", new BigDecimal("62055000000")}, //1
            {"111","Taxes on Services and Products", new BigDecimal("33667000000")},//2
            {"112","Taxes and Duties on Imports", new BigDecimal("362000000")}, //3
            {"113","Regular Property Taxes", new BigDecimal("2353000000")}, //4
            {"114","Other Production Taxes", new BigDecimal("355000000")}, //5
            {"115","Income Tax", new BigDecimal("23719000000")}, //6
            {"116","Capital Taxes", new BigDecimal("232000000")}, //7
            {"119","Other Current Taxes", new BigDecimal("1367000000")},//8
            {"12","Social Contributions", new BigDecimal("60000000")}, //9
            {"122","Other Social Contributions", new BigDecimal("60000000")}, //10
            {"13","Transfers", new BigDecimal("8131000000")}, //11
            {"131","Current Domestic Transfers", new BigDecimal("322000000")}, //12
            {"132","Current Transfers from Organizations and Member States", new BigDecimal("15000000")},//13
            {"133","Current Transfers from Foreign Entities", new BigDecimal("8000000")}, //14
            {"134","Domestic Investment Grants", new BigDecimal("35000000")}, //15
            {"135","Investment Grants from the EU", new BigDecimal("7645000000")}, //16
            {"139","Other Capital Transfers", new BigDecimal("106000000")}, //17
            {"14","Sales of Goods and Services", new BigDecimal("2405000000")}, //18
            {"141","Goods Sales", new BigDecimal("2000000")}, //19
            {"142","Provision of Services", new BigDecimal("338000000")}, //20
            {"143","Rents", new BigDecimal("1418000000")},//21 !!!!!
            {"144","Supplies", new BigDecimal("445000000")}, //21
            {"145","Administrative Fees", new BigDecimal("199000000")}, //22
            {"149","Other Sales", new BigDecimal("3000000")}, //23
            {"15","Other Current Income", new BigDecimal("2775000000")}, //24
            {"151","Interest Income", new BigDecimal("588000000")}, //25
            {"152","Distributed Corporate Income", new BigDecimal("356000000")}, //26
            {"153","Natural Resource Rents", new BigDecimal("75000000")}, //27
            {"156","Fines, Penalties and Assessments", new BigDecimal("1102000000")}, //28
            {"159","Expense Reimbursements", new BigDecimal("654000000")},//29
            {"31","Fixed Assets", new BigDecimal("37000000")}, //30
            {"311","Buildings and Related Infrastructure", new BigDecimal("37000000")}, //31
            {"43","Debt Securities", new BigDecimal("11000000")}, //32
            {"432","Long-term Debt Securities", new BigDecimal("11000000")}, //33
            {"44","Loans", new BigDecimal("20000000")}, //34
            {"442","Long-term Loans", new BigDecimal("20000000")}, //35
            {"45","Equity and Investment Fund Shares", new BigDecimal("467000000")}, //36
            {"451","Listed Shares", new BigDecimal("239000000")}, //37
            {"452","Unlisted Shares", new BigDecimal("228000000")}, //38
            {"52","Currency and Deposit Liabilities", new BigDecimal("66000000")}, //39
            {"521","Currency in Circulation Liabilities", new BigDecimal("66000000")}, //40
            {"53","Debt Securities (Liabilities)", new BigDecimal("25973000000")}, //41
            {"531","Short-term Debt Securities", new BigDecimal("17000000000")}, //42
            {"532","Long-term Debt Securities", new BigDecimal("8973000000")}, //43
            {"54","Loans", new BigDecimal("1202027000000")}, //44
            {"541","Short-term Loans", new BigDecimal("1200000000000")}, //45
            {"542","Long-term Loans", new BigDecimal("2027000000")}, //46
            {"57","Financial Derivatives", new BigDecimal("800000000")}, //47
            {"571","Financial Derivatives", new BigDecimal("800000000")}, //48
            {"21","Employee Benefits", new BigDecimal("14889199000")}, //49
            {"22","Social Benefits", new BigDecimal("425136000")}, //50
            {"23","Transfers", new BigDecimal("34741365000")}, //51
            {"24","Purchases of Goods and Services", new BigDecimal("2039542000")}, //52
            {"25","Subsidies", new BigDecimal("80630000")}, //53
            {"26","Interest", new BigDecimal("7701101000")}, //54
            {"27","Other Expenses", new BigDecimal("101553000")}, //55
            {"29","Credits Under Allocation", new BigDecimal("17283053000")}, //56
            {"31","Fixed Assets", new BigDecimal("2609600000")}, //57
            {"33","Valuables", new BigDecimal("85000")}, //58
            {"44","Loans", new BigDecimal("3741000000")}, //59
            {"45","Equity and Investment Fund Shares", new BigDecimal("1755112000")}, //60
            {"53","Debt Securities (Liabilities)", new BigDecimal("19375000000")}, //61
            {"54","Loans", new BigDecimal("1203165130000")}, //62
            {"1001","Presidency of the Republic", new BigDecimal("4638000")}, //63
            {"1003","Hellenic Parliament", new BigDecimal("171950000")}, //64
            {"1004","Presidency of the Government", new BigDecimal("41689000")}, //65
            {"1007","Ministry of Interior", new BigDecimal("3830276000")}, //66
            {"1009","Ministry of Foreign Affairs", new BigDecimal("420237000")}, //67
            {"1011","Ministry of National Defense", new BigDecimal("6130000000")}, //68
            {"1015","Ministry of Health", new BigDecimal("7177424000")}, //69
            {"1017","Ministry of Justice", new BigDecimal("650803000")}, //70
            {"1020","Ministry of Education, Religious Affairs and", new BigDecimal("6606000000")}, //71
            {"1022","Ministry of Culture", new BigDecimal("575419000")}, //72
            {"1024","Ministry of National Economy and", new BigDecimal("1246518464000")}, //73
            {"1029","Ministry of Rural Development and Food", new BigDecimal("1281403000")}, //74
            {"1031","Ministry of Environment and Energy", new BigDecimal("2341227000")}, //75
            {"1032","Ministry of Labor and Social Security", new BigDecimal("18678084000")}, //76
            {"1034","Ministry of Social Cohesion and", new BigDecimal("3989553000")}, //77
            {"1036","Ministry of Development", new BigDecimal("818045000")}, //78
            {"1039","Ministry of Infrastructure and Transport", new BigDecimal("2694810000")}, //79
            {"1041","Ministry of Shipping and Island Policy", new BigDecimal("651864000")}, //80
            {"1045","Ministry of Tourism", new BigDecimal("189293000")}, //81
            {"1053","Ministry of Digital Governance", new BigDecimal("1073928000")}, //82
            {"1055","Ministry of Migration and Asylum", new BigDecimal("475871000")}, //83
            {"1057","Ministry of Citizen Protection", new BigDecimal("2285820000")}, //84
            {"1060","Ministry of Climate Crisis and Civil Protection", new BigDecimal("1221116000")}, //85
            {"1901","Decentralized Administration of Attica", new BigDecimal("13091000")}, //86
            {"1902","Decentralized Administration of Thessaly - Central Greece", new BigDecimal("10579000")}, //87
            {"1903","Decentralized Administration of Epirus - Western Greece", new BigDecimal("9943000")}, //88
            {"1904","Decentralized Administration of Peloponnese -", new BigDecimal("14918000")}, //89
            {"1905","Decentralized Administration of the Aegean", new BigDecimal("6188000")}, //90
            {"1906","Decentralized Administration of Crete", new BigDecimal("6497000")}, //91
            {"1907","Decentralized Administration of Macedonia - Thrace", new BigDecimal("18376000")} //92
        };
    //Make objects of Taxes

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
    var trCurrent = new TrCurrentDomestic(
        (String) data[12][0], // "131"
        (String) data[12][1],
        (BigDecimal) data[12][2],
        "2025");

    var trEU = new TrEU(
        (String) data[13][0], // "132"
        (String) data[13][1],
        (BigDecimal) data[13][2],
        "2025");

    var trForeign = new TrForeignEntities(
        (String) data[14][0], // "133"
        (String) data[14][1],
        (BigDecimal) data[14][2],
        "2025");

    var trDomInvest = new TrDomesInvestGrants(
        (String) data[15][0], // "134"
        (String) data[15][1],
        (BigDecimal) data[15][2],
        "2025");

    var trEUInvest = new TrEUInvestGrants(
        (String) data[16][0], // "135"
        (String) data[16][1],
        (BigDecimal) data[16][2],
        "2025");

    var trOther = new TrOther(
        (String) data[17][0], // "139"
        (String) data[17][1],
        (BigDecimal) data[17][2],
        "2025");

    



}