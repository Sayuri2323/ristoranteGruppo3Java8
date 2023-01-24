package it.ristoranteGruppo3.entities.enums;

/**
 * enum of all the types of first course
 */
public enum FirstCourseTypeEnum {

        SOUP("This is a soup"),
        PASTA("This dish is pasta"),
        RICE("This is a rice based dish"),
        GNOCCHI("This dish is gnocchi based"),
        PIZZA("This is a pizza"),
        ;
        private String typeOfFirstCourse;
        FirstCourseTypeEnum(String s) {
                this.typeOfFirstCourse = s;
        }
        public String getTypeOfFirstCourse() {
                return typeOfFirstCourse;
        }
}
