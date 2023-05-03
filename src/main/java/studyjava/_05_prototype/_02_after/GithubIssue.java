package studyjava._05_prototype._02_after;


import java.util.Objects;

public class GithubIssue implements Cloneable{
//implements Cloneable을 하여 Clone 메서드를 재정의 해준다.


    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //자바가 해주는 clone을 사용하려면 super.clone()을 하면 된다.

        //Deep 카피가 가능하도록 구현
        //아예 생성을 고대로 해주도록 하네
        {
            GithubRepository repository = new GithubRepository();
            repository.setUser(this.repository.getUser());
            repository.setName(this.repository.getName());

            //githubissue에는 이슈 아이디와 제목, 그리고 이슈가 속해있는 Repository 정보를 갖는다.
            GithubIssue githubIssue = new GithubIssue(repository);
            githubIssue.setId(this.id);
            githubIssue.setTitle(this.title);
        }


        return super.clone();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
