package tools.packet.provider;

/**
 *
 * @author 黯淡
 */
public enum SpecialEffectType {

    //等級提升[178-完成]
    LEVEL_UP(0x0),
    //近端技能特效[178-完成]
    LOCAL_SKILL(0x1),
    //遠端技能特效[178-完成]
    REMOTE_SKILL(0x2),
    //神之子特效[178-完成]
    ZERO(0x3),
    //機甲戰神-輔助機器特效[178-完成]showDiceEffect
    MECHANIC(0x4),
    UNK5(0x5),
    UNK6(0x6),
    //物品獲得/丟棄文字特效[178-完成]
    ITEM_OPERATION(0x7),
    //寵物等級提升[178-完成]
    PET_LEVEL_UP(0x8),
    //技能飛行體特效[178-完成]
    SKILL_FLYING_OBJECT(0x9),
    UNK10(0xA),
    USE_CHARM(0xB),
    MULUNG_DOJO_UP(0xD),
    //職業變更[178-完成]
    CHANGE_JOB(0xE),
    //任務完成[178-完成]
    QUET_COMPLETE(0xF),
    REWARD_ITEM(0x14),
    ITEM_LEVEL_UP(0x15),
    ItemMaker_Success_3rdParty(0x16),
    DODGE_CHANCE(0x17),
    //顯示WZ的效果[178-完成]
    WZ(0x18),
    //顯示WZ的效果2[182-完成]
    WZ_NEW(0x1C),
    //商城道具效果[178-完成]
    CASH_ITEM(0x20),
    //恢復HP效果[178-完成]
    HP_HEALED(0x21),
    CHAMPION(0x23),
    CRAFTING(0x2C),
    UNSEAL_BOX(0x34),
    DublStart(0x35),
    RECHARGE(0x37),
    //暗夜行者技能特效[178-完成]
    FIRE(0x44),
    ;

    private final int value;

    private SpecialEffectType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
