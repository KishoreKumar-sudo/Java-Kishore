class Test{
    public static void main(String[] args){
        String ename = "Kishore Kumar";
        ename = ename.concat("Indian Batsman");
        System.out.println(ename);
        System.out.println("Index of 'e':" + ename.indexOf('e'));
        System.out.println("Trim:" + ename.trim());
        System.out.println("Char At:" + ename.charAt(15));
        System.out.println("Value of 'a':" + ename.valueOf('a'));
        System.out.println("Sub String:" + ename.substring(5,10));
    }
}