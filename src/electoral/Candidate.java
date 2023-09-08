/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electoral;

/**
 *
 * @author AULAFISI
 */
public class Candidate {
    private int _code;
    private String _name;
    private int _votes;
    
    public Candidate(int code, String name){
        _code = code;
        _name = name;
        _votes = 0;
    }

    /**
     * @return the _code
     */
    public int getCode() {
        return _code;
    }

    /**
     * @param _code the _code to set
     */
    public void setCode(int _code) {
        this._code = _code;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _votes
     */
    public int getVotes() {
        return _votes;
    }

    /**
     * @param _votes the _votes to set
     */
    public void setVotes(int _votes) {
        this._votes = _votes;
    }
    
    public void addingVotes ( int quantity){
        _votes += quantity;
    }
}
