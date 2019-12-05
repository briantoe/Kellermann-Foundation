package beans;

import dao.CachedOptionsDAO;
import model.CachedOptions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "CachedOptionsBean")
@SessionScoped
public class CachedOptionsBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private CachedOptions co;
    private List<CachedOptions> displayList;


    public CachedOptionsBean(){

    }

    public List<CachedOptions> get_options(String type)
    {
        System.out.println("in get_options");
        System.out.println(type);
        try{
            return CachedOptionsDAO.Get_Options(type);
        } catch(Exception ex){
            System.err.println("CachedOptionsBean Error: Method: get_options(String type)" + ex.getMessage());
            return null;
        }
    }
}
