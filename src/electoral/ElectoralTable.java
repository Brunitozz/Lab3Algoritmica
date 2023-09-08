/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electoral;

/**
 *
 * @author AULAFISI
 */
public class ElectoralTable {
    private int _number;
    private int _numberCandidates;
    private int _numberElectors;
    private int _counts[];
    
    public ElectoralTable(int number, int numberCandidate, int numberElectors){
        _number = number;
        _numberCandidates = numberCandidate;
        _numberElectors = numberElectors;
        _counts = new int [numberCandidate];
    }

    /**
     * @return the _number
     */
    public int getNumber() {
        return _number;
    }

    /**
     * @param _number the _number to set
     */
    public void setNumber(int _number) {
        this._number = _number;
    }

    /**
     * @return the _numberCandidates
     */
    public int getNumberCandidates() {
        return _numberCandidates;
    }

    /**
     * @param _numberCandidates the _numberCandidates to set
     */
    public void setNumberCandidates(int _numberCandidates) {
        this._numberCandidates = _numberCandidates;
    }

    /**
     * @return the _numberElectors
     */
    public int getNumberElectors() {
        return _numberElectors;
    }

    /**
     * @param _numberElectors the _numberElectors to set
     */
    public void setNumberElectors(int _numberElectors) {
        this._numberElectors = _numberElectors;
    }

    /**
     * @return the _counts
     */
    public int[] getCounts() {
        return _counts;
    }

    /**
     * @param _counts the _counts to set
     */
    public void setCounts(int[] _counts) {
        this._counts = _counts;
    }
     //Es para adicionar un voto a a la cuenta del candidato
    public void toVote (int candidate){
        _counts[candidate]++;
    }
    //Para obtener el numero de votos obtenidos por los candidatos
    public int quantityVotes(int candidate){
        return _counts[candidate];
    }
}
