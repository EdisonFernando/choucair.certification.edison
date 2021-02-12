package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchCoursePage;

public class Answer implements Question<Boolean> {
    private String questions;

    public Answer(String questions) {
        this.questions = questions;
    }

    public static Answer toThe(String questions) {
        return new Answer(questions);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if(questions.equals(nameCourse)){
            result=true;
        }
        else{
            result=false;
        }
        return result;
    }
}
