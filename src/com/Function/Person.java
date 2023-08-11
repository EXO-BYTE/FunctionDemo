package com.Function;

class Person {
    private String personName;
    private String emailld;

    public Person(String personName, String emailld) {
        this.personName = personName;
        this.emailld = emailld;
    }

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", emailld=" + emailld + "]";
	}

	public String getEmailld() {
		return emailld;
	}

	public void setEmailld(String emailld) {
		this.emailld = emailld;
	}
}
