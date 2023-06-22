package org.example;

public class Main {
    public static void main(String[] args) {

        // 1. Надає значення 4 полям типу int.
        System.out.println("1. Надає значення 4 полям типу int.");
        int intVal01 = 1;
        int intVal02 = 2;
        int intVal03 = 3;
        int intVal04 = 4;
        System.out.println("intVal01 = " + intVal01);
        System.out.println("intVal02 = " + intVal02);
        System.out.println("intVal03 = " + intVal03);
        System.out.println("intVal04 = " + intVal04);
        System.out.println("----------------------");

        // 2. Сумує їх попарно.
        System.out.println("2. Сумує їх попарно.");
        int firstSum = intVal01 +  intVal03;
        int secondSum = intVal02 + intVal04;
        System.out.println("firstSum = " + firstSum + ", Перша, сума intVal01 та intVal03");
        System.out.println("secondSum = " + secondSum + ", Друга, сума intVal02 та intVal04");
        System.out.println("----------------------");

        // 3. Виводить результат порівняння (true якщо Перша сума менша).
        System.out.println("3. Виводить результат порівняння (true якщо Перша сума менша).");
        System.out.println("firstSum = " + firstSum);
        System.out.println("secondSum = " + secondSum);
        if ( firstSum < secondSum)
            System.out.println("true, бо Перша сума менша");
        else
            System.out.println("false, бо Друга сума менша");
        System.out.println("----------------------");

        // 4. Збільшує Першу суму на 1.
        System.out.println("4. Збільшує Першу суму на 1.");
        int shortPlusOne = firstSum;
        shortPlusOne += 1;
        System.out.println("Збільшує Першу суму на 1, буде " + shortPlusOne);
        System.out.println("----------------------");

        // 5. Другу суму зменшує на 2.
        System.out.println("5. Другу суму зменшує на 2.");
        int shortMinusTwo = secondSum;
        shortMinusTwo -= 2;
        System.out.println("Другу суму зменшує на 2, буде " + shortMinusTwo);
        System.out.println("----------------------");

        // 6. Виводить результат порівняння сум (true, якщо перша сума більша).
        System.out.println("6. Виводить результат порівняння сум (true, якщо Перша сума більша).");
        System.out.println("shortPlusOne = " + shortPlusOne);
        System.out.println("shortMinusTwo = " + shortMinusTwo);
        boolean boolVal02 = shortPlusOne > shortMinusTwo;
        if ( shortPlusOne > shortMinusTwo)
            System.out.println("true, бо Перша сума більша");
        else
            System.out.println("false, бо Друга сума менша");
        System.out.println("----------------------");

        // 7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.
        System.out.println("7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.");
        System.out.println("shortPlusOne = " + shortPlusOne);
        System.out.println("shortMinusTwo = " + shortMinusTwo);

        if ( shortPlusOne % 2 == 0 || shortMinusTwo % 2 == 0 )
            System.out.println("true, бо одна сума з shortPlusOne чи shortMinusTwo кратна 2");
        else
            System.out.println("false, бо жодна сума з shortPlusOne чи shortMinusTwo не кратна 2");
    }
}