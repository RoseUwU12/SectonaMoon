public class Hero {
    WeaponController extends ArmorController();
    WeaponController wc = new WeaponController();
    ArmorController ac = new ArmorController();
    private int HeroHP;
    private int HeroWeapon;
    private int HeroXP; 
    private int HeroLvRequirement;
    private int HeroLV; 

    public Hero() { 
        ac.getArmorStats( 0 );
        HeroHP = 50 + ac.getArmorHPBoost();
        HeroWeapon = 0; 
        wc.getWeaponStats(HeroWeapon);

    }
    public void gainXP(int xp){ 
        HeroXP += xp ; 
        if (HeroXP >= HeroLvRequirement) { 
        HeroLV++; 
        HeroXP = 0;
        }
        else { 
        break; 
        }
    } 
    public int getHeroHP() { 
        return HeroHP;
    }
    public int getHeroLV(){
        return HeroLV;
    }
    
    public void XpRequirement(int Lv){
        case 1 {
            return Lv; 
        }
        case 2 { 
        break; 
        }
    }
    super { 
        case 1 {
    () => Ac.getWeapon(40 , 45 , 60);

    () => 58; 

    break; 
        }
        case 
    }
}
