package src.main.java;

class Model {
    private String summary;
    private String desc;

    public String getSummary() {
        return summary;
    }

    public String getDesc() {
        return desc;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Model{" +
                "summary='" + summary + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
