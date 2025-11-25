import entities.*;
import expenses.*;
import incomes.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/** 
 * The Main class serves as the entry 
 * point of application GovPro that
 * manages and analyzes data related to 
 * the 2025 Greek State Budget.
 * The {@code main} method initializes
 * the data and starts the analysis processes.
 */

public class Main2 {

  /**
   * Entry point of the 2025 Greek State Budget
   *  analysis application.
   * 
   * @param args command-line arguments 
   */
  public static void main(String[] args) {


    Object[][] data = {
        {"Code", "Name", "Amount"}, // 0
        {"11", "Taxes", new BigDecimal("62055000000")}, // 1
        {"111", "Taxes on Services and Products", new BigDecimal("33667000000")},
        {"112", "Taxes and Duties on Imports", new BigDecimal("362000000")},
        {"113", "Regular Property Taxes", new BigDecimal("2353000000")},
        {"114", "Other Production Taxes", new BigDecimal("355000000")},
        {"115", "Income Tax", new BigDecimal("23719000000")},
        {"116", "Capital Taxes", new BigDecimal("232000000")},
        {"119", "Other Current Taxes", new BigDecimal("1367000000")},
        {"12", "Social Contributions", new BigDecimal("60000000")},
        {"122", "Other Social Contributions", new BigDecimal("60000000")},
        {"13", "Transfers", new BigDecimal("8131000000")},
        {"131", "Current Domestic Transfers", new BigDecimal("322000000")},
        {"132", "Current Transfers from Organizations and Member States", 
        new BigDecimal("15000000")},
        {"133", "Current Transfers from Foreign Entities", new BigDecimal("8000000")},
        {"134", "Domestic Investment Grants", new BigDecimal("35000000")},
        {"135", "Investment Grants from the EU", new BigDecimal("7645000000")},
        {"139", "Other Capital Transfers", new BigDecimal("106000000")},
        {"14", "Sales of Goods and Services", new BigDecimal("2405000000")},
        {"141", "Goods Sales", new BigDecimal("2000000")},
        {"142", "Provision of Services", new BigDecimal("338000000")},
        {"143", "Rents", new BigDecimal("1418000000")},
        {"144", "Supplies", new BigDecimal("445000000")},
        {"145", "Administrative Fees", new BigDecimal("199000000")},
        {"149", "Other Sales", new BigDecimal("3000000")},
        {"15", "Other Current Income", new BigDecimal("2775000000")},
        {"151", "Interest Income", new BigDecimal("588000000")},
        {"152", "Distributed Corporate Income", new BigDecimal("356000000")},
        {"153", "Natural Resource Rents", new BigDecimal("75000000")},
        {"156", "Fines, Penalties and Assessments", new BigDecimal("1102000000")},
        {"159", "Expense Reimbursements", new BigDecimal("654000000")},
        {"31", "Fixed Assets", new BigDecimal("37000000")},
        {"311", "Buildings and Related Infrastructure", new BigDecimal("37000000")},
        {"43", "Debt Securities", new BigDecimal("11000000")},
        {"432", "Long-term Debt Securities", new BigDecimal("11000000")},
        {"44", "Loans", new BigDecimal("20000000")},
        {"442", "Long-term Loans", new BigDecimal("20000000")},
        {"45", "Equity and Investment Fund Shares", new BigDecimal("467000000")},
        {"451", "Listed Shares", new BigDecimal("239000000")},
        {"452", "Unlisted Shares", new BigDecimal("228000000")},
        {"52", "Currency and Deposit Liabilities", new BigDecimal("66000000")},
        {"521", "Currency in Circulation Liabilities", new BigDecimal("66000000")},
        {"53", "Debt Securities (Liabilities)", new BigDecimal("25973000000")},
        {"531", "Short-term Debt Securities", new BigDecimal("17000000000")},
        {"532", "Long-term Debt Securities", new BigDecimal("8973000000")},
        {"54", "Loans", new BigDecimal("1202027000000")},
        {"541", "Short-term Loans", new BigDecimal("1200000000000")},
        {"542", "Long-term Loans", new BigDecimal("2027000000")},
        {"57", "Financial Derivatives", new BigDecimal("800000000")},
        {"571", "Financial Derivatives", new BigDecimal("800000000")},
        {"21", "Employee Benefits", new BigDecimal("14889199000")},
        {"22", "Social Benefits", new BigDecimal("425136000")},
        {"23", "Transfers", new BigDecimal("34741365000")},
        {"24", "Purchases of Goods and Services", new BigDecimal("2039542000")},
        {"25", "Subsidies", new BigDecimal("80630000")},
        {"26", "Interest", new BigDecimal("7701101000")},
        {"27", "Other Expenses", new BigDecimal("101553000")},
        {"29", "Credits Under Allocation", new BigDecimal("17283053000")},
        {"31", "Fixed Assets", new BigDecimal("2609600000")},
        {"33", "Valuables", new BigDecimal("85000")},
        {"44", "Loans", new BigDecimal("3741000000")},
        {"45", "Equity and Investment Fund Shares", new BigDecimal("1755112000")},
        {"53", "Debt Securities (Liabilities)", new BigDecimal("19375000000")},
        {"54", "Loans", new BigDecimal("1203165130000")},
        {"1001", "Presidency of the Republic", new BigDecimal("4638000")},
        {"1003", "Hellenic Parliament", new BigDecimal("171950000")},
        {"1004", "Presidency of the Government", new BigDecimal("41689000")},
        {"1007", "Ministry of Interior", new BigDecimal("3830276000")},
        {"1009", "Ministry of Foreign Affairs", new BigDecimal("420237000")},
        {"1011", "Ministry of National Defense", new BigDecimal("6130000000")},
        {"1015", "Ministry of Health", new BigDecimal("7177424000")},
        {"1017", "Ministry of Justice", new BigDecimal("650803000")},
        {"1020", "Ministry of Education, Religious Affairs and", new BigDecimal("6606000000")},
        {"1022", "Ministry of Culture", new BigDecimal("575419000")},
        {"1024", "Ministry of National Economy and", new BigDecimal("1246518464000")},
        {"1029", "Ministry of Rural Development and Food", new BigDecimal("1281403000")},
        {"1031", "Ministry of Environment and Energy", new BigDecimal("2341227000")},
        {"1032", "Ministry of Labor and Social Security", new BigDecimal("18678084000")},
        {"1034", "Ministry of Social Cohesion and", new BigDecimal("3989553000")},
        {"1036", "Ministry of Development", new BigDecimal("818045000")},
        {"1039", "Ministry of Infrastructure and Transport", new BigDecimal("2694810000")},
        {"1041", "Ministry of Shipping and Island Policy", new BigDecimal("651864000")},
        {"1045", "Ministry of Tourism", new BigDecimal("189293000")},
        {"1053", "Ministry of Digital Governance", new BigDecimal("1073928000")},
        {"1055", "Ministry of Migration and Asylum", new BigDecimal("475871000")},
        {"1057", "Ministry of Citizen Protection", new BigDecimal("2285820000")},
        {"1060", "Ministry of Climate Crisis and Civil Protection", new BigDecimal("1221116000")},
        {"1901", "Decentralized Administration of Attica", new BigDecimal("13091000")},
        {"1902", "Decentralized Administration of Thessaly-Central Greece", 
        new BigDecimal("10579000")},
        {"1903", "Decentralized Administration of Epirus-Western Greece", 
        new BigDecimal("9943000")},
        {"1904", "Decentralized Administration of Peloponnese -", new BigDecimal("14918000")},
        {"1905", "Decentralized Administration of the Aegean", new BigDecimal("6188000")},
        {"1906", "Decentralized Administration of Crete", new BigDecimal("6497000")},
        {"1907", "Decentralized Administration of Macedonia - Thrace", new BigDecimal("18376000")}
    };
    // Make objects of Taxes
    var  taxGoodsServices = new TaxGoodsServices(
        (String) data[2][0],      // Κωδικός
        (String) data[2][1],      // Ονομασία
        (BigDecimal) data[2][2],  // Ποσό
        "2025"); // Έτος             // Taxes on Goods and Services
        
    var tDuties = new TaxDutiesOnImports(
        (String) data[3][0],      // Κωδικός
        (String) data[3][1],      // Ονομασία
        (BigDecimal) data[3][2],  // Ποσό
        "2025"); // Έτος      // Taxes and duties on imports
    
    var tRegular = new TaxRegularRealEstate(
        (String) data[4][0],     // Κωδικός
        (String) data[4][1],      // Ονομασία
        (BigDecimal) data[4][2],  // Ποσό
        "2025"); // Έτος       // Property taxes
    
    var tProduction = new TaxProduction(
        (String) data[5][0],      // Κωδικός
        (String) data[5][1],      // Ονομασία
        (BigDecimal) data[5][2],  // Ποσό
        "2025"); // Έτος     // Other taxes on production
    
    var tIncome = new TaxIncome(
        (String) data[6][0],      // Κωδικός
        (String) data[6][1],      // Ονομασία
        (BigDecimal) data[6][2],  // Ποσό
        "2025"); // Έτος      // Income taxes
    
    var tCapital = new TaxCapital((String) data[7][0],      // Κωδικός
        (String) data[7][1],      // Ονομασία
        (BigDecimal) data[7][2],  // Ποσό
        "2025");  // Capital taxes
    
    var tOther = new TaxOther((String) data[8][0],      // Κωδικός
        (String) data[8][1],      // Ονομασία
        (BigDecimal) data[8][2],  // Ποσό
        "2025");  // Other current taxes
    
    // Make objects of Sales
    
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
    
    // Make objects of Other Current Income
    
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
    
    // Make object of social contributions
    
    var socContr = new SocialContributions(
        (String) data[11][0], 
        (String) data[11][1],
        (BigDecimal) data[11][2],
        "2025");
    
    // Make Object for Fixed Assets
    
    var faBuildings = new FixedAssets(
        (String) data[33][0], // "159"
        (String) data[33][1],
        (BigDecimal) data[33][2],
        "2025");
    
    // Make object for Dept Securities
    
    var dsLongTerm = new DeptSecurities(
        (String) data[35][0], 
        (String) data[35][1],
        (BigDecimal) data[35][2],
        "2025");
    
    // Make object for Loans with code 44
    
    var lLongTerm1 = new LoansInc44(
        (String) data[36][0], // "156"
        (String) data[36][1],
        (BigDecimal) data[36][2],
        "2025");
       
    // Make objects for Equity and Investment Fund Shares
    
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
    
    // make object for circulation
     
    var lcdInCirculation = new LiabilitiesCurrenDepos(
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
    
    var lShort = new LShortTerm(// Incomes form short-term internal loans
        (String) data[46][0], 
        (String) data[46][1],
        (BigDecimal) data[46][2],
        "2025");
      
    
    var lLong = new LLongTermL2(// Incomes from long-term external loans
        (String) data[46][0], 
        (String) data[46][1],
        (BigDecimal) data[46][2],
        "2025");  
    
    var finDerivatives = new FinancDerivatives(
        (String) data[49][0], 
        (String) data[49][1],
        (BigDecimal) data[49][2],
        "2025");

    // Make objects for Transfers
    var trCurrent = new TrCurrentDomestic(
        (String) data[13][0],
        (String) data[13][1],
        (BigDecimal) data[13][2],
        "2025");

    var trEU = new TrEU(
        (String) data[14][0],
        (String) data[14][1],
        (BigDecimal) data[14][2],
        "2025");

    var trForeign = new TrForeignEntities(
        (String) data[15][0],
        (String) data[15][1],
        (BigDecimal) data[15][2],
        "2025");

    var trDomInvest = new TrDomesInvestGrants(
        (String) data[16][0],
        (String) data[16][1],
        (BigDecimal) data[16][2],
        "2025");

    var trEUInvest = new TrEUInvestGrants(
        (String) data[17][0],
        (String) data[17][1],
        (BigDecimal) data[17][2],
        "2025");

    var trOther = new TrOther(
        (String) data[18][0],
        (String) data[18][1],
        (BigDecimal) data[18][2],
        "2025");

    // Incomes List
    ArrayList<Income> inc = new ArrayList<>();

    inc.add(taxGoodsServices);
    inc.add(tDuties);
    inc.add(tRegular);
    inc.add(tProduction);
    inc.add(tIncome);
    inc.add(tCapital);
    inc.add(tOther);
    inc.add(socContr);
    inc.add(trCurrent);
    inc.add(trEU);
    inc.add(trForeign);
    inc.add(trDomInvest);
    inc.add(trEUInvest);
    inc.add(trOther);
    inc.add(sGoods);
    inc.add(sServices);
    inc.add(sRents);
    inc.add(sCommissions);
    inc.add(sAdmin);
    inc.add(sOther);
    inc.add(oInterest);
    inc.add(oCorpInc);
    inc.add(oNatRent);
    inc.add(oFines);
    inc.add(oReimb);
    inc.add(faBuildings);
    inc.add(dsLongTerm);
    inc.add(lLongTerm1);
    inc.add(secListed);
    inc.add(secUnlisted);
    inc.add(lcdInCirculation);
    inc.add(dsShort);
    inc.add(dsLong);
    inc.add(lShort);
    inc.add(lLong);
    inc.add(finDerivatives);
        

    // End of Incomes List

    // Make Expenses objects

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


    // Expenses List
    ArrayList<Expenses> exp = new ArrayList<>();

    exp.add(empBenefits);
    exp.add(sBenefits);
    exp.add(transfers);
    exp.add(purchases);
    exp.add(subsidies);
    exp.add(interests);
    exp.add(othExpenses);
    exp.add(aFunds);
    exp.add(fixAssets);
    exp.add(valuables);
    exp.add(lExp44);
    exp.add(sShares);
    exp.add(dSecurLiabil);
    exp.add(lExp54);
      
    // End of Expenses List

    // Make Object for Entities (Ministries, Presidency, Parliament and Administration)
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

    // Entities List
    ArrayList<Entity> ent = new ArrayList<>();

    ent.add(repPresidency);
    ent.add(helPar);
    ent.add(govPre);
    ent.add(minCivilProtect);
    ent.add(minClimaCrisis);
    ent.add(minCulture);
    ent.add(minDefense);
    ent.add(minDevelopment);
    ent.add(minDigitalGov);
    ent.add(minEconomy);
    ent.add(minEducatReligSports);
    ent.add(minEnvirEnergy);
    ent.add(minForeign);
    ent.add(minHealth);
    ent.add(minImmigrAsylum);
    ent.add(minInfrTransp);
    ent.add(minInterior);
    ent.add(minJustice);
    ent.add(minLaborSocSecurity);
    ent.add(minRuralDevelFood);
    ent.add(minShipIslandPolicy);
    ent.add(minSocCohesionFam);
    ent.add(minTourism);
    ent.add(decAdmAegean);
    ent.add(decAdmAttica);
    ent.add(decAdmCrete);
    ent.add(decAdmEpirWestMac);
    ent.add(decAdmMacedThr);
    ent.add(decAdminPelopWestGreeceIonio);
    ent.add(decAdminThesCenGr);
      

    // End of Entities List


    /*The below section of our code provides a menu where each user
     choice triggers a specific category of functionality.
      At first, the user has two options, read the 2025 State Budget
      or change the 2025 State Budget. Depending on the choice, 
      our code continue in the according way.
     */



    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    boolean valid1 = false;
    boolean valid2 = false;
    boolean valid3 = false;
    boolean valid4 = false;

        
    Scanner input = new Scanner(System.in);

    while (!valid1) {
      System.out.println("What do you want GovPro to do?"); 
      System.out.println();
        
      System.out.println("1. Reading of the 2025 State Budget.");
      System.out.println("2. Amendment of the 2025 State Budget.");
        
      try {
        number1 = input.nextInt();
        if (number1 !=1 && number1 != 2) {
            throw new IllegalArgumentException("Please only choose between 1 and 2."
            +"More functions are coming soon!");
        }
        valid1 = true;
      } catch (InputMismatchException e) {
        System.out.println("Please choose as an answer 1 or 2");
        input.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    // The case where the user chooses to read the budget. 
    String Blue = "\u001B[34m";
    String Reset = "\u001B[0m";  
    if (number1 == 1) {
      System.out.println(Blue + "--------------Incomes-------------" + Reset);
      System.out.println();
      for (Income object : inc) {
        System.out.println(object.toString());
        System.out.println();
      }
      System.out.println();
      System.out.println(Blue + "--------------Expenses--------------" + Reset);
      System.out.println();
      for (Expenses object : exp) {
        System.out.println(object.toString());
        System.out.println();
      }
      System.out.println();
      System.out.println(Blue + "--------------Entities---------------" + Reset);
      System.out.println();
      for (Entity object : ent) {
        System.out.println(object.toString());
        System.out.println();
      }
        
    /*The case where the user chooses the amendment of the 
     2025 State Budget. 
     */
    } else {
      while (!valid2) {
        System.out.println("Which category would you be interested in modifying?");
        System.out.println(" Please choose one of the options below."); 
        System.out.println();

        System.out.println("1. Income");
        System.out.println("2. Expences");
        System.out.println("3. Entities");

        try {
          number2 = input.nextInt();
          if (number1 < 1 || number2 > 3) {
            throw new IllegalArgumentException("Please choose a number 1-3");
          }
          valid2 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please choose as an answer 1, 2 or 3");
          input.next();
        } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());  
        }
      }
                
      if (number2 == 1) {
        while (!valid3) {
          System.out.println("Which income category would you be interested in modifying?");
          System.out.println();
        
          System.out.println("1. Taxes");
          System.out.println("2. Social contributions");
          System.out.println("3. Transfers");
          System.out.println("4. Sales of goods and services");
          System.out.println("5. Other current income");
          System.out.println("6. Fixed assets");
          System.out.println("7. Debt securities");
          System.out.println("8. Loans (repay older debt)");
          System.out.println("9. Equity securities and investment fund shares");
          System.out.println("10. Currency liabilities and deposits");
          System.out.println("11. Debt Securities (Liabilities)");
          System.out.println("12. Loans");
          System.out.println("13. Financial derivatives");                    
          try {
            number3 = input.nextInt();
            if (number3 < 1 || number3 > 13) {
                throw new IllegalArgumentException("Oops! There are"
                +"only 13 income accounts! Choose one of them please!");
            }
            valid3 = true;
          } catch (InputMismatchException e) {
            System.out.println("Please choose as an answer a number from 1 to 13");
            input.next();
          } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
          }
        }
        if (number3 == 1) {
          while (!valid4) {

            System.out.println("Please choose the number of one of the options below.");
            System.out.println();

            System.out.println("1. Taxes on goods and services");
            System.out.println("2. Taxes and duties on imports");
            System.out.println("3. Regular taxes on real estate");
            System.out.println("4. Other taxes on production");
            System.out.println("5. Income tax");
            System.out.println("6. Capital taxes");
            System.out.println("7. Other current taxes");
            try {
              number4 = input.nextInt();
              if (number4 < 1 || number4 > 7) {
                throw new IllegalArgumentException("There are only 7 types of taxes!");
            
              }
              System.out.println("Please change the account with the number " + number4);
              number5 = input.nextInt();
              if (number5 == 1) {
                taxGoodsServices.setAmount(new BigDecimal(number5));
              } else if (number5 == 2) {
                tDuties.setAmount(new BigDecimal(number5));
              } else if (number5 == 3) {
                tRegular.setAmount(new BigDecimal(number5));
              } else if (number5 == 4) {
                tProduction.setAmount(new BigDecimal(number5));
              } else if (number5 == 5) {
                tIncome.setAmount(new BigDecimal(number5));
              } else if (number5 == 6) {
                tCapital.setAmount(new BigDecimal(number5));
              } else {
                tOther.setAmount(new BigDecimal(number5));
              }
              System.out.println("You succesfully "
                  + "changed the account with the amount " + number5 + " euro.");
              valid4 = true;
            } catch (InputMismatchException e) {
              System.out.println("Please choose as an answer a number from 1 to 7");
              input.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
          }
        } else if (number3 == 2) { 
          while (!valid4) {
                
            System.out.println("Please choose the number of the option below.");
            System.out.println(); 
                    
            System.out.println("1. Other social contributions");
            try {
              number4 = input.nextInt();
              if (number4 != 1) {
                throw new IllegalArgumentException("Try again!");
              }
              System.out.println("Please change the account with the number " + number4);
              number5 = input.nextInt();
              socContr.setAmount(new BigDecimal(number5));
              System.out.println("You succesfully "
                  + "changed the account with the amount " + number5 + " euro.");
              valid4 = true;
            } catch (InputMismatchException e) {
              System.out.println("Please put as an answer the number 1");
              input.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
          }
        } else if (number3 == 3) {
          while (!valid4) {

            System.out.println("Please choose the number of one of the options below.");
            System.out.println();
                    
            System.out.println("1. Current domestic transfers");
            System.out.println("2. Current transfers from EU organizations and member states");
            System.out.println("3. Current transfers from foreign entities");
            System.out.println("4. Domestic investment grants");
            System.out.println("5. EU investment grants");
            System.out.println("6. Other capital transfers");
            try {
              number4 = input.nextInt();
              if (number4 < 1 || number4 > 6) {
                throw new IllegalArgumentException("There are only 6 types of transfers!");
              }
              System.out.println("Please change the account with the number " + number4);
              number5 = input.nextInt();
              if (number5 == 1) {
                trCurrent.setAmount(new BigDecimal(number5));
              } else if (number5 == 2) {
                trEU.setAmount(new BigDecimal(number5));
              } else if (number5 == 3) {
                trForeign.setAmount(new BigDecimal(number5));
              } else if (number5 == 4) {
                trDomInvest.setAmount(new BigDecimal(number5));
              } else if (number5 == 5) {
                trEUInvest.setAmount(new BigDecimal(number5));
              } else {
                trOther.setAmount(new BigDecimal(number5));
              }
              System.out.println("You succesfully "
                  + "changed the account with the amount " + number5 + " euro.");
              valid4 = true;
            } catch (InputMismatchException e) {
              System.out.println("Please choose as an answer a number from 1 to 6");
              input.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
          }
            } else if (number3 == 4) {
                while (!valid4) {
                
                    System.out.println("Please choose the number of one of the options below.");
                    System.out.println();
                
                    System.out.println("1. Sales of goods");
                    System.out.println("2. Provision of services");
                    System.out.println("3. Rents");
                    System.out.println("4. Commissions");
                    System.out.println("5. Administrative fees");
                    System.out.println("6. Other sales");
                    try {
                        number4 = input.nextInt();
                        if (number4 < 1 || number4 > 6) {
                        throw new IllegalArgumentException("There are only 6 types of Sales!");
                        }
                        System.out.println("Please change the account with the number " + number4);
                        number5 = input.nextInt();
                        if(number5 == 1) {
                            sGoods.setAmount(new BigDecimal(number5));
                        } else if(number5 == 2) {
                            sServices.setAmount(new BigDecimal(number5));
                        } else if(number5 == 3) {
                            sRents.setAmount(new BigDecimal(number5));
                        } else if(number5 == 4) {
                            sCommissions.setAmount(new BigDecimal(number5));
                        } else if(number5 == 5) {
                            sAdmin.setAmount(new BigDecimal(number5));
                        } else {
                            sOther.setAmount(new BigDecimal(number5));
                        }
                        System.out.println("You succesfully "
                            + "changed the account with the amount " + number5 + " euro.");
                        valid4 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please choose as an answer a number from 1 to 6");
                        input.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                } 
                } else if (number3 == 5) {
                    while (!valid4) {
                        try {
                            System.out.println("Please choose the number one of the options below.");
                            System.out.println();
                                System.out.println("1. Interest");
                                System.out.println("2. Distributed corporate income");
                                System.out.println("3. Rents of natural resources");
                                System.out.println("4. Fines, penalties and assessments");
                                System.out.println("5. Reimbursements of expenses");
                                System.out.print("Enter your choice (1-5): ");

                                // Check that input is an integer
                                if (!input.hasNextInt()) {
                                    throw new InputMismatchException("Input must be an integer.");
                                }

                                number4 = input.nextInt();

                                // Check that number4 is within range
                                if (number4 < 1 || number4 > 5) {
                                    throw new IllegalArgumentException("Choice must be between 1 and 5.");
                                }

                                System.out.print("Please enter the new amount (positive number): ");

                                if (!input.hasNextInt()) {
                                    throw new InputMismatchException("Amount must be an integer.");
                                }

                                number5 = input.nextInt();

                                if (number5 < 0) {
                                    throw new IllegalArgumentException("Amount cannot be negative.");
                                }

                                // Perform the update based on number4
                                switch (number4) {
                                    case 1 -> oInterest.setAmount(new BigDecimal(number5));
                                    case 2 -> oCorpInc.setAmount(new BigDecimal(number5));
                                    case 3 -> oNatRent.setAmount(new BigDecimal(number5));
                                    case 4 -> oFines.setAmount(new BigDecimal(number5));
                                    case 5 -> oReimb.setAmount(new BigDecimal(number5));
                                }

                                System.out.println("You successfully changed the account with the amount "
                                        + number5 + " euro.");
                                valid4 = true;

                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input: please enter numbers only.");
                                input.nextLine(); // clear invalid input
                            } catch (IllegalArgumentException e) {
                                System.out.println("Oops!" + e.getMessage());
                                input.nextLine(); // clear buffer if needed
                            } catch (Exception e) {
                                System.out.println("Oops!" + e.getMessage());
                                input.nextLine();
                            }
                        }
                    } else if(number3 == 6) {
                    while (!valid4) {

                    System.out.println("Please choose the number of the option below.");
                    System.out.println();
                    
                    System.out.println("1. Buildings and related infrastructure");
                    try {
                        number4 = input.nextInt();
                        if (number4 != 1) {
                            throw new IllegalArgumentException("Try again!");
                        }
                        System.out.println("Please change the account with the number " + number4);
                        number5 = input.nextInt();
                        faBuildings.setAmount(new BigDecimal(number5));
                        System.out.println("You succesfully "
                            + "changed the account with the amount " + number5 + " euro.");
                        valid4 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Try Again!");
                        input.next();
                    } catch (IllegalArgumentException e){
                        System.out.println("Try Again!");
                    }
                }  
            } else if(number3 == 7) {
                while (!valid4) {
                
                    System.out.println("Please choose the number of the option below.");
                    System.out.println();
        
                    System.out.println("1.Long-term debt securities");
                    try {
                        number4 = input.nextInt();
                        if (number4 != 1) {
                            throw new IllegalArgumentException("Try again!");
                        }
                        System.out.println("Please change the account with the number " + number4);
                        number5 = input.nextInt();
                        dsLongTerm.setAmount(new BigDecimal(number5));
                        System.out.println("You succesfully "
                            + "changed the account with the amount " + number5 + " euro.");
                        valid4 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Try again");
                        input.next();
                    } catch (IllegalArgumentException e){
                        System.out.println("Try again!");
                    }
                }   
            } else if(number3 == 8) {
                while (!valid4) {
                
                    System.out.println("Please choose the number of the option below.");
                    System.out.println();
                
                    System.out.println("1. Long-term loans");
                    try {
                        number4 = input.nextInt();
                        if (number4 != 1) {
                            throw new IllegalArgumentException("Try again!");
                        }
                        System.out.println("Please change the account with the number " + number4);
                        number5 = input.nextInt();
                        lLongTerm1.setAmount(new BigDecimal(number5));
                        System.out.println("You succesfully "
                            + "changed the account with the amount " + number5 + " euro.");
                        valid4 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Try again!");
                        input.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }  
            } else if(number3 == 9) {
                while (!valid4) {

                    System.out.println("Please choose the number one of the options below(1 or 2).");
                    System.out.println();

                    System.out.println("1. Listed shares");
                    System.out.println("2. Unlisted shares");
                    try {
                        number4 = input.nextInt();
                        if (number4 != 1 && number4 != 2) {
                            throw new IllegalArgumentException("Try again!");
                        }
                        System.out.println("Please change the account with the number " + number4);
                        number5 = input.nextInt();
                        if(number5 == 1) {
                            secListed.setAmount(new BigDecimal(number5));
                        } else {
                            secUnlisted.setAmount(new BigDecimal(number5));
                        }
                        System.out.println("You succesfully "
                            + "changed the account with the amount " + number5 + " euro.");
                        valid4 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please choose as an answer 1 or 2");
                        input.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }    
            } else if(number3 == 10) {
                while (!valid4) {
                
                    System.out.println("Please choose the number of the option below.");
                    System.out.println();
            
                    System.out.println("1. Currency liabilities in circulation");
                    try {
                        number4 = input.nextInt();
                        if (number4 != 1) {
                            throw new IllegalArgumentException("Try again!");
                        }
                        System.out.println("Please change the account with the number " + number4);
                        number5 = input.nextInt();
                        lcdInCirculation.setAmount(new BigDecimal(number5));
                        System.out.println("You succesfully "
                            + "changed the account with the amount " + number5 + " euro.");
                        valid4 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please put as an answer the number 1");
                        input.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if(number3 == 11) {
                while (!valid4) {
                
                    System.out.println("Please choose the number one of the options below(1 or 2).");
                    System.out.println();
            
                    System.out.println("1. Short-term debt securities");
                    System.out.println("2. Long-term debt securities");
                    try {
                        number4 = input.nextInt();
                        if (number4 != 1 && number4 != 2) {
                            throw new IllegalArgumentException("Try again!");
                        }
                        System.out.println("Please change the account with the number " + number4);
                        number5 = input.nextInt();
                        if(number5 == 1) {
                            dsShort.setAmount(new BigDecimal(number5));
                        } else {
                            dsLong.setAmount(new BigDecimal(number5));
                        }
                        System.out.println("You succesfully "
                            + "changed the account with the amount " + number5 + " euro.");
                        valid4 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Try again!");
                        input.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if(number3 == 12) {
                while (!valid4) {

                    System.out.println("Please choose the number of one of the options below(1 or 2).");
                    System.out.println();
                
                    System.out.println("1. Short-term loans");
                    System.out.println("2. Long-term loans");
                    try {
                        number4 = input.nextInt();
                        if (number4 != 1 && number4 != 2) {
                            throw new IllegalArgumentException("Try again!");
                        }
                        System.out.println("Please change the account with the number " + number4);
                        number5 = input.nextInt();
                        if(number5 == 1) {
                            lShort.setAmount(new BigDecimal(number5));
                        } else {
                            lLong.setAmount(new BigDecimal(number5));
                        }
                        System.out.println("You succesfully "
                            + "changed the account with the amount " + number5 + " euro.");
                        valid4 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Try again!");
                        input.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else {
                 while (!valid4) {
                
                    System.out.println("Please choose one of the options below.");
                    System.out.println();  
            
                    System.out.println("1. Financial derivatives");
                    try {
                        number4 = input.nextInt();
                        if (number4 !=1) {
                            throw new IllegalArgumentException("Try again!");
                        }
                        System.out.println("Please change the account with the number " + number4);
                        number5 = input.nextInt();
                        finDerivatives.setAmount(new BigDecimal(number5));
                        System.out.println("You succesfully "
                            + "changed the account with the amount " + number5 + " euro.");
                        valid4 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please put the number 1");
                        input.next();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        //αν επιλέξω έξοδα
        } else if(number2 == 2) {
            while (!valid3) {

                System.out.println("Which expence category would you be interested in modifying?");
                System.out.println();

                System.out.println("1. Employee Benefits");
                System.out.println("2. Social Benefits");
                System.out.println("3. Transfers");
                System.out.println("4. Purchases of goods and services");
                System.out.println("5. Subsidies");
                System.out.println("6. Interest");
                System.out.println("7. Other expenses");
                System.out.println("8. Credits under distribution");
                System.out.println("9. Fixed assets");
                System.out.println("10. Valuables");
                System.out.println("11. Long-Term Loans");
                System.out.println("12. Equity securities and investment fund shares");
                System.out.println("13. Debt securities (liabilities)");
                System.out.println("14. Short-Term Loans");
                try {
                    number3 = input.nextInt();
                    if (number3 < 1 || number3 > 14) {
                        throw new IllegalArgumentException("There are "+
                        "14 categories!Please choose the number of one of them!Thank you!");
                    }
                    System.out.println("Please change the account with the number " + number3);
                    number4 = input.nextInt();
                    if(number4 == 1) {
                        empBenefits.setAmount(new BigDecimal(number4));
                    } else if(number4 == 2) {
                        sBenefits.setAmount(new BigDecimal(number4));
                    } else if(number4 == 3) {
                        transfers.setAmount(new BigDecimal(number4));
                    } else if(number4 == 4) {
                        purchases.setAmount(new BigDecimal(number4));
                    } else if(number4 == 5) {
                        subsidies.setAmount(new BigDecimal(number4));
                    } else if(number4 == 6) {
                        interests.setAmount(new BigDecimal(number4));
                    } else if(number4 == 7) {
                        othExpenses.setAmount(new BigDecimal(number4));
                    } else if(number4 == 8) {
                        aFunds.setAmount(new BigDecimal(number4));
                    } else if(number4 == 9) {
                        fixAssets.setAmount(new BigDecimal(number4));
                    } else if(number4 == 10) {
                        valuables.setAmount(new BigDecimal(number4));
                    } else if(number4 == 11) {
                        lExp44.setAmount(new BigDecimal(number4));
                    } else if(number4 == 12) {
                        sShares.setAmount(new BigDecimal(number4));
                    } else if(number4 == 13) {
                        dSecurLiabil.setAmount(new BigDecimal(number4));
                    } else {
                        lExp54.setAmount(new BigDecimal(number4));
                    }
                    System.out.println("You succesfully "
                        + "changed the account with the amount " + number4 + " euro.");
                    valid3 = true;
                } catch (InputMismatchException e) {
                    System.out.println("Please choose as an answer a number from 1 to 13");
                    input.next();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        //αν επιλέξω φορείς
        } else {
            while (!valid3) {

                System.out.println("Which entity would you be interested in modifying?");
                System.out.println();

                System.out.println("1. Presidency of the Republic");
                System.out.println("2. Hellenic Parliament");
                System.out.println("3. Presidency of the Government");
                System.out.println("4. Ministry of Interior");
                System.out.println("5. Ministry of Foreign Affairs");
                System.out.println("6. Ministry of National Defense");
                System.out.println("7. Ministry of Health");
                System.out.println("8. Ministry of Justice");
                System.out.println("9. Ministry of Education, Religious Affairs and Sports");
                System.out.println("10. Ministry of Culture");
                System.out.println("11. Ministry of National Economy and Finance");
                System.out.println("12. Ministry of Rural Development and Food");
                System.out.println("13. Ministry of Environment and Energy");
                System.out.println("14. Ministry of Labor and Social Security");
                System.out.println("15. Ministry of Social Cohesion and Family");
                System.out.println("16. Ministry of Development");
                System.out.println("17. Ministry of Infrastructure and Transport");
                System.out.println("18. Ministry of Shipping and Island Policy");
                System.out.println("19. Ministry of Tourism");
                System.out.println("20. Ministry of Digital Governance");
                System.out.println("21. Ministry of Immigration and Asylum");
                System.out.println("22. Ministry of Civil Protection");
                System.out.println("23. Ministry of Climate Crisis and Civil Protection");
                System.out.println("24. Decentralized Administration of Attica");
                System.out.println("25. Decentralized Administration of Thessaly - Central Greece");
                System.out.println("26. Decentralized Administration of Epirus - Western Macedonia");
                System.out.println("27. Decentralized Administration of Peloponnese - Western Greece and Ionian");
                System.out.println("28. Decentralized administration of the Aegean");
                System.out.println("29. Decentralized administration of Crete");
                System.out.println("30. Decentralized administration of Macedonia - Thrace");
                try {
                    number3 = input.nextInt();
                    if (number3 < 1 || number3 > 30) {
                        throw new IllegalArgumentException("There are 30 Entities! Choose the number of one of them");
                    }
                    System.out.println("Please change the account with the number " + number3);
                    number4 = input.nextInt();
                    if(number4 == 1) {
                        repPresidency.setAmount(new BigDecimal(number4));
                    } else if(number4 == 2) {
                        helPar.setAmount(new BigDecimal(number4));
                    } else if(number4 == 3) {
                        govPre.setAmount(new BigDecimal(number4));
                    } else if(number4 == 4) {
                        minInterior.setAmount(new BigDecimal(number4));
                    } else if(number4 == 5) {
                        minForeign.setAmount(new BigDecimal(number4));
                    } else if(number4 == 6) {
                        minDefense.setAmount(new BigDecimal(number4));
                    } else if(number4 ==7) {
                        minHealth.setAmount(new BigDecimal(number4));
                    } else if(number4 == 8) {
                        minJustice.setAmount(new BigDecimal(number4));
                    } else if(number4 == 9) {
                        minEducatReligSports.setAmount(new BigDecimal(number4));
                    } else if(number4 == 10) {
                        minCulture.setAmount(new BigDecimal(number4));
                    } else if(number4 == 11) {
                        minEconomy.setAmount(new BigDecimal(number4));
                    } else if(number4 == 12) {
                        minDevelopment.setAmount(new BigDecimal(number4));
                    } else if(number4 == 13) {
                        minEnvirEnergy.setAmount(new BigDecimal(number4));
                    } else if(number4 == 14) {
                        minLaborSocSecurity.setAmount(new BigDecimal(number4));
                    } else if(number4 == 15) {
                        minSocCohesionFam.setAmount(new BigDecimal(number4));
                    } else if(number4 == 16) {
                        minDevelopment.setAmount(new BigDecimal(number4));
                    } else if(number4 == 17) {
                        minInfrTransp.setAmount(new BigDecimal(number4));
                    } else if(number4 == 18) {
                        minShipIslandPolicy.setAmount(new BigDecimal(number4));
                    } else if(number4 == 19) {
                        minTourism.setAmount(new BigDecimal(number4));
                    } else if(number4 == 20) {
                        minDigitalGov.setAmount(new BigDecimal(number4));
                    } else if(number4 == 21) {
                        minImmigrAsylum.setAmount(new BigDecimal(number4));
                    } else if(number4 == 22) {
                        minCivilProtect.setAmount(new BigDecimal(number4));
                    } else if(number4 == 23) {
                        minClimaCrisis.setAmount(new BigDecimal(number4));
                    } else if(number4 == 24) {
                        decAdmAttica.setAmount(new BigDecimal(number4));
                    } else if(number4 == 25) {
                        decAdminThesCenGr.setAmount(new BigDecimal(number4));
                    } else if(number4 == 26) {
                        decAdmEpirWestMac.setAmount(new BigDecimal(number4));
                    } else if(number4 == 27) {
                        decAdminPelopWestGreeceIonio.setAmount(new BigDecimal(number4));
                    } else if(number4 == 28) {
                        decAdmAegean.setAmount(new BigDecimal(number4));
                    } else if(number4 == 29) {
                        decAdmCrete.setAmount(new BigDecimal(number4));
                    } else {
                        decAdmMacedThr.setAmount(new BigDecimal(number4));
                    }
                    System.out.println("You succesfully "
                        + "changed the account with the amount " + number4 + " euro.");
                    valid3 = true;
                } catch (InputMismatchException e) {
                    System.out.println("Please choose as an answer a number from 1 to 30");
                    input.next();                
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } 
            }
        }
    }
    input.close();








}

    
}
