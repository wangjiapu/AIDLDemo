package subject;

public class SubjectClient {
    private IinterfaceSubject mSubject;

    public void main_client(SubjectProxy subjectProxy){
         mSubject=subjectProxy;
         mSubject.visit();
    }
}
