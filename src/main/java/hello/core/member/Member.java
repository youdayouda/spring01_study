package hello.core.member;

public class Member {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Long getPurchase_amount() {
        return purchase_amount;
    }

    public void setPurchase_amount(Long purchase_amount) {
        this.purchase_amount = purchase_amount;
    }

    private Long id;
    private String name;
    private Grade grade;
    private Long purchase_amount; //구매금액을 추가하여 주었습니다.


    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.purchase_amount = Long.valueOf(0);
    }

    //오버 로딩을 하여줍니다.
    public Member(Long id, String name, Grade grade, Long purchase_amount) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.purchase_amount = purchase_amount;
    }
}
