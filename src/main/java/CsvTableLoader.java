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
            {"144","Supplies", new BigDecimal("445000000")}, //22
            {"145","Administrative Fees", new BigDecimal("199000000")}, //23
            {"149","Other Sales", new BigDecimal("3000000")}, //24
            {"15","Other Current Income", new BigDecimal("2775000000")}, //25
            {"151","Interest Income", new BigDecimal("588000000")}, //26
            {"152","Distributed Corporate Income", new BigDecimal("356000000")}, //27
            {"153","Natural Resource Rents", new BigDecimal("75000000")}, //28
            {"156","Fines, Penalties and Assessments", new BigDecimal("1102000000")}, //29
            {"159","Expense Reimbursements", new BigDecimal("654000000")},//30
            {"31","Fixed Assets", new BigDecimal("37000000")}, //31
            {"311","Buildings and Related Infrastructure", new BigDecimal("37000000")}, //32
            {"43","Debt Securities", new BigDecimal("11000000")}, //33
            {"432","Long-term Debt Securities", new BigDecimal("11000000")}, //34
            {"44","Loans", new BigDecimal("20000000")}, //35
            {"442","Long-term Loans", new BigDecimal("20000000")}, //36
            {"45","Equity and Investment Fund Shares", new BigDecimal("467000000")}, //37
            {"451","Listed Shares", new BigDecimal("239000000")}, //38
            {"452","Unlisted Shares", new BigDecimal("228000000")}, //39
            {"52","Currency and Deposit Liabilities", new BigDecimal("66000000")}, //40
            {"521","Currency in Circulation Liabilities", new BigDecimal("66000000")}, //41
            {"53","Debt Securities (Liabilities)", new BigDecimal("25973000000")}, //42
            {"531","Short-term Debt Securities", new BigDecimal("17000000000")}, //43
            {"532","Long-term Debt Securities", new BigDecimal("8973000000")}, //44
            {"54","Loans", new BigDecimal("1202027000000")}, //45
            {"541","Short-term Loans", new BigDecimal("1200000000000")}, //46
            {"542","Long-term Loans", new BigDecimal("2027000000")}, //47
            {"57","Financial Derivatives", new BigDecimal("800000000")}, //48
            {"571","Financial Derivatives", new BigDecimal("800000000")}, //49
            {"21","Employee Benefits", new BigDecimal("14889199000")}, //50
            {"22","Social Benefits", new BigDecimal("425136000")}, //51
            {"23","Transfers", new BigDecimal("34741365000")}, //52
            {"24","Purchases of Goods and Services", new BigDecimal("2039542000")}, //53
            {"25","Subsidies", new BigDecimal("80630000")}, //54
            {"26","Interest", new BigDecimal("7701101000")}, //55
            {"27","Other Expenses", new BigDecimal("101553000")}, //56
            {"29","Credits Under Allocation", new BigDecimal("17283053000")}, //57
            {"31","Fixed Assets", new BigDecimal("2609600000")}, //58
            {"33","Valuables", new BigDecimal("85000")}, //59
            {"44","Loans", new BigDecimal("3741000000")}, //60
            {"45","Equity and Investment Fund Shares", new BigDecimal("1755112000")}, //61
            {"53","Debt Securities (Liabilities)", new BigDecimal("19375000000")}, //62
            {"54","Loans", new BigDecimal("1203165130000")}, //63
            {"1001","Presidency of the Republic", new BigDecimal("4638000")}, //64!! !!start from 64
            {"1003","Hellenic Parliament", new BigDecimal("171950000")}, //65
            {"1004","Presidency of the Government", new BigDecimal("41689000")}, //66
            {"1007","Ministry of Interior", new BigDecimal("3830276000")}, //67
            {"1009","Ministry of Foreign Affairs", new BigDecimal("420237000")}, //68
            {"1011","Ministry of National Defense", new BigDecimal("6130000000")}, //69
            {"1015","Ministry of Health", new BigDecimal("7177424000")}, //70
            {"1017","Ministry of Justice", new BigDecimal("650803000")}, //71
            {"1020","Ministry of Education, Religious Affairs and", new BigDecimal("6606000000")}, //72
            {"1022","Ministry of Culture", new BigDecimal("575419000")}, //73
            {"1024","Ministry of National Economy and", new BigDecimal("1246518464000")}, //74
            {"1029","Ministry of Rural Development and Food", new BigDecimal("1281403000")}, //75
            {"1031","Ministry of Environment and Energy", new BigDecimal("2341227000")}, //76
            {"1032","Ministry of Labor and Social Security", new BigDecimal("18678084000")}, //77
            {"1034","Ministry of Social Cohesion and", new BigDecimal("3989553000")}, //78
            {"1036","Ministry of Development", new BigDecimal("818045000")}, //79
            {"1039","Ministry of Infrastructure and Transport", new BigDecimal("2694810000")}, //80
            {"1041","Ministry of Shipping and Island Policy", new BigDecimal("651864000")}, //81
            {"1045","Ministry of Tourism", new BigDecimal("189293000")}, //82
            {"1053","Ministry of Digital Governance", new BigDecimal("1073928000")}, //83
            {"1055","Ministry of Migration and Asylum", new BigDecimal("475871000")}, //84
            {"1057","Ministry of Citizen Protection", new BigDecimal("2285820000")}, //85
            {"1060","Ministry of Climate Crisis and Civil Protection", new BigDecimal("1221116000")}, //86
            {"1901","Decentralized Administration of Attica", new BigDecimal("13091000")}, //87
            {"1902","Decentralized Administration of Thessaly - Central Greece", new BigDecimal("10579000")}, //88
            {"1903","Decentralized Administration of Epirus - Western Greece", new BigDecimal("9943000")}, //89
            {"1904","Decentralized Administration of Peloponnese -", new BigDecimal("14918000")}, //90
            {"1905","Decentralized Administration of the Aegean", new BigDecimal("6188000")}, //91
            {"1906","Decentralized Administration of Crete", new BigDecimal("6497000")}, //92
            {"1907","Decentralized Administration of Macedonia - Thrace", new BigDecimal("18376000")} //93
        };
    //Make objects of Incomes
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
    var tCapital = new TaxCapital(
        (String) data[7][0],      // Κωδικός
        (String) data[7][1],      // Ονομασία
        (BigDecimal) data[7][2],  // Ποσό
        "2025");  //Capital taxes
    var tOther = new TaxOther(
        (String) data[8][0],      // Κωδικός
        (String) data[8][1],      // Ονομασία
        (BigDecimal) data[8][2],  // Ποσό
        "2025");  //Other current taxes
    //Make objects of Transfers
    var trCurrent = new TrCurrentDomestic(
        (String) data[12][0], 
        (String) data[12][1],
        (BigDecimal) data[12][2],
        "2025");
    var trEU = new TrEU(
        (String) data[13][0], 
        (String) data[13][1],
        (BigDecimal) data[13][2],
        "2025");
    var trForeign = new TrForeignEntities(
        (String) data[14][0], 
        (String) data[14][1],
        (BigDecimal) data[14][2],
        "2025");
    var trDomInvest = new TrDomesInvestGrants(
        (String) data[15][0], 
        (String) data[15][1],
        (BigDecimal) data[15][2],
        "2025");
    var trEUInvest = new TrEUInvestGrants(
        (String) data[16][0], 
        (String) data[16][1],
        (BigDecimal) data[16][2],
        "2025");
    var trOther = new TrOther(
        (String) data[17][0], 
        (String) data[17][1],
        (BigDecimal) data[17][2],
        "2025");
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
    //Make Object for Fixed Assets
    var faBuildings = new FaBuildings(
        (String) data[32][0], // "159"
        (String) data[32][1],
        (BigDecimal) data[32][2],
        "2025");
    //Make object for Dept Securities
    var dsLongTerm = new DslLongTerm(
        (String) data[34][0], 
        (String) data[34][1],
        (BigDecimal) data[34][2],
        "2025");
    //Make object for Loans with code 44
    var lLongTerm1 = new LoansInc44(
        (String) data[36][0], // "156"
        (String) data[36][1],
        (BigDecimal) data[36][2],
        "2025");
    //Make objects for Equity and Investment Fund Shares
    var secListed = new SsListed(
        (String) data[38][0], 
        (String) data[38][1],
        (BigDecimal) data[38][2],
        "2025");
    var secUnlisted = new SsUnlisted(
        (String) data[39][0], 
        (String) data[39][1],
        (BigDecimal) data[39][2],
        "2025");
    //make object for circulation
     var lcdInCirculation = new LcdInCirculation(
        (String) data[41][0], 
        (String) data[41][1],
        (BigDecimal) data[41][2],
        "2025");
    var dsShort = new DslShortTerm(
        (String) data[43][0], 
        (String) data[43][1],
        (BigDecimal) data[43][2],
        "2025");
    var dsLong = new DslLongTerm(
        (String) data[44][0], 
        (String) data[44][1],
        (BigDecimal) data[44][2],
        "2025");
    var lShort = new LShortTerm(   //Incomes form short-term internal loans
        (String) data[46][0], 
        (String) data[46][1],
        (BigDecimal) data[46][2],
        "2025");
      
    var lLong = new LLongTermL2( //Incomes from long-term external loans
        (String) data[46][0], 
        (String) data[46][1],
        (BigDecimal) data[46][2],
        "2025");  
    var finDerivatives = new FinancDerivatives(
        (String) data[49][0], 
        (String) data[49][1],
        (BigDecimal) data[49][2],
        "2025");
    //Make Expenses objects
    // Employee Benefits
    var empBenefits = new EmployeeBenefits(
        (String) data[50][0], // "21"
        (String) data[50][1],
        (BigDecimal) data[50][2],
        "2025");
    // Social Benefits
    var sBenefits = new SocialBenefits(
        (String) data[51][0], // "22"
        (String) data[51][1],
        (BigDecimal) data[51][2],
        "2025");
    // Transfers
    var transfers = new TransfersExp(
        (String) data[52][0], // "23"
        (String) data[52][1],
        (BigDecimal) data[52][2],
        "2025");
    // Purchases of Goods and Services
    var purchases = new Purchases(
        (String) data[53][0], // "24"
        (String) data[53][1],
        (BigDecimal) data[53][2],
        "2025");
    // Subsidies
    var subsidies = new Subsidies(
        (String) data[54][0], // "25"
        (String) data[54][1],
        (BigDecimal) data[54][2],
        "2025");
    // Interests
    var interests = new Interests(
        (String) data[55][0], // "26"
        (String) data[55][1],
        (BigDecimal) data[55][2],
        "2025");
    // Other Expenses
    var othExpenses = new OtherExpenses(
        (String) data[56][0], // "27"
        (String) data[56][1],
        (BigDecimal) data[56][2],
        "2025");
    // Credits Under Allocation
    var aFunds = new AllocatedFunds(
        (String) data[57][0], // "29"
        (String) data[57][1],
        (BigDecimal) data[57][2],
        "2025");
    // Fixed Assets
    var fixAssets = new FixedAssetsExp(
        (String) data[58][0], // "31"
        (String) data[58][1],
        (BigDecimal) data[58][2],
        "2025");
    // Valuables
    var valuables = new Valuables(
        (String) data[59][0], // "33"
        (String) data[59][1],
        (BigDecimal) data[59][2],
        "2025");
    // Loans (code 44)
    var lExp44 = new LoansExp44(
        (String) data[60][0], // "44"
        (String) data[60][1],
        (BigDecimal) data[60][2],
        "2025");
    // Equity and Investment Fund Shares
    var sShares = new SecuritySharesExp(
        (String) data[61][0], // "45"
        (String) data[61][1],
        (BigDecimal) data[61][2],
        "2025");
    // Debt Securities (Liabilities)
    var dSecurLiabil = new DeptSecurLiabilExp(
        (String) data[62][0], // "53"
        (String) data[62][1],
        (BigDecimal) data[62][2],
        "2025");
    // Loans (code 54)
    var lExp54 = new LoansExp54(
        (String) data[63][0], // "54"
        (String) data[63][1],
        (BigDecimal) data[63][2],
        "2025");
    //Make Object for Entities (Ministries, Presidency, Parliament and Administration)
    var repPresidency = new RepublicPresidency(
        (String) data[64][0], // "1001"
        (String) data[64][1],
        (BigDecimal) data[64][2],
        "2025");
    var helPar = new HellenicParliament(
        (String) data[65][0], // "1003"
        (String) data[65][1],
        (BigDecimal) data[65][2],
        "2025");
    var govPre = new GovernPresidency(
        (String) data[66][0], // "1004"
        (String) data[66][1],
        (BigDecimal) data[66][2],
        "2025");
    var minInterior = new MinInterior(
        (String) data[67][0], // "1007"
        (String) data[67][1],
        (BigDecimal) data[67][2],
        "2025");
    var minForeign = new MinForeign(
        (String) data[68][0], // "1009"
        (String) data[68][1],
        (BigDecimal) data[68][2],
        "2025");
    var minDefense = new MinDefense(
        (String) data[69][0], // "1011"
        (String) data[69][1],
        (BigDecimal) data[69][2],
        "2025");
    var minHealth = new MinHealth(
        (String) data[70][0], // "1015"
        (String) data[70][1],
        (BigDecimal) data[70][2],
        "2025");
    var minJustice = new MinJustice(
        (String) data[71][0], // "1017"
        (String) data[71][1],
        (BigDecimal) data[71][2],
        "2025");
    var minEducatReligSports = new MinEducatReligSports(
        (String) data[72][0], // "1020"
        (String) data[72][1],
        (BigDecimal) data[72][2],
        "2025");
    var minCulture = new MinCulture(
        (String) data[73][0], // "1022"
        (String) data[73][1],
        (BigDecimal) data[73][2],
        "2025");
    var minEconomy = new MinEconomy(
        (String) data[74][0], // "1024"
        (String) data[74][1],
        (BigDecimal) data[74][2],
        "2025");
    var minRuralDevelFood = new MinRuralDevelFood(
        (String) data[75][0], // "1029"
        (String) data[75][1],
        (BigDecimal) data[75][2],
        "2025");
    var minEnvirEnergy = new MinEnvirEnergy(
        (String) data[76][0], // "1031"
        (String) data[76][1],
        (BigDecimal) data[76][2],
        "2025");
    var minLaborSocSecurity = new MinLaborSocSecurity(
        (String) data[77][0], // "1032"
        (String) data[77][1],
        (BigDecimal) data[77][2],
        "2025");
    var minSocCohesionFam = new MinSocCohesFam(
        (String) data[78][0], // "1034"
        (String) data[78][1],
        (BigDecimal) data[78][2],
        "2025");
    var minDevelopment = new MinDevelopment(
        (String) data[79][0], // "1036"
        (String) data[79][1],
        (BigDecimal) data[79][2],
        "2025");
    var minInfrTransp = new MinInfrastTransport(
        (String) data[80][0], // "1039"
        (String) data[80][1],
        (BigDecimal) data[80][2],
        "2025");
    var minShipIslandPolicy = new MinShipIslandPolicy(
        (String) data[81][0], // "1041"
        (String) data[81][1],
        (BigDecimal) data[81][2],
        "2025");
    var minTourism = new MinTourism(
        (String) data[82][0], // "1045"
        (String) data[82][1],
        (BigDecimal) data[82][2],
        "2025");
    var minDigitalGov = new MinDigitalGovern(
        (String) data[83][0], // "1053"
        (String) data[83][1],
        (BigDecimal) data[83][2],
        "2025");
    var minImmigrAsylum = new MinImmigrAsylum(
        (String) data[84][0], // "1055"
        (String) data[84][1],
        (BigDecimal) data[84][2],
        "2025");
    var minCivilProtect = new MinCivilProtection(
        (String) data[85][0], // "1057"
        (String) data[85][1],
        (BigDecimal) data[85][2],
        "2025");
    var minClimaCrisis = new MinClimateCrisis(
        (String) data[86][0], // "1060"
        (String) data[86][1],
        (BigDecimal) data[86][2],
        "2025");
// ==== DECENTRALIZED ADMINISTRATIONS ====
    var decAdmAttica = new DecAdminAttica(
        (String) data[87][0], // "1901"
        (String) data[87][1],
        (BigDecimal) data[87][2],
        "2025");
    var decAdminThesCenGr = new DecAdminThesCenGr(
        (String) data[88][0], // "1902"
        (String) data[88][1],
        (BigDecimal) data[88][2],
        "2025");
    var decAdmEpirWestMac = new DecAdminEpirWMaced(
        (String) data[89][0], // "1903"
        (String) data[89][1],
        (BigDecimal) data[89][2],
        "2025");
    var decAdminPelopWestGreeceIonio = new DecAdminPelopWGrIon(
        (String) data[90][0], // "1904"
        (String) data[90][1],
        (BigDecimal) data[90][2],
        "2025");
    var decAdmAegean = new DecAdminAegean(
        (String) data[91][0], // "1905"
        (String) data[91][1],
        (BigDecimal) data[91][2],
        "2025");
    var decAdmCrete = new DecAdminCrete(
        (String) data[92][0], // "1906"
        (String) data[92][1],
        (BigDecimal) data[92][2],
        "2025");
    var decAdmMacedThr = new DecAdminMacedThr(
        (String) data[93][0], // "1907"
        (String) data[93][1],
        (BigDecimal) data[93][2],
        "2025");





    
    
    
    

    



}