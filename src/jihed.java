public class jihed {



        public static String inverse(String chaine) {
            String inverse = "";
            for (int i = chaine.length() - 1; i >= 0; i--) {
                inverse += chaine.charAt(i);
            }
            return inverse;
        }

    }

