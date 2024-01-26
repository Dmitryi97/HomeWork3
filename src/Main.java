public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №3");
        //задача1
        System.out.println("Задача1");
        int a = 1000000;
        byte b = 100;
        short c = 30000;
        long d = 1000L;
        float f = 1.01F;
        double e = 1.0000000231;
        System.out.println("Значение переменной a " + " с типом int " + " равно" + a);
        System.out.println("Значение переменной b " + " с типом byte " + " равно" + b);
        System.out.println("Значение переменной c " + " с типом short " + " равно" + c);
        System.out.println("Значение переменной d " + " с типом long " + " равно" + d);
        System.out.println("Значение переменной f " + " с типом float " + " равно" + f);
        System.out.println("Значение переменной e " + " с типом double " + " равно" + e);
        //задача2
        System.out.println("Задача2");
        float g = 27.12f;
        long i = 987678965549L;
        float q = 2.786f;
        short w = 569;
        short r = -159;
        short t = 27897;
        byte y = 67;
        //задача3
        System.out.println("Задача3");
        int numberStudentsLydmilyPavlovny = 23;
        int numberStudentsAnnaSergeevna = 27;
        int numberStudentsEkaterinaAndreevna = 30;
        int totalPurchasedSheetsPaper = 480;
        int numberPurchasedSheetsPaperPerStudents = totalPurchasedSheetsPaper / (numberStudentsLydmilyPavlovny + numberStudentsAnnaSergeevna + numberStudentsEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано по " + numberPurchasedSheetsPaperPerStudents + " листов бумаги.");
        //задача4
        System.out.println("Задача4");
        byte productivityInTwoMinutesBottles = 16;
        byte productivitySixteenBottlesForMinutes = 2;
        byte productivitiInOneMinutesBottles = (byte) (productivityInTwoMinutesBottles / productivitySixteenBottlesForMinutes);
        byte time1InMinutes = 20;
        byte time2InDay = 1;
        short time2InMinutes = (short) (time2InDay * 24 * 60);
        byte time3InDay = 3;
        short time3InMinutes = (short) (time3InDay * 24 * 60);
        byte time4InMonths = 1;
        int time4InMinutes = time4InMonths * 30 * 24 * 60;
        short productivityInTime1 = (short) (time1InMinutes * productivitiInOneMinutesBottles);
        System.out.println("За " + time1InMinutes + " минут машина произвела " + productivityInTime1 + " штук бутылок.");
        short productivityInTime2 = (short) (time2InMinutes * productivitiInOneMinutesBottles);
        System.out.println("За " + time2InDay + " день машина произвела " + productivityInTime2 + " штук бутылок.");
        int productivityInTime3 = time3InMinutes * productivitiInOneMinutesBottles;
        System.out.println("За " + time3InDay + " дня машина произвела " + productivityInTime3 + " штук бутылок.");
        int productivityInTime4 = time4InMinutes * productivitiInOneMinutesBottles;
        System.out.println("За " + time4InMonths + " месяц машина произвела " + productivityInTime4 + " штук бутылок.");
        //задача5
        System.out.println("Задача5");
        byte numberBanksWhiteAndBrownPaintForSchoolRepair = 120;
        byte numberBanksWhitePaintsForOneClassRepair = 2;
        byte numberBanksBrownPaintsForOneClassRepair = 4;
        byte numberBanksForRepair = (byte) (numberBanksWhitePaintsForOneClassRepair + numberBanksBrownPaintsForOneClassRepair);
        byte numberClass = (byte) (numberBanksWhiteAndBrownPaintForSchoolRepair / numberBanksForRepair);
        byte numberBanksWitePaintForShoolRepair = (byte) (numberClass * numberBanksWhitePaintsForOneClassRepair);
        byte numberBanksBrownPauntForShoolRepair = (byte) (numberClass * numberBanksBrownPaintsForOneClassRepair);
        System.out.println("В школе где " + numberClass + " классов, нужно " + numberBanksWitePaintForShoolRepair + " банок белой краски и " + numberBanksBrownPauntForShoolRepair + " банок коричневой краски.");
        //задача6
        System.out.println("Задача6");
        byte massOneBananaInGrams = 80;
        byte massOneHundredMillilitersMilkInGrams = 105;
        byte massTwoPacksIceCreamInGrams = 100;
        byte massOneEggInGrams = 70;
        byte accordingRecipeBananasPieces = 5;
        short accordingRecipeMilkMilliliters = 200;
        byte accordingRecipeIceCreamPacks = 2;
        byte accordingRecEggPieces = 4;
        short grPerKg = 1000;
        short massBreakfastGrams = (short) (massOneBananaInGrams * accordingRecipeBananasPieces + massOneHundredMillilitersMilkInGrams * accordingRecipeMilkMilliliters + massTwoPacksIceCreamInGrams * accordingRecipeIceCreamPacks + massOneEggInGrams * accordingRecEggPieces);
        float massBreakfastKilogram = massBreakfastGrams / (float) grPerKg;
        System.out.println("Вес спортзавтрака, согласно репцепта равен " + massBreakfastGrams + " грамм");
        System.out.println("Вес спортзавтрака, согласно репцепта равен " + massBreakfastKilogram + " килограмм");
        //задача7
        System.out.println("Задача7");
        byte needLoseKilogram = 7;
        short canLose1gramsDay = 250;
        short canLose2gramsDay = 500;
        short numberWeightLoss1 = (short) ((needLoseKilogram * 1000) / canLose1gramsDay);
        short numberWeightLoss2 = (short) ((needLoseKilogram * 1000) / canLose2gramsDay);
        short numberWeightLossAverage = (short) ((numberWeightLoss1 + numberWeightLoss2) / 2);
        System.out.println("На похудение уйдет " + numberWeightLoss1 + " дней , при условии что худеть спортмен будет по " + canLose1gramsDay + " грамм в день.");
        System.out.println("На похудение уйдет " + numberWeightLoss2 + " дней , при условии что худеть спортмен будет по " + canLose2gramsDay + " грамм в день.");
        System.out.println("В среднем на похудение уйдет " + numberWeightLossAverage + " дней.");
        //задача8
        System.out.println("Задача8");
        int salaryMonthMasha = 67760;
        int salaryMonthMashaPercentage = 100;
        int salaryMonthDenis = 83690;
        int salaryMonthDenisPercentage = 100;
        int salaryMonthKristina = 76230;
        int salaryMonthKristinaPercentage = 100;
        byte salaryIncreasePercentage = 10;
        byte afterIncreaseSalaryPercentageMasha = (byte) (salaryMonthMashaPercentage + salaryIncreasePercentage);
        byte afterIncreaseSalaryPercentageDenis = (byte) (salaryMonthDenisPercentage + salaryIncreasePercentage);
        byte afterIncreaseSalaryPercentageKristina = (byte) (salaryMonthKristinaPercentage + salaryIncreasePercentage);
        int salaryIncreaseMasha = (salaryMonthMasha * afterIncreaseSalaryPercentageMasha) / salaryMonthMashaPercentage;
        int salaryIncreaseDenis = (salaryMonthDenis * afterIncreaseSalaryPercentageDenis) / salaryMonthDenisPercentage;
        int salaryIncreaseKristina = (salaryMonthKristina * afterIncreaseSalaryPercentageKristina) / salaryMonthKristinaPercentage;
        int annualIncomeBeforeIncreaseMasha = salaryMonthMasha * 12;
        int annualIncomeBeforeIncreaseDenis = salaryMonthDenis * 12;
        int annualIncomeBeforeIncreaseKristina = salaryMonthKristina * 12;
        int annualIncomeAfterIncreaseMasha = salaryIncreaseMasha * 12;
        int annualIncomeAfterIncreaseDenis = salaryIncreaseDenis * 12;
        int annualIncomeAfterIncreaseKristina = salaryIncreaseKristina * 12;
        int salaryDifferenceMasha = annualIncomeBeforeIncreaseMasha - annualIncomeAfterIncreaseMasha;
        int salaryDifferenceDenis = annualIncomeBeforeIncreaseDenis - annualIncomeAfterIncreaseDenis;
        int salaryDifferenceKristina = annualIncomeBeforeIncreaseKristina - annualIncomeAfterIncreaseKristina;
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей. Годовой доход вырос на " + Math.abs(salaryDifferenceMasha) + " рублей.");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей. Годовой доход вырос на " + Math.abs(salaryDifferenceDenis) + " рублей.");
        System.out.println("Крестина теперь получает " + salaryIncreaseKristina + " рублей. Годовой доход вырос на " + Math.abs(salaryDifferenceKristina) + " рублей.");


    }
}