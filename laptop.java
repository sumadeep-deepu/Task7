public interface laptop{
    public void copy();
    public void paste();
    public void keyborad();
    public void mouse();

    default void security(){
        System.out.println("please implement");
    }

    static void capture(){
        System.out.println("capture photo");
    }
}
