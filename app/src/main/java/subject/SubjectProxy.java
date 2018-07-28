package subject;


/**
 * AIDL 中编译器帮我们实现的一个代理类
 * 为了方便我们和service端通信
 *
 */
public class SubjectProxy implements IinterfaceSubject {
    private IinterfaceSubject subject;
    public SubjectProxy(IinterfaceSubject s){
        this.subject=s;
    }
    @Override
    public void visit() {
        subject.visit();
    }
}
