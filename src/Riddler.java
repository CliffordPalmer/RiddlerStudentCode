/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Clifford Palmer
 */
public class Riddler {

    // Method of encryption: a Ceasar cypher with a leftward shift of 9
    public String decryptOne(String encrypted) {
        String decrypted = "";

        // iterate through String, decrypting each letter and adding it to the decrypted String
        for(int  i = 0; i < encrypted.length(); i++){
            // If the character is a capital letter
            if(encrypted.charAt(i) >= 65 && encrypted.charAt(i) <= 90){
                // Apply a shift of 9
                Character decryptedChar = (char)((encrypted.charAt(i) - 'A' + (char)9) % 26 + 'A');
                // Add the decrypted character to the decrypted string
                decrypted += decryptedChar.toString();
            }
            // If the character is a lower case letter
            else if(encrypted.charAt(i) >= 97 && encrypted.charAt(i) <= 122){
                // Apply a shift of 9
                Character decryptedChar = (char)((encrypted.charAt(i) - 'a' + (char)9) % 26 + 'a');
                // Add the decrypted character to the decrypted string
                decrypted += decryptedChar.toString();
            }
            // if the character is not a letter
            else{
                // Just add the letter to the decyrpted String
                decrypted += encrypted.substring(i, i+1);
            }
        }
        // Print and return the result
        System.out.println(decrypted);
        return decrypted;
    }

    // Method of encryption: Each number represent an ASCII character
    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // Split the String into an array of strings by the placement of spaces
        String[] letters = encrypted.split(" ");
        // Iterate through array and translate ASCII numbers into letters and add to decrypted string
        for(String letter : letters){
            decrypted += Character.toString((char)Integer.parseInt(letter));
        }
        // Print and return result
        System.out.println(decrypted);
        return decrypted;
    }

    // Method of encryption: every 8 bits represents an ASCII character in binary
    public String decryptThree(String encrypted) {
        String decrypted = "";
        // Create an array for all the letters
        // 8 times shorter because every 8 bits represents one letter
        String[] letters = new String[encrypted.length()/8];
        // Translate 8-bit numebrs into ASCII characters
        for(int i = 0; i < encrypted.length()/8; i++){
            letters[i] = encrypted.substring(i*8, i*8 + 8);
        }
        // Iterate through array and add each translated number into the decrypted String
        for(String letter : letters){
            decrypted += Character.toString((char)Integer.parseInt(letter, 2));
        }
        // Print and return result
        System.out.println(decrypted);
        return decrypted;
    }

    // Method of encryption: essentially a Ceasar cypher with a huger shift of 9984
    public String decryptFour(String encrypted) {
        String decrypted = "";
        // Iterate through characters and apply the shift of 9984 and add to decrypted String
        for(int i = 0; i < encrypted.length(); i++){
            decrypted += Character.toString((encrypted.charAt(i) - (char)9984 + 'A'));
        }
        // Print and return results
        System.out.println(decrypted);
        return decrypted;
    }
}
