public class GitTest{
    public static void main(String[] args){
        System.out.println("~~~~~~~~~~~~~Input for bash git commands~~~~~~~~~~~~~");
        System.out.println("useful bash input for git");
        System.out.printf("-  -git init- creates a new Git repository\r\n" + //
                        "-  -git status- inspects the contents of the working directory and staging area\r\n" + //
                        "-  -git add- adds files from the working directory to the staging area\r\n" + //
                        "-  -git diff- shows the difference between the working directory and the staging area\r\n" + //
                        "-  -git commit- permanently stores file changes from the staging area in the repository\r\n" + //
                        "-  -git log- shows a list of all previous commits");
        System.out.println();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~Additional git commit~~~~~~~~~~~~~");
        System.out.println("additionally, writing -git commit- by itself into terminal will take you to a text editor.");
        System.out.println("The keys for this are -i- for insert. While in this mode type what you want.");
        System.out.println("Press -esc- to exit the insert mode");
        System.out.println("Then type -:wq- to write and quit");
        System.out.println("something different");
    }
}