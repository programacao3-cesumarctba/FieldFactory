package br.edu.unicesumar.main;

public class FieldFactory {
    private String type;
    private Integer position;
    private String screen;
    private Integer size;
    private Boolean required;
    private Integer id;
    private String name;
    private String onClick;
    private String onChange;
    private Boolean visibility;

    public FieldFactory(
        String type,
        Integer position,
        String screen,
        Integer size,
        Boolean required,
        Integer id,
        String name,
        String onClick,
        String onChange,
        Boolean visibility
    ) {
        this.type = type;
        this.position = position;
        this.screen = screen;
        this.size = size;
        this.required = required;
        this.id = id;
        this.name = name;
        this.onClick = onClick;
        this.onChange = onChange;
        this.visibility = visibility;
    }


    public String getType() {
        if(type.isEmpty()) {
            return "text";
        }
        return type;
    }

    public Integer getPosition() {
        return position;
    }

    public String getScreen() {
        return screen;
    }

    public Integer getSize() {
        return size;
    }

    public Boolean getRequired() {
        return required;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOnClick() {
        return onClick;
    }

    public String getOnChange() {
        return onChange;
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public String generateField() {
        return "<input id='" + getId() + "' type='" + getType() + "' name='" + getName() + "' required='" + getRequired() + "'" +
            "onchange='" + getOnChange() +"' onclick='" + getOnClick() + "' />";
    }
}
