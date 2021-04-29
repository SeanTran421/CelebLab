

public class Celebrity
{
    private String celeb = "";
    private String celebHint = "";

    public Celebrity(String name, String hint)
    {
        celeb = name;
        celebHint = hint;
    }

    public String getCelebName()
    {
        return celeb;        
    }

    public String getCelebHint()
    {
        return celebHint;
    }

    public void setCelebName(String name)
    {
        celeb = name;
    }
    
    public void setCelebHint(String hint)
    {
        celebHint = hint;
    }

    public String toString()
    {
        return celeb + " " + celebHint;
    }
}