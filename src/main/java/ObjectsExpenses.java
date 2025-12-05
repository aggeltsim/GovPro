import expenses.*;
import java.math.BigDecimal;
import java.util.ArrayList;


public class ObjectsExpenses {
  public static ArrayList<Expenses> createObjectsExp() {
    Object[][] data = {
        {"Code", "Name", "Amount"}, // 0
        {"21", "Employee Benefits", new BigDecimal("14889199000")}, // 1
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
        {"54", "Loans", new BigDecimal("1203165130000")}
    };

    // Make Expenses objects

    // Employee Benefits
    var empBenefits = new EmployeeBenefits(
        (String) data[1][0], // "21"
        (String) data[1][1],
        (BigDecimal) data[1][2],
        "2025");

    // Social Benefits
    var socialBenefits = new SocialBenefits(
        (String) data[2][0], // "22"
        (String) data[2][1],
        (BigDecimal) data[2][2],
        "2025");

    // Transfers
    var transfers = new TransfersExp(
        (String) data[3][0], // "23"
        (String) data[3][1],
        (BigDecimal) data[3][2],
        "2025");

    // Purchases of Goods and Services
    var purchases = new Purchases(
        (String) data[4][0], // "24"
        (String) data[4][1],
        (BigDecimal) data[4][2],
        "2025");

    // Subsidies
    var subsidies = new Subsidies(
        (String) data[5][0], // "25"
        (String) data[5][1],
        (BigDecimal) data[5][2],
        "2025");

    // Interests
    var interests = new Interests(
        (String) data[6][0], // "26"
        (String) data[6][1],
        (BigDecimal) data[6][2],
        "2025");

    // Other Expenses
    var othExpenses = new OtherExpenses(
        (String) data[7][0], // "27"
        (String) data[7][1],
        (BigDecimal) data[7][2],
        "2025");

    // Credits Under Allocation
    var allocFunds = new AllocatedFunds(
        (String) data[8][0], // "29"
        (String) data[8][1],
        (BigDecimal) data[8][2],
        "2025");

    // Fixed Assets
    var fixAssets = new FixedAssetsExp(
        (String) data[9][0], // "31"
        (String) data[9][1],
        (BigDecimal) data[9][2],
        "2025");

    // Valuables
    var valuables = new Valuables(
        (String) data[10][0], // "33"
        (String) data[10][1],
        (BigDecimal) data[10][2],
        "2025");

    // Loans (code 44)
    var loanExp44 = new LoansExp44(
        (String) data[11][0], // "44"
        (String) data[11][1],
        (BigDecimal) data[11][2],
        "2025");

    // Equity and Investment Fund Shares
    var secShares = new SecuritySharesExp(
        (String) data[12][0], // "45"
        (String) data[12][1],
        (BigDecimal) data[12][2],
        "2025");

    // Debt Securities (Liabilities)
    var deptSecurLiabil = new DeptSecurLiabilExp(
        (String) data[13][0], // "53"
        (String) data[13][1],
        (BigDecimal) data[13][2],
        "2025");

    // Loans (code 54)
    var loanExp54 = new LoansExp54(
        (String) data[14][0], // "54"
        (String) data[14][1],
        (BigDecimal) data[14][2],
        "2025");

        // Expenses List
    ArrayList<Expenses> exp = new ArrayList<>();

    exp.add(empBenefits);
    exp.add(socialBenefits);
    exp.add(transfers);
    exp.add(purchases);
    exp.add(subsidies);
    exp.add(interests);
    exp.add(othExpenses);
    exp.add(allocFunds);
    exp.add(fixAssets);
    exp.add(valuables);
    exp.add(loanExp44);
    exp.add(secShares);
    exp.add(deptSecurLiabil);
    exp.add(loanExp54);
      
    // End of Expenses List
    return exp;
  }
    
}
