package com.gabut.projection.myfirstapp;

import java.util.ArrayList;

public class CharacterData {
    private static String[] characterNames = {
            "Diene",
            "Kayron",
            "Kise",
            "Luna",
            "Destina",
            "Tamarinne",
            "Silver Blade Aramintha",
            "Cermia",
            "Lidica",
            "Cecilia"
    };

    private static String[] characterDetails = {
            "Diene, Saint of Ezera, received the Goddess's divine revelation and fearlessly led the world to victory against the Archdemon, even without the heir of the Covenant. Later, she became Ezera's queen.",
            "An Acolyte, and commander of an army of undead known as the Dust Walkers. It is said the he demands your soul and loyalty in return for releasing you from your grudges.",
            "An heir to the Sixth World, Kise is leader of the Nocturnes. She fought every battle against the Archdemon alongside the Guardian Kromcruz. Though she can be sluggish and sharp-tongued, she cares greatly for her fellow Heirs.",
            "Luna is a half-Dragon, half-Human knight that has been loyal to Wintenberg since the time of Queen Francesca. Only a few know of the true feelings hidden behind her smile.",
            "Nicknamed \"the Beast of the Western Light,\" Destina is a master of light and metal who has physically manifested in the image of her deeply beloved Soul Weaver, Ruele.",
            "An idol that brings joy and cheer through her electrifying music. She has great magical talent and can harness magic with her voice. She changes her appearance on stage with the Blooming Pendant and becomes more dynamic and lively.",
            "Aramintha is a gentle and cheerful woman, and leader of the Phantom CIC, a group dedicated to investigating the Unknown to whom she lost her husband. She is an incredible fighter, but often she gets caught up bragging about her husband when she's not in a battle.",
            "A fiercely competitive but also horribly unlucky knight, she is very hot-headed and often gambles and loses everything. Her impulsive nature forced her parents to give all of the inheritance to her sister Carrot, who provides her an allowance to live off of.",
            "Expelled from the Rose Apostles, she joined the Phantom CIC to investigate the Land of Death. She wanted to defeat the Unknown and instill faith unto others. However, her rough personality still causes problems within the Phantom CIC.",
            "A brave woman known as the Storm Dragon Knight. Cecilia is Queen of Winterberg and has a strong sense of responsibility. She has a righteous and sincere personality, but will stubbornly resist any attempts to change her mind."
    };

    private static int[] characterImages = {
            R.drawable.diene,
            R.drawable.kayron,
            R.drawable.kise,
            R.drawable.luna,
            R.drawable.destina,
            R.drawable.tamarinne,
            R.drawable.aramintha,
            R.drawable.cermia,
            R.drawable.lidica,
            R.drawable.cecilia
    };

    private static String[] characterSkillA = {
            "Light of Judgment",
            "Void Slash",
            "Full Moon Scythe",
            "Infinity Slash",
            "Key to an Oath",
            "Serene Tune",
            "Flame Friction",
            "Playing with Fire",
            "Wild Rose",
            "Deliverance"
    };

    private static String[] characterSkillB = {
            "Blessing of the Goddess",
            "Immortal Will",
            "Dark Scar",
            "Dragon Knight's Will",
            "Regen",
            "Song of the Forest",
            "Flame Release",
            "Hot Streak!",
            "Thornbush",
            "Steel Cloudburst"
    };

    private static String[] characterSkillC = {
            "Saint's Prayer",
            "Apocalypse",
            "Nocturne",
            "Ragnar Spear",
            "Destina's Grace",
            "Shining Star",
            "Meteor Fall",
            "All-In!",
            "Public Execution",
            "Ruinous Retribution"
    };

    private static String[] detailSkillA = {
            "Emits a ray of brilliant light, increasing the caster's Combat Readiness by 10%. Effect doubles when caster is buffed.",
            "Attacks with a sword, with a 35% chance to decrease Hit Chance for 1 turn, dealing damage proportional to the caster's lost Health.",
            "Attacks with a scythe. Damage dealt increases by 70% when the target is buffed.",
            "Stabs the target a random number of times. Skill cooldown decreases by 1-3 turns and damage dealt increases according to the number of attacks.",
            "Attacks the enemy with a staff and heals the ally with the lowest Health. Healing increases proportional to the target's max Health.",
            "(Tamarinne) Attacks an enemy with serene melody and heals the ally with the lowest Health. Amount recovered increases proportional to the ally's max Health. Decreases cooldown of Shining Star by 1 turn. (Idol) Attacks all enemies with a beautiful voice, dispelling all buffs. Triggers a Dual Attack from the ally with the highest Attack.",
            "Attacks the enemy with an explosion of flame, with a 65% chance to burn for 1 turn.",
            "Attacks with a flaming sword, with a 55% chance to make the target unhealable for 1 turn.",
            "Attacks with a sword, decreasing Combat Readiness by 15%. If the enemy is debuffed, decreases Combat Readiness by another 10%.",
            "Attacks with a spear, with a 35% chance to decrease Defense for 2 turns. Damage dealt increases proportional to the caster's max Health."
    };

    private static String[] detailSkillB = {
            "With the Blessing of the Goddess, covers all allies with a barrier for 2 turns before dispelling one debuff. Barrier strength increases proportional to the target's max Health.",
            "Grants immortality for 1 turn when the caster receives lethal damage and resets skill cooldown of Apocalypse. Can only be activated once every 9 turns. On the caster's turn, when buffed and using Void Slash, the skill will become an AoE attack and does not trigger Dual Attack.",
            "Attacks all enemies with a scythe. Penetrates Defense by 60% if caster is stealthed.",
            "Increases Attack and Critical Hit Chance by 20% if the caster's Health is more than 50%, or increases Defense and decreases chance of suffering a critical hit by 20% if the caster's Health is less than 50%.",
            "Blessing an ally, recovering their Health and increasing their Combat Readiness by 30%. Healing increases Proportional to the caster's max Health.",
            "(Tamarinne) Heals all allies with a peaceful melody. Amount recovered increases proportional to the caster's max Health. Decreases cooldown of Shining Star by 1 turn. (Idol) With a powerful performance, increases Attack of all allies for 2 turns and increases Combat Readiness by 30%, recovering Health. Amount recovered increases proportional to the caster's max Health.",
            "Activates Flame Release if the enemy is burned after using Flame Friction. Flame Release: Attacks all enemies with mystic fire energy, increasing the caster's Combat Readiness by 20%.",
            "Shoots fire, granting the caster Increase Attack (Greater), resetting the cooldown of All-In!, and granting an extra turn.",
            "Attacks all enemies, with an 85% chance to decrease Hit Chance for 1 turn and dispels one buff.",
            "Attacks all enemies with a magical spear with a 35% chance to decrease Attack for 2 turns. The chance increases by 50% when the caster's Health is less than 50%. Damage dealt increases proportional to the caster's max Health."
    };

    private static String[] detailSkillC = {
            "A miracle of the Goddess manifests, increasing Attack and Critical Hit Resistance of all allies for 3 turns, before increasing the caster's Combat Readiness by 50%.",
            "Attacks the enemy by exploding the Archdemon's Might contained within their sword, increasing Attack of the caster for 2 turns. If the enemy is defeated, extends any buffs granted to the caster by 1 turn. Deals damage proportional to the caster's lost Health.",
            "Leaps towards the enemy to attack, increasing skill cooldowns by 2 turns, before granting stealth to the caster for 2 turns. A critical hit will grant a barrier to the caster for 2 turns. Barrier strength increases proportional to the caster's Attack. Damage dealt increases proportional to caster's current health.",
            "Soars into the air and hits the enemy with a spear, with a 80% chance to decrease Defense for 2 turns. Attacks with a more powerful element.",
            "Grants all allies the blessing of a Spirit Lord, dispelling all debuffs and recovering Health. If ally is debuffed, their Combat Readiness will also be increased by 15% per each debuff. Effect can only be applied up to 4 times. Healing increases Proportional to the caster's max Health.",
            "Before performing, dispels all debuffs inflicted on all allies and recovers the caster to max Health and grants an extra turn. The caster becomes an idol for 3 turns and performs a concert. Begins the first battle with full cooldown count.",
            "Drops a giant meteor to stun all enemies for 1 turn, with a 40% chance each to inflict two burn effects for 2 turns.",
            "Attacks with a blazing inferno, penetrating Defense by 50%.",
            "Attacks the enemy with a whip sword and decreases Combat Readiness by 100% and decrease Speed and making them unhealable for 2 turns. Grants the caster Skill Nullifier, negating damage received from the next attack.",
            "Attacks all enemies with a spear infused with dark energy, 85% chance to provoke for 1 turn, granting a barrier to the caster for 2 turns. Damage dealt and barrier strength increases proportional to the caster's max Health."
    };

    private static int[] imageSkillA = {
            R.drawable.lightofjudgment,
            R.drawable.voidslash,
            R.drawable.fullmoonsctyhe,
            R.drawable.infinityslash,
            R.drawable.keytoanoath,
            R.drawable.serenetune,
            R.drawable.flamefriction,
            R.drawable.playingwithfire,
            R.drawable.wildrose,
            R.drawable.deliverance
    };

    private static int[] imageSkillB = {
            R.drawable.blessingsofthegoddess,
            R.drawable.immortalwill,
            R.drawable.darkscar,
            R.drawable.dragonknightswill,
            R.drawable.regen2,
            R.drawable.songoftheforest,
            R.drawable.flamerelease,
            R.drawable.hotstreak,
            R.drawable.thornbush,
            R.drawable.steelcloudburst
    };

    private static int[] imageSkillC = {
            R.drawable.saintsprayer,
            R.drawable.apocalypse,
            R.drawable.nocturne,
            R.drawable.ragnarspear,
            R.drawable.destinasgrace,
            R.drawable.shiningstar,
            R.drawable.meteorfall,
            R.drawable.allin,
            R.drawable.publicexecution,
            R.drawable.ruinousretribution
    };





    static ArrayList<Character> getListData(){
        ArrayList<Character> list = new ArrayList<>();
        for (int position = 0; position < characterNames.length; position++){
            Character character = new Character();
            character.setName(characterNames[position]);
            character.setDetail(characterDetails[position]);
            character.setPhoto(characterImages[position]);
            character.setSkill(characterSkillA[position]);
            character.setSkillb(characterSkillB[position]);
            character.setSkillc(characterSkillC[position]);
            character.setSkilldesc(detailSkillA[position]);
            character.setSkilldescb(detailSkillB[position]);
            character.setSkilldescc(detailSkillC[position]);
            character.setSkillpict(imageSkillA[position]);
            character.setSkillpictb(imageSkillB[position]);
            character.setSkillpictc(imageSkillC[position]);
            list.add(character);
        }
        return list;
    }
}
