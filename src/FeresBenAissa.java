public class FeresBenAissa {
    // Fonction pour concaténer deux tableaux

    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] resultArray = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            resultArray[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            resultArray[arr1.length + i] = arr2[i];
        }

        return resultArray;
    }

    // Fonction pour calculer la racine carrée d'un nombre
    public static double calculateSquareRoot(double num) {
        return Math.sqrt(num);
    }
}

