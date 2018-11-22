package cis104mmachineproject;

// Class containing all methods for calculating the components of the
// Income Tax Calculator 

public class IncomeTaxCalculator {
    String userName;           // Name of user
    double monthlyGrossIncome; // User-defined monthly gross income
    int numDependents;         // number of dependents of user (up to 4 only)
    boolean isUserMarried;     // Civil Status of user
    String employmentStatus;   // Employment Status of user (Employed or Self-Employed)
    
    // Constructor Method for Class variables
    public IncomeTaxCalculator(
            String nameGiven,
            double userIncome,
            int userDependents,
            boolean userCivil,
            String userStatus
    )
    {
        userName = nameGiven;
        monthlyGrossIncome = userIncome;
        numDependents = userDependents;
        isUserMarried = userCivil;
        employmentStatus = userStatus;
    }
    
    // Method that returns the name of the user (userName)
    public String getName(){
        return userName;
    }
    
    // Method that returns the Annual Taxable Income of the user based on the
    // pre-TRAIN tax rate
    public double calculateAnnualIncomeOld(){
        if (monthlyGrossIncome <= 82000){
            return monthlyGrossIncome * 12;
        }
        else {
            return (monthlyGrossIncome * 12) + monthlyGrossIncome - 82000; // Annual bonuses in excess of P82,000 is taxable
        }
    }
    
    // Method that returns the Annual Taxable Income of the user based on the
    // TRAIN tax rate
    public double calculateAnnualIncomeNew(){
        if (monthlyGrossIncome <= 90000){
            return monthlyGrossIncome * 12;
        }
        else {
            return (monthlyGrossIncome * 12) + monthlyGrossIncome - 90000; // Annual bonuses in excess of P90,000 is taxable
        }
    }
    
    // Method that calculates Tax Exemption for users with dependents
    // P25,000 per dependent, maximum of 4 dependents only
    public double getDependentExemption(){
        double result = 0;
        if (numDependents>=0&&numDependents<=4){
        return result = numDependents * 25000;
        } else if (numDependents>4){
            return result = 100000;
        }
      return result;
    }
    
    // Method that calculates Tax Exemption based on user's civil status
    // For Married - less P50,000 from Taxable Income
    public double getMarriedExemption(){
        if (isUserMarried){
            return 50000;
        } else {
            return 0;
        }
    }
    
    // Method that returns PAGIBIG Monthly Deduction
    // Default contribution is P100.00 across the board
    public double getPAGIBIGDeduction(){
        return 100.00;
    }
    
    // Method that returns SSS Monthly Deduction
    public double getSSSDeduction(){
        double result = 0;
        if (monthlyGrossIncome>=1000.00&&monthlyGrossIncome<=1249.99){
            if ("e".equals(employmentStatus)) {
                result = 36.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 110.00;
            }
        }
        else if (monthlyGrossIncome>=1250.00&&monthlyGrossIncome<=1749.99){
            if ("e".equals(employmentStatus)) {
                result = 54.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 165.00;
            }
        }
        else if (monthlyGrossIncome>=1750.00&&monthlyGrossIncome<=2249.99){
            if ("e".equals(employmentStatus)) {
                result = 72.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 220.00;
            }
        }
        else if (monthlyGrossIncome>=2250.00&&monthlyGrossIncome<=2749.99){
            if ("e".equals(employmentStatus)) {
                result = 90.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 275.00;
            }
        }
        else if (monthlyGrossIncome>=2750.00&&monthlyGrossIncome<=3249.99){
            if ("e".equals(employmentStatus)) {
                result = 109.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 330.00;
            }
        }
        else if (monthlyGrossIncome>=3250.00&&monthlyGrossIncome<=3749.99){
            if ("e".equals(employmentStatus)) {
                result = 127.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 385.00;
            }
        }
        else if (monthlyGrossIncome>=3750.00&&monthlyGrossIncome<=4249.99){
            if ("e".equals(employmentStatus)) {
                result = 145.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 440.00;
            }
        }
        else if (monthlyGrossIncome>=4250.00&&monthlyGrossIncome<=4749.00){
            if ("e".equals(employmentStatus)) {
                result = 163.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 495.00;
            }
        }
        else if (monthlyGrossIncome>=4750.00&&monthlyGrossIncome<=5249.99){
            if ("e".equals(employmentStatus)) {
                result = 181.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 550.00;
            }
        }
        else if (monthlyGrossIncome>=5250.00&&monthlyGrossIncome<=5749.99){
            if ("e".equals(employmentStatus)) {
                result = 199.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 605.00;
            }
        }    
        else if (monthlyGrossIncome>=5750.00&&monthlyGrossIncome<=6249.99){
            if ("e".equals(employmentStatus)) {
                result = 218.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 660.00;
            }            
        }
        else if (monthlyGrossIncome>=6250.00&&monthlyGrossIncome<=6749.99){
            if ("e".equals(employmentStatus)) {
                result = 236.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 715.00;
            }            
        }
        else if (monthlyGrossIncome>=6750.00&&monthlyGrossIncome<=7249.99){
            if ("e".equals(employmentStatus)) {
                result = 254.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 770.00;
            }            
        }
        else if (monthlyGrossIncome>=7250.00&&monthlyGrossIncome<=7749.99){
            if ("e".equals(employmentStatus)) {
                result = 272.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 825.00;
            }            
        }
        else if (monthlyGrossIncome>=7750.00&&monthlyGrossIncome<=8249.99){
            if ("e".equals(employmentStatus)) {
                result = 290.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 880.00;
            }            
        }
        else if (monthlyGrossIncome>=8250.00&&monthlyGrossIncome<=8749.99){
            if ("e".equals(employmentStatus)) {
                result = 308.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 935.00;
            }            
        }
        else if (monthlyGrossIncome>=8750.00&&monthlyGrossIncome<=9249.99){
            if ("e".equals(employmentStatus)) {
                result = 327.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 990.00;
            }            
        }
        else if (monthlyGrossIncome>=9250.00&&monthlyGrossIncome<=9749.99){
            if ("e".equals(employmentStatus)) {
                result = 345.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1045.00;
            }            
        }
        else if (monthlyGrossIncome>=9750.00&&monthlyGrossIncome<=10249.99){
            if ("e".equals(employmentStatus)) {
                result = 363.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1100.00;
            }            
        }
        else if (monthlyGrossIncome>=10250.00&&monthlyGrossIncome<=10749.99){
            if ("e".equals(employmentStatus)) {
                result = 381.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1155.00;
            }            
        }
        else if (monthlyGrossIncome>=10750.00&&monthlyGrossIncome<=11249.99){
            if ("e".equals(employmentStatus)) {
                result = 399.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 990.00;
            }            
        }
        else if (monthlyGrossIncome>=11250.00&&monthlyGrossIncome<=11749.99){
            if ("e".equals(employmentStatus)) {
                result = 417.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1265.00;
            }            
        }
        else if (monthlyGrossIncome>=11750.00&&monthlyGrossIncome<=12249.99){
            if ("e".equals(employmentStatus)) {
                result = 436.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1320.00;
            }            
        }
        else if (monthlyGrossIncome>=12250.00&&monthlyGrossIncome<=12749.99){
            if ("e".equals(employmentStatus)) {
                result = 454.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1375.00;
            }            
        }
        else if (monthlyGrossIncome>=12750.00&&monthlyGrossIncome<=13249.99){
            if ("e".equals(employmentStatus)) {
                result = 472.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1430.00;
            }            
        }
        else if (monthlyGrossIncome>=13250.00&&monthlyGrossIncome<=13749.99){
            if ("e".equals(employmentStatus)) {
                result = 490.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1485.00;
            }            
        }
        else if (monthlyGrossIncome>=13750.00&&monthlyGrossIncome<=14249.99){
            if ("e".equals(employmentStatus)) {
                result = 508.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1540.00;
            }            
        }
        else if (monthlyGrossIncome>=14250.00&&monthlyGrossIncome<=14749.99){
            if ("e".equals(employmentStatus)) {
                result = 526.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1595.00;
            }            
        }
        else if (monthlyGrossIncome>=14750.00&&monthlyGrossIncome<=15249.99){
            if ("e".equals(employmentStatus)) {
                result = 545.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1650.00;
            }            
        }
        else if (monthlyGrossIncome>=15250.00&&monthlyGrossIncome<=15749.99){
            if ("e".equals(employmentStatus)) {
                result = 563.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1705.00;
            }            
        }
        else if (monthlyGrossIncome>=15750.00){
            if ("e".equals(employmentStatus)) {
                result = 581.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1760.00;
            }            
        }
        
        return result;        
    }
    
    //Method that returns PhilHealth Monthly Deduction
    public double getPhilHealthDeduction(){
        double result = 0;
        if (monthlyGrossIncome<=8999.99){
            if ("e".equals(employmentStatus)) {
                result = 100.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 200.00;
            }
        }
        if (monthlyGrossIncome>=9000.00&&monthlyGrossIncome<=9999.99){
            if ("e".equals(employmentStatus)) {
                result = 112.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 225.00;
            }
        }
        if (monthlyGrossIncome>=10000.00&&monthlyGrossIncome<=10999.99){
            if ("e".equals(employmentStatus)) {
                result = 125.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 250.00;
            }
        }
        if (monthlyGrossIncome>=11000.00&&monthlyGrossIncome<=11999.99){
            if ("e".equals(employmentStatus)) {
                result = 137.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 275.00;
            }
        }
        if (monthlyGrossIncome>=12000.00&&monthlyGrossIncome<=12999.99){
            if ("e".equals(employmentStatus)) {
                result = 150.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 300.00;
            }
        }
        if (monthlyGrossIncome>=13000.00&&monthlyGrossIncome<=13999.99){
            if ("e".equals(employmentStatus)) {
                result = 162.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 325.00;
            }
        }
        if (monthlyGrossIncome>=14000.00&&monthlyGrossIncome<=14999.99){
            if ("e".equals(employmentStatus)) {
                result = 175.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 350.00;
            }
        }
        if (monthlyGrossIncome>=15000.00&&monthlyGrossIncome<=15999.99){
            if ("e".equals(employmentStatus)) {
                result = 187.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 375.00;
            }
        }
        if (monthlyGrossIncome>=16000.00&&monthlyGrossIncome<=16999.99){
            if ("e".equals(employmentStatus)) {
                result = 200.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 400.00;
            }
        }
        if (monthlyGrossIncome>=17000.00&&monthlyGrossIncome<=17999.99){
            if ("e".equals(employmentStatus)) {
                result = 212.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 425.00;
            }
        }
        if (monthlyGrossIncome>=18000.00&&monthlyGrossIncome<=18999.99){
            if ("e".equals(employmentStatus)) {
                result = 225.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 450.00;
            }
        }
        if (monthlyGrossIncome>=19000.00&&monthlyGrossIncome<=19999.99){
            if ("e".equals(employmentStatus)) {
                result = 237.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 475.00;
            }
        }
        if (monthlyGrossIncome>=20000.00&&monthlyGrossIncome<=20999.99){
            if ("e".equals(employmentStatus)) {
                result = 250.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 500.00;
            }
        }
        if (monthlyGrossIncome>=21000.00&&monthlyGrossIncome<=21999.99){
            if ("e".equals(employmentStatus)) {
                result = 262.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 525.00;
            }
        }
        if (monthlyGrossIncome>=22000.00&&monthlyGrossIncome<=22999.99){
            if ("e".equals(employmentStatus)) {
                result = 275.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 550.00;
            }
        }
        if (monthlyGrossIncome>=23000.00&&monthlyGrossIncome<=23999.99){
            if ("e".equals(employmentStatus)) {
                result = 287.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 575.00;
            }
        }
        if (monthlyGrossIncome>=24000.00&&monthlyGrossIncome<=24999.99){
            if ("e".equals(employmentStatus)) {
                result = 300.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 600.00;
            }
        }
        if (monthlyGrossIncome>=25000.00&&monthlyGrossIncome<=25999.99){
            if ("e".equals(employmentStatus)) {
                result = 312.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 625.00;
            }
        }
        if (monthlyGrossIncome>=26000.00&&monthlyGrossIncome<=26999.99){
            if ("e".equals(employmentStatus)) {
                result = 325.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 650.00;
            }
        }
        if (monthlyGrossIncome>=27000.00&&monthlyGrossIncome<=27999.99){
            if ("e".equals(employmentStatus)) {
                result = 337.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 675.00;
            }
        }
        if (monthlyGrossIncome>=28000.00&&monthlyGrossIncome<=28999.99){
            if ("e".equals(employmentStatus)) {
                result = 350.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 700.00;
            }
        }
        if (monthlyGrossIncome>=29000.00&&monthlyGrossIncome<=29999.99){
            if ("e".equals(employmentStatus)) {
                result = 362.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 725.00;
            }
        }
        if (monthlyGrossIncome>=30000.00&&monthlyGrossIncome<=30999.99){
            if ("e".equals(employmentStatus)) {
                result = 375.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 750.00;
            }
        }
        if (monthlyGrossIncome>=31000.00&&monthlyGrossIncome<=31999.99){
            if ("e".equals(employmentStatus)) {
                result = 387.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 775.00;
            }
        }
        if (monthlyGrossIncome>=32000.00&&monthlyGrossIncome<=32999.99){
            if ("e".equals(employmentStatus)) {
                result = 400.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 800.00;
            }
        }
        if (monthlyGrossIncome>=33000.00&&monthlyGrossIncome<=33999.99){
            if ("e".equals(employmentStatus)) {
                result = 412.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 825.00;
            }
        }
        if (monthlyGrossIncome>=34000.00&&monthlyGrossIncome<=34999.99){
            if ("e".equals(employmentStatus)) {
                result = 425.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 850.00;
            }
        }
        if (monthlyGrossIncome>=35000.00){
            if ("e".equals(employmentStatus)) {
                result = 437.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 875.00;
            }
        }
        return result;
    }
    
    // Method to get the ANNUAL TAX DUE under TRAIN Law 
    // based on Annual Taxable Income (Monthly Taxable Income * 12)
    public double getAnnualIncomeTaxNew( double annualTaxableIncome ){
        double result = 0;
        if (annualTaxableIncome<=250000.00){    
            result = 0;
        }
        else if (annualTaxableIncome>250000.00&&annualTaxableIncome<=400000.00){
            result = (annualTaxableIncome - 250000.00) * 0.20;
        }
        else if (annualTaxableIncome>400000.00&&annualTaxableIncome<=800000.00){
            result = 30000.00 + ((annualTaxableIncome - 400000.00) * 0.25);
        }
        else if (annualTaxableIncome>800000.00&&annualTaxableIncome<=2000000.00){
            result = 130000.00 + ((annualTaxableIncome - 800000.00) * 0.30);
        }
        else if (annualTaxableIncome>2000000.00&&annualTaxableIncome<=8000000.00){
            result = 490000.00 + ((annualTaxableIncome - 2000000.00) * 0.32);
        }
        else if (annualTaxableIncome>8000000.00){
            result = 2410000.00 + ((annualTaxableIncome - 8000000.00) * 0.35);
        }
        return result;
    }
    
        // Method to get Annual Taxable Income before implementation of TRAIN Law
        public double getAnnualIncomeTaxOld( double annualTaxableIncome ){
        double result = 0;
        if (annualTaxableIncome<=10000.00){    
            result = annualTaxableIncome * 0.05;
        }
        else if (annualTaxableIncome>10000.00&&annualTaxableIncome<=30000.00){
            result = 500 + ((annualTaxableIncome - 10000.00) * 0.10);
        }
        else if (annualTaxableIncome>30000.00&&annualTaxableIncome<=70000.00){
            result = 2500.00 + ((annualTaxableIncome - 30000.00) * 0.15);
        }
        else if (annualTaxableIncome>70000.00&&annualTaxableIncome<=140000.00){
            result = 8500.00 + ((annualTaxableIncome - 70000.00) * 0.20);
        }
        else if (annualTaxableIncome>140000.00&&annualTaxableIncome<=250000.00){
            result = 22500.00 + ((annualTaxableIncome - 140000.00) * 0.25);
        }
        else if (annualTaxableIncome>250000.00&&annualTaxableIncome<=500000.00){
            result = 50000.00 + ((annualTaxableIncome - 250000.00) * 0.30);
        }
        else if (annualTaxableIncome>500000.00){
            result = 125000.00 + ((annualTaxableIncome - 500000.00) * 0.32);
        }
        return result;
    }
    
    
}


