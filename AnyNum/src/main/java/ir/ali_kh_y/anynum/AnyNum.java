package ir.ali_kh_y.anynum;

import com.sun.istack.internal.NotNull;

/**
 * @author      Ali Khaleqi Yekta <ali.kh.y.ir @gmail.com>
 * @version     1.0
 * @see <a href="https://github.com/ALI-KH-Y/AnyNum">Library Web Page</a>
 */
public final class AnyNum {
    /* ARABIC */

    /**
     * This method converts any English number to Arabic in a string
     *
     * @param  text A string including English numbers
     * @return Converted string including Arabic numbers
     */
    public static String enToAr(@NotNull String text) {
        try {
            char[] arabicChars = {'٠', '١', '٢', '٣', '٤', '٥', '٦', '٧', '٨', '٩'};
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i)))
                    builder.append(arabicChars[(int) (text.charAt(i)) - 48]);
                else
                    builder.append(text.charAt(i));
            }
            return builder.toString();

        } catch (Exception ignored) {
            return safeEnToAr(text);
        }
    }

    /**
     * This method converts any English number to Arabic in a string
     *
     * @param  onlyNumber A string including ONLY English numbers
     * @return Converted string including Arabic numbers
     */
    public static String enNumToAr(@NotNull String onlyNumber) {
        try {
            char[] arabicChars = {'٠', '١', '٢', '٣', '٤', '٥', '٦', '٧', '٨', '٩'};
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < onlyNumber.length(); i++)
                builder.append(arabicChars[(int) (onlyNumber.charAt(i)) - 48]);

            return builder.toString();

        } catch (Exception ignored) {
            return safeEnToAr(onlyNumber);
        }
    }

    /**
     * This method converts any English/Persian number to Arabic in a string
     *
     * @param  text A string including English/Persian numbers
     * @return Converted string including Arabic numbers
     */
    public static String anyToAr(@NotNull String text) {
        return
                //English to Arabic
                safeEnToAr(text)
                //Persian to Arabic (same character checks have been removed)
                .replace('۰', '٠')
                .replace('۱', '١')
                .replace('۲', '٢')
                .replace('۴', '٤')
                .replace('۵', '٥')
                .replace('۶', '٦')
                .replace('۷', '٧')
                .replace('۸', '٨');
    }

    /* PERSIAN */

    /**
     * This method converts any English number to Persian in a string
     *
     * @param  text A string including English numbers
     * @return Converted string including Persian numbers
     */
    public static String enToFa(@NotNull String text) {
        try {
            char[] persianChars = {'۰', '۱', '۲', '٣', '۴', '۵', '۶', '۷', '۸', '٩'};
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i)))
                    builder.append(persianChars[(int) (text.charAt(i)) - 48]);
                else
                    builder.append(text.charAt(i));
            }
            return builder.toString();

        } catch (Exception ignored) {
            return safeEnToFa(text);
        }
    }

    /**
     * This method converts any English number to Persian in a string
     *
     * @param  onlyNumber A string including ONLY English numbers
     * @return Converted string including Persian numbers
     */
    public static String enNumToFa(@NotNull String onlyNumber) {
        try {
            char[] persianChars = {'۰', '۱', '۲', '٣', '۴', '۵', '۶', '۷', '۸', '٩'};
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < onlyNumber.length(); i++)
                builder.append(persianChars[(int) (onlyNumber.charAt(i)) - 48]);

            return builder.toString();

        } catch (Exception ignored) {
            return safeEnToFa(onlyNumber);
        }
    }

    /**
     * This method converts any English/Arabic number to Persian in a string
     *
     * @param  text A string including English/Arabic numbers
     * @return Converted string including Persian numbers
     */
    public static String anyToFa(@NotNull String text) {
        return
                //English to Persian
                safeEnToFa(text)
                        //Arabic to Persian (same character checks have been removed)
                        .replace('٠', '۰')
                        .replace('١', '۱')
                        .replace('٢', '۲')
                        .replace('٤', '۴')
                        .replace('٥', '۵')
                        .replace('٦', '۶')
                        .replace('٧', '۷')
                        .replace('٨', '۸');
    }

    /* PRIVATE METHODS */
    private static String safeEnToAr(String text) {
        return text
                .replace('0', '٠')
                .replace('1', '١')
                .replace('2', '٢')
                .replace('3', '٣')
                .replace('4', '٤')
                .replace('5', '٥')
                .replace('6', '٦')
                .replace('7', '٧')
                .replace('8', '٨')
                .replace('9', '٩');
    }
    private static String safeEnToFa(String text) {
        return text
                .replace('0', '۰')
                .replace('1', '۱')
                .replace('2', '۲')
                .replace('3', '٣')
                .replace('4', '۴')
                .replace('5', '۵')
                .replace('6', '۶')
                .replace('7', '۷')
                .replace('8', '۸')
                .replace('9', '٩');
    }
}