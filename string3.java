import java.util.*;
class String3
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT:");
        String s = sc.nextLine().toUpperCase();
        int l = s.length();
        if (s.charAt(l - 1) == '!' || s.charAt(l - 1) == '?' || s.charAt(l - 1) == '.') {
            boolean check = false;
            for (int i = 0; i < s.length() - 1; i++)
                if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90 || s.charAt(i) == ',' || s.charAt(i) == ' ') {
                    check = true;
                } else {
                    System.out.println("OUTPUT:INVALID INPUT");
                    check = false;
                    System.exit(0);
                }
            if (check) {
                System.out.print("WORDS TO BE DELETED:");
                String si = sc.nextLine().toUpperCase();
                System.out.print("WORDS POSITION IN THE SENTENCE:");
                int n = sc.nextInt();
                System.out.print("OUTPUT:");
                StringTokenizer st = new StringTokenizer(s);
                int c = st.countTokens();
                String s1[] = new String[c];

                for (int i = 0; i < c; i++)
                    s1[i] = st.nextToken();

                for (int i = 0; i < c; i++) {
                    if(i==n-1&&(s1[i].charAt(s1[i].length()-1)==','||s1[i].charAt(s1[i].length()-1)=='.'||s1[i].charAt(s1[i].length()-1)=='!'||s1[i].charAt(s1[i].length()-1)=='?')&&s1[i].substring(0,s1[i].length()-1).equals(si)) {
                        if ( i == n - 1) {
                            if(s1[i].charAt(s1[i].length()-1)==',')
                            System.out.print("\b"+","+" ");
                            if(s1[i].charAt(s1[i].length()-1)=='.')
                                System.out.print("\b"+".");
                                if(s1[i].charAt(s1[i].length()-1)=='?')
                                    System.out.print("\b"+"?");
                                    if(s1[i].charAt(s1[i].length()-1)=='!')
                                        System.out.print("\b"+"!");
                        }
                        else
                            System.out.print(s1[i] + " ");
                    }
                   else
                            if (s1[n - 1].equals(si)) {
                                if (i != n - 1)
                                    System.out.print(s1[i] + " ");
                            } else
                                System.out.print(s1[i] + " ");

            }
        }}
        else
            System.out.println("OUTPUT:INVALID INPUT");
    }
}
