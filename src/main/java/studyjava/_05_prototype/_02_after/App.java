package studyjava._05_prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        //repository는 user 이름과 repository 이름을 갖고 있음
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        //githubissue에는 이슈 아이디와 제목, 그리고 이슈가 속해있는 Repository 정보를 갖는다.
        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");


        //위의 2개를 가지고 url을 만들 수 있음
        String url = githubIssue.getUrl();
        System.out.println(url);

        //새로운 깃헙 이슈를 만든다고 할때
        //위의 일련의 과정을 다시한번 하는 것이 아니라
        //대부분의 데이터는 전부 갖고 데이터를 복재하여 github issue만 변경 하여 사용 하도록 한다.

        //클론을 사용을 할 수 없는 이유는 protected로 되어 있기 때문에 기본 사용이 불가능 한다.
        //클론을 지원 해주고 싶은 클래스가 있다면
        //implements Cloneable을 하여 Clone 메서드를 재정의 해준다.
        //자바가 해주는 clone을 사용하려면 super.clone()을 하면 된다.
        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());
        System.out.println("동일한 메모리 주소를 갖는가? : " + (clone == githubIssue));
        System.out.println("동일한 내용인가? : " + clone.equals(githubIssue));
        System.out.println("동일한 클래스인가? : " + (clone.getClass() == githubIssue.getClass()));
        //이 경우 Repository는 동일한 메모리 주소를 갖는 객체이다.
        System.out.println("Repository는 동일한 메모리를 참조 하는가가? : "+ (clone.getRepository() == githubIssue.getRepository()));
        //이것 마저 새로 생성되게 하려면 clone을 재정의 해야 한다.

    }

}
