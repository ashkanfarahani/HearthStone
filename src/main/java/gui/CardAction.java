package gui;

public abstract class CardAction {
    private String actionName;
    private String action;
    private String actionType;

    public CardAction(String actionName, String action,String actionType) {
        this.actionName = actionName;
        this.action = action;
        this.actionType = actionType;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
}

class Summon extends CardAction{
    public Summon(String actionName, String action) {
        super(actionName, action, "summon");
    }
}
class BattleCry extends CardAction{
    public BattleCry(String actionName, String action) {
        super(actionName, action, "battleCry");
    }
}
class DeathRattle extends CardAction{
    public DeathRattle(String actionName, String action) {
        super(actionName, action, "deathRattle");
    }
}
class EndTurnAction extends CardAction{
    public EndTurnAction(String actionName, String action) {
        super(actionName, action, "endTurnAction");
    }
}