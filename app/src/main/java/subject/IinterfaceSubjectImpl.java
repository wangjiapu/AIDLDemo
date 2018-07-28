package subject;


/**
 * 这个类在AIDL 中我们可以理解为我们将要自己实现的逻辑，
 *
 */
public class IinterfaceSubjectImpl implements IinterfaceSubject {

    @Override
    public void visit() {
        System.out.println("这是一个具体的实现类");
    }
}
