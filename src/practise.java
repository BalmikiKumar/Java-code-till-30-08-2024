interface Left
{
    int x=888;
}
interface Right
{
    int x=999;
}
class practise implements Left,Right
{
    public static void main(String args[]) {

        System.out.println(Right.x);
        System.out.println(Left.x);

    }
}