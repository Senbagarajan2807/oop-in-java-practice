class ObjectCreation{
    int objId;
    String objName;
}
class Main{
    public static void main(String[] args){
        ObjectCreation obj = new ObjectCreation();
        obj.objId = 1;
        obj.objName = "firstObject";
        System.out.println("Object ID: "+ obj.objId + " Object Name: " + obj.objName);
    }
}