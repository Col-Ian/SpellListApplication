package com.example.spelllistapplication.data.allspellslist


//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "CRB","Ch Op","Glt Mgc","AdvP#","NearS","DrftCs","Armory","Int Sp","Alien#","GaExM","Ports","PactW","RdsR","Junker","TechR",
//      spellSourcePage = "",
//      spellSourceBookFull = "Adventure Path",
//      spellSchool = "",
//      spellCastingTime = "",
//      spellRange = "",
//      spellTargets = "",
//      spellArea = "",
//      spellEffect = "",
//      spellDuration = "",
//      spellSavingThrow = "none",
//      spellResistance = "no",
//      spellDescriptionFull = "",
//  )

// List to pull data from


var SpellData = listOf(
    SpellDataModel(
        spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
        spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
        spellTitle = "Daze",
        spellPreviewDescription = "Humanoid creature of CR 3 or lower is dazed.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "347",
        spellSourceBookFull = "Core Rulebook",
        spellSchool = "enchantment (compulsion, mind-affecting)",
        spellCastingTime = "1 standard action",
        spellRange = "close (25 ft. + 5 ft./2 levels)",
        spellTargets = "one humanoid creature of CR 3 or lower",
        spellArea = "",
        spellEffect = "",
        spellDuration = "1 round",
        spellSavingThrow = "Will negates",
        spellResistance = "yes",
        spellDescriptionFull = "This spell short-circuits the mind of a humanoid creature with a CR of 3 or lower so that it is dazed (unable to take actions, but taking no penalty to AC). Humanoids of CR 4 or higher are not affected. After a creature has been dazed by this spell, it is immune to it for 1 minute.",
    ), SpellDataModel(
        spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
        spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
        spellTitle = "Detect Magic",
        spellPreviewDescription = "Detect spells and magic items within 60 feet.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "348",
        spellSourceBookFull = "Core Rulebook",
        spellSchool = "divination",
        spellCastingTime = "1 standard action",
        spellRange = "60 ft.",
        spellTargets = "",
        spellArea = "cone-shaped emanation",
        spellEffect = "",
        spellDuration = " concentration, up to 1 minute/level",
        spellSavingThrow = "none",
        spellResistance = "no",
        spellDescriptionFull = "You detect all magic spells, effects, items, and objects (including those on or affecting creatures you can see), as well as hybrid items, in the area. You can’t detect magical traps in this way, as they are created with additional magic that wards them from this common spell. Each round you concentrate on the same area, you can determine if one magic source you detect is from a spell, magic item, or other effect, and the caster level (or item level) of the effect. You can’t determine if there are magic sources in areas you can’t see, or if there was a magic source in an area at one time but that has since expired.",
    ), SpellDataModel(
        spellClassWithLevel = listOf("Mystic 0"),
        spellClassesWithLevelPreview = listOf("Myst 0"),
        spellTitle = "Stabilize",
        spellPreviewDescription = "Cause a dying creature to stabilize.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "378",
        spellSourceBookFull = "Core Rulebook",
        spellSchool = "conjuration (healing)",
        spellCastingTime = "1 standard action",
        spellRange = "close (25 ft. + 5 ft./2 levels)",
        spellTargets = "one living creature",
        spellArea = "",
        spellEffect = "",
        spellDuration = "instantaneous",
        spellSavingThrow = "Will negates (harmless)",
        spellResistance = "yes (harmless)",
        spellDescriptionFull = "If the target of this spell has 0 Hit Points and is dying, it automatically stabilizes. If the creature later takes damage, it is no longer stable.",
    ), SpellDataModel(
        spellClassWithLevel = listOf("Mystic 0"),
        spellClassesWithLevelPreview = listOf("Myst 0"),
        spellTitle = "Telepathic Message",
        spellPreviewDescription = "Send a short telepathic message and hear simple telepathic replies.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "381",
        spellSourceBookFull = "Core Rulebook",
        spellSchool = "divination (language-dependent, mind-affecting)",
        spellCastingTime = "1 standard action",
        spellRange = "medium (100 ft. + 10 ft./level)",
        spellTargets = "up to one creature/level",
        spellArea = "",
        spellEffect = "",
        spellDuration = "10 minutes/level",
        spellSavingThrow = "none",
        spellResistance = "no",
        spellDescriptionFull = "You can send a short telepathic message and hear simple telepathic replies. Any living creature within 10 feet of you or an intended recipient also receives your telepathic message if it succeeds at a DC 25 Perception check. You must be able to see or hear each recipient. The creatures that receive the message can reply telepathically, but no more than a single message can be sent each round, and each message cannot exceed 10 words. A technomancer casting this spell can also use it to send a message to a computer or a construct with the technological subtype if the receiving target is designed to receive messages.",
    ), SpellDataModel(
        spellClassWithLevel = listOf("Mystic 1"),
        spellClassesWithLevelPreview = listOf("Myst 1"),
        spellTitle = "Mind Thrust",
        spellPreviewDescription = "Mentally deal 2d10/ 4d10/ 7d10/ 10d10/ 15d10/ 17d10 damage to one target.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "365",
        spellSourceBookFull = "Core Rulebook",
        spellSchool = "divination (mind-affecting)",
        spellCastingTime = "1 standard action",
        spellRange = "close (25 ft. + 5 ft./2 levels)",
        spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
        spellDuration = "instantaneous",
        spellSavingThrow = "Will half",
        spellResistance = "yes",
        spellDescriptionFull = "You divine the most vulnerable portion of your opponent’s mind and overload it with a glut of psychic information. The target can attempt a Will saving throw to halve the damage dealt by this spell. This spell has no effect on creatures without an Intelligence score.\n" +
                "\n" +
                "1st: When you cast mind thrust as a 1st-level spell, it deals 2d10 damage to the target.\n" +
                "\n" +
                "2nd: When you cast mind thrust as a 2nd-level spell, it deals 4d10 damage to the target.\n" +
                "\n" +
                "3rd: When you cast mind thrust as a 3rd-level spell, it deals 7d10 damage to the target.\n" +
                "\n" +
                "4th: When you cast mind thrust as a 4th-level spell, it deals 10d10 damage to the target and the target is fatigued for 1 round if it fails its saving throw.\n" +
                "\n" +
                "5th: When you cast mind thrust as a 5th-level spell, it deals 15d10 damage to the target. The target is exhausted for 1 round if it fails its save and it is fatigued for 1 round if it succeeds at its saving throw.\n" +
                "\n" +
                "6th: When you cast mind thrust as a 6th-level spell, it deals 17d10 damage to the target. The target is exhausted and stunned for 1 round if it fails its save, and it is fatigued for 1 round if it succeeds at its saving throw.",
    ), SpellDataModel(
        spellClassWithLevel = listOf("Mystic 1"),
        spellClassesWithLevelPreview = listOf("Myst 1"),
        spellTitle = "Mystic Cure",
        spellPreviewDescription = "Restore 1d8/ 3d8/ 5d8/ 12d8/ 16d8/ 20d8 + your Wisdom modifier Hit Points to a living creature.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "367",
        spellSourceBookFull = "Core Rulebook",
        spellSchool = "conjuration (healing)",
        spellCastingTime = "1 standard action",
        spellRange = "touch",
        spellTargets = "one living creature",
        spellArea = "",
        spellEffect = "",
        spellDuration = "instantaneous",
        spellSavingThrow = "Will half (harmless)",
        spellResistance = "yes (harmless)",
        spellDescriptionFull = "With a touch, you heal and invigorate your target, restoring a number of Hit Points. If the target regains all of its Hit Points as a result of this healing, you can apply the remaining healing to yourself, as long as you are a living creature. On the other hand, if this isn’t enough to restore all the target’s Hit Points, you can transfer any number of your own Hit Points to the target, healing the target that amount. You can’t transfer more Hit Points than you have or more Hit Points than the target is missing.\n" +
                "\n" +
                "Mystic cure restores a number of Hit Points to your target depending on the spell’s level.\n" +
                "\n" +
                "1st: 1d8 + your Wisdom modifier\n" +
                "2nd: 3d8 + your Wisdom modifier\n" +
                "3rd: 5d8 + your Wisdom modifier\n" +
                "4th: 7d8 + your Wisdom modifier\n" +
                "5th: 9d8 + your Wisdom modifier\n" +
                "6th: 11d8 + your Wisdom modifier\n" +
                "\n" +
                "In addition, unlike most healing, when you cast mystic cure as a spell of 4th-level or higher, you have two options to enhance its effects. The first option is to restore an extra 5d8 Hit Points with a 4th-level mystic cure spell, an extra 7d8 Hit Points with a 5th-level mystic cure spell, or an extra 9d8 Hit Points with a 6th-level mystic cure spell. The second option is to bring a target that died within 2 rounds back to life. In addition to healing such a creature, the spell returns the target to life, and the target takes a temporary negative level for 24 hours. This spell can’t resuscitate creatures slain by death effects, creatures turned into undead, or creatures whose bodies were destroyed, significantly mutilated, disintegrated, and so on.\n" +
                "\n" +
                "Casting this spell doesn’t provoke attacks of opportunity.",
    ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
        spellTitle = "Accelerate Step",
        spellPreviewDescription = "Gain concealment while moving your speed.",
        spellSourceBookPreview = "Glt Mgc",
        spellSourcePage = "67",
        spellSourceBookFull = "Galactic Magic",
        spellSchool = "transmutation",
        spellCastingTime = "1 standard action",
        spellRange = "personal",
        spellTargets = "",
        spellArea = "",
        spellEffect = "",
        spellDuration = "1 round/level",
        spellSavingThrow = "",
        spellResistance = "",
        spellDescriptionFull = "Drawing upon the Dimension of Time, you speed your steps until your every movement is a blur of motion. While you move up to your speed, charge, run, or step, you have concealment against attackers.",
    ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Accelerated Adaptation",
      spellPreviewDescription = "You grant a barathu increased control over its own powers of adaptation.",
      spellSourceBookPreview = "AdvP#29",
      spellSourcePage = "44",
      spellSourceBookFull = "Adventure Path #29: The Cradle Infestation",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "1 barathu",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You grant a barathu increased control over its own powers of adaptation. If the target has the early stage adaptation racial trait, it gains adaptation instead. If the target already has adaptation, it can have two adaptations in effect at a time, instead of only one.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Acid Puddle",
      spellPreviewDescription = "Create a damaging pool of acid.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "67",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration (acid, creation)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "20-ft.-radius spread",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You coat the area in conjured acid, which quickly pools on the ground. Creatures and objects in the area when the spell is cast take 6d6 acid damage. For the duration of the spell, creatures that enter or start their turn in the area take 2d6 acid damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("WtchW 5"),
      spellTitle = "Acid Rain",
      spellPreviewDescription = "A storm deals 3d6 damage for 1 round per level, imposes a 50% miss chance, and staggers enemies at its end.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "133",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "",
        spellArea = "cylinder (20-ft. radius, 40 ft. high)",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Fortitude partial (see text)",
      spellResistance = "no",
      spellDescriptionFull = "You pull a downpour of elemental precipitation from an alternate reality. You then direct this acid rain to pour only onto your enemies, dealing them 3d6 acid damage each round. The acid splashes into and burns your foes’ eyes, coats them in slime, and clouds their other senses. Enemies must attempt a Fortitude save when exposed to the spell. On a failure, the creature has a 50% miss chance for its attacks while in the area. The rain causes spellcasters who fail the save to have a 20% chance of losing any spell they attempt to cast from within the area. When this spell ends, a thunderclap causes enemies still in the area who failed their Fortitude saves to be staggered for 1 round.\n" +
              "\n"+
              "As a standard action, you can change the rain, causing it to deal a different type of energy damage, such as fiery sparks that deal fire damage or shards of ice that deal cold damage. This change in damage types leaves secondary effects unchanged. When the spell ends, the rain leaves no aftereffects.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Acidic Mist",
      spellPreviewDescription = "You call forth the corrosive atmosphere of a gas giant to damage your opponents.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "154",
      spellSourceBookFull = "Near Space",
      spellSchool = "conjuration (acid)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
        spellArea = "10-ft.-radius spread",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Fortitude half",
      spellResistance = "no",
      spellDescriptionFull = "You call forth the corrosive atmosphere of a gas giant to damage your opponents. A creature that starts its turn in the area takes 2d6 acid damage. The corrosive mist does not obscure vision.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Adamantine Shot",
      spellPreviewDescription = "Transmute ammunition into adamantine alloy and attack with it, dealing damage and inferring special properties.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "67",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to three creatures",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Dwarves created adamantine shot to turn common ammunition into deadly projectiles with siege and mining potential. You transmute one longarm round or similar missile, such as an arrow, into a magical projectile that performs as adamantine alloy ammunition (CRB 191), then you launch it. The round splits into three; attempt an attack against a target's KAC for each projectile. On a success, a shot deals piercing damage based on the slot you used to cast the spell and has the knockdown critical hit effect. Each shot also has the breach (Armory 27) weapon special property, but you use your key ability score in place of Strength and add triple the spell-slot level you used to the roll instead of item level.\n" +
              "\n" +
              "1st: When you cast adamantine shot as a 1st-level spell, each projectile deals 1d8 piercing damage.\n" +
              "\n" +
              "2nd: When you cast adamantine shot as a 2nd-level spell, each projectile deals 2d8 piercing damage.\n" +
              "\n" +
              "3rd: When you cast adamantine shot as a 3rd-level spell, each projectile deals 3d8 piercing damage.\n" +
              "\n" +
              "4th: When you cast adamantine shot as a 4th-level spell, each projectile deals 5d8 piercing damage.\n" +
              "\n" +
              "5th: When you cast adamantine shot as a 5th-level spell, each projectile deals 7d8 piercing damage.\n" +
              "\n" +
              "6th: When you cast adamantine shot as a 6th-level spell, each projectile deals 9d8 piercing damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0","WtchW 0"),
      spellTitle = "Adhere",
      spellPreviewDescription = "Create a strong molecular bond with an object or in a square.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "67",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one object",
        spellArea = "",
        spellEffect = "",
      spellDuration = "varies; see text",
      spellSavingThrow = "see text",
      spellResistance = "no",
      spellDescriptionFull = "You create a molecular bond between an object you touch (bulk up to 1 + your caster level) and another object or a surface that object is touching. Pulling the object free of that surface then requires a Strength check against the spell's save DC, although you can dismiss it by touching the object again. If moving or opening the object already requires a Strength check, you increase the DC of that check by half your key ability score bonus. If the adherence is broken, the spell ends. Otherwise, the magic is permanent.\n" +
              "\n" +
              "If you instead touch a surface (one 5-foot square), that surface becomes charged with adhering magic for 1 round per level. If a creature touches the surface of the affected square, the creature must succeed at a Reflex saving throw or become entangled until they successfully save against the spell (they can attempt a new save at the beginning of each of their turns). Once the entangled creature escapes, the spell ends. It also ends if you cast this version of the spell on another area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("WtchW 2"),
      spellTitle = "Adhesive Blood",
      spellPreviewDescription = "You alter the chemical composition of your vital fluids to become a glue-like substance when exposed to air.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You alter the chemical composition of your vital fluids to become a glue-like substance when exposed to air. For the duration of the spell, a melee weapon that deals piercing or slashing damage to you is stuck fast unless the wielder succeeds at a Reflex saving throw. A creature can attempt to pry off a stuck weapon as a standard action with a successful Strength check (DC = 10 + half your spellcaster level + your key ability modifier). Strong alcohol or a mixture like basic universal solvent (Armory 125) dissolves the adhesive. The glue also breaks down 5 rounds after you die, or when the spell’s duration ends. This glue has no effect while you’re underwater or in an environment that lacks air.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5","WtchW 5"),
      spellTitle = "Afterimage",
      spellPreviewDescription = "You instantly teleport from your current location to any other spot within range, be that a place you visualize or simply by deciding a direction and distance.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "139",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "personal",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous, and 1 round",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You instantly teleport from your current location to any other spot within range, be that a place you visualize or simply by deciding a direction and distance. You can bring along objects as long as their weight doesn’t exceed your maximum load. You leave behind an insubstantial image of yourself in your previous space until the end of your next turn. This image’s features are too washed out to be mistaken for you, and it can’t be harmed (though it can be dispelled). While it lasts, you can perceive the image’s surroundings, flank nearby creatures, and target spells as if you still occupied its space.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Akashic Download",
      spellPreviewDescription = "You do a cosmic search of the Akashic Record for information about a topic.",
      spellSourceBookPreview = "AdvP#23",
      spellSourcePage = "50",
      spellSourceBookFull = "Adventure Path #23: Hive of Minds",
      spellSchool = "divination",
      spellCastingTime = "1 round",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "2 minutes (see text)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You do a cosmic search of the Akashic Record for information about a topic. Your tier 0 or better computer (such as a comm unit) instantly compiles snippets and selections from various media relevant to the subject. The information remains for 2 minutes, during which you explore it. Once you’re finished, you can attempt one skill check to recall knowledge on the topic with a +4 divine bonus, and you can do so untrained if the DC is 20 or lower. On a failed skill check, the GM can select some small insight into the topic that you retain. All the information you downloaded from this spell then disappears back to the Akashic Record. Using this spell doesn’t prevent you from doing further research using a downloaded data set or library chip, but perusing this magical download can’t be done concurrently with such study.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Akashic Investigation",
      spellPreviewDescription = "Generate a magical reenactment of recent events in the target area.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "67",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
        spellArea = "20-ft.-radius emanation",
        spellEffect = "",
      spellDuration = "1 hour (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You sift through the Akashic Record to view a shadow of the past day's events that happened in the spell's area. You overlay these events at the location that they occurred, staging a blurred reenactment of events that took place over the last 24 hours. This reenactment presents only a shadow of the original events, with the creatures appearing as shadows that make indecipherable noises. You can make out the general actions, positions, and sizes of creatures, identify generic noises, and determine the mood and tone of conversation. There isn't enough detail to identify creatures in this reenactment by anything more specific than creature type, nor to determine anything spoken. You have the ability to fast forward, rewind, move in slow motion, and pause the events to get a better view, at any speed desired.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","WtchW 6"),
      spellTitle = "Akashic Revival",
      spellPreviewDescription = "You create perfect documentation of your physical body in the Akashic Record at the time the spell is cast, allowing you to later recall this record and reconstruct your body as it was when you cast this spell.",
      spellSourceBookPreview = "AdvP#23",
      spellSourcePage = "50",
      spellSourceBookFull = "Adventure Path  #23: Hive of Minds",
      spellSchool = "necromancy",
      spellCastingTime = "1 hour",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "24 hours",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You create perfect documentation of your physical body in the Akashic Record at the time the spell is cast, allowing you to later recall this record and reconstruct your body as it was when you cast this spell. The record of your body includes your current Stamina Points, Hit Points, augmentations, physical ability scores, and any enduring negative physical states (including ability damage or drain to physical ability scores, disease, negative levels, poison, and so on). Any effect that was affecting you when you cast this spell to store your record continues with its normal duration, so that effect might expire between the time you store your record and when you later recall it.\n" +
              "\n" +
              "To recall your record, either you must die due to events other than old age or, if you are at 0 Hit Points, you can instead allow your body to perish by spending 3 Resolve Points. If either of these things occurs, you can claim your record as your new physical body at the start of your next turn. Your corpse disappears. Then, you instantly reappear, standing in your recorded body in the corpse’s space and wearing your gear. If you cannot appear in that space, you appear as close to it as you can. You retain your mind as it was at the time of your body’s death, so you regain no expended spells, Resolve Points, or uses of special abilities. Any mental effects affecting you or mental ability damage present at the time of your death persist in your new body.\n" +
              "\n" +
              "Casting this spell again replaces any previous record of yourself with a new one—you can store only one copy of yourself in the Akashic Record.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Akashic Tutor",
      spellPreviewDescription = "You communicate with the Akashic Record of one of your classmates or former instructors, asking them to assist you in a task.",
      spellSourceBookPreview = "AdvP#30",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #30: Puppets Without Strings",
      spellSchool = "divination",
      spellCastingTime = "1 round",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You communicate with the Akashic Record of one of your classmates or former instructors, asking them to assist you in a task. When you cast this spell, select two skills; if you cast Akashic tutor more than once a day, you must select different skills each time. The tutor can provide you with aid another benefits for the two skills you have selected, and always succeeds at the check to aid you. Alternatively, you can instead choose to let the Akashic tutor instruct you on how the task should be performed, substituting the tutor’s skill modifier for your own.\n" +
              "\n"+
              "1st: When you cast Akashic tutor as a 1st-level spell, your Akashic tutor has a total skill modifier equal to your level + 2.\n" +
              "\n"+
              "2nd: When you cast Akashic tutor as a 2nd-level spell, your Akashic tutor has a total skill modifier equal to your level + 4.\n" +
              "\n"+
              "3rd: When you cast Akashic tutor as a 3rd-level spell, your Akashic tutor has a total skill modifier equal to your level + 6.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("WtchW 2"),
      spellTitle = "Algae Bloom",
      spellPreviewDescription = "You conjure a toxic algae bloom composed of particles that are sufficiently tiny to bypass standard environmental protections.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
        spellArea = "20-ft.-radius burst",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Fortitude negates",
      spellResistance = "no",
      spellDescriptionFull = "You conjure a toxic algae bloom composed of particles that are sufficiently tiny to bypass standard environmental protections. Creatures that breathe (whether water or air) that start their turn in or enter the area must attempt a Fortitude save or become sickened for 1d4+1 rounds.\n" +
              "\n"+
              "If the entire area of this spell is underwater, its duration increases to 1 minute per level.\n"+
              "\n"+
              "SFS Note: For the purpose of the algae bloom spell, “standard environmental protections” refers to the protection provided by a typical suit of armor.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Alter Corpse",
      spellPreviewDescription = "You cause a corpse to change to suit a narrative you choose.",
      spellSourceBookPreview = "AdvP#25",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #25: The Chimera Mystery",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one corpse",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You cause a corpse to change to suit a narrative you choose. This spell can hide or create clues about how the corpse ended up in its current state, from closing wounds to evaporating chemicals in the cadaver’s system. However, the changes cannot be major, such as removing or restoring a limb, or stripping flesh from the skeleton. The spell is also unable to change the corpse’s identity.\n" +
              "\n"+
              "Anyone who examines the corpse can attempt a Perception check (DC = 10 + your caster level) to notice that the corpse’s condition (or lack thereof) seems manipulated, but success doesn’t allow the observer to determine what the corpse looked like before this spell was cast. Closely examining the corpse with a successful Medicine check (DC = 15 + your caster level) not only reveals what a successful Perception check does, but also reveals what the corpse looked like before this spell was cast.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("WtchW 2"),
      spellTitle = "Alter Enhancement",
      spellPreviewDescription = "You tap into the multiverse and find a reality with a forgotten",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "155",
      spellSourceBookFull = "Near Space",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one weapon with at least one weapon fusion or one suit of armor with at least one armor upgrade",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "yes",
      spellDescriptionFull = "You tap into the multiverse and find a reality with a forgotten object similar to the target of this spell, swapping that item with the target item. For the duration of the spell, you can select one weapon fusion or armor upgrade on the target item to replace with a weapon fusion or armor upgrade from the Core Rulebook. A fusion selected this way must be the same level of the original or lower. An upgrade selected this way must be the same type (hybrid, magical, or technological) as the original, be of the same level or lower. and occupy the same number of slots or fewer. At the end of the spell’s duration, the original item returns as it was when swapped, including its number of remaining charges, if any.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Amorphous Form",
      spellPreviewDescription = "Your body briefly shifts into an amorphous form, enabling you to circumvent certain attacks and squeeze through tight spaces.",
      spellSourceBookPreview = "AdvP#27",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #27: Deceivers’ Moon",
      spellSchool = "transmutation (polymorph)",
      spellCastingTime = "1 standard action; see text",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Your body briefly shifts into an amorphous form, enabling you to circumvent certain attacks and squeeze through tight spaces. You do not take double damage from critical hits, but critical hit effects apply against you normally. You gain a +4 circumstance bonus to your KAC against the grapple and reposition combat maneuvers. You can move through an area as small as one-quarter of your space without squeezing, or one-eighth your space when squeezing.\n" +
              "\n"+
              "To benefit from this spell, you must have the shapechanger subtype or be benefiting from a polymorph effect. You can cast this spell as a reaction when you are attacked by a grapple or reposition maneuver or hit by a critical hit, but when you do, you can’t take a standard action on your next turn.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2","WtchW 2"),
      spellTitle = "Anchor",
      spellPreviewDescription = "Create a magical anchoring cable.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "68",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration (summoning)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "immobile object",
        spellArea = "",
        spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You conjure and attach a cable to an immobile object. When the spell ends, the cable returns to where it was summoned from. The cable has hardness 8, 8 Hit Points, and a length equal to the spell's range. The cable can be pried free with an Athletics check equal to the spell's DC. If the cable becomes unanchored or destroyed, the spell ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5"),
      spellTitle = "Animate Armor",
      spellPreviewDescription = "Briefly control a suit of armor",
      spellSourceBookPreview = "Armory",
      spellSourcePage = "156",
      spellSourceBookFull = "Armory",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "one unattended suit of armor",
        spellArea = "",
        spellEffect = "",
      spellDuration = "concentration, up to 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You temporarily infuse a suit of armor with a magic force that allows it to move on its own and that directs its mechanisms. When you cast this spell, the armor acts and responds to your mental control for as long as you concentrate. Each round on your turn, the armor can perform either a move action or a standard action to attack. The armor can move up to 30 feet (or its listed speed using any of its available modes of movement, if powered armor or containing an armor upgrade that alters movement). When the armor attacks, it can either make an unarmed attack, dealing 4d8 + your caster level bludgeoning damage (or the listed damage plus its Strength modifier, for powered armor) or make an attack with any of the weapons mounted in its weapon slots or weapons with the integrated special property installed in its upgrade slots (if any); this deals the weapon’s base damage for ranged attacks and the weapon’s base damage plus the armor’s Strength modifier for melee attacks. The armor has a bonus to attacks equal to 6 + your caster level. If the armor has no listed Strength score, it can apply a Strength bonus equal to your caster level.\n" +
              "\n" +
              "Should the animated armor be attacked, its EAC and KAC are equal to 10 + the EAC and KAC bonus the armor provides. It uses your saving throw bonuses when it is the target of spells and other targeted effects, and it has the typical hardness and Hit Points for an item of its level. For the purpose of spells and effects that target the armor, it is treated as a construct with the technological and magical subtypes while the spell lasts.\n" +
              "\n" +
              "This spell has no effect if cast on powered armor with a depleted battery or powered armor of an item level that exceeds your caster level.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4"),
      spellTitle = "Animate Dead",
      spellPreviewDescription = "Create controlled undead creatures out of target corpses.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "340",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one or more corpses",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell turns corpses into undead creatures that obey your spoken commands. The undead can be made to follow you, or they can be made to remain in place and attack any creature (or a specific kind of creature) entering the area. They remain animated until they are destroyed. A destroyed undead can’t be animated again.\n" +
              "\n" +
              "You can create one or more undead creatures with a total CR of no more than half your caster level. You can only create one type of undead with each casting of this spell. Creating undead requires special materials worth 1,000 credits × the total CR of the undead created; these materials are consumed as part of casting the spell.\n" +
              "\n" +
              "The undead you create remain under your control indefinitely. No matter how many times you use this spell, however, you can control only a number of undead whose total CR is no greater than your caster level. If you exceed this number, all the newly created creatures fall under your control and any excess undead from previous castings become uncontrolled. You choose which creatures are released. Once released, such undead have no particular feelings of loyalty to you, and in time they may grow in power beyond the undead you can create.\n" +
              "\n" +
              "The corpses you use must be as intact as the typical undead of the type you choose to create. For example, a skeleton can be created only from a mostly intact corpse (that has bones) or skeleton. A zombie can be created only from a creature with a physical anatomy.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Antimagic Burst",
      spellPreviewDescription = "Unravel magic in an area.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "68",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
        spellArea = "20-ft.-radius burst",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "yes, see text",
      spellDescriptionFull = "You detonate a bubble of antimagic in the area, temporarily unraveling magical effects. This spell works like an area dispel from greater dispel magic (Starfinder Core Rulebook pg 352), but your dispel check applies to every spell, supernatural effect, hybrid item, magic item, and magical effect in the area. For supernatural effects, the DC for your check equals 11 + the CR or level of the creature that created the effect. If the dispel check would end a summoning effect, it sends only those summoned creatures in the area back from whence they came. The antimagic suppresses an affected magic item's magical capabilities for 1d4 rounds. Creatures and objects only partially within the area are unaffected.\n" +
              "\n" +
              "Creatures, including summoned ones that remain because the effect that summoned them isn't dispelled, can attempt a Will saving throw against this effect, and their spell resistance applies. If a creature is affected, it can't use its spells, spell-like abilities, and supernatural abilities for 1d4 rounds. A magical construct that fails the save is also staggered for this time. Any creature affected by this spell can attempt a Will saving throw at the end of each round to shrug off the effect on itself.\n" +
              "\n" +
              "This spell has no effect on artifacts or deities.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("WtchW 3"),
      spellTitle = "Antiradiation",
      spellPreviewDescription = "Calm an area of radiation, the strength of which depends on your caster level.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "133",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
        spellArea = "10-ft.-radius spread; see text",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You permeate radiation with mitigations from other realities, dissipating radiation effects in the spell’s area; the radiation level you affect depends on your caster level, as shown below. Once radiation has been dissipated, the environment in the area has no harmful effects from radiation, although this spell does not remove ongoing radiation-creating effects.\n" +
              "\n" +
              "An antiradiation spell counters an irradiate spell, as long as your caster level is greater than the caster level of the creature or effect that created the irradiate effect.\n" +
              "\n" +
              "6th level or lower, radiation Level low. 7th-9th level, radiation level medium. 10th-16th level, radiation level high. 17th level or higher, radiation level severe.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Aqueous Form",
      spellPreviewDescription = "You temporarily transform part or all of your body into water, gaining unique abilities.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "transmutation (water)",
      spellCastingTime = "1 standard action; see text",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "see text (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You temporarily transform part or all of your body into water, gaining unique abilities.\n" +
              "\n" +
              "1st: When you cast aqueous form as a 1st-level spell, you gain a swim speed of 30 feet for 1 round, and changing direction while swimming doesn’t cost additional movement.\n" +
              "\n" +
              "2nd: When you cast aqueous form as a 2nd-level spell, you’re affected as per the 1st-level version. Also for 1 round, you reduce the amount of bludgeoning, slashing, and fire damage you take by an amount equal to half your caster level (this reduction doesn’t stack with DR or resistances you might already have), and you gain vulnerability to electricity.\n" +
              "\n" +
              "3rd: When you cast aqueous form as a 3rd-level spell, you’re affected as per the 2nd-level version except the spell lasts 1 minute per caster level. In addition, you gain a +4 circumstance bonus to AC against combat maneuvers while you’re completely submerged in water.\n" +
              "\n" +
              "4th: When you cast aqueous form as a 4th-level spell, you’re affected as per the 3rd-level version except the spell lasts 10 minutes per caster level, and you gain concealment while you’re completely submerged in water.\n" +
              "\n" +
              "5th: When you cast aqueous form as a 5th-level spell, you’re affected as per the 4th-level version except the spell lasts for 1 hour per caster level. You can cast the 5th-level version of aqueous form as a purely defensive reaction when you’re about to take damage, but when you do so, you can’t take a standard action on your next turn.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Prcg 4","Tchn 4"),
      spellTitle = "Arcane Eye",
      spellPreviewDescription = "Invisible floating eye moves 30 feet per round and sends you visual information.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "340",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination (scrying)",
      spellCastingTime = "10 minutes",
      spellRange = "planetary",
      spellTargets = "",
        spellArea = "",
        spellEffect = "magical sensor",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You create an invisible magical sensor that sends you visual information. The sensor appears at any point within line of sight, but it can then travel beyond your line of sight without hindrance. An arcane eye travels at 30 feet per round (300 feet per minute) if viewing an area ahead as a humanoid would (primarily looking at the floor) or 10 feet per round (100 feet per minute) if examining the ceiling and walls as well as the floor ahead. The arcane eye sees exactly as you would see if you were there.\n" +
              "\n" +
              "The arcane eye can travel in any direction as long as the spell lasts. Solid barriers block its passage, but it can pass through a hole or space as small as 1 inch in diameter. The arcane eye can’t enter another plane of existence, even through Drift travel or a magical gate or similar magical portal.\n" +
              "\n" +
              "You must concentrate to use an arcane eye. If you do not concentrate, the sensor is inert until you concentrate again.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Arcane Sight",
      spellPreviewDescription = "Magical sources become visible to you.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "340",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "This spell allows you to see magic sources within 120 feet of you. The effect is similar to that of a detect magic spell, but arcane sight does not require concentration and discerns information more quickly.\n" +
              "\n" +
              "You know the location and caster level of all magic sources within your sight. If the magic sources are in line of sight, you can attempt a DC 28 Mysticism check (one check per source) to determine the school of magic involved in each source.\n" +
              "\n" +
              "If you concentrate on a specific creature within 120 feet of you as a standard action, you can determine whether it has any spellcasting or spell-like abilities and the caster level of the most powerful spell or spell-like ability the creature currently has available for use.\n" +
              "\n" +
              "You can attempt a Mysticism skill check to identify the properties of magic or hybrid items (but not artifacts), as if you were using identify.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Archive",
      spellPreviewDescription = "You magically remove data from the target computer or module.",
      spellSourceBookPreview = "AdvP#32",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #32: The Starstone Blockade",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one computer or secure data module",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 day; see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You magically remove data from the target computer or module. You can remove an amount of data equal to what can be stored on a specific secure data module. You can end the spell with a swift action, restoring the missing data. Each day, when you regain your spell slots, you can expend a 3rd-level spell slot to keep the data hidden for another day. If you choose not to, the data returns.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Arcing Surge",
      spellPreviewDescription = "Deal 10d6 electricity damage in a 120-foot line.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "340",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (electricity)",
      spellCastingTime = "1 standard action",
      spellRange = "120 ft.",
      spellTargets = "",
        spellArea = "line-shaped burst",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You cause an electrical device in your possession to surge in power and unleash a line of electricity from the massive oversurge. This deals 10d6 electricity damage to all creatures and objects in the area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Artificial Geyser",
      spellPreviewDescription = "You create a burst of pressurized boiling water.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "115",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "",
        spellArea = "20-ft.-line",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You create a burst of pressurized boiling water. This deals 3d8 slashing and fire damage and applies the burn condition for 1d6 to each creature in the area. A successful Reflex save halves this damage and negates the burn condition.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Atavistic Howl",
      spellPreviewDescription = "You release a howl of primal rage, echoing the pain of Dreamers awoken by injury.",
      spellSourceBookPreview = "AdvP#29",
      spellSourcePage = "44",
      spellSourceBookFull = "Adventure Path #29: The Cradle Infestation",
      spellSchool = "enchantment (emotion, fear, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "",
      spellTargets = "all creatures within 30 feet",
        spellArea = "",
        spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "Will partial",
      spellResistance = "yes",
      spellDescriptionFull = "You release a howl of primal rage, echoing the pain of Dreamers awoken by injury. Creatures in the area that fail their saves are shaken for 2d4 rounds. Dreamers are immune to this spell.\n" +
              "\n"+
              "Barathus can cast this spell as a reaction when reduced to 0 Hit Points. In this case, the spell’s DC is increased by 2.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","WtchW 2"),
      spellTitle = "Augury",
      spellPreviewDescription = "Learn whether an action will be good or bad.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "340",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Casting augury can tell you whether a particular action will bring good or bad results for you in the immediate future. Casting this spell takes intense personal focus and requires you to spend 1 Resolve Point.\n" +
              "\n" +
              "The chance for successfully receiving a meaningful reply is 75%; this roll is made secretly by the GM. A question may be so straightforward that a successful result is automatic, or it may be so vague as to have no chance of success. If the augury succeeds, you get one of four results.\n" +
              "Weal (if the action will probably bring good results).\n" +
              "Woe (for bad results).\n" +
              "Weal and woe (for both).\n" +
              "Nothing (for actions that have neither especially good nor especially bad results).\n" +
              "\n"+
              "If the augury isn’t successful, you get the “nothing” result. A spellcaster who gets the “nothing” result has no way to tell whether it was the consequence of a failed or successful augury.\n" +
              "\n" +
              "The augury can see only about 30 minutes into the future, so anything that might happen beyond that time frame does not affect the result. Thus, the result might not take into account the long-term consequences of a contemplated action. Multiple castings of augury by the same creature about the same topic use the same die result as the first casting.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Autopilot",
      spellPreviewDescription = "Install a temporary AI into a vehicle that can act as an autopilot.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "68",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one vehicle",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You install an AI into a vehicle that can control the vehicle in place of an actual pilot. During the spell's duration, you can engage or disengage the autopilot AI as a swift action. You can input a destination into the autopilot AI as a move action, and the autopilot AI attempts to reach that location if doing so is possible.\n" +
              "\n" +
              "The vehicle is considered controlled when the autopilot AI is engaged. The autopilot AI's actions are dictated by the GM, and the autopilot AI can take any of the actions to pilot a vehicle that an actual pilot can. The autopilot AI has a Piloting modifier of +14.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Awaken Computer",
      spellPreviewDescription = "Turn a computer into a friendly AI that you and up to four other creatures are authorized to use.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "133",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "10 minutes",
      spellRange = "touch",
      spellTargets = "one computer",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "no (object)",
      spellResistance = "no (object)",
      spellDescriptionFull = "You infuse a computer with a spark of advanced technology, granting it an artificial personality. For this spell to take effect, you must have access to the computer, through either hacking it and bypassing any countermeasures it has or having unsecured access, but you don’t need root access. Further, if the target computer’s tier is equal to half your caster level or higher, you must expend credits equal to 5% of its base price while you cast this spell or the spell has no effect. This spell has no effect on computers that already have an artificial personality upgrade.\n" +
              "\n" +
              "You decide the details of the computer’s personality when you cast this spell, including its name, mannerisms, and sense of humor. The artificial personality recognizes you as its creator unless you remove that detail from its memory while casting. You can designate yourself and up to four other creatures as authorized users of the personality. This spell configures the personality with cunning and charm, granting it a bonus to Bluff, Diplomacy, Intimidate, and Sense Motive checks equal to 3 × its tier.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Baleful Polymorph",
      spellPreviewDescription = "Change the target's shape to that of a smaller, weaker creature",
      spellSourceBookPreview = "Alien2",
      spellSourcePage = "147",
      spellSourceBookFull = "Alien Archive 2",
      spellSchool = "transmutation (polymorph)",
      spellCastingTime = "1 round",
      spellRange = "close",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You change a target’s shape to that of a smaller, weaker creature.\n" +
              "\n" +
              "1st: The target shrinks slightly (though it retains its size category) and gains a few cosmetic bestial features of an animal you choose. The target takes a –1 penalty to AC, attack rolls, melee damage rolls, Reflex saving throws, and Strengthand Dexterity-based ability checks and skill checks. Lesser remove condition (Core Rulebook pg. 373) and similar spells can end this effect.\n" +
              "\n" +
              "2nd: As per the 1st-level version, but the target takes a –2 penalty and must attempt an additional saving throw each round until it fails or the spell’s duration ends. If the target fails this second saving throw, its appearance becomes more bestial and the penalty increases to –3. Break enchantment (Core Rulebook pg. 341), remove affliction(Core Rulebook pg. 373), or remove condition (Core Rulebook pg. 373) can end the spell’s effect.\n" +
              "\n" +
              "3rd: As per the 2nd-level version, but you can make the target one size category smaller (its equipment resizes to remain functional, though it may lose reach with its new size; see Size on page 143). The target must attempt a saving throw every round, with the penalty to AC, attack rolls, melee damage rolls, Reflex saving throws, and Strength- and Dexterity-based ability checks and skill checks worsening by 1 each time the target fails one of these saving throws, to a maximum penalty of –4. If the target succeeds at this saving throw after the penalty has reached its maximum, it is no longer required to attempt saving throws. If the target fails this saving throw after the penalty has reached its maximum, you can change the duration to permanent (D). If an object leaves the creature’s possession for 1 round or more, it reverts to normal.\n" +
              "\n" +
              "4th: As per the 3rd-level version, but the penalty begins at –3, and the target must attempt a saving throw every round, with the penalty worsening by 1 each time the target fails one of these saving throws (to a maximum penalty of –5). If the target succeeds at this saving throw after the penalty has reached its maximum, it is no longer required to attempt saving throws. If the target fails this saving throw after the penalty has reached its maximum, you can change the duration to permanent (D). If an object leaves the creature’s possession for 1 round or more, it reverts to normal.\n" +
              "\n" +
              "5th: As per the 4th-level version, except if the target fails its saving throw after the penalty has reached –5, instead of making the duration permanent (D), for the remainder of the duration you can turn the target into a Small animal or similar beast that has EAC 10 and KAC 12, can’t make attacks or cast spells or spell-like abilities, and can’t use extraordinary or supernatural abilities. The target retains its Intelligence, Wisdom, and Charisma scores in animal form, but it can’t speak or use any abilities of its normal form. Equipment the target is wearing is absorbed into this form, and the target still benefits from any environmental protections on its armor, but the target drops gear it’s holding or carrying but not wearing.\n" +
              "\n" +
              "6th: As per the 5th-level version, except if the target fails its saving throw after the penalty has reached –5, you can both make the duration permanent (D) and turn the target into a Small animal or similar beast.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4","WtchW 4"),
      spellTitle = "Baleful Polymorph, Mass",
      spellPreviewDescription = "Change multiple targets' shapes to that of a smaller, weaker creature",
      spellSourceBookPreview = "Alien2",
      spellSourcePage = "148",
      spellSourceBookFull = "Alien Archive 2",
      spellSchool = "transmutation (polymorph)",
      spellCastingTime = "1 round",
      spellRange = "close",
      spellTargets = "up to four creatures, no two of which can be more than 30 ft. apart",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions as baleful polymorph, except as noted in this description. Each target must take the same form.\n" +
              "\n" +
              "4th: This spell causes all targets to suffer the effects of the 1st-level version of baleful polymorph.\n" +
              "\n" +
              "5th: This spell causes all targets to suffer the effects of the 2nd-level version of baleful polymorph.\n" +
              "\n" +
              "6th: This spell causes all targets to suffer the effects of the 3rd-level version of baleful polymorph.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","WtchW 3"),
      spellTitle = "Baleful Synesthesia",
      spellPreviewDescription = "You overstimulate the senses of the affected creature, causing its senses to interfere with another.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "illusion (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You overstimulate the senses of the affected creature, causing its senses to interfere with another. While a creature is under the effects of this spell, sensory input is processed by the wrong senses, such that noise triggers bursts of colors, smells create sounds, and so on. The affected creature moves at half speed, has a 20% miss chance on all attacks, has the flat-footed condition, and takes a –4 penalty on skill checks and Reflex saving throws.\n" +
              "\n"+
              "Effects that negate or reduce the miss chance from concealment don’t affect the miss chance effect from baleful synesthesia.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6"),
      spellTitle = "Battle Junkbot",
      spellPreviewDescription = "Create a temporary robot from random junk, turning it into a deadly combatant.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "341",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "at least 1 bulk of inert electronic equipment; see text",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You turn a pile of technological junk into a vicious robot that can hunt down and attack your enemies.\n" +
              "\n" +
              "You must target inert, nonworking electronic equipment of at least 1 bulk. Valid targets include a large broken computer system, nonworking or unconnected computer or robot parts, a destroyed robot or another such trashed mechanical system, or any related electronic components or combination of the above as long as the junk is found in a large enough quantity. Creating a battle junkbot also requires one ultra-capacity battery. Casting this spell drains all of the battery’s charges.\n" +
              "\n" +
              "While casting this spell, you use your magic and technological know-how to rearrange the junked parts and infuse them with aggression and martial skills. A battle junkbot is Small, its KAC and EAC are each equal to 15 + your technomancer level, it has hardness 15, and it has a number of Hit Points equal to half of your own (but no Stamina Points). It uses your saving throw bonuses when it is the target of spells and other targeted effects. It has a land speed of 30 feet and a fly speed of 15 feet with average maneuverability. For purposes of spells and effects that target the junkbot, it is treated as a construct with the magical and technological subtypes.\n" +
              "\n" +
              "The battle junkbot has four hands. It is treated as if it had the Deadly Aim and Improved Combat Maneuver (Bull Rush, Grapple, Trip) feats. It has an attack bonus equal to 6 + your technomancer level; in one hand it wields a special buzzblade dagger that deals 6d8+6 damage instead of its normal damage, and a second hand carries a special light laser pistol that deals 6d6 damage instead of its normal damage. Damage from the junkbot’s special weapons counts as magic for the purpose of overcoming damage reduction.\n" +
              "\n" +
              "You can give new basic commands to your battle junkbot telepathically on your turn as a move action, and the junkbot can take actions as if it were a normal creature. You are aware when the robot has made an attack or combat maneuver and whether or not it was successful, as well as when the battle junkbot has been attacked, has taken damage, or is destroyed, but you can perceive nothing else through this basic telepathic link.\n" +
              "\n" +
              "When the battle junkbot is destroyed or this spell ends, the electronic equipment you used to create the junkbot falls apart into refuse, its circuitry fried beyond anything recognizable. You cannot use this refuse as a target to create another junkbot.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Battle Sonata",
      spellPreviewDescription = "Deal 8d6 sonic damage to creatures in an area with a chance to stagger.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "68",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (sonic)",
      spellCastingTime = "1 standard action",
      spellRange = "15 ft.",
      spellTargets = "",
        spellArea = "cone-shaped burst",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will half, see text",
      spellResistance = "yes, see text",
      spellDescriptionFull = "Employed to great effect by the pahtra defenders of independent Pulonis, this spell weaponizes music to devastate foes. You compose a deadly song that unleashes dissonant chords in a cone-shaped burst in front of you, dealing 8d6 sonic damage to all creatures and objects in the area. A creature who fails its Will save against your battle sonata is also staggered for 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Battlemind Link",
      spellPreviewDescription = "Creates a psychic link that gives a bonus to initiative and other benefits.",
      spellSourceBookPreview = "AdvP#20",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #20: The Last Refuge",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "two creatures",
        spellArea = "",
        spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You create a strong temporary psychic link between two creatures that allows them to act almost as one. This spell works like lesser battlemind link, but the enhancement bonus to initiative rolls is +4, and the spell ends if the targets are more than 500 feet apart, rather than 200 feet apart. In addition, if the targets threaten the same enemy, they are considered to be flanking that foe regardless of their actual positions. When one of the targets hits a foe with a ranged attack, they can, as a reaction, apply the effects of covering fire or harrying fire against that foe for the other target of this spell. Finally, each target gains a +4 enhancement bonus to attacks of opportunity if they both attack the same creature due to the same triggering action on that creature’s part.\n" +
        "\n" +
        "(Battlemind Link, Lesser: You form a temporary psychic link between two creatures that allows them to act almost as one. While this spell is active, the two targets each roll initiative in combat and use the higher die result between them before adding modifiers. This spells also grants each target a +2 enhancement bonus to initiative rolls. This spell ends if the targets are ever more than 200 feet apart or if either target is unconscious or helpless.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Battlemind Link, Lesser",
      spellPreviewDescription = "Creates a psychic link that gives a bonus to initiative.",
      spellSourceBookPreview = "AdvP#20",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #20: The Last Refuge",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "two creatures",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You form a temporary psychic link between two creatures that allows them to act almost as one. While this spell is active, the two targets each roll initiative in combat and use the higher die result between them before adding modifiers. This spells also grants each target a +2 enhancement bonus to initiative rolls. This spell ends if the targets are ever more than 200 feet apart or if either target is unconscious or helpless.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Befuddling Gibberish",
      spellPreviewDescription = "You hurl your voice to distract creatures with nonstop chatter, which doesn’t require a shared language to be annoying.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "enchantment (mind-affecting, sense-dependent)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
        spellArea = "20-ft.-radius spread",
        spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You hurl your voice to distract creatures with nonstop chatter, which doesn’t require a shared language to be annoying; targets must be able to hear to be affected by this spell, though. Creatures in the area who fail the saving throw are off-target and take a –4 penalty to Perception checks for the duration.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Benevolent Synesthesia",
      spellPreviewDescription = "You transform the target’s brain, allowing them to see sounds, hear scents, and otherwise perceive sensory input using multiple sensory organs.",
      spellSourceBookPreview = "AdvP#29",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #29: The Cradle Infestation",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "1 creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You transform the target’s brain, allowing them to see sounds, hear scents, and otherwise perceive sensory input using multiple sensory organs. Even unusual senses, such as a shirren’s vibration sense, are affected. For the duration of the spell, the target is immune to the blinded, dazzled, and deafened conditions and gains a +2 enhancement bonus to Perception checks.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Bestow Curse",
      spellPreviewDescription = "Target takes –4 penalty to attack rolls, saves, and checks or 50% chance of not acting on each of its turns.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "341",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy (curse)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "permanent",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You place a terrible curse on the target, stealing either its overall competency or its ability to think and act on its feet. Choose one of the following.\n" +
              "\n"+
              "The target takes a –4 penalty to ability checks, attack rolls, saving throws, and skill checks.\n" +
              "\n"+
              "Each turn, the target has a 50% chance to act normally; otherwise, it takes no action.\n" +
              "\n"+
              "You can also invent your own curse (see Afflictions on page 414 for a few ideas), but it should be no more powerful than those described above. The curse bestowed by this spell cannot be dispelled, but it can be removed with a break enchantment, miracle, remove affliction, or wish spell.\n" +
              "\n" +
              "Casting this spell doesn’t provoke attacks of opportunity. Bestow curse counters remove affliction.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6","WtchW 6"),
      spellTitle = "Bilocation",
      spellPreviewDescription = "The spell creates an identical copy of you in an adjacent space, along with everything you wear and carry other than artifacts.",
      spellSourceBookPreview = "AdvP#23",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #23: Hive of Minds",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "The spell creates an identical copy of you in an adjacent space, along with everything you wear and carry other than artifacts. (If you carry an artifact, you decide which body retains it.) You exist in two places at once until the spell ends. Once the copy is created, it can travel an unlimited distance away from you. Your duplicate acts just after you do each round—it doesn’t have a separate initiative count. One of you can use a full round’s worth of actions, and the other can take only a standard or a move action. Between the two of you, you can cast only one spell per round—unless you have a special ability that allows you to cast more than one spell when you have no duplicate, such as the quickened spell magic hack. You and your duplicate share sensory information, so if one of you is aware of or knows something, both of you do. The duplicate is another creature for most purposes, with the following exceptions.\n" +
              "\n" +
              "You and the duplicate use the same statistics and share resources, including one pool of consumable items (including ammo), daily-use abilities (including from items) and spell slots, Hit Points, Resolve Points, and Stamina Points. If your duplicate casts a spell, your spell is expended, and if your duplicate uses a consumable item, that item is no longer available to you. Similarly, if an item one of you carries is permanently lost or destroyed, that item is lost or destroyed for both. Attacks, spells, and effects affect the two bodies as though they were one person, taking the worst effect applicable. For example, if both bodies are in the same explosive blast, you attempt the saving throw only once and take the damage only once. If you fail the saving throw against hold person, both bodies are paralyzed, and if one body catches a disease, both do. Both bodies count as one creature for spell effects, and they can’t be chosen more than once for such effects. Any magical effect on you has its duration halved while you’re bilocating. For example, the aforementioned hold person loses 2 rounds of duration each round it paralyzes you and your duplicate. Similarly, if you cast resistant armor on yourself, your duplicate is also affected, and the spell has a duration of 5 minutes per level. An effect that has its duration shortened in this way lasts a minimum of 1 round.\n" +
              "\n" +
              "In addition, if you attempt a skill check to recall knowledge, you roll only one check. Similarly, if you and your duplicate are in the same area, you roll only one Perception check to determine what you’re both aware of, although you receive a +2 bonus to this check as if your duplicate aided you on it.\n" +
              "\n" +
              "When this spell ends, you decide which body remains and which disappears. Any enduring effects continue to affect you.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Bioluminescent Lure",
      spellPreviewDescription = "You cause a 30-foot-diameter sphere of water increasing the light level from dark to dim or from dim to normal.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
        spellArea = "30-ft.-diameter sphere",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will save negates",
      spellResistance = "no",
      spellDescriptionFull = "You cause a 30-foot-diameter sphere of water or other liquid to fill with bioluminescent plankton, increasing the light level from dark to dim or from dim to normal. For the spell’s duration, you can take a standard action to move this area up to 30 feet in any direction. You can also take a standard action to condense the plankton into a tight, brightly glowing ball at the center of the sphere. If you do so, each creature that starts its turn in or enters the spell’s area must attempt a Will save or become fascinated until the beginning of its next turn. A creature that saves against this effect is immune to it for 24 hours. This spell has no effect above water.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","WtchW 1"),
      spellTitle = "Biome Adaptation",
      spellPreviewDescription = "Adapt a creature to the environment, granting several bonuses.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "68",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "As the elves of yore, you attune the target to the surrounding environment or foresee their needs there, altering their coloration and movement to better match the biome (Core Rulebook pg. 396) within which you cast this spell. The target ignores nonmagical difficult terrain typical to that biome and gains a +2 insight bonus to Stealth checks there as well as Survival checks for the tasks endure severe weather, live off the land, and orienteering in that biome.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Biomechanical Symbiosis",
      spellPreviewDescription = "You energize the target’s natural healing.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "111",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature with a biotech, cybernetic, or magitech augmentation",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous and up to 1 minute (see below)",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You energize the target’s natural healing. For 5 rounds, the target gains fast healing and electricity resistance based on the spell slot used to cast the spell. If the target is a plant, the spell instead lasts for 1d6+4 rounds, and the spell removes one condition affecting the target that could be ended with lesser remove condition. Casting this spell drains all charges from a fully charged battery, otherwise it fails.\n" +
              "\n"+
              "2nd: The spell grants fast healing 2 and electricity resistance 5, and drains a standard battery.\n" +
              "\n"+
              "4th: The spell grants fast healing 4 and electricity resistance 10, and drains a high-capacity battery. The spell can end one condition affecting a plant target as though it were remove condition.\n" +
              "\n"+
              "6th: The spell grants fast healing 6 and electricity resistance 15, and drains an ultra-capacity battery. The spell can end one condition affecting a plant target as though it were greater remove condition.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Biotic Shroud",
      spellPreviewDescription = "Create a shroud that protects against attacks and lets you fly.",
      spellSourceBookPreview = "AdvP#20",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #20: The Last Refuge",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You conjure forth a mantle of organic, insectile nanites that encircle you. The density of the swarm provides you with partial concealment (20% miss chance) against ranged attacks. Any creature that makes a successful melee attack against you takes 2d6 piercing damage, although you can allow anyone to touch you without them taking damage, for instance to deliver a beneficial touch spell. As a move action, you cause the nanites to cling tightly to you, granting you a fly speed of 20 feet with clumsy maneuverability as an extraordinary ability. When using the shroud to fly, you have no concealment due to it, and it cannot harm creatures that successfully attack you in melee. You can return the nanites to their protective configuration as a move action.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Biotic Taclash",
      spellPreviewDescription = "Create a taclash out of nanites with extra abilities.",
      spellSourceBookPreview = "AdvP#20",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #20: The Last Refuge",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "0 ft.",
      spellTargets = "",
        spellArea = "",
        spellEffect = "living taclash",
      spellDuration = "1 round/level (D); see text",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "This spell functions as lesser biotic taclash, except that the created weapon is considered to be a magic weapon, deals 4d4 slashing damage, and functions as a level 10 item. In addition, when you dismiss the spell as a reaction when striking a target, that target must succeed at a Fortitude save or take the weapon's damage again and become nauseated for 1d3+1 rounds.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Biotic Taclash, Lesser",
      spellPreviewDescription = "Create a magic taclash with extra abilities.",
      spellSourceBookPreview = "AdvP#20",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #20: The Last Refuge",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "0 ft.",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level (D); see text",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You conjure a taclash made of organic, insectile nanites into your grasp. The created weapon functions as a standard taclash with the living weapon special property. You are considered to be proficient with this taclash, and you add 1-1/2 times your caster level to damage rolls with it in place of your Weapon Specialization bonus. In addition, the weapon has the nauseate critical hit effect.\n" +
              "\n" +
              "The biotic taclash functions only for you, and once you create it, you can neither drop it nor be disarmed of it. As a move action, you can stow the biotic taclash, causing its component nanites to discorporate into individual nanobots that disperse over your body but remain while the spell lasts. During that time, you can cause the nanites to reincorporate to form the weapon again by taking another move action.\n" +
              "\n" +
              "As a reaction when you strike a target with the biotic taclash, you can dismiss the spell to cause the weapon to discorporate into its component nanites, which then swarm over the target. The target must succeed at a Fortitude save or be nauseated for 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Blast Door",
      spellPreviewDescription = "Conjure a door that blocks off a hallway.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "133",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 round",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
        spellArea = "",
        spellEffect = "wall up to 20 feet high, 20 feet wide, and 5 feet thick",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You conjure a blast door up to 5 feet thick that blocks a hallway no more than 20 feet wide and 20 feet high. If the door would not completely block the targeted hallway, you can’t cast this spell. Any creature in the spaces where the door appears is harmlessly shunted to a side of the door you choose. The door’s statistics are those of a starship interior wall. It is airtight, and it protects against vacuum and radiation. When the spell ends, the door vanishes without a trace.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 1"),
      spellClassesWithLevelPreview = listOf("Prcg 1"),
      spellTitle = "Blessing of Youth",
      spellPreviewDescription = "Restore Stamina Points and grant additional land speed.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "68",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You rewind a living creature's personal timeline to an earlier point in their life cycle, imbuing them with renewed vitality and restoring a number of Stamina Points. Blessing of youth ends the bleeding condition.\n" +
              "\n" +
              "Blessing of youth restores a number of Stamina Points and applies bonuses to your target depending on the spell's level.\n" +
              "\n" +
              "1st: When you cast blessing of youth as a 1st-level spell, it restores 1d8 Stamina Points plus grants a +5-foot enhancement bonus to the target's land speed for 1 round.\n" +
              "\n" +
              "2nd: When you cast blessing of youth as a 2nd-level spell, it restores 3d8 Stamina Points plus grants a +5-foot enhancement bonus to the target's land speed for 2 rounds.\n" +
              "\n" +
              "3rd: When you cast blessing of youth as a 3rd-level spell, it restores 5d8 Stamina Points plus grants a +5-foot enhancement bonus to the target's land speed for 3 rounds.\n" +
              "\n" +
              "4th: When you cast blessing of youth as a 4th-level spell, it restores 7d8 Stamina Points plus grants a +10-foot enhancement bonus to the target's land speed for 4 rounds.\n" +
              "\n" +
              "5th: When you cast blessing of youth as a 5th-level spell, it restores 9d8 Stamina Points plus grants a +10-foot enhancement bonus to the target's land speed for 5 rounds. Additionally, it heals 1 temporary ability damage to each of the target's ability scores.\n" +
              "\n" +
              "6th: When you cast blessing of youth as a 6th-level spell, it restores 11d8 Stamina Points plus grants a +10-foot enhancement bonus to the target's land speed for 6 rounds. Additionally, it heals 2 temporary ability damage to each of the target's ability scores.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2","WtchW 2"),
      spellTitle = "Body Double",
      spellPreviewDescription = "You make one creature look like another.",
      spellSourceBookPreview = "AdvP#35",
      spellSourcePage = "54",
      spellSourceBookFull = "Adventure Path #35: Merchants of the Void",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "two creatures; see text",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "Upon casting this spell, choose a primary target and a secondary target, both within range. If the primary target fails or forfeits its saving throw, its appearance, scent, sounds, and mannerisms change to match those of the secondary target.\n" +
              "\n"+
              "As long as the two targets are of the same size category, they are indistinguishable. As a consequence, if the targets are adjacent and a creature takes an action that would affect one of the targets (such as an attack, a targeted spell, or an area effect), that action has a 50% chance of affecting the other target instead. Any action that would affect both creatures affects them both normally.\n" +
              "\n"+
              "This spell doesn’t deceive creatures under the effects of true seeing. Likewise, a creature that can’t perceive one of the targets isn’t fooled by this spell (even if the spell fooled that creature earlier), and its attacks, targeted spells, and other actions affect targets as normal.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4"),
      spellTitle = "Borrow Corruption",
      spellPreviewDescription = "Gain the benefits of a corruption from someone else.",
      spellSourceBookPreview = "AdvP#12",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #12: Heart of Night",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "willing creature touched",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You touch a willing creature with at least one manifestation from corruption (Adventure Path #10: The Diaspora Strain pg. 41) and expend 2 Resolve Points. If you do so, you temporarily gain any stains and gifts that corruption grants to the target, and the target retains them. If a gift you gain has limited uses, you can use the gift only by expending 1 Resolve Point for each use.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","Tchn 5","WtchW 5"),
      spellTitle = "Break Enchantment",
      spellPreviewDescription = "Free creatures from curses, enchantments, and transmutations.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "341",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 minute",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature per level, no two of which can be more than 30 ft. apart",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell frees victims from curses, enchantments, and transmutations. Break enchantment can reverse even an instantaneous effect. For each such effect, you attempt a caster level check (1d20 + your caster level, maximum +15) against a DC equal to 11 + the caster level of the effect. Success means that the creature is free of the spell, curse, or effect. For a cursed magic item, the DC of the caster level check is equal to the DC of the curse.\n" +
              "\n" +
              "If the spell is one that can’t be dispelled by dispel magic, break enchantment works only if that spell is 5th level or lower. If the effect comes from a permanent magic item, break enchantment doesn’t remove the curse from the item but it does free the victim from the item’s effects.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","Tchn 1"),
      spellTitle = "Broadcast Message",
      spellPreviewDescription = "Send out a repeating telepathic message to all creatures in an area.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "69",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination (language-dependent, mind-affecting)",
      spellCastingTime = "1 round; see text",
      spellRange = "(Area) emanation with a radius of 100 ft., centered on you; see text",
      spellTargets = "all creatures",
        spellArea = "",
        spellEffect = "",
      spellDuration = "concentration, up to 1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You broadcast a short telepathic message of up to 25 words to all creatures in the area. The message repeats each round for the duration. A technomancer casting this spell also broadcasts the message to all computers or constructs with the technological subtype that are designed to receive messages.\n" +
              "\n" +
              "You can spend additional time casting this spell to increase its area. If you do, for each additional full action spent to cast this spell, the emanation's radius increases by 100 ft., to a maximum of 1,000 ft.",
  )
, SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Build Trust",
      spellPreviewDescription = "You get a sense of the best way to interact with the target to encourage positive regard toward you.",
      spellSourceBookPreview = "AdvP#25",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #25: The Chimera Mystery",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1/day level; see text",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You get a sense of the best way to interact with the target to encourage positive regard toward you. You gain a +2 circumstance bonus to Charisma checks, Charismabased skill checks, and Sense Motive checks you attempt when interacting with the target. In addition, when you fail a Charisma check or Charisma-based skill check when interacting with the target, you can reroll the check as a reaction. However, if you attempt the reroll, the target receives a new saving throw against the spell. Taking hostile action against the target automatically ends the spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Burning Ash Cloud",
      spellPreviewDescription = "Creates a cloud that blocks vision and causes fire damage.",
      spellSourceBookPreview = "AdvP#18",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #18: Assault on the Crucible",
      spellSchool = "conjuration (creation, fire)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
        spellArea = "20-ft.-radius spread",
        spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "see text",
      spellResistance = "no",
      spellDescriptionFull = "You conjure forth a cloud of smoke and burning embers that billows out from the point you designate. The cloud obscures all sight, including darkvision beyond 5 feet. The area counts as a smoke hazard, except a creature within the cloud has total concealment (50% miss chance, and the attacker can’t use sight to locate the target) against their attackers. In addition, the embers within the cloud deal 2d6 points of fire damage to creatures ending their turns within the cloud.\n" +
              "\n"+
              "A moderate wind (11+ mph) disperses the cloud in 4 rounds; a strong wing (21+ mph) or stronger disperses the cloud in 1 round. This spell doesn’t function underwater or in a vacuum.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Bypass Password",
      spellPreviewDescription = "Use magic to access a password-protected computer.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "69",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one computer, control panel, datapad, or similar digital device",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous; see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Bypass password allows the caster to access a computer, control panel, or other similar digital device protected by a password. When you complete the casting of this spell, attempt a caster-level check (1d20 + your caster level) with a +10 bonus against the DC of the computer password. If successful, bypass password gives access through three password-protected security measures. Bypass password only works on technological or hybrid devices.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Cairn Form",
      spellPreviewDescription = "You transform your outer layer into solid rock, amplifying your offense and defense.",
      spellSourceBookPreview = "GaExM",
      spellSourcePage = "75",
      spellSourceBookFull = "Galaxy Exploration Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "one living creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no",
      spellDescriptionFull = "You transform your outer layer into solid rock, amplifying your offense and defense. You gain a special unarmed strike that deals lethal damage, doesn’t count as archaic, and threatens squares. You also add 1-1/2 × your character level to damage dealt with this attack (instead of the normal Weapon Specialization damage). You also gain DR 2/—. Finally, you gain a +2 circumstance bonus to your AC against bull rush, reposition, and trip combat maneuvers.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Call Cosmos",
      spellPreviewDescription = "Rain cosmic particles on targets, dealing 4d6 fire damage and 3d6 cold damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "342",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "",
        spellArea = "cylinder (20-ft. radius, 40 ft. high)",
        spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You evoke a vertical column of dangerous material from across the universe that rains down upon creatures in the area. This matter is made up of bits of burning stars and chunks of frozen comets, and it deals 4d6 fire damage and 3d6 cold damage to every creature in the area. This damage occurs only once, when the spell is cast. For the spell’s remaining duration, the fallen starstuff makes the entire area difficult terrain, and thick, swirling clouds of particulate space matter magically block vision. This obscures all sight beyond 5 feet, including darkvision and other vision-based senses (including vision-based blindsight and sense through), but doesn’t prevent blindsense. A creature within 5 feet of its attacker has concealment (attacks have a 20% miss chance). Creatures farther away have total concealment (50% miss chance, and the attacker can’t use sight to locate the target). Additionally, the swirling cosmic particles are distracting to spellcasters in the area, who have a 20% chance of losing any spell they attempt to cast in the area. At the end of the duration, the starstuff disappears, leaving no aftereffects (other than the damage dealt).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","WtchW 4"),
      spellTitle = "Calm the Storm",
      spellPreviewDescription = "Gain bonuses against mind-affecting effects.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "69",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "enchantment",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Developed by ikeshti brood-minders and congregants who moved beyond the threat of becoming a rivener, this spell is a celebration of the mental fortitude that one needs to resist one's urges and to shrug off outside influence. You gain a +2 morale bonus to saving throws against all spells and effects with the mind-affecting descriptor. If you would fail a saving throw against a mind-affecting spell or effect while under the effects of calm the storm, you can reroll the failed saving throw as a reaction. If you do, calm the storm ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Capricious Cats",
      spellPreviewDescription = "You conjure a pack of Tiny whimsical cats that scamper and perch within 30 feet of you wherever you move.",
      spellSourceBookPreview = "Ports",
      spellSourcePage = "123",
      spellSourceBookFull = "Ports of Call",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "spherical emanation",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 minute or until expended (D)",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You conjure a pack of Tiny whimsical cats that scamper and perch within 30 feet of you wherever you move. These adorable felines are only semi-real and are immune to damage. The cats appear with their own inclinations and don’t meaningfully heed your other instructions: roll 1d6 five times on the table below to determine these inclinations. This can result in multiple inclinations of the same type. As a move action, you can expend one of these inclinations and issue a command to the cats as a move action (for mischief or spite inclinations) or a reaction (for affection), causing the cats to perform the associated action once. Once you’ve expended all of the inclinations, the cats disappear.\n" +
              "D6 - INCLINATION\n" +
              "1–2 - Affection: Cats purr, nuzzle, and perch atop one creature in the emanation. The creature can reroll a saving throw they just failed against a fear, mind-affecting, or pain effect and use the second result.\n" +
              "3–4 - Mischief: Cats crowd, distract, and cling to one creature in the emanation, successfully providing your choice of covering fire or harrying fire.\n" +
              "5–6 - Spite: Cats claw and bite one creature in the emanation. Make a melee attack against KAC, for which you can use your caster level in place of your base attack bonus and your spellcasting ability modifier in place of your Strength modifier. The attack deals 4d6 slashing damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Carnivorous",
      spellPreviewDescription = "Your mouth expands to twice its normal size and fills with rows of razor-sharp teeth, giving you a bite attack.",
      spellSourceBookPreview = "AdvP#2",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #2: Temple of the Twelve",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Your mouth expands to twice its normal size and fills with rows of razor-sharp teeth, giving you a bite attack. This attack is treated as an attack with a basic melee weapon with the operative special quality for purposes of proficiency and Weapon Specialization and for other abilities that function with basic melee operative weapons. You can make this attack without using any limbs and when pinned.\n" +
              "\n"+
              "The attack deals 1d4 piercing damage. At 7th level, the damage increases to 2d4. At 10th level, it increases to 2d8. At 14th level, it increases to 3d8. At 16th level, it increases to 4d8. At 18th level, it increases to 5d8. At 20th level, it increases to 10d8.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2","WtchW 2"),
      spellTitle = "Caustic Conversion",
      spellPreviewDescription = "Fling magical nanites as a ranged attack that deals 4d4 acid damage to one target, plus 5 additional damage in subsequent rounds.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "342",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (acid)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature or object",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round + 1 round/3 levels",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You fling magical nanites that convert water vapor around your target into deadly acid. Make a ranged attack roll against your target’s EAC. If you hit, the target takes 4d4 acid damage and it takes 5 additional acid damage at the end of its turn each round for the spell’s duration.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("WtchW 1"),
      spellTitle = "Caustic Fissure",
      spellPreviewDescription = "You tear a thin fissure in reality, releasing a blaze of caustic energy.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "evocation (acid)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
        spellArea = "",
        spellEffect = "fissure of variable dimensions (S)",
      spellDuration = "1 round/level",
      spellSavingThrow = "Reflex partial, see text",
      spellResistance = "no",
      spellDescriptionFull = "You tear a thin fissure in reality, releasing a blaze of caustic energy. The fissure must be oriented on a horizontal surface that can fit its length, which depends on the level of the spell; the fissure runs through the center of the affected squares. The height of the blaze of caustic energy released from the fissure and the damage it deals to creatures who pass through it or end their turn in one of the fissure’s squares(no save) also depend on the level of the spell.\n" +
              "\n"+
              "If you evoke the fissure so that it appears where creatures are, each creature takes damage as if passing through the blaze and must immediately attempt a Reflex saving throw. On a failure, the creature falls prone.\n" +
              "\n"+
              "1st: When you cast caustic fissure as a 1st-level spell, the fissure is 10 feet long. The blaze of caustic energy rises to a height of 10 feet above the fissure and deals 2d4 acid damage.\n" +
              "\n"+
              "2nd: When you cast caustic fissure as a 2nd-level spell, the fissure is 20 feet long. The blaze of caustic energy rises to a height of 10 feet above the fissure and deals 4d4 acid damage.\n" +
              "\n"+
              "3rd: When you cast caustic fissure as a 3rd-level spell, the fissure is 30 feet long. The blaze of caustic energy rises to a height of 20 feet above the fissure and deals 6d4 acid damage.\n" +
              "\n"+
              "4th: When you cast caustic fissure as a 4th-level spell, the fissure is 40 feet long. The blaze of caustic energy rises to a height of 25 feet above the fissure and deals 6d6 acid damage.\n" +
              "\n"+
              "5th: When you cast caustic fissure as a 5th-level spell, the fissure is 60 feet long. The blaze of caustic energy rises to a height of 30 feet above the fissure and deals 8d6 acid damage.\n" +
              "\n"+
              "6th: When you cast caustic fissure as a 6th-level spell,the fissure is 80 feet long. The blaze of caustic energy rises to a height of 40 feet above the fissure and deals 10d6 acid damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2"),
      spellTitle = "Cavitation Sphere",
      spellPreviewDescription = "You cause a rapid change of pressure in liquid to form vapor-filled cavities, causing damaging localized shock waves.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "evocation (sonic)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless) and Reflex half (see text)",
      spellResistance = "no",
      spellDescriptionFull = "You cause a rapid change of pressure in liquid to form vapor-filled cavities, causing damaging localized shock waves.\n" +
              "\n"+
              "The target is surrounded by a series of quickly forming and dissipating rings that rotate around it. These rings are harmless to the target, but each creature adjacent to the target (in any direction, including diagonally and above or below) must attempt a Reflex saving throw or take 4d10 sonic damage. A successful save halves this damage.\n" +
              "\n"+
              "This spell can be cast on a target that isn’t entirely submerged in water, but adjacent creatures that aren’t at least partially submerged are unaffected by the spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6"),
      spellTitle = "Chain Surge",
      spellPreviewDescription = "Deal 13d12 electricity damage to primary target and up to 10 secondary targets; one of the primary target’s electrical devices stops functioning for 1 round.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "342",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (electricity)",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "one primary target and up to 10 secondary targets, no two of which can be more than 30 ft. from the primary target",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "Choose a primary target as well as up to 10 secondary targets within 30 feet of the primary target. The primary target must be carrying or wielding some kind of equipment that uses electricity. This spell causes the primary target’s electrical equipment to surge with deadly electricity, which arcs out to strike the secondary targets, dealing 13d12 electricity damage to all targets chosen.\n" +
              "\n" +
              "If the primary target fails its Reflex save, the spell also shorts out one of that target’s electrical items (your choice) for 1 round, meaning the primary target can’t use it for that period. If the primary target negates the effect entirely (such as with evasion), the secondary targets also suffer no effects.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Change Attitude",
      spellPreviewDescription = "You alter the target’s emotions and perceptions concerning a particular creature or topic.",
      spellSourceBookPreview = "AdvP#44",
      spellSourcePage = "49",
      spellSourceBookFull = "Adventure Path #44: Allies Against the Eye",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./level)",
      spellTargets = "one living creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You alter the target’s emotions and perceptions concerning a particular creature or topic, which can be as specific as “Vindaskayo Swarmripper, the current High Despot of the Veskarium” or as general as “technology.” The target’s attitude toward the chosen topic improves or worsens (your choice); the number of steps the target’s attitude changes is determined by the spell’s level (below). For example, you could use a 1st-level change attitude to improve the attitude of a target that’s normally indifferent toward AbadarCorp to make it friendly instead.\n" +
              "\n" +
              "This spell doesn’t enable the target to be controlled as if it were an automaton, nor does it influence the target’s behavior in any way beyond its attitude. The target can discriminate between general creatures, topics, and individuals based on its experiences; for example, a vesk influenced by this spell to have a better attitude toward humans might begin with a friendly attitude toward all humans they meet, but if an individual human gravely insulted the target’s honor, their attitude can (and likely would) adjust to unfriendly or hostile toward that individual—and if the target was attacked by humans, the vesk would fight back.\n" +
              "\n" +
              "1st: The spell adjusts the target’s attitude by one step.\n" +
              "\n" +
              "2nd: The spell adjusts the target’s attitude by two steps.\n" +
              "\n" +
              "3rd: The spell adjusts the target’s attitude by three steps.\n" +
              "\n" +
              "4th: The spell adjusts the target’s attitude by four steps.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","WtchW 2"),
      spellTitle = "Change of Seasons",
      spellPreviewDescription = "You accelerate time for the target, making them experience the concentrated effects of a Triaxian season.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "115",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will partial",
      spellResistance = "yes",
      spellDescriptionFull = "You accelerate time for the target, making them experience the concentrated effects of a Triaxian season. This spell imbues a target with vulnerability (as the universal creature rule) to cold or fire (chosen when cast); if the target has resistance to that type of damage, it instead reduces a target’s resistance to cold or fire damage by 5. If the target is immune, it’s instead treated as though it had fire or cold resistance 10 for the duration of the spell. A successful Will save reduces the duration to one round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Prcg 4","WtchW 4"),
      spellTitle = "Change of Seasons, Greater",
      spellPreviewDescription = "You accelerate time for the target, making them experience the concentrated effects of a Triaxian season.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "115",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will partial",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions like change of seasons except it causes vulnerability to fire or cold even if the target has resistance and reduces immunity to fire or cold resistance 5.\n"+

        "\n"+
        "(Change of Seasons: You accelerate time for the target, making them experience the concentrated effects of a Triaxian season. This spell imbues a target with vulnerability (as the universal creature rule) to cold or fire (chosen when cast); if the target has resistance to that type of damage, it instead reduces a target’s resistance to cold or fire damage by 5. If the target is immune, it’s instead treated as though it had fire or cold resistance 10 for the duration of the spell. A successful Will save reduces the duration to one round.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6"),
      spellClassesWithLevelPreview = listOf("Myst 6"),
      spellTitle = "Channel the Outer Sphere",
      spellPreviewDescription = "Draw concentrated essence from a selected plane in beams that deal 4d8 damage.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "69",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration",
      spellCastingTime = "1 round; see text",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
        spellArea = "cylinder (30-ft. radius, 100 ft. high)",
        spellEffect = "",
      spellDuration = "concentration, up to 1 round/level",
      spellSavingThrow = "Reflex half, see text",
      spellResistance = "no",
      spellDescriptionFull = "You weaken the border between one of the outer planes and the area, drawing concentrated planar essence down to the battlefield in beams of volatile energy. A beam is a vertical line, 5 feet wide, from the top of the spell's area to the bottom, and it deals 4d8 damage to each creature in the beam. When you cast this spell and each time you concentrate on it, you can call down a damaging beam within the spell's area. A creature in the area of a beam can attempt a Reflex saving throw to halve the damage dealt by this spell. Creatures that fail this saving throw can suffer further ill effects, as noted.\n" +
              "\n" +
              "When you cast this spell, select one of the following planes. You can only select a plane within one alignment step of your own. The beams gain additional effects based on the plane selected.\n" +
              "\n" +
              "Heaven (LG): When you choose Heaven, channel the outer sphere deals fire damage that has the lawful and good descriptors. Good creatures are immune to all damage dealt by this spell. Creatures that fail their Reflex saving throw are blinded 1 round.\n" +
              "\n" +
              "Nirvana (NG): When you choose Nirvana, channel the outer sphere deals nonlethal bludgeoning damage that has the good descriptor. Good creatures in the area of a beam are immune to all damage dealt by this spell and have 4d8 Hit Points restored.\n" +
              "\n" +
              "Elysium (CG): When you choose Elysium, channel the outer sphere deals sonic damage that has the chaotic and good descriptors. Good creatures in the area of a beam are immune to all damage dealt by this spell and escape from unwelcome bonds, immediately removing the entangled and grappled conditions.\n" +
              "\n" +
              "Axis (LN): When you choose Axis, channel the outer sphere deals electricity damage that has the lawful descriptor. Creatures that fail their Reflex saving throw are entangled for 1 round.\n" +
              "\n" +
              "Boneyard (N): When you choose the Boneyard, channel the outer sphere deals damage with the force descriptor. Undead in the area of a beam are dealt an additional 2d8 damage, for a total of 6d8 damage.\n" +
              "\n" +
              "Maelstrom (CN): When you choose the Maelstrom, the damage dealt by channel the outer sphere has the chaotic descriptor and an additional damage type determined randomly each round from among the following: acid, cold, electricity, fire. Creatures that fail their Reflex saving throw are confused for 1 round.\n" +
              "\n" +
              "Hell (LE): When you choose Hell, channel the outer sphere deals fire damage that has the lawful and evil descriptors. Creatures that fail their Reflex saving throw gain the burning condition (1d8).\n" +
              "\n" +
              "Abaddon (NE): When you choose Abaddon, channel the outer sphere deals acid damage that has the evil descriptor. Creatures that fail their Reflex saving throw are sickened for 1 round.\n" +
              "\n" +
              "Abyss (CE): When you choose the Abyss, channel the outer sphere deals slashing damage that has the chaotic and evil descriptors. Creatures that fail their Reflex saving throw are bleeding (1d8).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Charm Monster",
      spellPreviewDescription = "Make one creature believe it is your ally or one day per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "342",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (charm, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 day/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions like charm person, except the effect is not restricted by creature type.\n" +
        "\n"+
        "(Charm Person: This charm makes a humanoid creature regard you as its trusted friend and ally (treat the target’s attitude as friendly). If the creature is currently being threatened or attacked by you or your allies, however, it receives a +5 bonus to its saving throw.\n" +
              "\n" +
              "The spell does not enable you to control the charmed creature as if it were an automaton. It is unlikely to attempt to harm you, but it is also unlikely to attack any of its true friends or allies. You can try to give the target suggestions, but you must succeed at an opposed Charisma check to convince it to do anything it wouldn’t ordinarily do. (Retries of this check are not allowed.) An affected creature never obeys suicidal or obviously harmful suggestions. Any act by you or your apparent allies that threatens the charmed creature breaks the spell. You must speak the creature’s language to communicate your suggestions, or else be good at pantomiming.)",
  )
, SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Charm Person",
      spellPreviewDescription = "Make one creature believe it is your ally or one day per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "342",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (charm, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one humanoid creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This charm makes a humanoid creature regard you as its trusted friend and ally (treat the target’s attitude as friendly). If the creature is currently being threatened or attacked by you or your allies, however, it receives a +5 bonus to its saving throw.\n" +
              "\n" +
              "The spell does not enable you to control the charmed creature as if it were an automaton. It is unlikely to attempt to harm you, but it is also unlikely to attack any of its true friends or allies. You can try to give the target suggestions, but you must succeed at an opposed Charisma check to convince it to do anything it wouldn’t ordinarily do. (Retries of this check are not allowed.) An affected creature never obeys suicidal or obviously harmful suggestions. Any act by you or your apparent allies that threatens the charmed creature breaks the spell. You must speak the creature’s language to communicate your suggestions, or else be good at pantomiming.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("WtchW 0"),
      spellTitle = "Charming Veneer",
      spellPreviewDescription = "Give a creature a bonus to Charisma-based checks, and speed its gathering of information.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "133",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "10 minutes",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You pull gossamer threads from other, more genteel realities and wrap the target in them, smoothing the edges of their personality and accentuating their charms. The target gains a +1 circumstance bonus to Charisma checks and Charisma-based skill checks. Additionally, a creature affected by this spell can attempt a Diplomacy check to gather information in only 10 minutes. Once any individual under the effects of a charming veneer spell you cast has used this benefit to gather information in a specific settlement or local region, no target of a charming veneer spell you cast can do so again for 24 hours.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 6"),
      spellClassesWithLevelPreview = listOf("Prcg 6"),
      spellTitle = "Cheat Time",
      spellPreviewDescription = "Perform a flurry of actions.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "70",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 round; see text",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You unfetter yourself in time, rapidly performing a variety of actions in the blink of an eye. You can perform up to six actions from the following options, in a combination and order of your choice, though some actions end the spell immediately.\n" +
              "\n" +
              "Attack: You can perform an attack with any weapon you're wielding. After you perform this action, cheat time immediately ends, eliminating any unused actions.\n" +
              "\n" +
              "Combat Maneuver: You can perform a bull rush, dirty trick, disarm, or trip combat maneuver. When you attempt these combat maneuvers, you can use your key ability modifier instead of your Strength modifier if it's higher.\n" +
              "\n" +
              "Manipulate Object: You can manipulate an object within reach.\n" +
              "\n" +
              "Move: You can move up to your speed. This movement doesn't provoke attacks of opportunity.\n" +
              "\n" +
              "Spell: You can cast a spell with a casting time of 1 standard action. After you perform this action, if the spell you cast is offensive, cheat time immediately ends, eliminating any unused actions.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5"),
      spellTitle = "Chrono Leap",
      spellPreviewDescription = "Knock a creature through time and across the battlefield.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "70",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
        spellArea = "see text",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You rocket the target forward through time, sending them careening across the battlefield. You move the target up to 60 feet in a straight line. This movement doesn't provoke attacks of opportunity. The target can attempt a Reflex saving throw to prevent this movement and negate the additional effect below.\n" +
              "\n" +
              "At the end of this movement, the creature reenters the flow of time with a burst of temporal energy. Creatures adjacent to the target take 4d6 bludgeoning damage and are knocked prone. A creature in this area that succeeds at a Reflex saving throw takes only half damage and isn't knocked prone.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("WtchW 0"),
      spellTitle = "Churn Fluid",
      spellPreviewDescription = "Change the chemical composition of up to 1 bulk of liquid per level.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "134",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
        spellArea = "",
        spellEffect = "change the chemical composition of up to 1 bulk of fluid/ level; see text",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You merge a tiny corner of parallel realities with this one, subtly or dramatically shifting the chemical composition of a fluid. You can target any type of fluid, and you need not know its current composition. You must be able to see the liquid or the receptacle that holds it, or this spell fails and is lost. You must also target an entire body of fluid, rather than only part of it. If you target an amount of fluid that is too large for you to change entirely, the spell fails and is lost.\n" +
              "\n"+
              "When you target fluid in this way, you can turn it into potable water, salt water, mildly corrosive acid or base, blood, or any other nontoxic, non-damaging fluid with no other game effects. After 1 day, if unused in its changed state, the fluid reverts to its original state. In so doing, the reverting fluid cannot cause harm.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Clairaudience/Clairvoyance",
      spellPreviewDescription = "Hear or see at a distance for 1 minute per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "342",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination (scrying)",
      spellCastingTime = "10 minutes",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "",
        spellArea = "",
        spellEffect = "magical sensor",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You create an invisible magical sensor at a specific location that enables you to hear or see (your choice) almost as if you were there. You don’t need line of sight or line of effect to create this sensor in a specific spot within range, but the locale must be either a place that’s familiar to you or an obvious location, such as inside a cave whose entrance you can see.\n" +
              "\n" +
              "The sensor doesn’t move, but you can rotate it in all directions to view the area as desired. This spell functions only on the plane of existence you are currently occupying.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Climate Adaptation",
      spellPreviewDescription = "Protect a creature from extreme heat or cold.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "70",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 hour",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You tweak a creature's genetic code, altering its environmental adaptations to better suit the surrounding climate. For the duration, the target reduces the severity of dangerous temperatures by one step. For example, cold is reduced to comfortable, while extreme heat is reduced to severe heat. Climate adaptation can protect the target from either cold or heat but not both simultaneously.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1"),
      spellTitle = "Command Icon",
      spellPreviewDescription = "Create a rallying symbol of light above a target creature that provides several beneficial effects.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "70",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "Hobgoblins created this spell to signify rallying points and provide commanders with better ability to organize troops. The target creature seems more imposing, granting the creature a +2 morale bonus to Charisma-based checks made to motivate troops and all Intimidate checks. A symbol of leadership, such as the seal of an organization or a deity's holy symbol, illuminates above the target. This symbol increases the light in a 10-foot radius by one step, up to normal. The light imposes a –20 penalty to Stealth checks and prevents the target from benefiting from concealment from darkness, invisibility, and similar effects. The target gains a +1 morale bonus to saving throws against fear and being charmed, as do allies while they remain within the symbol's light.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Command Undead",
      spellPreviewDescription = "Undead creature obeys your commands.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "343",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy (sense-dependent)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one undead creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 day/level",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "yes",
      spellDescriptionFull = "This spell allows you a degree of control over an undead creature. If the target is intelligent, it perceives your words and actions favorably (treat its attitude as friendly). It will not attack you while the spell lasts. You can give the target suggestions, but you must succeed at an opposed Charisma check to convince it to do anything it wouldn’t ordinarily do. (Retries are not allowed.) An intelligent commanded undead never obeys suicidal or obviously harmful suggestions, but it might be convinced that something very dangerous is worth doing.\n" +
              "\n" +
              "An unintelligent undead creature gets no saving throw against this spell. When you control a mindless being, you can communicate only basic commands, such as “Come here,” “Go there,” “Fight,” “Stand still,” and so on. Unintelligent undead won’t resist suicidal or obviously harmful orders.\n" +
              "\n" +
              "Any act by you or your apparent allies that threatens the commanded undead (regardless of its Intelligence) breaks the spell. You command the undead creature by voice and it understands you, no matter what language you speak.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Command",
      spellPreviewDescription = "One creature obeys a select command for 1 round.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "343",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, language-dependent, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You give the target one of the following commands, which it obeys to the best of its ability at its earliest opportunity. If the target can’t carry out your command on its next turn, the spell automatically fails.\n" +
              "\n" +
              "Approach: The target moves toward you as quickly and directly as possible for 1 round, taking no other actions and triggering reactions (such as attacks of opportunity) for this movement as normal.\n" +
              "\n" +
              "Drop: The target drops whatever it is holding. It can’t pick up any dropped item until its next turn.\n" +
              "\n" +
              "Fall: The target falls to the ground and remains prone for 1 round. It can otherwise act normally.\n" +
              "\n" +
              "Flee: The target moves away from you as quickly and directly as possible for 1 round, taking no other actions and provoking reactions (such as attacks of opportunity) for this movement as normal.\n" +
              "\n" +
              "Halt: The target is dazed for 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Command, Greater",
      spellPreviewDescription = "One creature per level obeys select command for 1 round per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "343",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, language-dependent, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
        spellArea = "",
        spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions like command, except you can affect up to one creature per level and the targets continue the specified activity beyond 1 round. At the start of each commanded creature’s action after the first, it can attempt another Will saving throw to break free from the spell. Each creature must receive the same command.\n" +
              "\n" +
              "(Command: You give the target one of the following commands, which it obeys to the best of its ability at its earliest opportunity. If the target can’t carry out your command on its next turn, the spell automatically fails.\n" +
              "\n" +
              "Approach: The target moves toward you as quickly and directly as possible for 1 round, taking no other actions and triggering reactions (such as attacks of opportunity) for this movement as normal.\n" +
              "\n" +
              "Drop: The target drops whatever it is holding. It can’t pick up any dropped item until its next turn.\n" +
              "\n" +
              "Fall: The target falls to the ground and remains prone for 1 round. It can otherwise act normally.\n" +
              "\n" +
              "Flee: The target moves away from you as quickly and directly as possible for 1 round, taking no other actions and provoking reactions (such as attacks of opportunity) for this movement as normal.\n" +
              "\n" +
              "Halt: The target is dazed for 1 round.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","WtchW 1"),
      spellTitle = "Communal Bond",
      spellPreviewDescription = "Grant a bonus to saves against fear effects, and bonuses to providing aid, harrying fire, or covering fire.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "71",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "the caster and all allies within a 30-ft. radius burst, centered on the caster",
        spellArea = "",
        spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "none",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell arises from ghorans' tradition of imbuing their group projects and celebrations of togetherness with magic. Targets gain a +1 morale bonus to saving throws against fear effects while they're observing at least one other target of the same casting of this spell. Also, when a target successfully aids another target of the same casting of this spell, or provides such a creature covering or harrying fire, the bonus from successfully doing so is +3 instead of +2.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Commune with Nature",
      spellPreviewDescription = "Learn about terrain for 1 mile per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "344",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "10 minutes",
      spellRange = "",
      spellTargets = "personal",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You become one with nature, attaining knowledge of the surrounding territory. You instantly gain knowledge of up to three facts from among the following subjects: the ground or terrain, plants, minerals, bodies of water, people, general animal population, presence of native creatures, presence of powerful unnatural creatures, or general state of the natural setting.\n" +
              "\n" +
              "In outdoor settings, the spell operates in a radius of 1 mile per caster level. In natural underground settings—caves, caverns, and the like—the spell is less powerful and its radius is limited to 100 feet per caster level. The spell does not function where nature has been replaced by construction or settlements, such as in cities, factories, and starships.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Commune With Planet",
      spellPreviewDescription = "Learn information about the planet you occupy, or about a planet in whose orbit you’re within.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "134",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "10 minutes",
      spellRange = "personal",
      spellTargets = "",
        spellArea = "",
        spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You form a connection with a planet you are on or in orbit of, instantly learning up to three facts from among the following: major settlements, basic attributes (location in the galaxy, diameter and mass, gravity, atmosphere, and day and year length), ecological state (such as untamed, cultivated, polluted, destroyed by war, and so on), intelligent life, the presence of powerful or unusual creatures, and technological installations.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","WtchW 1"),
      spellTitle = "Companion Bond",
      spellPreviewDescription = "Communicate telepathically with a pet, mount, or other creature.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "71",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "the caster plus one willing creature (see text)",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "As the lashuntas who created this spell, you forge a telepathic link with a pet, mount, or other creature, provided the creature has an Intelligence modifier and that modifier is –2 or lower, and the creature is of the aberration, animal, dragon, magical beast, or plant type. Any creature that you have as a creature companion can instead be the target of this spell. You can communicate telepathically through the bond, regardless of language. No special power or influence is established because of the bond. Once the bond is formed, it works over any distance provided you and the target are on the same plane. If the creature has an intelligence modifier of –3 or higher, they can communicate simple thoughts through the bond to you. Otherwise, the creature can communicate feelings through this bond but not words or complex concepts. If the target is your creature companion, it doesn't need to see or hear you to receive your commands, and you receive a +2 morale bonus to Survival checks to control or ride the creature.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1"),
      spellTitle = "Comprehend Customs",
      spellPreviewDescription = "Gain a +2 insight bonus to Culture checks about a specific culture made within the spell’s duration.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "134",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "reaction",
      spellRange = "personal",
      spellTargets = "you",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no (harmless)",
      spellDescriptionFull = "This spell grants you a +2 insight bonus to Culture checks you attempt during the duration. The insight you gain might help you greet someone properly, know whether physical contact (a handshake, for example) is appropriate, or how to eat without making a mess or insulting your host. In addition, when you attempt Diplomacy checks to change attitudes during the duration, you can lower the DC by 5. This spell does not replace careful study of a culture, nor does it give insight beyond events that occur during the duration.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Comprehend Languages",
      spellPreviewDescription = "You understand all spoken, signed, and written or tactile languages.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "344",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You can understand the spoken or signed words of creatures or read otherwise incomprehensible written or tactile messages. The ability to read does not necessarily impart insight into the material, merely its literal meaning. The spell enables you to understand or read an unknown language, not speak or write it. You can’t use this spell to read magic writing or encoded messages (though it does reveal if a message is magic or encoded), but you can use it to read raw computer code or foreign programming languages, allowing you to understand enough to attempt Computers checks on those materials without penalties.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("WtchW 1"),
      spellTitle = "Compress Creature",
      spellPreviewDescription = "This spell compresses the body of the target, reducing their size by one category (to a minimum of Small) for the purposes of squeezing and of the number of squares it occupies.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "1 creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/ level (D)",
      spellSavingThrow = "Fortitude negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell compresses the body of the target, reducing their size by one category (to a minimum of Small) for the purposes of squeezing and of the number of squares it occupies. The target’s speed is reduced by 5 feet, and it can’t run or charge while compressed. This spell doesn’t confer bonuses, inflict penalties, or trigger effects that would otherwise result from changing a creature’s size.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog ","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","WtchW 4"),
      spellTitle = "Confusion",
      spellPreviewDescription = "Targets behave randomly for 1 round per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "344",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "15-ft.-radius burst",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell causes confusion in all creatures in the area, making them unable to determine their actions. Any confused creature that is attacked automatically attacks or attempts to attack its attackers on its next turn, as long as it is still confused at the start of its next turn. Note that a confused creature will not make attacks of opportunity against any foe that it is not already devoted to attacking (either because of its most recent action or because it has just been attacked). For confused creatures that have not been attacked, roll on the following table at the start of each affected creature’s turn each round to see what it does in that round.\n" +
              "\n" +
              "D% : Behavior\n" +
              "1–25 : Act normally.\n" +
              "26–50 : Do nothing but babble incoherently.\n" +
              "51–75 : Deal 1d8 + Str modifier damage to self with item in hand.\n" +
              "76–100 : Attack nearest creature.\n" +
              "\n" +
              "A confused creature that can’t carry out the indicated action does nothing but babble incoherently. Attackers are not at any special advantage when attacking a confused target.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","WtchW 1"),
      spellTitle = "Confusion, Lesser",
      spellPreviewDescription = "One living creature is confused for 1 round.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "344",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell causes a single creature to become confused (as per the confusion spell) for 1 round.\n" +
              "\n" +
              "(Confusion) This spell causes confusion in all creatures in the area, making them unable to determine their actions. Any confused creature that is attacked automatically attacks or attempts to attack its attackers on its next turn, as long as it is still confused at the start of its next turn. Note that a confused creature will not make attacks of opportunity against any foe that it is not already devoted to attacking (either because of its most recent action or because it has just been attacked). For confused creatures that have not been attacked, roll on the following table at the start of each affected creature’s turn each round to see what it does in that round.\n" +
              "\n" +
              "D% : Behavior\n" +
              "1–25 : Act normally.\n" +
              "26–50 : Do nothing but babble incoherently.\n" +
              "51–75 : Deal 1d8 + Str modifier damage to self with item in hand.\n" +
              "76–100 : Attack nearest creature.\n" +
              "\n" +
              "A confused creature that can’t carry out the indicated action does nothing but babble incoherently. Attackers are not at any special advantage when attacking a confused target.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0"),
      spellTitle = "Conjure Grenade",
      spellPreviewDescription = "You rapidly conjure and assemble the components to make a grenade.",
      spellSourceBookPreview = "Ports",
      spellSourcePage = "83",
      spellSourceBookFull = "Ports of Call",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You rapidly conjure and assemble the components to make a grenade, which you throw as part of the action used to cast this spell, requiring an attack roll to hit the intersection as normal. The grenade has a 20-foot range increment, deals 1d4 piercing damage, and has the explode (5 feet) property. Creatures in the affected area can attempt a Reflex save to halve the damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Contact Other Plane",
      spellPreviewDescription = "Ask questions of an extraplanar entity, with questionable results.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "344",
      spellSourceBookFull = "Starfinder Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "10 minutes",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You send your mind to another plane of existence (an Elemental Plane or some plane further removed) in order to receive advice and information from powers there. The powers reply in a language you understand, but they resent such contact and give only brief answers to your questions. All questions are answered with “Yes,” “No,” “Maybe,” “Never,” “Irrelevant,” or some other one-word answer.\n" +
              "\n" +
              "You must concentrate on maintaining the spell in order to ask questions at the rate of one per round. A question is answered by the power during the same round. You can ask one question for every 2 caster levels. On rare occasions, this divination may be blocked by an act of certain deities or forces.\n" +
              "\n" +
              "Contacting a minor planar power is relatively safe but may not result in useful answers. For each question you ask, the GM secretly rolls 1d20.\n" +
              "\n" +
              "1–2: The power gives you no answer, the spell ends, and you must attempt a DC 7 Intelligence check. On a failed check, your Intelligence and Charisma scores each fall to 8 for a week and you are unable to cast spells for that period.\n" +
              "\n" +
              "3–5: You receive a random answer to the question.\n" +
              "\n" +
              "6–10: You receive an incorrect answer to the question. Based on the nature and needs of the creature contacted, this may be a lie designed to harm you.\n" +
              "\n" +
              "11–15: You receive no answer to the question.\n" +
              "\n" +
              "16 or More: You receive a truthful and useful one-word answer. If the question can’t be truthfully answered in this way, no answer is received.\n" +
              "\n" +
              "Contact with minds further removed from your home plane increases the probability that you will incur a decrease in Intelligence and Charisma due to your brain being overwhelmed by the power’s sheer strangeness and force, but it also increases the chance of the power knowing the answer and answering correctly. You can add any value from +1 to +5 to the d20 roll to represent contacting increasingly powerful planar beings. However, on a roll of 1 or 2, the result is still no answer, the spell ends, and you must attempt an Intelligence check to avoid losing Intelligence and Charisma. The DC of this Intelligence check is increased by the same amount added to the d20 check to contact a planar creature.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Control Atmosphere",
      spellPreviewDescription = "Alter the corrosiveness, density, or toxicity of the surrounding atmosphere",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "204",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium",
      spellTargets = "",
      spellArea = "30-ft.-radius spread",
      spellEffect = "",
      spellDuration = "10 minute/level",
      spellSavingThrow = "Fortitude partial (see text)",
      spellResistance = "no",
      spellDescriptionFull = "You can alter the atmosphere within the spell’s area to cause it to become more like the atmosphere of another planet. You can alter one aspect of the atmosphere—its corrosiveness, density, or toxicity. The possible effects of each of these changes are detailed below.\n" +
              "\n" +
              "Corrosiveness: You can make the atmosphere corrosive. Each creature and object in the area when you cast the spell must succeed at a Fortitude save or take 5d6 acid damage. Creatures and objects that remain in the area take 3d6 additional acid damage every 10 minutes (Fortitude half).\n" +
              "\n" +
              "Alternatively, you can make a normally corrosive atmosphere noncorrosive. In this case, the atmosphere within the spell’s area deals no acid damage for the duration of the spell.\n" +
              "\n" +
              "Density: You can make the atmosphere in the area one step thinner (going from severely thick to thick, thick to normal, normal to thin, or thin to severely thin) or thicker (going from severely thin to thin, thin to normal, normal to thick, or thick to severely thick). The spell cannot make an atmosphere thicker than severely thick or thinner than severely thin.\n" +
              "\n" +
              "In addition to the normal long-term effects of being in an atmosphere thinner or thicker than a creature is acclimated to, each creature in the area of the spell when it is cast must succeed at a Fortitude save or suffer the immediate effects described below. This is true even for creatures with environmental protection from equipment (such as armor), as the air within the armor is affected on a failed saving throw. Creatures that do not need to breathe are not affected by changes in atmospheric density.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Tchn 6","WtchW 6"),
      spellTitle = "Control Gravity",
      spellPreviewDescription = "Alter gravity in an area.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "345",
      spellSourceBookFull = "Starfinder Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "up to one 10-ft. cube/2 levels (S)",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Fortitude negates, see text",
      spellResistance = "no",
      spellDescriptionFull = "You can control gravity in an area, causing it to reverse, become zero-g, or become extremely strong. A creature or object within the area that succeeds at its saving throw is unaffected (though if it stays in the area, it must succeed at a new save each round or become affected), but it might still suffer secondary effects (such as an object flying up from reversed gravity, or an object falling upon it when the spell ends). You choose how to have this spell affect gravity when you cast it, and you cannot change it without recasting the spell. If two control gravity spells affect the same area, they negate each other in the area of overlap.\n" +
              "\n" +
              "If you reverse gravity in an area, you cause unattached objects and creatures in the area to fall upward and reach the top of the affected area in 1 round. If a solid object (such as a ceiling) is encountered in this fall, falling objects and creatures strike it in the same manner as they would during a normal downward fall. If an object or creature reaches the top of the spell’s area without striking anything, it remains there, oscillating slightly, until the spell ends. At the end of the spell’s duration, affected objects and creatures fall downward. Creatures who can fly or levitate can keep themselves from falling in either direction.\n" +
              "\n" +
              "If you increase gravity in the area, creatures and objects weigh twice as much as normal, move at half speed, can jump only half as far as normal, and can lift and carry only half as much as normal. Any flying target has its maneuverability worsened by one step (from average to clumsy, for example; minimum clumsy) and plummets to the ground unless it succeeds at a DC 25 Acrobatics check to fly to remain in the air.\n" +
              "\n" +
              "An area of zero-g works like the zero gravity environment (Starfinder Core Rulebook page 402). You can also use this spell to make areas of zero gravity, heavy gravity, or low gravity act as standard gravity for the duration (Starfinder Core Rulebook page 402).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5"),
      spellTitle = "Control Machines",
      spellPreviewDescription = "Command technological constructs within range telepathically.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "345",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "constructs of the technological subtype with individual CRs no greater than your level + 1 and a total CR no greater than twice your level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, up to 1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "no",
      spellDescriptionFull = "You wrest control of the target constructs and command them telepathically. You can issue commands to any number of controlled constructs on your turn, beginning when you cast this spell, as part of the concentration required to sustain its duration (a standard action).\n" +
              "\n" +
              "If any of the constructs are under the control of a hostile creature, that controlling creature can attempt a Will saving throw (DC equal to this spell’s) to negate this spell’s effect. Each construct under the control of another creature grants its controlling creature a separate saving throw to negate the effect for that construct.\n" +
              "\n" +
              "While this spell is in effect, the affected constructs follow any command you give them, even if it would be dangerous to the controlled constructs. At the end of the spell, the constructs revert to their normal behavior. If they are intelligent, they know and remember that you used magic to control them.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6"),
      spellTitle = "Control Undead",
      spellPreviewDescription = "Undead creatures follow your commands and don’t attack you.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "345",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "undead creatures with individual CRs no greater than your level + 1 and a total CR no greater than twice your level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell enables you to control undead creatures for a short period of time. You command them by voice and they understand you, no matter what language you speak. No matter what, the controlled undead do not attack you. At the end of the spell, the targets revert to their normal behavior.\n" +
              "\n" +
              "If any of the undead are under the control of a hostile creature, that controlling creature can attempt a Will saving throw (DC = the spell’s DC) to negate this spell’s effect if the creature failed its initial saving throw. Each undead under the control of another creature grants its controlling creature a separate saving throw to negate the effect for that undead.\n" +
              "\n" +
              "Intelligent undead creatures remember that you controlled them, and they may seek revenge after the spell’s duration ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Control Winds",
      spellPreviewDescription = "You alter the movement of air in an area around you.",
      spellSourceBookPreview = "GaExM",
      spellSourcePage = "114",
      spellSourceBookFull = "Galaxy Exploration Manual",
      spellSchool = "transmutation (air)",
      spellCastingTime = "1 standard action",
      spellRange = "10 ft./level; see text",
      spellTargets = "",
      spellArea = "10 ft./level–radius cylinder, equally high; see text",
      spellEffect = "10 minutes/level (D)",
      spellDuration = "",
      spellSavingThrow = "Fortitude negates, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You alter the movement of air in an area around you. Wind created by this spell imposes a penalty to Perception checks equal to the penalty the wind imposes on non-energy ranged weapon attacks (see Table 11–6: Wind Effects on page 400 of the Core Rulebook). At the GM’s discretion, outdoor wind conditions are generally light wind, while indoor wind conditions are generally no wind; these conditions can vary by environment. This spell can’t create wind in an area that has no atmosphere.\n" +
              "\n" +
              "1st: When you cast control winds as a 1st-level spell, you can lower or raise the wind speed in the area by one level (for example, from strong wind to either moderate or severe wind), to a minimum of no wind and a maximum of severe wind.\n" +
              "\n" +
              "2nd: When you cast control winds as a 2nd-level spell, you can lower or raise the wind speed in the area by up to two levels, to a minimum of no wind and a maximum of severe wind.\n" +
              "\n" +
              "3rd: When you cast control winds as a 3rd-level spell, you can lower or raise the wind speed in the area by up to three levels, to a minimum of no wind and a maximum of severe wind.\n" +
              "\n" +
              "When you dismiss the spell or it otherwise ends, you can create a blast of severe wind in an instantaneous line-shaped burst that originates from the area’s point of origin and has a length equal to the area’s radius. Creatures that enter the area or start their turn there must attempt a Fortitude saving throw to avoid effects based on their size: Tiny and smaller creatures are knocked prone and pushed 1d4 × 10 feet along the wind’s path, up to the end of the wind’s range, and the creature takes 1d4 bludgeoning damage per 10 feet. Small creatures are knocked prone. Medium and smaller creatures moving against the wind move at half speed. In addition, flying creatures in the area must attempt an Acrobatics check to fly in dangerous wind conditions. This gust can also do whatever a gust of severe wind might be expected to do, such as put out small flames, fan large flames, blow away vapors, and so on.\n" +
              "\n" +
              "4th: When you cast control winds as a 4th-level spell, it functions as the 3rd-level version, but you can raise the wind speed up to a maximum of windstorm. In addition, when you cast the spell, you can exclude up to 2 squares per level from the spell’s effects; these squares must be contiguous.\n" +
              "\n" +
              "If you create a blast of wind when you dismiss the spell or it otherwise ends, the blast is windstorm level. Creatures are treated as one size category smaller when determining the effects of the blast on them.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Corrode Battery",
      spellPreviewDescription = "You cause the energy cells of a technological item to corrode, causing it to unreliably hold a charge.",
      spellSourceBookPreview = "AdvP#45",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #45: The Culling Shadow",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "You cause the energy cells of a technological item to corrode, causing it to unreliably hold a charge. Whenever a creature uses the target item in a way that would use a charge, there’s a 20% chance the item doesn’t function (as if the item is out of charges), and any action normally required to use the item is lost.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Corrosive Haze",
      spellPreviewDescription = "Cloud deals 4d8 acid damage per round, plus 10 additional damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "346",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (acid)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "5-ft.-diameter cloud of acid",
      spellDuration = "1 round/level",
      spellSavingThrow = "Reflex negates",
      spellResistance = "yes",
      spellDescriptionFull = "A 5-foot cloud of acid-resistant nanites continually converts nearby water vapor into deadly acid. You can create the cloud in the same square as a creature and move it up to 30 feet in any direction as a move action on your turn. If the cloud enters (or is created in) a square containing a creature, it can’t move any farther that round and deals 4d6 acid damage to that creature (Reflex negates). The acidic cloud also corrodes any unattended objects along its path, dealing them 4d8 acid damage.\n" +
              "\n" +
              "If you don’t move the cloud, it remains where it is; if it shares its square with any creature at the beginning of your turn, that creature must succeed at a Reflex save or take 4d8 acid damage. Any creature that takes damage from the cloud takes 10 additional acid damage at the end of its next turn.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Cosmic Eddy",
      spellPreviewDescription = "Whirlwind deals 4d6 damage and knocks creatures prone.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "346",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius spread",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You pull dormant mystical energy from the land and objects around you and use it to create a swirling eddy that batters your foes and can hinder their movement. The eddy deals 4d6 bludgeoning damage to each creature in the area. Additionally, creatures in the area are knocked prone and are reduced to half speed while the spell is in effect. A creature that succeeds at a Reflex save takes only half damage and is not knocked prone, but it is still reduced to half speed. Flying creatures within the eddy’s area must attempt an Acrobatics check to fly (DC equals the spell’s save DC) each round. Failure means the creature cannot move for that round.\n" +
              "\n" +
              "The spell deals damage and knocks creatures prone only once. However, if a creature leaves the spell’s area and then returns, it is subject to the damage and other effects described above again (and can attempt another Reflex saving throw). Similarly, if a creature is not in this spell’s area when it is first cast but later moves into it, it is subject to the damage and other effects described above.\n" +
              "\n" +
              "Small, unattended items (no more than light bulk) are also thrown around in the eddy’s area. At the end of the spell’s duration, such items land in a randomly determined space within the spell’s area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Create Ammunition",
      spellPreviewDescription = "Create a specific type of ammunition, such as arrows or a battery.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "134",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You create a specific type of ammunition, such as arrows or a battery, and conjure it in hand or a place within range. You can create ammunition with an item level of 1 or 2, and you create a number of charges or pieces of ammunition as if you had purchased the ammunition (for example, 20 arrows or a battery with 20 charges). If you use this spell to create a battery, the battery can be used for any function a battery performs. This spell cannot create ammunition made from special materials or with any special quality, and it cannot create grenades, rockets, missiles, or the like. The ammunition disappears when the duration ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5","WtchW 5"),
      spellTitle = "Creation",
      spellPreviewDescription = "Create a single object made of vegetable or mineral matter.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "347",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 minute",
      spellRange = "0 ft.",
      spellTargets = "",
      spellArea = "",
      spellEffect = "one nonmagical, nontechnological object of nonliving matter, up to 1 bulk/level; see text",
      spellDuration = "see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You create a nonmagical, nontechnological, unattended object of nonliving matter. The volume of the item created can’t exceed 1 cubic foot (or 1 bulk) per caster level. You must succeed at an appropriate Engineering or Profession check to make a complex item, and you can’t create a consumable item.\n" +
              "\n" +
              "4th: When you cast creation as a 4th-level spell, it creates an object made out of vegetable matter (such as wood) that has an item level no greater than one-third your caster level. The duration is 1 hour per caster level.\n" +
              "\n" +
              "5th: When you cast creation as a 5th-level spell, it creates an object made out of vegetable matter or material of a mineral nature: crystal, metal, stone, or the like. The object can’t have an item level greater than half your caster level. The duration depends on the hardness and rarity of the created object, as indicated on the following table.\n" +
              "\n" +
              "Hardness and Rarity Examples : Duration\n" +
              "Vegetable matter : 2 hours/level\n" +
              "Stone, crystal, base metals : 1 hour/level\n" +
              "Precious metals : 20 minutes/level\n" +
              "Gems : 10 minutes/level\n" +
              "Rare metals* : 1 round/level\n" +
              "\n" +
              "* Includes adamantine, alchemical silver, mithral, and starmetal alloys. You can’t use a 5th-level creation spell to create a cold iron item.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","WtchW 5"),
      spellTitle = "Crush Skull",
      spellPreviewDescription = "Deal 18d8 damage to living creature’s head.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "347",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy (death)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude partial",
      spellResistance = "yes",
      spellDescriptionFull = "You manipulate the energy that swirls around the target’s head, pulling it inward and potentially crushing its skull. You must make a ranged attack against the target’s EAC to ensure this spell hits the necessary weak spots in the target’s head, but you can add your key ability score modifier to this attack roll instead of your Dexterity modifier if it is higher. If you hit and the target fails a Fortitude saving throw, it takes 18d8 damage. If the target succeeds at its saving throw, it instead takes 4d8 damage. The target might die from damage even if it succeeds at its saving throw; in this case, the spell is not a death effect. This spell has no effect against living creatures that don’t have an anatomical head.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Crystal Eruption",
      spellPreviewDescription = "You force unstable magic into the ground, causing jagged crystals to erupt in the area.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "123",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "cone-shaped burst",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You force unstable magic into the ground, causing jagged crystals to erupt in the area. Creatures in the area and in contact with the ground when the spell first takes effect take 2d8 piercing damage. The crystals remain for the spell’s duration, making the affected area difficult terrain that deals 1d4 piercing damage to a creature any time they move into an affected square on foot.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4","WtchW 4"),
      spellTitle = "Crystal Mine",
      spellPreviewDescription = "You create three electrified crystal proximity mines under the ground within range.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "123",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "conjuration (electricity)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Reflex partial",
      spellResistance = "no",
      spellDescriptionFull = "You create three electrified crystal proximity mines under the ground within range. Each mine must be within 30 feet of at least one of the other mines. Each mine occupies one 5-foot square and remains for the duration or until triggered. When a creature enters a space adjacent to a mine, that mine immediately explodes, dealing 2d8 piercing damage and 2d8 electricity damage to creatures in a 10-foot-radius burst centered on the mine. A creature can spot and disable a crystal mine as a trap with successful Perception and Engineering checks respectfully (DC = 15 + your caster level + your key ability score modifier).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Daegoxian Spore Cloud",
      spellPreviewDescription = "You summon a concentrated cloud of Daegoxian spores, which renders living creatures docile and agreeable.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "155",
      spellSourceBookFull = "Near Space",
      spellSchool = "conjuration (summoning)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "all creatures in the cloud",
      spellArea = "20-ft.-radius spread",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "no",
      spellDescriptionFull = "You summon a concentrated cloud of Daegoxian spores, which renders living creatures docile and agreeable. Any creature that enters the cloud or begins its turn within the cloud must succeed at a Will save or be fascinated for 1d4 rounds. A creature that succeeds at this save is immune to the effects of Daegoxian spore cloud for 24 hours.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","Tchn 1","WtchW 1"),
      spellTitle = "Dampen Spell",
      spellPreviewDescription = "Weaken a cast spell as a reaction.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "71",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 reaction",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one spell",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You siphon magical energy from a spell, casting dampen spell as a reaction when you observe the triggering spell being cast within range. This spell has no effect on magic items but can affect spells they cast. The spell slot you use to cast dampen spell determines the options you have for dampening the targeted spell. To have any effect, you must attempt a dispel check (1d20 + your caster level) with a DC equal to 11 + the spell's caster level. If you successfully dampen a spell, the caster can cease casting, losing the action used for casting rather than the spell slot. This spell has no effect on artifacts or deities.\n" +
              "1st: If you cast dampen spell using a 1st-level slot, choose one of the following effects.\n" +
              "\n" +
              "Contract: Halve the spell's range. If the targeted spell can no longer reach its target, the caster can choose a new target within the new range and continue casting.\n" +
              "\n" +
              "Exclude: An area or multitarget spell excludes one target of your choice.\n" +
              "\n" +
              "Mistarget: Make the spell go off-target as if it's a thrown weapon that missed its grid intersection.\n" +
              "\n" +
              "Shorten: If the spell's duration is measured in rounds or minutes, halve that duration (round down, minimum 0 or 5 rounds for 1 minute rounded down). You can't shorten a spell that has a duration measured in longer increments.\n" +
              "\n" +
              "2nd: If you cast dampen spell using a 2nd-level slot, choose one of the following effects.\n" +
              "\n" +
              "Reduce: Halve the area or number of targets the spell can affect.\n" +
              "\n" +
              "Shorten: If the spell's duration is measured in hours, halve that duration (round down, minimum 30 minutes for 1 hour rounded down). You can't shorten a spell that has a duration measured in longer increments.\n" +
              "\n" +
              "Weaken: Halve the spell's damage or healing done.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Dampening Field",
      spellPreviewDescription = "The target becomes encased in a field that dampens sounds and vibrations.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "155",
      spellSourceBookFull = "Near Space",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The target becomes encased in a field that dampens sounds and vibrations. For the duration of the spell, the target has total concealment against creatures whose only sense is blindsense (sound) or blindsense (vibration) and can attempt Stealth checks to hide from creatures whose only sense is blindsight (sound) or blindsight (vibration) with a +10 circumstance bonus to their checks. All sounds the target makes intentionally are muffled, increasing the DC of Perception checks to hear them by 5.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0","WtchW 0"),
      spellTitle = "Dancing Lights",
      spellPreviewDescription = "Create and direct up to four lights.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "347",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "up to four lights",
      spellDuration = "1 minute (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You create up to four lights that resemble small headlights or flashlights. The dancing lights must stay within a 10-foot-radius area in relation to each other but otherwise move as you desire: forward or back, up or down, straight or turning corners, or the like. The lights can move up to 100 feet per round. A light winks out if the distance between you and it exceeds the spell’s range.\n" +
              "\n" +
              "You can have only one dancing lights spell active at a time. If you cast this spell while another casting is still in effect, the previous casting is dispelled.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2"),
      spellTitle = "Darkvision",
      spellPreviewDescription = "Grant ability to see 60 feet in total darkness.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "347",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or camera",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The target gains the ability to see 60 feet even in total darkness. Darkvision is black and white only but otherwise like normal sight.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4"),
      spellTitle = "Data Dump",
      spellPreviewDescription = "You gain access to the data in the computer or any of its secure data modules with a DC to hack equal to or less than the result of your check.",
      spellSourceBookPreview = "AdvP#32",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #32: The Starstone Blockade",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one computer or secure data module",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "When you cast this spell, attempt a Computers or Mysticism check; you gain access to the data in the computer or any of its secure data modules with a DC to hack equal to or less than the result of your check. You cannot add to, alter, or delete this data, but you remember it perfectly for 2d4 minutes, after which it fades from your mind. The computer does not register your spell as an attempt to access the computer, regardless of the success or failure of your skill check.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","WtchW 2"),
      spellTitle = "Day's Weariness",
      spellPreviewDescription = "Deal 4d8 damage, and fatigue or exhaust a target.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "72",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "enchantment (mind-affecting, pain)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You launch an opponent's mind forward in time, forcing them to experience a day's events in a moment. The target takes 4d8 damage and becomes fatigued for the duration, or they become exhausted for the duration if already fatigued. The target can attempt a Will saving throw to halve the damage dealt by this spell and negate the fatigued condition.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","Tchn 2","WtchW 2"),
      spellTitle = "Daze Monster",
      spellPreviewDescription = "Target living creature of CR 5 or lower is dazed.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "347",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one living creature of CR 5 or lower",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions like daze, but it can affect any one living creature of any type up to CR 5. Creatures of CR 6 or higher are not affected.\n" +
        "\n" +
        "(Daze: This spell short-circuits the mind of a humanoid creature with a CR of 3 or lower so that it is dazed (unable to take actions, but taking no penalty to AC). Humanoids of CR 4 or higher are not affected. After a creature has been dazed by this spell, it is immune to it for 1 minute.) ",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("WtchW 0"),
      spellTitle = "Dazzling Flares",
      spellPreviewDescription = "Create bursts of distracting flares, imposing a –2 penalty on Perception checks made in the area.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "134",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "popping, distracting flares within a 10-ft.-radius",
      spellDuration = "1 round",
      spellSavingThrow = "Fortitude negates",
      spellResistance = "yes",
      spellDescriptionFull = "You evoke fist-sized pockets of existence from multiple realities, creating chemical reactions that result in up to a dozen flares. These flares appear at once, and they do so within a 10-foot-radius spread. You choose the flares’ colors, including colorless, and they make popping noises as they flicker in and out of reality. This popping can be as quiet as a human’s whisper or as loud as up to 20 humans shouting. You can cause the flares to emit a sulfurous or ozone smell as they pop. These distracting flares impose a –2 penalty on Perception checks attempted in the area.\n" +
              "\n" +
              "If you cast this spell while another casting of dazzling flares is still in effect, the previous casting ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3"),
      spellTitle = "Death Affinity",
      spellPreviewDescription = "You infuse the target with necromantic energy, physically altering their form into an amalgam of life and undeath.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "155",
      spellSourceBookFull = "Near Space",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one willing living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You infuse the target with necromantic energy, physically altering their form into an amalgam of life and undeath.\n" +
              "\n" +
              "For the duration of the spell, the target becomes immune to the following effects (unless such an effect specifies it works against undead creatures): bleed, death effects, disease, energy drain, exhaustion, fatigue, negative levels, nonlethal damage, and poison. This immunity does not apply to such effects currently affecting the creature. The creature also gains a +4 enhancement bonus to saving throws against the following effects: mind-affecting, paralysis, and stunning effects; ability damage; ability drain; and any effect that requires a Fortitude saving throw (unless the effect works on objects or is harmless).\n" +
              "\n" +
              "For effects that target creatures by type, the target creature counts as both its own type and undead (whichever type allows an ability to affect them for abilities that affect only one type, and whichever is worse for abilities that affect both types).\n" +
              "\n" +
              "When the spell ends, the above effects end and the target gains the exhausted condition.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog "),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4"),
      spellTitle = "Death Ward",
      spellPreviewDescription = "Target gains +4 bonus to saves against death spells, and is immune to negative energy and gaining negative levels.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "348",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The target gains a +4 morale bonus to saving throws against all spells and effects with the death descriptor. The target can attempt a save to negate such effects even if one is not normally allowed. The target can’t gain negative levels and is immune to any negative energy effects. This spell does not remove negative levels the target has already gained, but it does remove the penalties from negative levels for the duration of its effect.\n" +
              "\n" +
              "Death ward does not protect against other sorts of attacks, even if those attacks might be lethal.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 1"),
      spellClassesWithLevelPreview = listOf("Prcg 1"),
      spellTitle = "Death's Door",
      spellPreviewDescription = "Deal damage, Strength damage, and Dexterity damage to a target.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "72",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You accelerate a living opponent's personal timeline to the end of their natural life cycle, unleashing the ravages of time in a devastating surge. The target can attempt a Fortitude saving throw to halve the damage and ignore the ability damage dealt by this spell. Ability damage dealt by this spell wears off after 1 minute. A creature can take ability damage from this spell only once every 24 hours.\n" +
              "\n" +
              "1st: When you cast death's door as a 1st-level spell, it deals 1d10 damage plus 2 Strength damage to the target.\n" +
              "\n" +
              "2nd: When you cast death's door as a 2nd-level spell, it deals 2d10 damage plus 2 Strength and 2 Dexterity damage to the target.\n" +
              "\n" +
              "3rd: When you cast death's door as a 3rd-level spell, it deals 4d10 damage plus 4 Strength and 2 Dexterity damage to the target.\n" +
              "\n" +
              "4th: When you cast death's door as a 4th-level spell, it deals 6d10 damage plus 4 Strength and 4 Dexterity damage to the target.\n" +
              "\n" +
              "5th: When you cast death's door as a 5th-level spell, it deals 8d10 damage plus 6 Strength and 4 Dexterity damage to the target.\n" +
              "\n" +
              "6th: When you cast death's door as a 6th-level spell, it deals 10d10 damage plus 6 Strength and 6 Dexterity damage to the target.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Deep Slumber",
      spellPreviewDescription = "Put a number of creatures whose CRs total 8 or less to sleep.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "348",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 round",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "one or more living creatures with a total CR of 8 or lower, all within a 10-ft.-radius burst",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell causes living creatures in the area to fall into a magical sleep, gaining the asleep condition (except normal noise doesn’t wake up the sleeping creatures). Creatures with the lowest CR are affected first. Among creatures of equal CR, those who are closest to the spell’s point of origin are affected first. Deep slumber doesn’t affect unconscious creatures, constructs, or undead creatures.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Defrex Hardiness",
      spellPreviewDescription = "The target becomes infused with the resilience of a defrex and sprouts bristling spines.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "155",
      spellSourceBookFull = "Near Space",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "The target becomes infused with the resilience of a defrex and sprouts bristling spines. It gains DR/— equal to your caster level, and any creature adjacent to the target that hits it with a melee attack takes piercing damage equal to your caster level.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","Tchn 2"),
      spellTitle = "Delay Countermeasures",
      spellPreviewDescription = "Delay one computer’s countermeasures.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "134",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "enchantment",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one computer",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "Countermeasures on the target computer are suppressed. If you trigger any suppressed countermeasure, you are still alerted that you have done so, but it activates only after the spell ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Deprive Knowledge",
      spellPreviewDescription = "You strip the target creature of key knowledge.",
      spellSourceBookPreview = "AdvP#32",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #32: The Starstone Blockade",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 feet + 5 ft./2 levels)",
      spellTargets = "1 creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You strip the target creature of key knowledge. Choose one skill; for the duration of the spell, the target takes a –4 penalty to the chosen skill. If you choose Culture, this also strips the target of up to 4 languages, determined randomly. This spell cannot leave the target without any language or capacity to speak; they retain at least the ability to speak Common or the language of their home world.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Destruction Protocol",
      spellPreviewDescription = "Turn nonhostile technological construct against your foes.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "348",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one non-hostile construct of the technological subtype; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, up to 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Waves of inciting programming ebb from your touch, reprogramming a construct to have murderous intentions toward your enemies. This spell must target a construct that is not already programmed or tasked with harming you. The target construct must have a CR lower than or equal to your level. If the target construct is under the control of another creature, the controlling creature can attempt a Will saving throw (DC = the spell’s DC) to negate this spell’s effect.\n" +
              "\n" +
              "While this spell is in effect, the construct is under your control. On your turn starting when you cast this spell, you must direct it to attack a target; the construct then pursues and attacks this target as best it can. You can change which target the construct attacks as part of your concentration to continue this spell’s duration (a standard action). When you stop concentrating or when the spell’s duration otherwise ends, the construct immediately stops following your commands to attack.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst ","WtchW 1"),
      spellTitle = "Destructive Rebuke",
      spellPreviewDescription = "You convert your pain and emotional distress into a sharp, forceful reverberation that fractures another creature’s body.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "135",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "evocation",
      spellCastingTime = "special (see below)",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude partial",
      spellResistance = "yes",
      spellDescriptionFull = "You convert your pain and emotional distress into a sharp, forceful reverberation that fractures another creature’s body. The target can attempt a Fortitude saving throw to halve the damage dealt by the spell and negate any additional effects.\n" +
              "\n" +
              "When you take damage from a spell or attack, you can cast this spell as a reaction, but only to target the creature that performed the triggering spell or attack. If the triggering effect was a critical hit or reduced your Hit Points to 10 or fewer (but not 0), you roll d8s instead of d6s to calculate your destructive rebuke’s damage. Casting this spell as a reaction doesn’t provoke attacks of opportunity.\n" +
              "\n" +
              "1st: When you cast destructive rebuke as a 1st-level spell, it deals 1d6 damage with the force descriptor, and the target is flat-footed until the end of your next turn.\n" +
              "\n" +
              "2nd: When you cast destructive rebuke as a 2nd-level spell, it deals 2d6 damage with the force descriptor, and the target is flat-footed until the end of your next turn.\n" +
              "\n" +
              "3rd: When you cast destructive rebuke as a 3rd-level spell, it deals 4d6 damage with the force descriptor, and the target is flat-footed until the end of your next turn.\n" +
              "\n" +
              "4th: When you cast destructive rebuke as a 4th-level spell, it deals 6d6 damage with the force descriptor, and the target is sickened for 1 round.\n" +
              "\n" +
              "5th: When you cast destructive rebuke as a 5th-level spell, it deals 9d6 damage with the force descriptor, and the target is sickened and flat‑footed for 1 round.\n" +
              "\n" +
              "6th: When you cast destructive rebuke as a 6th-level spell, it deals 13d6 damage with the force descriptor, and the target is knocked prone and becomes sickened and flat-footed for 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0"),
      spellTitle = "Detect Affliction",
      spellPreviewDescription = "Determine whether a creature or object has been poisoned, is diseased, is cursed, or is suffering a similar affliction.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "348",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You determine whether a creature or object has been poisoned, is diseased, is cursed, or is suffering a similar affliction. If the target is poisoned or diseased, you automatically detect that fact and can determine the exact type of poison or disease with a successful DC 20 Intelligence or Wisdom check. If you are trained in Life Science or Medicine (depending on the nature of the poison or disease), you can attempt a DC 20 check of that skill if you fail your Wisdom or Intelligence check. If the target is cursed or suffering from a similar affliction, you must succeed at a DC 20 Intelligence or Wisdom check to determine that fact. You can then determine the exact nature of the curse with a successful DC 25 Mysticism check.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1"),
      spellTitle = "Detect Augmentation",
      spellPreviewDescription = "Detect the presence of augmentations in the area",
      spellSourceBookPreview = "Armory",
      spellSourcePage = "148",
      spellSourceBookFull = "Armory",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "",
      spellArea = "cone-shaped emanation",
      spellEffect = "",
      spellDuration = "concentration, up to 1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You detect the presence of augmentations installed within creatures you can see within the area, which appear to you as glowing outlines around the systems in which the augmentations are installed. The spell allows you to determine the type of augmentation, such as biotech, cybernetic, magitech, or necrotech, and its item level, but it does not reveal the function of the augmentation. This spell does not reveal hidden or invisible creatures.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","Tchn 1"),
      spellTitle = "Detect Radiation",
      spellPreviewDescription = "Detect radiation within 120 feet.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "348",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "120 ft.",
      spellTargets = "",
      spellArea = "120-ft. spherical emanation centered on you",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You detect radiation in the surrounding area, and you can determine the specific intensity of the radiation of one area or object within the spell’s area each round without taking an action (see Radiation on page 403 for more details). The spell can penetrate barriers, but 3 feet of dirt or wood, 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or any force field blocks it.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Detect Tech",
      spellPreviewDescription = "Detect technological items with charges or that replenish charges within 60 feet.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "349",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "",
      spellArea = "cone-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You detect all technological items (even hybrid items) with charges or that replenish charges in the area, including batteries, power cells, and generators (as well as such items that are on creatures you can see, even if the creatures have hidden those items on themselves). You can’t determine if there are technological items in areas you can’t see, nor can you detect technological traps in this way.\n" +
              "\n" +
              "The information this spell provides allows you to differentiate between charged items and items that replenish charges, but it does not provide any further information nor does it tell you, for example, how many charges an item currently has or how many maximum charges it can hold. This spell can penetrate barriers, but 3 feet of dirt or wood, 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or any force field blocks it.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Detect Thoughts",
      spellPreviewDescription = "“Listen” to surface thoughts.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "349",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "",
      spellArea = "cone-shaped emanation",
      spellEffect = "",
      spellDuration = "concentration, up to 1 minute/level",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "no",
      spellDescriptionFull = "You detect the surface thoughts of intelligent creatures around you. The amount of information revealed depends on how long you study a particular area or target.\n" +
              "\n" +
              "1st Round: You detect the presence or absence of thoughts from conscious creatures that have Intelligence scores of at least 1 (or an Intelligence modifier of –5) or higher.\n" +
              "\n" +
              "2nd Round: You detect the number of thinking minds and the Intelligence score (or modifier) of each. If the highest Intelligence score is 26 (or a modifier of +8) or higher and at least 10 points higher than your own Intelligence score (or 5 points higher than your own Intelligence modifier), you are stunned for 1 round and the spell ends. This spell doesn’t let you determine the location of the thinking minds if you can’t see the creatures whose thoughts you are detecting.\n" +
              "\n" +
              "3rd Round: You can read the surface thoughts of any mind in the area. A target who succeeds at its Will save prevents you from reading its thoughts, and you must cast detect thoughts again to have another chance. Creatures of animal intelligence (an Intelligence score of 1 or 2 or an Intelligence modifier of –4 or lower) have simple, instinctual thoughts.\n" +
              "\n" +
              "Each round, you can turn to detect thoughts in a new area. The spell can penetrate barriers, but 3 feet of dirt or wood, 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or any force field blocks it.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5"),
      spellTitle = "Digital Doorway",
      spellPreviewDescription = "Teleport from one computer to another within range",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "205",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "conjuration (teleport)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "you",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level or until expended; see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You gain the ability to step into a piece of electronic equipment currently connected to a communication or information network (such as a comm unit or a computer connected to an infosphere), converting yourself into digital information and traveling along the network. Once uploaded onto a network, you teleport out from any device within 3,000 feet of the device that you entered; if no such device is in range, you emerge from the same device you entered. You are instantly aware of all unsecured devices connected to the same network as the one you entered, and you can attempt a Computers check (DC = 15 + 1-1/2 × the item’s level) to detect other devices (this does not require an action); a single check renders you aware of all devices whose DC to detect you exceeded. If the item is a computer, your Computers check result must also exceed the DC required to successfully hack it. This movement acts as the teleport spell, except there is no chance of missing your destination.\n" +
              "\n" +
              "When attempting to enter or exit a computer with one or more countermeasures, you automatically trigger any countermeasures that are not successfully disabled. When you emerge from a computer, you can attempt one Computers check, with the result compared to the DC of each countermeasure in place on that computer (this does not require an action); you suffer the effects of all countermeasures with a DC higher than the result of your check. Some countermeasures triggered in this manner are exceptionally dangerous, as noted below.\n" +
              "\n" +
              "Feedback: The digital virus uploaded into your data causes you to become exposed to the mindfire disease, but the disease has a save DC of 15 + half the item level of the destination device.\n" +
              "\n" +
              "Firewall: You arrive at the destination prone, and you remain flat-footed and off-target for 1 minute.\n" +
              "\n" +
              "Wipe: Your recent memories are scrambled, with minor elements removed, causing you to be confused for a number of rounds equal to half the item level of the destination device (minimum 1 round).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Digital Shield",
      spellPreviewDescription = "When you take damage from an effect, you can create a defensive conduit between yourself and one technological object.",
      spellSourceBookPreview = "Alien#4",
      spellSourcePage = "37",
      spellSourceBookFull = "Alien Archive 4",
      spellSchool = "abjuration",
      spellCastingTime = "1 reaction",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "When you take damage from an effect, you can create a defensive conduit between yourself and one technological object, non-archaic armor, or non‑archaic weapon you’re carrying or wearing that’s 3 Bulk or less. The chosen object takes damage equal to 1d6 times your caster level, ignoring the object’s hardness. You reduce the damage you take from the triggering attack by half this result, though you can’t reduce the damage by more than 3 times the item’s level.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Dimension Door",
      spellPreviewDescription = "Teleport a short distance.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "349",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "you and touched objects or touched willing or unconscious creatures",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none, Will negates (object)",
      spellResistance = "no, yes (object)",
      spellDescriptionFull = "You instantly transfer yourself from your current location to any other spot within range. You always arrive at exactly the spot desired—whether by simply visualizing the area or by stating its direction. You can bring along objects as long as their weight doesn’t exceed your maximum load. You can also bring up to four additional willing or unconscious Medium or smaller creatures (carrying gear or objects up to their maximum load) or their equivalent. A Large creature counts as two Medium creatures, and a Huge creature counts as two Large creatures. All creatures to be transported must be in contact with one another, and at least one of those creatures must be in contact with you. After using this spell, you can’t take any other actions until your next turn (and each creature traveling with you can’t take any other actions until its next turn).\n" +
              "\n" +
              "If you arrive in a place that is already occupied by a solid body, you and each creature traveling with you each take 1d6 damage and are shunted to a random open space on a suitable surface within 100 feet of the intended location. If there is no free space within 100 feet, you and each creature traveling with you take 2d6 additional damage and are shunted to a free space within 1,000 feet. If there is no free space within 1,000 feet, you and each creature traveling with you take 4d6 additional damage and the spell simply fails.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4"),
      spellTitle = "Dimensional Anchor",
      spellPreviewDescription = "Prevent a target from leaving the plane",
      spellSourceBookPreview = "Alien#3",
      spellSourcePage = "53",
      spellSourceBookFull = "Alien Archive 3",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature or object",
      spellArea = "1 minute/level",
      spellEffect = "",
      spellDuration = "",
      spellSavingThrow = "none",
      spellResistance = "yes (object)",
      spellDescriptionFull = "You fire a ray at the target, making a ranged attack against its EAC. On a hit, the target is covered in a shimmering field that prevents planar travel. The target can’t be affected by any effect that causes the target to move extradimensionally or to another plane, such as teleportation, summoning, plane shifting, astral travel, ethereal travel, and so on. An affected starship can’t enter or emerge from Drift travel.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Dimensional Crash",
      spellPreviewDescription = "You instantly transfer yourself from your current location to a spot within range that’s occupied by another creature, otherwise functioning as per dimension door.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "139",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "you and one creature within range",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You instantly transfer yourself from your current location to a spot within range that’s occupied by another creature, otherwise functioning as per dimension door. You take 1d6 bludgeoning damage, and the other creature takes 3d6 bludgeoning damage (Reflex half). Attempt a bull rush combat maneuver against the other creature, using your caster level + your key ability score modifier + 2 as your attack bonus. Compare the result to the target’s KAC + 8, as normal. For every 5 feet the creature travels this way, it takes an additional 1d6 bludgeoning damage. If your bull rush combat maneuver fails, you immediately move to the nearest available space; this movement doesn’t provoke an attack of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Directed Denial of Strength Attack",
      spellPreviewDescription = "Cause creatures to become encumbered",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "205",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "enchantment (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You flood targets’ minds with a magical effect similar to a computer virus that duplicates every sensation of lifting, carrying, and being burdened. Targets become encumbered, or they become overburdened if already encumbered.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4"),
      spellTitle = "Discern Lies",
      spellPreviewDescription = "Reveal deliberate falsehoods.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "349",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, up to 1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "no",
      spellDescriptionFull = "Each round, you concentrate on one target within range. You know if the target deliberately and knowingly speaks a lie by discerning disturbances in its aura caused by lying. The spell does not reveal the truth or uncover unintentional inaccuracies, and it doesn’t necessarily reveal evasions. Each round, you can concentrate on a different target.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","Tchn 3"),
      spellTitle = "Discharge",
      spellPreviewDescription = "Disrupts or depowers one target technological item or construct.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "350",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature or technological object",
      spellArea = "instantaneous",
      spellEffect = "",
      spellDuration = "",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "no",
      spellDescriptionFull = "You can dissipate the charges from one technological object, temporarily depower one electrically powered technological object that does not use charges, or severely hinder a construct with the technological subtype. If the spell targets an object with charges, the object loses all of its remaining charges. If the object is powered by electrical means other than charges, its functions are suppressed for 1d4 rounds. If the spell targets a creature not of the technological subtype, it affects a random charged or electrically powered item in that creature’s possession. If the target is a construct with the technological subtype, it is staggered and cannot use any energy-based attacks for 1d4 rounds. A construct with the technological subtype that is affected by this spell can attempt a Fortitude saving throw at the end of each round to shrug off the effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6"),
      spellTitle = "Discharge, Greater",
      spellPreviewDescription = "Disrupts or depowers multiple technological items or constructs.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "350",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature or technological object",
      spellArea = "a 20-ft.-radius burst or -",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "no",
      spellDescriptionFull = "This spell functions as discharge, except it can discharge multiple technological objects. You can use it in one of two ways: an area discharge or a targeted discharge.\n" +
              "\n" +
              "Area Discharge: When used in this way, the spell affects everything within a 20-foot-radius burst. Each creature in the area is affected as though by discharge (affecting only one object in the creature’s possession), and each unattended object is similarly affected.\n" +
              "\n" +
              "Targeted Discharge: If this spell targets a single creature, it can discharge one randomly determined object from the target’s charged or electrically powered possessions for every 4 caster levels you have.\n"+
              "\n"+
              "(Discharge: You can dissipate the charges from one technological object, temporarily depower one electrically powered technological object that does not use charges, or severely hinder a construct with the technological subtype. If the spell targets an object with charges, the object loses all of its remaining charges. If the object is powered by electrical means other than charges, its functions are suppressed for 1d4 rounds. If the spell targets a creature not of the technological subtype, it affects a random charged or electrically powered item in that creature’s possession. If the target is a construct with the technological subtype, it is staggered and cannot use any energy-based attacks for 1d4 rounds. A construct with the technological subtype that is affected by this spell can attempt a Fortitude saving throw at the end of each round to shrug off the effect.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","Tchn 1","WtchW 1"),
      spellTitle = "Disguise Self",
      spellPreviewDescription = "Change your appearance.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "350",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You make yourself—and any clothing, armor, weapons, and equipment on you—look different. You can seem up to 1 foot shorter or taller, thin, fat, or in between. You can’t change your creature type (although you can appear as another subtype). Otherwise, the extent of the apparent change is up to you. You could merely add or obscure a minor feature, or you could look like an entirely different person or gender.\n" +
              "\n" +
              "The spell does not provide the abilities or mannerisms of the chosen form nor does it alter the perceived tactile (touch) or audible (sound) properties of you or your equipment. If you use this spell to create a disguise, you gain a +10 circumstance bonus to the Disguise check (since it counts as altering your form). A creature that interacts with you directly can attempt a Will saving throw to recognize your appearance as an illusion.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Disintegrate",
      spellPreviewDescription = "Ray reduces one creature or object to dust.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "350",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature or object, or up to a 10-ft. cube of nonliving matter",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude partial (object)",
      spellResistance = "yes",
      spellDescriptionFull = "Immense power shoots from your finger, with the potential to disintegrate a target where it stands.\n" +
              "\n" +
              "When you cast this spell, a thin, green ray springs from your pointing finger. You must make a ranged attack against your target’s EAC, but you can add your key ability score bonus to this attack instead of your Dexterity modifier if it is higher. If you hit, the target takes 14d20 damage. Any creature reduced to 0 Hit Points by this spell is entirely disintegrated, leaving behind only a trace of fine dust. A disintegrated creature’s equipment is unaffected. Only one target is affected per casting of this spell.\n" +
              "\n" +
              "When used against an object, the ray simply disintegrates as much as a 10-foot cube of nonliving matter. Thus, the spell disintegrates only part of any very large object or structure targeted. The ray affects even objects constructed entirely of force, but it does not affect other magical effects that are not an object, creature, or force effect.\n" +
              "\n" +
              "A creature or object that succeeds at a Fortitude saving throw is partially affected, taking only 4d20 damage. If this damage reduces the creature or object to 0 Hit Points, the target is entirely disintegrated.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Dismissal",
      spellPreviewDescription = "Force extraplanar creatures whose total CR is no greater than your level + 2 to return to their native planes.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "350",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "yes",
      spellDescriptionFull = "The spell instantly forces one or more extraplanar creatures off your current plane, whisking them away instantly—usually to the creature’s home plane, but there is a 20% chance of sending the target to a random plane other than its own. You can improve the spell’s chance of success by presenting one object or substance that the target fears, hates, or otherwise opposes; you gain a +1 circumstance bonus to your caster level check to overcome the target’s spell resistance (if any), and the save DC of the spell increases by 2. At the GM’s discretion, certain rare items might work twice as well, providing a +2 circumstance bonus to the caster level check to overcome spell resistance and increasing the spell’s save DC by 4.\n" +
              "\n" +
              "4th: When you cast dismissal as a 4th-level spell, it affects one extraplanar creature.\n" +
              "\n" +
              "5th: When you cast dismissal as a 5th-level spell, it affects a number of extraplanar creatures whose total CR can’t exceed your level + 2, no two of which can be more than 30 feet apart.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Dispel Magic",
      spellPreviewDescription = "Cancel one magical spell or effect.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "351",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature, object, spell, or spellcaster",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You can use dispel magic to end one ongoing spell that has been cast on a creature or object, to temporarily suppress the magical abilities of a magic item, or to counter another spellcaster’s spell. A dispelled spell ends as if its duration had expired. Some spells, as detailed in their descriptions, can’t be defeated by dispel magic. Dispel magic can dispel (but not counter) spell-like abilities just as it does spells. The effect of a spell with an instantaneous duration can’t be dispelled.\n" +
              "\n" +
              "You choose to use dispel magic in one of two ways: as a targeted dispel or as a counter.\n" +
              "\n" +
              "Targeted Dispel: One creature, object, or spell is the target of the dispel magic spell. You can also use a targeted dispel to specifically end one spell affecting the target or one spell affecting an area (such as zone of truth). You must name the specific spell effect to be targeted in this way or otherwise uniquely identify it (such as “that burning wall” or “the spell that’s giving him those duplicates”). Attempt a dispel check (1d20 + your caster level) with a DC equal to 11 + the spell’s caster level. If you succeed, the spell ends. If you don’t specify a spell and there is more than one possible spell on the target, your targeted dispel attempts to dispel a spell at random.\n" +
              "\n" +
              "If you target a force, an object, or a creature that is the effect of an ongoing spell (such as unseen servant), you attempt a dispel check to end the spell that conjured the object or creature.\n" +
              "\n" +
              "If the object that you target is a magic item, you attempt a dispel check against the item level (DC = 11 + the item level). If you succeed, all the item’s magical properties are suppressed for 1d4 rounds, after which the item recovers its magical properties. A suppressed item becomes nonmagical for the duration of the effect. A magic item’s nonmagical physical properties are unchanged: a suppressed holy laser pistol is still a laser pistol. Artifacts and deities are unaffected by mortal magic such as this.\n" +
              "\n" +
              "You can choose to automatically succeed at your dispel check against any spell you have cast.\n" +
              "\n" +
              "Counter: You can use the energy of dispel magic to disrupt the casting of other spells. First, select an opponent and take the ready action (see page 249) to cast dispel magic when that target casts a spell. This is considered a purely defensive action. When that readied action is triggered, you cast dispel magic and must attempt a dispel check (1d20 + your caster level) to counter the other spellcaster’s spell. The DC is equal to 11 + the other spellcaster’s caster level. If the check is successful and the target is in range, the spell fails and has no result.",
  )
, SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","Tchn 5","WtchW 5"),
      spellTitle = "Dispel Magic, Greater",
      spellPreviewDescription = "Cancel multiple magical spells or effects.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "352",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature, object, spell, or spellcaster",
      spellArea = "a 20-ft.-radius burst or -",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell functions like dispel magic, except it can end more than one spell on a target and it can be used to target multiple creatures. You choose to use greater dispel magic in one of three ways: a targeted dispel, an area dispel, or a counter.\n" +
              "\n" +
              "Targeted Dispel: This functions as a targeted dispel magic, but you can dispel one spell for every 4 caster levels you have, attempting a separate dispel check for each spell. Additionally, greater dispel magic has a chance to dispel any curse that remove affliction can remove, even if dispel magic can’t dispel that effect. The DC of this check is equal to the curse’s DC.\n" +
              "\n" +
              "Area Dispel: When greater dispel magic is used in this way, the spell affects everything within a 20-foot-radius burst. Attempt one dispel check and apply that check to each creature or object in the area, as if it were targeted by dispel magic. If you don’t specify spells and there is more than one possible spell on the target, your targeted dispel attempts to dispel spells at random. Magic items themselves are not affected by an area dispel but additional magical effects on them may be dispelled.\n" +
              "\n" +
              "For each ongoing spell effect whose point of origin is within the area of the greater dispel magic spell, apply the result of the dispel check to dispel the spell. For each ongoing spell whose area overlaps that of the greater dispel magic spell, apply the result of the dispel check to end the effect, but only within the overlapping area.\n" +
              "\n" +
              "If an object or a creature that is the effect of an ongoing spell is in the area, apply the result of the dispel check to end the spell that conjured that object or creature (returning it whence it came) in addition to attempting to dispel one spell targeting the creature or object.\n" +
              "\n" +
              "You can choose to automatically succeed at your dispel check against any spell you have cast.\n" +
              "\n" +
              "Counter: This functions as countering with dispel magic, but you receive a +4 bonus to your dispel check to counter the other spellcaster’s spell.\n" +
              "\n" +
              "(Dispel Magic: You can use dispel magic to end one ongoing spell that has been cast on a creature or object, to temporarily suppress the magical abilities of a magic item, or to counter another spellcaster’s spell. A dispelled spell ends as if its duration had expired. Some spells, as detailed in their descriptions, can’t be defeated by dispel magic. Dispel magic can dispel (but not counter) spell-like abilities just as it does spells. The effect of a spell with an instantaneous duration can’t be dispelled.\n" +
              "\n" +
              "You choose to use dispel magic in one of two ways: as a targeted dispel or as a counter.\n" +
              "\n" +
              "Targeted Dispel: One creature, object, or spell is the target of the dispel magic spell. You can also use a targeted dispel to specifically end one spell affecting the target or one spell affecting an area (such as zone of truth). You must name the specific spell effect to be targeted in this way or otherwise uniquely identify it (such as “that burning wall” or “the spell that’s giving him those duplicates”). Attempt a dispel check (1d20 + your caster level) with a DC equal to 11 + the spell’s caster level. If you succeed, the spell ends. If you don’t specify a spell and there is more than one possible spell on the target, your targeted dispel attempts to dispel a spell at random.\n" +
              "\n" +
              "If you target a force, an object, or a creature that is the effect of an ongoing spell (such as unseen servant), you attempt a dispel check to end the spell that conjured the object or creature.\n" +
              "\n" +
              "If the object that you target is a magic item, you attempt a dispel check against the item level (DC = 11 + the item level). If you succeed, all the item’s magical properties are suppressed for 1d4 rounds, after which the item recovers its magical properties. A suppressed item becomes nonmagical for the duration of the effect. A magic item’s nonmagical physical properties are unchanged: a suppressed holy laser pistol is still a laser pistol. Artifacts and deities are unaffected by mortal magic such as this.\n" +
              "\n" +
              "You can choose to automatically succeed at your dispel check against any spell you have cast.\n" +
              "\n" +
              "Counter: You can use the energy of dispel magic to disrupt the casting of other spells. First, select an opponent and take the ready action (see page 249) to cast dispel magic when that target casts a spell. This is considered a purely defensive action. When that readied action is triggered, you cast dispel magic and must attempt a dispel check (1d20 + your caster level) to counter the other spellcaster’s spell. The DC is equal to 11 + the other spellcaster’s caster level. If the check is successful and the target is in range, the spell fails and has no result.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4"),
      spellTitle = "Displace Memory",
      spellPreviewDescription = "You deposit a memory into a small object.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "134",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "one object of negligible bulk",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none (object",
      spellResistance = "no (object)",
      spellDescriptionFull = "You move one of your memories into the target object. You can select up to 5 minutes of continuous memory, or you can select every memory associated with one person, place, or object you name when you cast this spell. If you select continuous memory, you lose those memories, and if you try to recall them, you remember a blank gap instead of any details. If you select a person, place, or object, you remember events related to that thing, but not the presence or details of the thing you named. For example, if after a visit to Castrovel with your sister you use this spell to forget Castrovel, you remember traveling with your sister, but you forget where you went. Alternatively, if you used this spell to forget your sister, you remember going to Castrovel with someone, but not who was with you.\n" +
              "\n" +
              "Anyone touching the object into which you placed your memories can recall those memories by speaking a command word that you designate at the time of casting. Alternatively, you can designate no command word so that no one can recall the memories when touching the object. If the object is destroyed, the memories placed within return to you.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Displacement",
      spellPreviewDescription = "Attacks miss target 50% of the time.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "352",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The target of this spell appears to be about 2 feet away from its true location. The creature benefits from a 50% miss chance as if it had total concealment. Unlike actual total concealment, displacement doesn’t prevent enemies from targeting the creature normally. True seeing reveals the target’s true location and negates the miss chance. If a creature with blindsense can also see the displaced creature, the visual and blindsense information combined are enough for the creature with blindsense to attack the displaced creature without a miss chance, unlike normal for blindsense.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Dissonance Strike",
      spellPreviewDescription = "Attack to deal 4d4 sonic damage with a deafen critical effect.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "72",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (sonic)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You harness the vibrations in your body and a body you strike. Attempt a melee attack against the target's EAC. If your attack hits, the target takes 4d4 sonic damage (critical deafen; DC equals your spell save DC) and can't take reactions for 1 round.\n" +
              "\n" +
              "Casting this spell doesn't provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Tchn 0"),
      spellTitle = "Distant Speech",
      spellPreviewDescription = "Your speech is audible for half a mile outdoors or 1,000 feet indoors.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "72",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Your speech is audible for up to half a mile outdoors or 1,000 feet indoors. The volume of your voice doesn't change, so intervening obstacles and louder noises can still drown it out.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","WtchW 2"),
      spellTitle = "Distract",
      spellPreviewDescription = "Use the feint action with Mysticism in place of Bluff.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "72",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates",
      spellResistance = "no",
      spellDescriptionFull = "You distract a creature with a sudden illusory noise or image. This functions as a feint action except that you can use your Mysticism skill in place of Bluff, and you can apply the benefits of the Improved Feint (Starfinder Core Rulebook pg. 158) and Greater Feint (Starfinder Core Rulebook pg. 157) feats if you have them.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4"),
      spellTitle = "Divination",
      spellPreviewDescription = "Gain useful advice for specific proposed actions.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "352",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "10 minutes",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Similar to augury but more powerful, a divination spell can provide you with a useful piece of advice in reply to a question concerning a specific goal, event, or activity that is to occur within 1 week. Casting this spell requires you to expend 1 Resolve Point. The advice granted by the spell can be as simple as a short phrase, or it might take the form of a cryptic rhyme or omen. If you don’t act on the information, the conditions may change so that the information is no longer useful. The chance for a correct divination is 75%. If the die roll fails, you know the spell failed, unless specific magic yielding false information is at work.\n" +
              "\n" +
              "As with augury, multiple castings of divination about the same topic by the same caster use the same die result as the first divination spell and yield the same answer each time.",
  )
, SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Divine Aspect",
      spellPreviewDescription = "You adopt the intimidating aura of a god.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "135",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "enchantment",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You take on a terrifying aura that evokes a specific god, an aspect of divinity, a mystic concept, or another mighty force. For the duration, you are immune to fear effects, and you gain frightful presence as a supernatural ability with a range of 30 feet and a Will save DC equal to the spell’s DC.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Dominate Person",
      spellPreviewDescription = "Control humanoid telepathically.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "352",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 round",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one humanoid",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 day/level; see text",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You fire a bright purple ray at your target, making a ranged attack against your target’s EAC, but you can add your key ability score bonus to this attack instead of your Dexterity modifier if it is higher.\n" +
              "\n" +
              "If you hit and your target fails its Will saving throw, you establish a telepathic link with the target’s mind and can control its actions. If you and the target have a common language, you can generally force the target to perform as you desire, within the limits of its abilities. If no common language exists, you can communicate only basic commands, such as “Come here,” “Go there,” “Fight,” and “Stand still.” You know what the target is experiencing, but you don’t receive direct sensory input from it, nor can it communicate with you telepathically. Once you have given a dominated creature a command, it continues to attempt to carry out that command to the exclusion of all other activities except those necessary for day-to-day survival (such as sleeping, eating, and so forth). Changing your orders or giving a dominated creature a new command is a move action.\n" +
              "\n" +
              "By concentrating fully on the spell (a standard action), you can receive full sensory input as interpreted by the mind of the target, though it still can’t communicate with you. You don’t actually see through the target’s eyes, but you still get a good idea of what’s going on.\n" +
              "\n" +
              "The target resists this control, and any target forced to take actions against its nature can attempt a new saving throw with a +2 bonus. Obviously self-destructive orders are not carried out. Once control is established, the range at which it can be exercised is unlimited as long as you and the target are on the same plane. You don’t need to see the target to control it.\n" +
              "\n" +
              "If you don’t spend at least 1 round concentrating on the spell each following day, the target can attempt a new saving throw to throw off the domination. You can be prevented from exercising control or using the telepathic link while the target is under the effects of some spells, but such effects don’t automatically dispel the domination.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","WtchW 1"),
      spellTitle = "Dream of Home",
      spellPreviewDescription = "Fascinate a target.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "73",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "enchantment (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "Drawing on the magic of the kasathan Pillar of the Homeworld or similar homey memories, you overwhelm the target with pleasant visions and thoughts of their home, whatever that means to them. If the target fails the saving throw, they become fascinated for the duration. If the target saves, they're fascinated for 1 round instead.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Tchn 5"),
      spellTitle = "Drift Messenger",
      spellPreviewDescription = "You briefly summon an iridia, a spectra native to the Drift, to deliver a message for you.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "93",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "conjuration (summoning)",
      spellCastingTime = "1 round",
      spellRange = "close (25 ft. +5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "one summoned iridia",
      spellDuration = "1 minute",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You briefly summon an iridia, a spectra native to the Drift, to deliver a message for you. The iridia is indifferent to you and will take no other action on your behalf; it remains within range of you for 1 minute, during which time you can communicate your message to it, transmit a data file to it by means of a comm, or give it a physical object no larger than 2 bulk. You must identify the recipient of your message by name and provide that recipient’s location.\n" +
              "\n" +
              "Once it has your message, is targeted by any hostile effect, or the duration of the spell expires (whichever comes first), the iridia vanishes and moves through the Drift to the named location, traveling at the speed of a starship with a Drift engine rating of 1. When it arrives at the location you’ve provided, it attempts to deliver whatever you told or gave it to the individual you named. If it fails to find that individual, it abandons your message. No information regarding the success or failure to deliver your message is provided by this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Drift Prediction",
      spellPreviewDescription = "You glimpse a narrow range of possibilities related to a starship’s next Drift journey initiated within the next 24 hours.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "122",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "1 mile",
      spellTargets = "one starship you can see visually or detect on a scanner",
      spellArea = "",
      spellEffect = "",
      spellDuration = "24 hours",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You glimpse a narrow range of possibilities related to a starship’s next Drift journey initiated within the next 24 hours. When you cast this spell, choose one of the following distances: travel in-system, travel to Absalom station, travel to Near Space, or travel to the Vast. Make a DC 20 caster level check (1d20 + your caster level). If you succeed, make any necessary random rolls related to the Drift journey you predicted, such as the duration and the chance of a random encounter in the Drift. If the starship initiates Drift travel of the distance you predicted before the spell’s duration expires, apply those rolls to the journey. This spell doesn’t allow you to anticipate any extra time the starship might spend on its journey, such as if it stops to explore or engage in starship combat, and you can’t anticipate whether the ship will complete its journey or stop for some reason, such as to exit the Drift early, or because it was destroyed.\n" +
              "\n" +
              "Casting this spell requires access to a computer or similar device, which displays the information gained. Additionally, casting this spell places considerable strain on you, requiring you to spend 1 Resolve Point.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Duplicate Data",
      spellPreviewDescription = "Copy data and any countermeasures from a single computer to another device in your possession.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "73",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one computer or secure data module",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You instantly copy all data stored on a single computer or secure data module onto another device in your possession with adequate storage capacity. If the data is protected by countermeasures, these countermeasures are copied along with the data. If the data is encrypted, the data remains encrypted until it has been successfully decrypted with an appropriate skill check. When the spell ends, the duplicated data is erased.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Eclipse Touch",
      spellPreviewDescription = "In the darkened halls of the Eclipse Academy, only the most ruthless students survive.",
      spellSourceBookPreview = "AdvP#30",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #30: Puppets Without Strings",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "partial (see text)",
      spellResistance = "yes",
      spellDescriptionFull = "In the darkened halls of the Eclipse Academy, only the most ruthless students survive. By touching the target (usually requiring a melee attack roll against the target’s EAC, but you can add your key ability score modifier instead of your Strength modifier if it is higher), you inflict bludgeoning damage that has the force descriptor to your opponent. Casting this spell does not provoke an attack of opportunity.\n" +
              "\n" +
              "The spell deals force damage and has additional effects on a critical hit, depending on the spell’s level. Staggered and wound effects allow a saving throw.\n" +
              "\n" +
              "1st: 3d6 B; critical staggered\n" +
              "\n" +
              "2nd: 4d6 B; critical staggered\n" +
              "\n" +
              "3rd: 6d8 B; critical staggered\n" +
              "\n" +
              "4th: 8d8 B; critical wound\n" +
              "\n" +
              "5th: 11d10 B; critical wound\n" +
              "\n" +
              "6th: 16d10 B; critical wound",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Ectoplasmic Barrage",
      spellPreviewDescription = "You fling psychic material, called ectoplasm, at the target, making a ranged attack against its KAC and dealing bludgeoning damage.",
      spellSourceBookPreview = "AdvP#23",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #23: Hive of Minds",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to two creatures that are no more than 30 ft. apart from each other",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You fling psychic material, called ectoplasm, at the target, making a ranged attack against its KAC and dealing bludgeoning damage. Each projectile in the barrage has the knockdown critical hit effect. In addition, ectoplasm extends to the Ethereal Plane, so it affects ethereal and incorporeal creatures.\n" +
              "\n" +
              "1st: When you cast ectoplasmic barrage as a 1st-level spell, each projectile deals 2d6 damage on a hit.\n" +
              "\n" +
              "2nd: When you cast ectoplasmic barrage as a 2nd-level spell, each projectile deals 4d6 damage on a hit.\n" +
              "\n" +
              "3rd: When you cast ectoplasmic barrage as a 3rd-level spell, each projectile deals 7d6 damage on a hit.\n" +
              "\n" +
              "4th: When you cast ectoplasmic barrage as a 4th-level spell, each projectile deals 10d6 damage on a hit.\n" +
              "\n" +
              "5th: When you cast ectoplasmic barrage as a 5th-level spell, each projectile deals 13d6 damage on a hit. A struck target is also entangled for 1 round.\n" +
              "\n" +
              "6th: When you cast ectoplasmic barrage as a 6th-level spell, each projectile deals 15d6 damage on a hit. A struck target is also entangled for 1d4 rounds.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Ectoplasmic Eruption",
      spellPreviewDescription = "Swirling psychic matter, known as ectoplasm, erupts from a point you choose.",
      spellSourceBookPreview = "AdvP#23",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #23: Hive of Minds",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "30-ft.-radius burst",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Reflex half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "Swirling psychic matter, known as ectoplasm, erupts from a point you choose. Those in the area take 6d6 bludgeoning damage. Those who fail the Reflex saving throw are entangled for the spell’s duration. The ectoplasm extends to the Ethereal Plane, so it affects ethereal and incorporeal creatures and objects. Such a creature entangled in the eruption is forced to partially materialize, so it cannot enter or pass through solid objects, takes half damage from nonmagical kinetic attacks, and takes full damage from magic and energy weapons, spells, spell-like effects, and supernatural effects. It reacts as a material creature to non-damaging spells.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Ectoplasmic Snare",
      spellPreviewDescription = "You launch a writhing tendril of ectoplasm to snare a creature. Make a ranged attack roll against your target’s EAC.",
      spellSourceBookPreview = "AdvP#23",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #23: Hive of Minds",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, up to 1 round/level (D)",
      spellSavingThrow = "Reflex partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You launch a writhing tendril of ectoplasm to snare a creature. Make a ranged attack roll against your target’s EAC. If you hit, the target can attempt a Reflex save. On a successful save, the target is entangled for the duration. If the target fails, it is grappled and takes 2d6 bludgeoning damage each round it remains so. If the target escapes the grapple, it remains entangled for the duration. While the target remains grappled, you can move it up to 15 feet each time you concentrate on the spell. If the distance between you and the target ever exceeds the spell’s range, the snare disappears. This spell affects ethereal and incorporeal creatures.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Edit Code",
      spellPreviewDescription = "You can cast edit code as a reaction when a target creature within range attempts an ability check, attack roll, saving throw, or skill check.",
      spellSourceBookPreview = "AdvP#51",
      spellSourcePage = "49",
      spellSourceBookFull = "Adventure Path #51: Into the Dataverse",
      spellSchool = "enchantment (compulsion)",
      spellCastingTime = "1 reaction",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature with the technological subtype",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You can cast edit code as a reaction when a target creature within range attempts an ability check, attack roll, saving throw, or skill check. You manipulate the creature’s code in such a way that causes it to roll twice and take the worse result. Casting this spell requires a great deal of energy, so you must spend 1 Resolve Point.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Ego Whip",
      spellPreviewDescription = "You overwhelm your opponent’s ego, diminishing its sense of self, hope, and confidence.",
      spellSourceBookPreview = "AdvP#23",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #23: Hive of Minds",
      spellSchool = "enchantment (emotion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will partial",
      spellResistance = "yes",
      spellDescriptionFull = "You overwhelm your opponent’s ego, diminishing its sense of self, hope, and confidence. The target takes a –2 penalty to Intelligence-, Wisdom-, and Charisma-based checks; its spell save DCs; and its Will saving throws. In addition, the target is staggered for the duration. A successful initial Will save reduces the duration to 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Electric Light Show",
      spellPreviewDescription = "This spell lets you create a charming electrical light show that can mimic fireworks, skywrite a message or logo, or depict anything—from birds and butterflies to a colorful dragon or starship.",
      spellSourceBookPreview = "AdvP#30",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #30: Puppets Without Strings",
      spellSchool = "transmutation (electricity, light)",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "",
      spellArea = "5-ft.-diameter burst",
      spellEffect = "",
      spellDuration = "1 minute",
      spellSavingThrow = "Reflex partial",
      spellResistance = "yes",
      spellDescriptionFull = "A favorite among SENOT students, this spell lets you create a charming electrical light show that can mimic fireworks, skywrite a message or logo, or depict anything—from birds and butterflies to a colorful dragon or starship. Once per round as a move action, including on the round you cast this spell, you can target a 5-foot-square within range and launch a spark in that direction. The spark takes a zigzag path from you to that square, missing all creatures and objects in its path, and detonating in the target square with a loud noise and a colorful burst of electricity and light. Creatures in the target square take 1d6 electricity damage and are dazzled for 1 round (a successful Reflex save reduces damage by half and negates the dazzled condition). If you attack in the same round as you launch a spark, that attack has a –4 penalty.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Electroplating",
      spellPreviewDescription = "Give kinetic weapons the ability to bypass material-based damage reduction",
      spellSourceBookPreview = "Armory",
      spellSourcePage = "157",
      spellSourceBookFull = "Armory",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close",
      spellTargets = "one melee or projectile weapon/level, no two of which can be more than 30 ft. apart; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude negates (harmless, object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "When you cast this spell, you create a temporary quantity of silver in a cloud of charged nanoparticles, which you then direct to coat nearby melee or projectile weapons. The target weapons must deal bludgeoning, piercing, or slashing damage or the spell has no effect. For the spell’s duration, the metal plating on the weapons grants them the ability to overcome DR/silver and bypass DR/magic for the spell’s duration.\n" +
              "\n" +
              "If your caster level is 8th or higher, you can have weapons affected by this spell bypass DR/adamantine rather than DR/ silver. Weapons affected by this version of the spell are not considered adamantine for any other purpose (such as the ability to bypass hardness). If your caster level is 16th or higher, you can instead have affected weapons bypass DR that is bypassed by any other one metal with which you are familiar (either from having succeeded at a skill check to identify the weaknesses of a creature with DR, or from a successful Physical Science skill check to identify some other metal when you encountered it). Such weapons do not gain any other benefit from being made of the selected material.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Elemental Convergence",
      spellPreviewDescription = "Mix elemental planar energies together and deal 8d8 damage of two types in an area.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "73",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "30-ft.-radius burst centered on you",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You tap into the power of two elemental planes, mix their energy together, and then release it around you in a powerful explosion, dealing 8d8 damage. Select two of the following damage types when you cast this spell: acid, cold, electricity, fire. The damage dealt by this spell is of both types (half one and half the other). For 1 hour, the area is difficult terrain.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2"),
      spellTitle = "Emberstep",
      spellPreviewDescription = "Leaves a trail of fire behind you.",
      spellSourceBookPreview = "AdvP#18",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #18: Assault on the Crucible",
      spellSchool = "evocation (fire)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "For the duration of this spell, you leave behind a trail of faintly burning embers in any square that you move through. These embers have no effect except for providing dim light in those squares. The embers disappear at the start of your next turn. As a reaction to another creature moving into a square of embers, you can ignite that square, causing flames to leap up and burn that creature. The affected creature takes 5d6 points of fire damage (Reflex half), and gains the burning condition for 1d4 points of fire damage on a failed Reflex save. In addition, that square no longer contains embers.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog ","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","WtchW 1"),
      spellTitle = "Embrace Of The Void",
      spellPreviewDescription = "You wrap the target in the cold of the Negative Energy Plane, numbing its body.",
      spellSourceBookPreview = "AdvP#45",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #45: The Culling Shadow",
      spellSchool = "necromancy (cold)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./level)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude (see text)",
      spellResistance = "yes",
      spellDescriptionFull = "You wrap the target in the cold of the Negative Energy Plane, numbing its body. The target might lose feeling in its extremities or even be temporarily frozen in place. The target takes half damage on a successful save.\n" +
              "\n" +
              "1st: When you cast embrace the void as a 1st-level spell, it deals 2d6 cold damage.\n" +
              "\n" +
              "2nd: When you cast embrace the void as a 2nd-level spell, it deals 4d6 cold damage.\n" +
              "\n" +
              "3rd: When you cast embrace the void as a 3rd-level spell, it deals 7d6 cold damage. On a failed save, the target is also off-target for 1 round.\n" +
              "\n" +
              "4th: When you cast embrace the void as a 4th-level spell, it deals 10d6 cold damage. On a failed save, the target is also off-target for 1d4 rounds.\n" +
              "\n" +
              "5th: When you cast embrace the void as a 5th-level spell, it deals 15d6 cold damage. On a failed save, the target is also staggered for 1 round and off-target for 1d6 rounds.\n" +
              "\n" +
              "6th: When you cast embrace the void as a 6th-level spell, it deals 17d6 cold damage. On a failed save, the target is also paralyzed for 1 round and off-target for 1d6 rounds after that.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","WtchW 1"),
      spellTitle = "Empathic Communication",
      spellPreviewDescription = "Gain bonuses when communicating with other creatures.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "73",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "With this spell, common among shirren mystics, you transmit your emotions into the surrounding area, allowing you to empathically communicate with others. You gain a +2 insight bonus to ability or skill checks other than Bluff made to communicate with any creature, whether you share a language or not, and all creatures gain a +4 insight bonus to Sense Motive checks made to read your body language, emotions, or motives. If you have limited telepathy, creatures within 30 feet of you sense and comprehend your emotions clearly. A creature that has telepathy or limited telepathy and is within 30 feet can understand your emotions clearly.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2","WtchW 2"),
      spellTitle = "Empathic Support",
      spellPreviewDescription = "Grant alternate uses of the aid another, covering fire, and harrying fire actions.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "73",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "When the target uses aid another, covering fire, or harrying fire, and succeeds at their attack roll or skill check, they can forgo granting their ally the usual benefit of that action to instead grant the following benefits, determined by the action they used. Any effect that increases the bonuses provided by these actions doesn't apply when using this spell. The target can provide these benefits only to allies with whom they can communicate in person.\n" +
              "\n" +
              "Aid Another: Instead of gaining a bonus to a skill check, the ally can roll the check twice and use the higher result.\n" +
              "\n" +
              "Covering Fire: Instead of granting a bonus to the ally's AC, the next opponent to attack the chosen ally must roll the attack twice and use the lower result.\n" +
              "\n" +
              "Harrying Fire: Instead of gaining a bonus to an attack roll, the next ally to attack the chosen opponent can roll the attack twice and use the higher result.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Tchn 0"),
      spellTitle = "Enduring Stylus",
      spellPreviewDescription = "You trace a symbol or phrase upon a nonmagical object or solid surface with your touch, which becomes permanently imprinted on the object’s surface.",
      spellSourceBookPreview = "AdvP#42",
      spellSourcePage = "42",
      spellSourceBookFull = "Adventure Path #42: Whispers of the Eclipse",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "one nonmagical object or solid surface",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "You trace a symbol or phrase upon a nonmagical object or solid surface with your touch, which becomes permanently imprinted on the object’s surface. The imprint doesn’t harm the object or surface in any way and can be no larger than 6 inches square. If you chose to write a phrase, it can be no more than 5 words in length. This imprint is permanent but is subject to natural wear after being applied. The imprint can be painted over, worn, sanded off, or otherwise defaced or erased at the GMs discretion, with at least 1 hour of work.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("WtchW 1"),
      spellTitle = "Enduring Worlds",
      spellPreviewDescription = "Extend the infinite worlds feature’s duration.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "135",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You cast this spell during the duration of an ongoing environmental effect you’ve created using your infinite worlds class feature, refining your grasp on the overlapping realities around you. When you do so, this spell extends those effects for its duration. If you have used infinite worlds to create multiple effects, you can use this spell to extend any number of them.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0"),
      spellTitle = "Energy Ray",
      spellPreviewDescription = "Ray deals 1d3 acid, cold, electricity, or fire damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "353",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "When you cast this spell, choose acid, cold, electricity, or fire; the spell gains that descriptor. You fire a ray at the target, and you must make a ranged attack against its EAC. On a hit, the ray deals 1d3 damage of the chosen energy type.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4"),
      spellTitle = "Enervation",
      spellPreviewDescription = "Ray imposes 2 negative levels.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "353",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You shoot a black ray at a target, making a ranged attack against the target’s EAC. If you hit, the target gains 2 temporary negative levels. Negative levels stack. If the target survives, it recovers from negative levels after a number of hours equal to your caster level (maximum 15 hours). An undead creature struck by the ray gains 10 temporary Hit Points for 1 hour.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","WtchW 6"),
      spellTitle = "Enshrining Refuge",
      spellPreviewDescription = "Targets can’t attack or be attacked, but can exist comfortably.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "353",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "all creatures in 40-ft. radius burst",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "no",
      spellDescriptionFull = "All creatures within a 40-foot radius of the spell’s point of origin are protected from violence. Any opponent attempting to directly attack a warded creature, even with a targeted spell, must attempt a Will saving throw. If the opponent succeeds, it can attack that creature normally, though it takes a –2 penalty to attacks against that creature for the duration of the spell. On a failed save, the opponent can’t follow through with the attack, loses that action, and can’t directly attack the warded creature for the duration of the spell. Those not attempting to attack a warded creature remain unaffected.\n" +
              "\n" +
              "This spell doesn’t prevent warded creatures from being affected by an attack with an area of effect, though a warded creature receives a +2 bonus to saving throws against such attacks.\n" +
              "\n" +
              "Each warded creature can breathe normally, no matter the surrounding atmosphere, and it suffers no harm from being in a hot or cold environment. A warded creature can’t attack without breaking the spell for itself, but it can use harmless spells and abilities that don’t require attack rolls, and it can act otherwise.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Entropic Grasp",
      spellPreviewDescription = "Touch decays a construct or nonmagical manufactured item once per round per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "353",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one nonmagical manufactured object (or the volume of the object within a 3-ft.-radius of the touched point) or one manufactured creature touched each round",
      spellArea = "",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "no",
      spellDescriptionFull = "Any unattended, manufactured (built from component parts, including metal, wood, plastic, glass, and so on) item you touch crumbles into dust, rust, and decay. If the item is so large that it can’t fit within a 3-foot radius, a 3-foot-radius volume of the material is destroyed. This is an instantaneous effect.\n" +
              "\n" +
              "You can employ entropic grasp in combat by making a melee attack against your opponent’s EAC. If you hit, you instantaneously reduce a manufactured armor’s KAC and EAC bonus by 3 (to a minimum of a +0 bonus). Damaged armor can be repaired using the Engineering skill; with a successful check, the armor’s armor bonuses are restored to their original values. Against a manufactured creature (generally constructs, but not undead), this attack instead deals 6d12 damage.\n" +
              "\n" +
              "Weapons and equipment in use by an opponent are more difficult to affect with this spell. You attempt a sunder combat maneuver against the item. If successful, you deal 6d6 damage to the weapon or item.\n" +
              "\n" +
              "Used in combat, this spell lasts 1 round per level, and you can make one melee attack each round on future rounds as a standard action. The target can attempt a save to negate each melee attack, but success does not end the spell.\n" +
              "\n" +
              "Casting this spell doesn’t provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4","WtchW 4"),
      spellTitle = "Entropic Shields",
      spellPreviewDescription = "You sheath a starship in a protective envelope, shielding it from the hunger of the Void.",
      spellSourceBookPreview = "AdvP#45",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #45: The Culling Shadow",
      spellSchool = "abjuration",
      spellCastingTime = "10 minutes",
      spellRange = "touch",
      spellTargets = "1 starship",
      spellArea = "",
      spellEffect = "",
      spellDuration = "24 hours",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You sheath a starship in a protective envelope, shielding it from the hunger of the Void. The starship becomes immune to the cold damage dealt by residing in the Negative Energy Plane, as well as any naturally occurring hazards encountered on the plane.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Prcg 1","Tchn 1","WtchW 1"),
      spellTitle = "Erase",
      spellPreviewDescription = "Remove writings of either magical or mundane nature.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "353",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one written data set",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Erase removes writings of either magical or mundane nature from any written storage, including paper, computers, or similar devices. You remove up to 1,500 words worth of text (for computer files, this could be a 1,500-word data file or 1,500 words of computer code). With this spell, you can remove magic runes and glyphs created by spells of 3rd-level and lower.\n" +
              "\n" +
              "Nonmagical writing in a book or manual is automatically erased if you touch it and no one else is holding it. Magical writing and computer programs must be touched (either directly or by touching the physical drive that holds the file) to be erased, and you must also succeed at a caster level check (1d20 + caster level) with a DC equal to 11 + the caster level for the magical writing or the item level of the computer’s drive. Computers generally keep backups on a round-by-round basis, and when you erase code from a computer, it takes 1 round for the computer to access its backups. If you erase a file that stores continuous data (like a camera feed), the computer won’t be able to recover the missing round. A natural 1 is always a failure on this check. If you fail to erase writing that is part of a trap (magical or otherwise), you set off that trap.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Ethereal Jaunt",
      spellPreviewDescription = "You become ethereal for 1 round per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "364",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You become ethereal, along with your equipment. For the duration of the spell, you are on the Ethereal Plane, which overlaps the Material Plane. When the spell expires, you return to material existence.\n" +
              "\n" +
              "An ethereal creature is invisible, insubstantial, and capable of moving in any direction, even up or down, albeit at half normal speed. As an insubstantial creature, you can move through solid objects, including living creatures. An ethereal creature can see and hear events and creatures on the Material Plane, but everything looks gray and ephemeral. Sight and hearing on the Material Plane are limited to 60 feet and many kinds of senses (such as blindsense and blindsight) don’t work across the planar boundary.\n" +
              "\n" +
              "Force effects and abjurations affect an ethereal creature normally, but force effects originating on the Ethereal Plane don’t affect targets on the Material Plane. An ethereal creature can’t attack material creatures, and spells you cast while ethereal affect only other ethereal things. Certain material creatures and objects have attacks or effects that work on the Ethereal Plane. Treat other ethereal creatures and ethereal objects as you would if you were both on the Material Plane.\n" +
              "\n" +
              "If you end the spell and become material while inside a material object (such as a solid wall), you are shunted to the nearest open space and take 1d6 damage per 5 feet that you so travel.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3","WtchW 3"),
      spellTitle = "Etheric Shards",
      spellPreviewDescription = "You harden ethereal matter into interplanar blades that are invisible to those who cannot see into the Ethereal Plane.",
      spellSourceBookPreview = "AdvP#23",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #23: Hive of Minds",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "one 10-ft. cube/level",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "Reflex partial or Reflex negates, see text",
      spellResistance = "no",
      spellDescriptionFull = "You harden ethereal matter into interplanar blades that are invisible to those who cannot see into the Ethereal Plane. Movement through an area of etheric shards is halved, even for incorporeal creatures, and creatures entering a 5-foot cube filled with etheric shards take 1d8 slashing damage and must succeed at a Reflex saving throw or gain the bleeding 1 condition. The damage from this bleeding stacks with itself and other sources of bleeding. A creature that remains motionless within the area takes no damage, but such a creature is flat-footed unless it moves enough to defend itself, which forces it to take damage and attempt a saving throw.\n" +
              "\n" +
              "Etheric shards are a magical trap. A creature trained in Mysticism and within 30 feet of the area can attempt a DC 35 Perception check to sense the shards. The shards cannot be disabled, but they can be dispelled.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Explosive Blast",
      spellPreviewDescription = "Deal 9d6 fire damage to creatures in a 20-foot radius.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "354",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (fire)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You magically transform a used battery into a powerful explosive device, propelling it in a straight line to a grid intersection within range, at which point it detonates, dealing 9d6 fire damage to all creatures and objects in the area. If you send the battery through a narrow opening, you must make a ranged attack (usually against an Armor Class of 10 for a narrow opening or an Armor Class of 15 for an extremely narrow opening) to avoid hitting the side and detonating it prematurely.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Extra Sense",
      spellPreviewDescription = "You magically amplify or add to a target’s senses.",
      spellSourceBookPreview = "GaExM",
      spellSourcePage = "114",
      spellSourceBookFull = "Galaxy Exploration Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or camera",
      spellArea = "",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You magically amplify or add to a target’s senses.\n" +
              "\n" +
              "1st: When you cast extra sense as a 1st-level spell, the target gains blindsense (vibration) out to a range of 30 feet. The blindsense can be based on scent or sound rather than vibration. If the creature has an existing sense that’s tied to the blindsense—such as touch (vibration), smell (scent), or hearing (sound)—and it’s suppressed, the blindsense is suppressed for the same duration. This spell lasts 1 hour/level.\n" +
              "\n" +
              "2nd: When you cast extra sense as a 2nd-level spell, the target can emit a piercing sound and, by listening to the echoes, gain blindsight (sound) with a range of 20 feet and blindsense (sound) with a range of 40 feet for 1 round. The sound emitted is audible to others in the 40-foot area, and the target emits the sound as if it were part of combat banter (Core Rulebook 249). The target can decide not to emit the sound but doesn’t gain the benefits this spell grants until they do so. This spell lasts 10 minutes/level.\n" +
              "\n" +
              "3rd: When you cast extra sense as a 3rd-level spell, it functions as the 1st-level version, except the range of the blindsense extends to 60 feet, the target gains blindsight (of the same type as the blindsense) with a range of 30 feet, and the spell lasts 10 minutes/level.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0"),
      spellTitle = "Fabricate Scrap",
      spellPreviewDescription = "You turn 1 bulk of inert matter, such as debris, dust, rocks, or other unattended 0-level items, into 1 bulk of junked electronic equipment.",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "205",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "universal; see text",
      spellCastingTime = "1 standard action",
      spellRange = "close",
      spellTargets = "",
      spellArea = "",
      spellEffect = "creates or converts 1 bulk of inert electronic equipment",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (object)",
      spellResistance = "yes (object); see text",
      spellDescriptionFull = "You turn 1 bulk of inert matter, such as debris, dust, rocks, or other unattended 0-level items, into 1 bulk of junked electronic equipment suitable for targeting with spells such as battle junkbot, handy junkbot, healing junkbot, junk armor, junk restraints, or junksword. The junked electronics have no resale value and can’t be repaired into any functioning item. Any direct examination by a character trained in Engineering or Physical Science reveals the useless nature of the junk.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","WtchW 0"),
      spellTitle = "Fatigue",
      spellPreviewDescription = "Touched creature is fatigued.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "354",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude negates",
      spellResistance = "yes",
      spellDescriptionFull = "You make a melee attack against a single target’s EAC, adding your key ability score modifier to the attack roll instead of your Strength modifier if it is higher. The target must succeed at a Fortitude save or be fatigued for the spell’s duration. This spell has no effect on a creature that is already fatigued. Casting this spell doesn’t provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Fear",
      spellPreviewDescription = "All targets within a cone are panicked for 1 minute.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "354",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (emotion, fear, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "see text",
      spellTargets = "see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "Will partial",
      spellResistance = "yes",
      spellDescriptionFull = "With a single mental nudge, you can unlock one or more targets’ deepest nightmares. A target that succeeds at its Will saving throw against this spell is shaken for 1 round.\n" +
              "\n" +
              "1st: When you cast fear as a 1st-level spell, it affects one living creature of CR 4 or lower at close range (25 feet + 5 feet/2 levels). The target must succeed at a Will saving throw or be frightened for 1d4 rounds.\n" +
              "\n" +
              "2nd: When you cast fear as a 2nd-level spell, it affects one living creature of CR 4 or lower per 3 caster levels at medium range (100 feet + 10 feet/level), no two of which can be more than 30 feet apart. Each target must succeed at a Will saving throw or be frightened for 1 minute.\n" +
              "\n" +
              "3rd: When you cast fear as 3rd-level spell, it affects all living creatures of CR 8 or lower in 30-foot cone-shaped burst. Each target must succeed at a Will save or become panicked for 1 minute. If cornered, a panicked creature begins cowering.\n" +
              "\n" +
              "4th: When you cast fear as 4th-level spell, it affects all living creatures in 30-foot cone-shaped burst regardless of CR. Each target must succeed at a Will save or become panicked for 1 minute. If cornered, a panicked creature begins cowering.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5"),
      spellTitle = "Feeblemind",
      spellPreviewDescription = "Target’s Intelligence and Charisma scores drop to 1.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "354",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You fire a scintillating ray at your target, making a ranged attack against your target’s EAC, but you can add your key ability score bonus to this attack instead of your Dexterity modifier if it is higher. If you hit and your target fails its Will saving throw, the target creature’s Intelligence and Charisma scores each drop to 1 (a modifier of –5). The affected creature is unable to use Intelligence- or Charisma-based skills, cast spells, understand language, or communicate coherently. It still knows who its friends are and can follow them and even protect them. The target remains in this state until a miracle, psychic surgery, wish, or similar spell is used to cancel the effect. It can’t be removed by effects like break enchantment.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("WtchW 3"),
      spellTitle = "Fey Pranksters",
      spellPreviewDescription = "You summon a 10-foot-by-10-foot swarm of mischievous fey creatures armed with various tiny weapons who fly around chaotically.",
      spellSourceBookPreview = "AdvP#30",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #30: Puppets Without Strings",
      spellSchool = "conjuration (summoning)",
      spellCastingTime = "1 round",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "1 predator swarm (tiny rainbow-colored fey)",
      spellDuration = "1 minute",
      spellSavingThrow = "partial (see text)",
      spellResistance = "no",
      spellDescriptionFull = "This spell was created and used to win a Nerundel Halls prank challenge a few years ago. You summon a 10-foot-by-10-foot swarm of mischievous fey creatures armed with various tiny weapons who fly around chaotically. The swarm understands and obeys your commands, and has the statistics of a predator swarm with the exceptions noted below.\n" +
              "\n" +
              "The swarm has the fey type (instead of animal) and an Intelligence modifier of +0. Each round, the swarm deals 1d6 nonlethal slashing damage to creatures in its squares. If the swarm damages a target, it grants the benefit of harrying fire to the next creature that attacks that target. A swarm of fey pranksters does not have the usual distraction ability of a predator swarm; instead, all creatures sharing spaces with a swarm of fey pranksters must attempt a saving throw against a fey prank. The exact nature of the prank, and the required saving throw, is determined randomly:\n" +
              "\n" +
              " d6 - Prank - Saving Throw - Effect\n" +
              "1–2 - Earworm - Will - Target is deafened for 1 minute.\n" +
              "3–4 - Pie in the Face - Reflex - Target is blinded for 1 minute, but can remove this condition with a full action.\n" +
              "5–6 - Tickle Attack - Fortitude - Target drops held item, chosen randomly.\n" +
              "\n" +
              "Creatures who save against a fey prank are immune to fey pranks for 1 day. If the swarm is killed, all fey prank effects end.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6"),
      spellClassesWithLevelPreview = listOf("Myst 6"),
      spellTitle = "Fist of Damoritosh",
      spellPreviewDescription = "Deal 12d8 damage with the force descriptor to creatures in a line and knock them prone.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "74",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "120 ft.",
      spellTargets = "",
      spellArea = "line-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You form a fist of divine energy and thrust it outward, damaging and potentially knocking down your enemies. You deal 12d8 damage with the force descriptor to each creature in the area. A creature that fails its Reflex save is additionally knocked prone.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Flash Boil",
      spellPreviewDescription = "You cause water in the spell’s area to instantly boil, dealing 7d8 fire damage to creatures that fail a Reflex save.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "evocation (fire)",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "cone-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex partial",
      spellResistance = "yes",
      spellDescriptionFull = "You cause water in the spell’s area to instantly boil, dealing 7d8 fire damage to creatures that fail a Reflex save. Creatures that save take half damage. This spell has no effect in vacuum, deals half damage in normal and thin atmosphere, and deals full damage in thick atmosphere and underwater.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","WtchW 6"),
      spellTitle = "Flesh to Stone",
      spellPreviewDescription = "Turn a creature into a statue.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "355",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates",
      spellResistance = "yes",
      spellDescriptionFull = "You fire a dull gray ray at your target, making a ranged attack against your target’s EAC, but you can add your key ability score bonus to this attack instead of your Dexterity modifier if it is higher. If you hit and the target fails its Fortitude save, the target, along with all its carried gear, turns into a mindless, inert statue. If the statue resulting from this spell is broken or damaged, the target (if ever returned to its original state) has similar damage or deformities. The creature is not dead, but it gives off no sign of life even upon close inspection. Only creatures made of flesh are affected by this spell.\n" +
              "\n" +
              "If this spell is cast upon a stone creature that was once flesh, it reverses the petrification.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Flight",
      spellPreviewDescription = "Allow yourself or others to fly.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "355",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action; see text",
      spellRange = "see text",
      spellTargets = "see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You tinker with the particles of magic surrounding one or more targets to either allow them to slow a fall, gently rise or descend, or fly short or vast distances.\n" +
              "\n" +
              "1st: When you cast flight as a 1st-level spell, you can target one Medium or smaller falling object or creature per level at close range (25 feet + 5 feet/2 levels). The targets must all be within 20 feet of each other. A Large creature or object counts as two Medium creatures or objects, a Huge creature or object counts as four Medium creatures or objects, and so on. The affected targets instantly fall slower, at a rate of just 60 feet per round (equivalent to the end of a fall from a few feet). The targets take no damage upon landing while the spell is in effect. This spell doesn’t affect charging or flying creatures.\n" +
              "\n" +
              "For each target, this casting of the spell lasts until that target lands or 1 round per caster level (whichever happens first).\n" +
              "\n" +
              "The 1st-level version of this spell can be cast as a reaction, but when you do so, you can’t take a standard action on your next round.\n" +
              "\n" +
              "2nd: When you cast flight as a 2nd-level spell, you can target yourself or one willing or unconscious creature or unattended object (total weight up to 100 pounds or 10 bulk per level) at close range. The spell allows you to move the target up or down as you wish. Each round as a move action, you can mentally direct the target up or down as much as 20 feet. You can’t move the target horizontally. A levitating creature that attacks with a melee or ranged weapon finds itself increasingly unstable; the first attack takes a –1 penalty to attack rolls, the second a –2 penalty, and so on, to a maximum of –5. A full round spent stabilizing allows the creature to begin again at –1.\n" +
              "\n" +
              "This casting of the spell lasts 1 minute per caster level and is dismissible.\n" +
              "\n" +
              "3rd: When you cast flight as a 3rd-level spell, you can target one willing or unconscious touched creature and give it the power of flight. The target can fly at a speed of 60 feet with average maneuverability. Flying while under this spell’s effects takes no more concentration than walking, so the target can attack or cast spells normally. The target can charge but not run, and it can’t carry aloft more weight than its normal bulk limit. The target gains a bonus to Acrobatics checks to fly equal to half your caster level.\n" +
              "\n" +
              "If this spell expires or is dispelled while the target is aloft, the target floats downward 60 feet per round for 1d6 rounds. If it reaches the ground in that amount of time, it lands safely. If not, it falls the rest of the distance, taking 1d6 damage per 10 feet fallen.\n" +
              "\n" +
              "The spell lasts for 1 minute per caster level.\n" +
              "\n" +
              "4th: When you cast flight as a 4th-level spell, you can target one willing or unconscious touched creature and affect it as per the 3rd-level version of the spell, except the target’s fly speed is increased by 10 feet and the spell lasts for 10 minutes per caster level.\n" +
              "\n" +
              "5th: When you cast flight as a 5th-level spell, you can target yourself and be affected as per the 4th-level version of the spell, except the spell lasts for 1 hour per caster level. When you use this flight speed for long-distance movement, you can hustle without taking nonlethal damage (a forced march still requires Constitution checks). You can cover 140 miles in an 8-hour period of flight (or 80 miles at a speed of 50 feet).\n" +
              "\n" +
              "6th: When you cast flight as a 6th-level spell, you can target multiple willing or unconscious creatures at close range (25 feet + 5 feet/2 levels) and affect them as per the 3rd-level version of the spell. You can target one creature per caster level, all of which must be within 30 feet of each other. This casting of the spell lasts 10 minutes per caster level.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Fluid Morphism",
      spellPreviewDescription = "Provide an enhancement bonus to a creature's ability and skill checks.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "74",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one willing or unconscious creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "Lashuntas experimented with this magic based on their species' dimorphism. With this spell, you reignite the epigenetic processes that shaped the target and alter them, applying different environmental pressures to temporarily awaken dormant potential in the genetic code. Choose one ability score. You grant the target a +2 enhancement bonus to ability checks with that ability score and skill checks based on that score. While the spell lasts, you can use a standard action to change the affected ability score, provided the target is within range.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3","WtchW 3"),
      spellTitle = "Fluidity of Form",
      spellPreviewDescription = "Draw upon the Maelstrom to grant ever- shifting bonuses to a creature.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "74",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels",
      spellTargets = "one willing or unconscious creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "Drawing upon the ever-shifting chaos of the Maelstrom, you free the target from the shackles of their form. Each round at the start of their turn, the target must select one of the following benefits they gain for that round. They can't select the same benefit on two consecutive rounds.\n" +
              "\n" +
              "Additional Arms: The target grows two additional arms, enabling them to wield and hold an additional two hands' worth of equipment. While these additional arms increase the number of items they can carry, it doesn't increase the number of attacks they can make during combat.\n" +
              "\n" +
              "Additional Legs: The target grows two additional legs, granting them a +10-foot status bonus to their speed.\n" +
              "\n" +
              "Amorphous: The target loses their form, becoming amorphous. They're immune to the entangled and grappled conditions, and they don't take double damage from critical hits.\n" +
              "\n" +
              "Damage Reduction: The target's skin hardens, becomes rubbery, or grows scales, granting them DR 5/— that protects against bludgeoning, piercing, and slashing damage. This damage reduction doesn't stack with any damage reduction the target already has.\n" +
              "\n" +
              "Energy Resistance: The target adapts to a hazardous environment, gaining resistance 5 to one of the following damage types of their choice: acid, cold, electricity, fire, sonic. This energy resistance doesn't stack with any damage resistance the target already has.\n" +
              "\n" +
              "Shrink: The target shrinks by one size category (to a minimum of Tiny).\n" +
              "\n" +
              "Stretch: The target's arms elongate, increasing their reach by 5 feet.\n" +
              "\n" +
              "Multiple castings of fluidity of form don't stack. Fluidity of form counters and negates physical stability.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Fluidity of Form, Mass",
      spellPreviewDescription = "Draw upon the Maelstrom to grant ever-shifting bonuses to multiple creatures.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "74",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one willing or unconscious creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions like fluidity of form, except as noted above.\n" +
              "\n" +
              "(Fluidity of Form: Drawing upon the ever-shifting chaos of the Maelstrom, you free the target from the shackles of their form. Each round at the start of their turn, the target must select one of the following benefits they gain for that round. They can't select the same benefit on two consecutive rounds.\n" +
              "\n" +
              "Additional Arms: The target grows two additional arms, enabling them to wield and hold an additional two hands' worth of equipment. While these additional arms increase the number of items they can carry, it doesn't increase the number of attacks they can make during combat.\n" +
              "\n" +
              "Additional Legs: The target grows two additional legs, granting them a +10-foot status bonus to their speed.\n" +
              "\n" +
              "Amorphous: The target loses their form, becoming amorphous. They're immune to the entangled and grappled conditions, and they don't take double damage from critical hits.\n" +
              "\n" +
              "Damage Reduction: The target's skin hardens, becomes rubbery, or grows scales, granting them DR 5/— that protects against bludgeoning, piercing, and slashing damage. This damage reduction doesn't stack with any damage reduction the target already has.\n" +
              "\n" +
              "Energy Resistance: The target adapts to a hazardous environment, gaining resistance 5 to one of the following damage types of their choice: acid, cold, electricity, fire, sonic. This energy resistance doesn't stack with any damage resistance the target already has.\n" +
              "\n" +
              "Shrink: The target shrinks by one size category (to a minimum of Tiny).\n" +
              "\n" +
              "Stretch: The target's arms elongate, increasing their reach by 5 feet.\n" +
              "\n" +
              "Multiple castings of fluidity of form don't stack. Fluidity of form counters and negates physical stability.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2","WtchW 2"),
      spellTitle = "Flux Density",
      spellPreviewDescription = "When you cast flux density, choose rise or sink.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "52",
      spellSourceBookFull = " #36: Professional Courtesy",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart, and each of which must be partially or fully submerged in water",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration + 1 round",
      spellSavingThrow = "Fortitude partial",
      spellResistance = "yes",
      spellDescriptionFull = "When you cast flux density, choose rise or sink. If you choose rise, each target ascends 10 feet per round, or if you choose sink, each target sinks 10 feet per round; this movement doesn’t provoke attacks of opportunity. In addition, each creature must attempt a Fortitude save each round it’s moved by this spell; a failure causes the creature to gain the flat-footed condition and to take a –2 penalty to attack rolls until the beginning of its next turn.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2","WtchW 2"),
      spellTitle = "Fog Cloud",
      spellPreviewDescription = "Create a fog that obscures vision.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "356",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius spread",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "A bank of fog billows out from the point you designate. The fog obscures all sight, including darkvision, beyond 5 feet. Adjacent creatures are granted concealment against one another (attacks have a 20% miss chance). Otherwise, this fog provides total concealment (50% miss chance and attackers can’t use sight to locate targets).\n" +
              "\n" +
              "A moderate wind (11+ mph) disperses the fog in 4 rounds; a strong wind (21+ mph) disperses the fog in 1 round.\n" +
              "\n" +
              "This spell doesn’t function underwater or in a vacuum.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","WtchW 2"),
      spellTitle = "Force Blast",
      spellPreviewDescription = "Cone deals 2d6 force damage and bull rushes creatures.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "356",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "cone-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You gather mystical energy and blast it outward in a mighty wave originating from your fingertips, damaging and potentially knocking back your enemies. This spell deals 2d6 damage to each creature in the area unless it succeeds at a Reflex saving throw for half damage.\n" +
              "\n" +
              "Additionally, the force from this spell effectively attempts to bull rush all creatures in the area. Attempt a single bull rush combat maneuver, using your caster level + your key ability score modifier as your attack bonus. Compare the result to each target’s KAC + 8. If you’re successful, that creature is knocked back 5 feet, plus 5 additional feet for every 5 by which your attack exceeds the creature’s KAC + 8. If there is an obstacle in the way, the creature stops at the obstacle instead.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Forcecage",
      spellPreviewDescription = "Create an invisible cage of force energy.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "74",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "barred cage (20-ft. cube) or cell (10-ft. cube)",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex partial, see text",
      spellResistance = "no",
      spellDescriptionFull = "You create an immobile, invisible but hollow cube of force composed of bars or solid walls (your choice). Creatures within the area are caught and contained. Creatures partially within the area when the cage appears can attempt a Reflex saving throw to avoid being shunted into the cage in the nearest open space. Otherwise, the creature is shunted out of the cage into the nearest open space. You can allow creatures to be shunted out even when they fail the save. If the cage is too small to accommodate creatures inside, the spell fails. The force walls or bars extend into the Ethereal Plane, blocking ethereal travel. The cage has walls of force on every side. A barred version has bands, each a half-inch wide, with half-inch gaps between them— creatures within the cage have improved cover against attacks coming from outside the cage. The cell version has no gaps. This spell otherwise functions per the parameters of the wall of force spell.\n" +
        "\n" +
        "(Wall of Force: Wall of force creates an invisible wall of pure force. You can form the wall into a flat, vertical plane whose area is up to one 10-foot square per level. The wall must be continuous and unbroken when formed. If its surface is broken by any object or creature, the spell fails.\n" +
              "\n" +
              "This counts as a force field for effects that can’t penetrate a force field. The wall can’t move and is not easily destroyed. A wall of force is immune to dispel magic. A greater dispel magic specifically targeting the wall of force can dispel it, but treat the wall of force’s caster level as being 5 higher than the actual caster level. A wall of force can be damaged by spells and attacks as normal, but a wall of force has hardness 30 and 300 Hit Points. Disintegrate instantly destroys a wall of force.\n" +
              "\n" +
              "Breath weapons and spells can’t pass through a wall of force in either direction, though dimension door, teleport, and similar effects can bypass the barrier. The wall blocks ethereal creatures as well as material ones (though ethereal creatures can usually circumvent the wall by going around it, through material floors and ceilings). Gaze attacks operate normally through a wall of force.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Forceful Fling",
      spellPreviewDescription = "You fling a willing ally across the battlefield, moving them 30 feet in a straight line from its original position to an unoccupied square in range.",
      spellSourceBookPreview = "RdsR",
      spellSourcePage = "59",
      spellSourceBookFull = "Redshift Rally",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one willing creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You fling a willing ally across the battlefield, moving them 30 feet in a straight line from its original position to an unoccupied square in range. The target provokes attacks of opportunity for this movement, as normal, but is unaffected by difficult terrain since it remains airborne for the movement. The target has a –2 penalty to its AC during this movement and until the start of its next turn. If the target ends this movement adjacent to an enemy, the target can attack that enemy with a melee attack as a reaction. The target takes a –2 penalty to this attack roll.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic "),
      spellClassesWithLevelPreview = listOf("Myst "),
      spellTitle = "Furious Shriek",
      spellPreviewDescription = "Deal sonic damage to creatures within 30 feet (more if you have fewer than half your HP remaining).",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "75",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (sonic)",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "30-ft.-radius spread centered on you",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "Orcs and half-orcs learned long ago to channel rage, despair, or a sense of injustice or oppression into a soul-shaking shriek. The shriek deals sonic damage to creatures and objects based on the spell slot used to cast the spell. If you cast this spell when you have fewer than half your Hit Points remaining, use d8s rather than d6s as damage dice.\n" +
              "\n" +
              "1st: When you cast furious shriek as a 1st-level spell, it deals 2d6 sonic damage.\n" +
              "\n" +
              "2nd: When you cast furious shriek as a 2nd-level spell, it deals 4d6 sonic damage.\n" +
              "\n" +
              "3rd: When you cast furious shriek as a 3rd-level spell, it deals 7d6 sonic damage.\n" +
              "\n" +
              "4th: When you cast furious shriek as a 4th-level spell, it deals 10d6 sonic damage.\n" +
              "\n" +
              "5th: When you cast furious shriek as a 5th-level spell, it deals 13d6 sonic damage. Creatures that fail their saving throw are shaken for 1 round.\n" +
              "\n" +
              "6th: When you cast furious shriek as a 6th-level spell, it deals 16d6 sonic damage. Creatures that fail their saving throw are staggered for 1 round and shaken for 1d4 rounds.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","WtchW 5"),
      spellTitle = "Gaze Into Darkness",
      spellPreviewDescription = "You pull open the seams of the universe, forcing the target to view what truly sits in the dark between the stars.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "enchantment (fear, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (25 ft. + 5 ft./2 levels)",
      spellTargets = "1 creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous and 1 round/level",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You pull open the seams of the universe, forcing the target to view what truly sits in the dark between the stars. The target takes 5d10 damage and must attempt a Will saving throw. On a failure, the target is cowering for the duration. Each round on its turn, a cowering creature can take a full action to attempt a new saving throw to end the cowering effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Ghost Sound",
      spellPreviewDescription = "Create minor illusory sounds.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "356",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "illusory sounds",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will disbelief",
      spellResistance = "no",
      spellDescriptionFull = "You create a volume of sound that rises, falls, recedes, approaches, or remains fixed. You choose what type of sound this spell creates when casting it and cannot thereafter change the sound’s basic character.\n" +
              "\n" +
              "The volume of sound created can produce as much noise as 20 normal humans. Thus, you can create shouting, singing, talking, marching, running, or walking sounds, as well as sounds of battle or small explosions. You can make noises that sound like machines, the general chatter of distant conversation, or the roar of an alien predator, but you can’t make specific sounds such as intelligible speech or the exact hum of a particular starship’s engines.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3","WtchW 3"),
      spellTitle = "Glimpse Of Truth",
      spellPreviewDescription = "This spell functions as true seeing, except as noted.",
      spellSourceBookPreview = "AdvP#25",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #25: The Chimera Mystery",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as true seeing, except as noted above.\n" +
        "\n" +
        "(True Seeing: You confer upon the target the ability to see all things within 120 feet as they actually are. The target sees through normal and magical darkness, notices secret doors hidden by magic, sees the exact locations of creatures or objects that are invisible or displaced, sees through illusions, and sees the true form of changed or transmuted things. Further, the target can focus its vision to see into the Ethereal Plane (but not into extradimensional spaces).\n" +
              "\n" +
              "True seeing, however, does not penetrate solid objects. It in no way confers X-ray vision or its equivalent. It does not negate concealment, including that caused by fog and the like. True seeing does not help the viewer see through mundane disguises, spot creatures who are simply hiding, or notice secret doors hidden by mundane means.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","WtchW 6"),
      spellTitle = "Glimpse The End",
      spellPreviewDescription = "You give the target a vision of the end of the Material Plane as it’s consumed by entropy.",
      spellSourceBookPreview = "AdvP#45",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #45: The Culling Shadow",
      spellSchool = "illusion (emotion, fear, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./level)",
      spellTargets = "1 living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will disbelief (see text)",
      spellResistance = "yes",
      spellDescriptionFull = "You give the target a vision of the end of the Material Plane as it’s consumed by entropy. The target witnesses all the stars in the universe dim simultaneously and planets throughout the galaxy crumble to nothingness. The sight deals 15d10 damage to the creature and gives it the panicked condition for 1 round. The target attempts a Will saving throw; on a success, they take half damage and are shaken for 1 round instead.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1"),
      spellTitle = "Gloom Mote",
      spellPreviewDescription = "Create a mote of light from the Shadow Plane, which draws other nearby lights down into shadow.",
      spellSourceBookPreview = "AdvP#12",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #12: Heart of Night",
      spellSchool = "conjuration (creation, shadow)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. +10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "a mote of darkness",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You draw forth the energy of the Shadow Plane and form it into a floating mote of gloom. The mote creates dim light in a 5-foot radius. It also lowers the light level within 20 feet of it by one step, down to dim. As a move action, you can move the mote up to 60 feet in any direction. The mote winks out if the distance between you and it exceeds the spell’s range. You can have only one gloom mote spell active at a time. If you cast this spell while another gloom mote of yours is still in effect, the previous casting is dispelled.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Glowing Wall",
      spellPreviewDescription = "Create a plane of colored light.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "75",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "light with area of up to eight 10-ft. squares",
      spellDuration = "concentration + 10 minutes/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "A barrier of light, colored as you choose, springs into existence. You can form the wall into a vertical or horizontal plane, but each 10-foot square must join another. The light level within 5 feet of the wall increases to normal light. Within an additional 5 feet, the light increases one step, up to normal light. When you concentrate on the spell, you can change the light's color. You can have only one glowing wall spell active at a time. If you cast this spell while another casting is still in effect, the previous casting is dispelled. A glowing wall somehow made permanent doesn't count against this limit.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Grasping Brambles",
      spellPreviewDescription = "You entrap a creature in a cage of thorny brambles that erupts from the ground around them.",
      spellSourceBookPreview = "AdvP#42",
      spellSourcePage = "42",
      spellSourceBookFull = "Adventure Path #42: Whispers of the Eclipse",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, up to 1 round/level",
      spellSavingThrow = "Reflex partial",
      spellResistance = "no",
      spellDescriptionFull = "You entrap a creature in a cage of thorny brambles that erupts from the ground around them. The target must attempt a Reflex save. On a successful save, the target takes 2d6 piercing damage as it escapes the brambles and the spell ends. On a failed save, the target is grappled and takes 6d6 piercing damage each round it remains so. The target can use the escape task of the Acrobatics skill to escape the grapple as normal, or it can attempt the grapple combat maneuver even if you aren’t within reach; if the target succeeds at the grapple combat maneuver, it escapes the grapple effect but don’t grapple you in return. If the target escapes the grapple, the spell ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","WtchW 0"),
      spellTitle = "Grave Words",
      spellPreviewDescription = "Force a corpse to babble.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "357",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy (language-dependent)",
      spellCastingTime = "1 minute",
      spellRange = "touch",
      spellTargets = "one dead creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You can force a touched corpse talk to you, but you can’t ask it specific questions or communicate with it at all. The corpse utters random sentences for 1 round, with a 10% chance this information is of some use to you. Useful information might include warnings about dangers in a wrecked starship, the password to unlock a computer, or the name of a supernatural creature seeking you or your allies. The GM makes the d% roll in secret and decides what information, useful or not, the corpse spews out in its babbling.\n" +
              "\n" +
              "Once a corpse has been subjected to grave words by any caster, any new attempt to cast grave words on that corpse fails. A corpse must have a mouth or means to speak in order for this spell to function, and the spell doesn’t affect a corpse that has been turned into an undead creature.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6"),
      spellClassesWithLevelPreview = listOf("Myst 6"),
      spellTitle = "Gravitational Singularity",
      spellPreviewDescription = "Particle with infinite density pulls creatures and objects into it, dealing 12d6 damage each round to those inside.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "357",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 round",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "5-ft.-cube gravitational singularity; see text",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You call into being a tiny particle of mass with infinite density. You must conjure the singularity in a square that is unoccupied by any creatures or objects. When you finish casting this spell, the singularity immediately draws all Medium and smaller creatures and unattended objects of no more than light bulk within 30 feet toward it. Each round on your turn, the singularity makes a single special combat maneuver against creatures within 30 feet with an attack bonus equal to 4 + your caster level + your key ability modifier. Compare the result to each creature’s KAC + 8. If the singularity is successful, that creature is moved 5 feet toward the singularity plus 5 additional feet for every 5 by which the result exceeds a target’s KAC + 8. Unattended objects are automatically moved 10 feet toward the singularity each round. If a creature or object is moved into the square that contains the singularity, it is sucked inside it and takes 12d6 damage at the end of its turn each round it remains within that space.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3","WtchW 3"),
      spellTitle = "Gravity Tether",
      spellPreviewDescription = "Deal 5d8 electricity damage to one or two creatures, then manipulate affected enemies' positions.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "75",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation (electricity)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one or two creatures",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Reflex partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "By manipulating electromagnetic forces acting on your target, you change its movements. Attempt a melee attack against EAC. If you attempt a full attack, you can target two creatures. On a hit, your target takes 5d8 electricity damage and must attempt a Reflex save. On a failure, the target treats any square it moves farther from you as difficult terrain for the duration. A successful save ends the spell on the target.\n" +
              "\n" +
              "As a standard action, you can attempt an attack against an affected target within 60 feet, adding your key ability modifier to the attack roll. You can attack two affected targets if you take a full action to do so. If you hit the target's KAC + 8, you pull it 5 feet closer to you plus 5 feet for every 5 by which the result exceeds a target's KAC + 8. If you attack and hit two targets, you can instead move them closer to each other. Moving the target into a barrier, creature, dangerous space, or obstacle causes the target to stop before entering that space.\n" +
              "\n" +
              "Casting this spell doesn't provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4","WtchW 4"),
      spellTitle = "Gravity Well",
      spellPreviewDescription = "Create a point of high gravity that knocks creatures in the area prone and pulls them closer to the center.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "135",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft. radius",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex negates, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You alter the gravity in an area, making a central point of high gravity that pulls creatures toward it. Each creature in the area when the spell takes effect is knocked prone unless it succeeds at a Reflex saving throw. Any creature that starts its turn in the area must succeed at a Reflex saving throw or be drawn 15 feet closer to the center of the area. This movement provokes attacks of opportunity. Creatures adjacent to the spell’s origin point take a –2 penalty to the save to avoid being pulled.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Grease",
      spellPreviewDescription = "Make a 10-ft. square or one object slippery.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "357",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one object",
      spellArea = "one 10-ft. square or -",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Reflex partial, see text",
      spellResistance = "no",
      spellDescriptionFull = "You cover a solid surface with a layer of slippery grease. Any creature in the area when the spell is cast must succeed at a Reflex save or fall prone. A creature can walk within or through the area of grease at half normal speed with a successful DC 10 Acrobatics check. Failure means the creature can’t move that round and must then succeed at a Reflex save or fall prone, while failure by 5 or more means it falls prone (see the Acrobatics skill on page 135 for details). A creature that doesn’t move on its turn doesn’t need to attempt this check and isn’t considered flat-footed. The spell can also be used to create a greasy coating on an item. Unattended material objects are always affected by this spell. If you attempt to affect an object in a creature’s possession, the creature can attempt a Reflex save to negate the effect. If the creature fails the initial saving throw, it immediately drops the item and must attempt a new save each round it attempts to pick up, hold, or use the item. A creature wearing greased armor or clothing gains a +5 circumstance bonus to Acrobatics checks to escape a grapple and a +2 circumstance bonus to its AC against grapple combat maneuvers.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","WtchW 3"),
      spellTitle = "Grim Insight",
      spellPreviewDescription = "Deal 6d10 damage to a creature and cause it to become shaken.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "75",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/caster level",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You channel visions of a grim future into your target's mind. Attempt a melee attack against the target's EAC, adding the higher of your key ability modifier or your Strength modifier to the attack roll. On a hit, the target takes 6d10 damage and must attempt a Will saving throw. A target that fails is shaken for the duration. One who succeeds is shaken for only 1 round, and then the spell ends.\n" +
              "\n" +
              "Casting this spell doesn't provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","Tchn 3"),
      spellTitle = "Groundling",
      spellPreviewDescription = "Give a target a burrow speed and DR 5/bludgeoning.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "135",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "",
      spellTargets = "one willing creature touched",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D",
      spellSavingThrow = "none",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The target’s body forms an exoskeleton, and its appendages such as hands and feet become broad and pointed like spades. Armor that covers any of these appendages functions normally and molds to fit the appendages’ new shape. The target gains DR 5/ bludgeoning and a burrow speed equal to its land speed. This spell grants no ability to breathe while buried, so a breathing creature without environmental protections might be at risk of suffocation.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Gyre",
      spellPreviewDescription = "You cause the water in gyre’s area of effect to form a twisting whirlpool that drags creatures in and down.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "evocation (water)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "cylinder (10-ft. radius, 40-ft. high)",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex partial (see text)",
      spellResistance = "no",
      spellDescriptionFull = "You cause the water in gyre’s area of effect to form a twisting whirlpool that drags creatures in and down. Each creature that enters or starts its turn in the spell’s area must attempt a Reflex save. A creature that fails its save is pulled a total of 15 feet: first, it’s pulled toward the gyre’s center; then once its space is adjacent to the gyre’s center, it’s pulled downward. A creature that succeeds at its save is pulled only 5 feet. Movement caused by gyre doesn’t provoke attacks of opportunity, and any portion of this spell’s area that isn’t in water has no effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Hack Wetware",
      spellPreviewDescription = "If the target fails its saving throw, you form a link between their mind and a computer you touch at the time of casting, allowing you to hack their brain as if it were a computer to examine or manipulate memories and implant suggestions.",
      spellSourceBookPreview = "AdvP#25",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #25: The Chimera Mystery",
      spellSchool = "divination",
      spellCastingTime = "1 round",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "If the target fails its saving throw, you form a link between their mind and a computer you touch at the time of casting, allowing you to hack their brain as if it were a computer to examine or manipulate memories and implant suggestions. Each round this spell is active and you are within range of the target, you can take a standard action to attempt a Computers check to hack their brain and gain certain information, depending on the level of the spell. For the purposes of this spell, a living mind has a tier equal to one-half the target’s level or CR (minimum 1) and has an alarm countermeasure that immediately alerts the target creature if you fail a Computers check, allowing them an immediate additional Will saving throw to end the spell.\n" +
              "\n" +
              "2nd: When you cast hack wetware as a 2nd-level spell, you can hack the target’s mind to gain general access to their thoughts, fears, and desires. If you are successful, you gain access to one of the following: the target’s current surface thoughts, the target’s most pressing current fear, or the target’s most pressing current desire. On following rounds, you can attempt additional Computers checks to learn other pieces of information.\n" +
              "\n" +
              "3rd: When you cast hack wetware as a 3rd-level spell, it functions like the 2nd-level casting of the spell, but you can also hack the target’s mind to gain deeper access to their secrets and memories. Such information is partitioned behind a mental firewall, which increases the DC to access it by 2 or the target’s Wisdom modifier, whichever is greater. If you are successful, you gain access to a single piece of secret information the target knows (such as a passcode or the location of a hidden panel) or a specific memory (which can be no longer than 1 minute); a memory shows exactly what the target experienced from their perspective, so it might lack context. You can save the information or memory to your computer to retrieve later.\n" +
              "\n" +
              "4th: When you cast hack wetware as a 4th-level spell, it functions like the 3rd-level casting of the spell, but you can also hack the target’s mind to send it false sensory data. If you are successful, you can determine the sights, sounds, and smells the brain receives, creating an illusion only the target can perceive, similar to a 4th-level holographic projection spell. The target can attempt a new saving throw when it interacts with these impressions to recognize them as false, but this doesn’t immediately end the effect. The impressions last for as long as the spell does, but you must attempt additional Computers checks to alter them in subsequent rounds.\n" +
              "\n" +
              "5th: When you cast hack wetware as a 5th-level spell, it functions like the 4th-level casting of the spell, but you can also hack the target’s mind to implant a subconscious command that can be activated at a later time. If you are successful, you can state a course of activity similar to that of a suggestion spell and a trigger, such as a static image or a code phrase. This ends the hack wetware spell, but the subconscious command remains in the target’s brain for a number of days equal to your technomancer level. The next time the target perceives the trigger, it performs the suggested course of action as best it can if it fails another Will saving throw. For every 5 your Computers check exceeded the DC, the target takes a cumulative –2 penalty to this saving throw. The command can be triggered only once.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","WtchW 5"),
      spellTitle = "Hailstorm",
      spellPreviewDescription = "Creatures in area take 6d8 cold damage and 7d8 bludgeoning damage, and gives –4 penalty to Perception checks, and is considered difficult terrain.",
      spellSourceBookPreview = "Alien#4",
      spellSourcePage = "119",
      spellSourceBookFull = "Alien Archive 4",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "",
      spellArea = "cylinder (20-ft. radius, 40 ft. high)",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "A barrage of fist-sized hailstones pelts the area. Creatures that enter or start their turn in the area during the first round of the spell take 6d8 cold damage and 7d8 bludgeoning damage. For the remaining duration of the spell, heavy snow and sleet rain down in the area. Until the spell is dismissed or until the end of the duration, this area provides concealment, creatures inside it take a –4 penalty to Perception checks, and the entire area is considered difficult terrain.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Handy Junkbot",
      spellPreviewDescription = "Create a temporary robot made of junk to perform Computers, Engineering, Piloting, and Sleight of Hand tasks.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "357",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "1 bulk of inert electronic equipment; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You turn a pile of technological junk into a robot that can accomplish helpful tasks. You must target inert, nonworking electronic equipment of at least 1 bulk. Valid targets include a large broken computer system, nonworking or unconnected computer or robot parts, a destroyed robot or another such trashed mechanical system, or any related electronic components or combination of the above as long as the junk is found in a large enough quantity.\n" +
              "\n" +
              "While casting this spell, you use your magic and technological know-how to rearrange the junked parts and infuse them with energy and helpful programming. A handy junkbot is Small, its KAC and EAC are each equal to 10 + your caster level, and it has a number of Hit Points equal to one-quarter of your own (but no Stamina Points). It has a land speed of 30 feet and a fly speed of 15 feet with average maneuverability. It can accomplish all tasks described in the Computers, Engineering, Piloting, and Sleight of Hand skills, is considered trained in those skills, and has a total skill bonus in each equal to 3 + your caster level. The junkbot is treated as if it is using a hacker’s kit when using the Computers skill and an engineering kit when using the Engineering skill. A handy junkbot can never attack. The junkbot uses your saving throw bonuses if it is the target of a spell or another targeted effect. For purposes of spells and effects that target the junkbot, it is treated as a construct with the technological and magical subtypes.\n" +
              "\n" +
              "You can give new basic commands to your handy junkbot telepathically on your turn as a move action, and the junkbot can take actions as if it were a normal creature. You are aware when the junkbot has succeeded at or failed a skill check, as well as when it has been attacked or destroyed, but you can perceive nothing else through this basic telepathic link.\n" +
              "\n" +
              "When the handy junkbot is destroyed or this spell ends, the electronic equipment you used to create it falls apart into refuse, its circuitry fried beyond anything recognizable. You can’t use this refuse as a target to create another junkbot.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4"),
      spellTitle = "Harness Lightning",
      spellPreviewDescription = "Gain cover against attacks that deal electricity damage, and potentially retaliate with electricity damage.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "75",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (electricity)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "cylinder (20-ft. radius, 40 ft. high)",
      spellEffect = "",
      spellDuration = "1 round plus 1 round/level",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "Born of necessity to contend with violent storms on the world of Shimrinsara in the Vast, harness lightning enables you to collect energy from major electrical discharges that occur within the area of the spell. The spell's area grants cover against ranged attacks and area effects that would deal only electricity damage. The bonus to saving throws due to this cover applies to any save against a critical hit effect from a weapon that deals only electricity damage. The first time the spell's area grants cover against an attack or effect this way, collected electrical attacks bend toward you and form a surging sphere of pure energy that lasts until the end of the spell. You can take a standard action to discharge this sphere at a target within 100 feet, dealing 8d8 electricity damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Haste",
      spellPreviewDescription = "One creature per level moves and acts faster.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "358",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The targeted creatures move and act more quickly than normal. This extra speed has several effects.\n" +
              "\n" +
              "When making a full attack, a hasted creature can also take a separate move action in order to move. The movement can occur before, after, or between the attacks from the full attack. All movement must occur at the same time.\n" +
              "\n" +
              "All of the hasted creature’s modes of movement (including base, burrow, climb, fly, and swim speeds) increase by 30 feet, to a maximum of twice the target’s normal speed using that form of movement. This increase counts as an enhancement bonus, and it affects the creature’s jumping distance as normal for increased speed. Multiple haste effects don’t stack. Haste counters and negates slow.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("WtchW 4"),
      spellTitle = "Hateful Visage",
      spellPreviewDescription = "The target’s illusory face grants them a bonus to Intimidate checks and the ability to frighten foes.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "135",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one willing creature; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none (harmless); see text",
      spellResistance = "no",
      spellDescriptionFull = "You pull alternate forms from horrifying realities and drape them upon the target, causing the target to exhibit almost any type of body horror imaginable. Your allies can tell this effect results from your layering of alternate realities onto this one and are unaffected. Against others, the target gains a +10 insight bonus to Intimidate checks. If the target successfully uses Intimidate to demoralize a foe, the foe is frightened instead of shaken. This bonus and change in condition are fear and mind-affecting effects.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2"),
      spellClassesWithLevelPreview = listOf("Myst 2"),
      spellTitle = "Haunted Armor",
      spellPreviewDescription = "Armor interferes with the wearer’s movement.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "136",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one worn suit of armor; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You divert a malevolent spirit from the River of Souls to haunt your opponent’s armor. This spell must target a suit of light, heavy, or powered armor. The armor becomes cumbersome, reducing the wearer’s speed by 10 feet and AC by 1. It also rattles, hisses, and screeches, imposing a –4 penalty on Stealth checks.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2"),
      spellClassesWithLevelPreview = listOf("Myst 2"),
      spellTitle = "Haunted Combatant",
      spellPreviewDescription = "Haunt an enemy’s weapons, interfering with attacks made with those weapons.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "136",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You divert a malevolent spirit from the River of Souls to temporarily haunt and interfere with an opponent’s weapons. The spirit writhes and rattles around in the target’s manufactured weapons, imposing a –1 penalty on the target’s attack rolls with weapons other than natural weapons. The weapons on a target’s body continue to be haunted while the spell lasts, even if the original target dies. Anyone who picks up the haunted weapons during this time must attempt to save against this spell at a –1 penalty or be affected by it.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("WtchW 0"),
      spellTitle = "Hazard",
      spellPreviewDescription = "Deal 1d3 acid, cold, electricity, fire, or sonic damage in a 5-foot-radius burst.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "136",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "5-foot-radius burst",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "Reflex negates",
      spellResistance = "yes",
      spellDescriptionFull = "When you cast this spell, choose acid, cold, electricity, fire, or sonic. The spell gains that descriptor. You summon a minor hazard from an alternate reality, creating a splash of acid rain, a blast of freezing air, a static electric discharge, a burst of fire, or a roar of thunder. Each creature in the area must succeed at a Reflex save or take 1d3 damage of the chosen type.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Healing Junkbot",
      spellPreviewDescription = "Robot made of junk can perform Medicine tasks and drag unconscious creature to safety.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "358",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "1 bulk of inert electronic equipment; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You turn a pile of technological junk into a robot that can perform basic healing tasks.\n" +
              "\n" +
              "You must target inert, nonworking electronic equipment of at least 1 bulk. Valid targets include a large broken computer system, nonworking or unconnected computer or robot parts, a destroyed robot or another such trashed mechanical system, or any related electronic components or combination of the above as long as the junk is found in a large enough quantity. While casting this spell, you use your magic and technological know-how to rearrange the junked parts and infuse them with energy and medical skills.\n" +
              "\n" +
              "A healing junkbot is Small, its KAC and EAC are each equal to 10 + your caster level, and it has a number of Hit Points equal to one-quarter of your own (but no Stamina Points). It has a land speed of 30 feet and a fly speed of 15 feet with average maneuverability. It is considered trained in the Medicine skill and can perform first aid, treat deadly wounds, and treat drugs or poison as if it had a medkit (though it can’t provide long-term care or treat disease). The junkbot has a total skill bonus for Medicine checks equal to 3 + your caster level.\n" +
              "\n" +
              "A healing junkbot can drag or fly one unconscious creature at a time to any spot you designate. It can drag or fly a Small, Medium, or Large creature at half speed. It can drag or fly smaller creatures at normal speed, but it can’t move creatures bigger than Large. A healing junkbot can never attack. The junkbot uses your saving throw bonuses if it is the target of a spell or another targeted effect. For purposes of spells and effects that target it, the junkbot is treated as a construct with the technological and magical subtypes.\n" +
              "\n" +
              "You can give new basic commands to your healing junkbot telepathically on your turn as a move action, and the junkbot can take actions as if it were a normal creature. You are aware when the bot has succeeded at or failed a skill check, as well as when it has been attacked or destroyed, but you can perceive nothing else through this basic telepathic link.\n" +
              "\n" +
              "When the healing junkbot is destroyed or this spell ends, the electronic equipment you used to create it falls apart into refuse, its components and circuitry fried beyond anything recognizable. You can’t use this refuse as a target to create another junkbot.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","Tchn 5"),
      spellTitle = "Heat Leech",
      spellPreviewDescription = "Deal 13d8 cold damage to creatures in a cone.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "359",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (cold)",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "",
      spellArea = "cone-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous; see text",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You drain the heat from all creatures and objects in the area, dealing 13d8 cold damage. You can store the gathered heat energy in a used battery. If you do so and use that battery when casting explosive blast within 1 minute, that spell deals 2d6 additional fire damage, destroying the used battery. Otherwise, the energy dissipates normally.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Helping Hands",
      spellPreviewDescription = "Grant extra hands that assist with some skill checks and item manipulation.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "76",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one willing creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "First developed by resourceful skittermander technomancers, you or a targeted creature sprout two vestigial hands that can hold and manipulate objects. While this spell is active, the target gains a +2 circumstance bonus to Engineering and Sleight of Hand checks. Each round, this spell grants the target one additional move action that can be used to manipulate objects, such as to activate an item, draw a weapon, or reload a weapon. This spell doesn't allow the target to attempt additional attacks.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Helping Hands, Mass",
      spellPreviewDescription = "Grant extra hands to multiple creatures that assist with some skill checks and item manipulation.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "76",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one willing creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as helping hands, except as noted above.\n" +
              "\n" +
              "(Helping Hands: First developed by resourceful skittermander technomancers, you or a targeted creature sprout two vestigial hands that can hold and manipulate objects. While this spell is active, the target gains a +2 circumstance bonus to Engineering and Sleight of Hand checks. Each round, this spell grants the target one additional move action that can be used to manipulate objects, such as to activate an item, draw a weapon, or reload a weapon. This spell doesn't allow the target to attempt additional attacks.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1"),
      spellTitle = "Hide Weapon",
      spellPreviewDescription = "You can make a small arm or one-handed weapon disappear into your body.",
      spellSourceBookPreview = "AdvP#35",
      spellSourcePage = "54",
      spellSourceBookFull = "Adventure Path #35: Merchants of the Void",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "When you cast this spell, a small arm or one-handed melee weapon with the operative special property in your hand melds with your flesh, accompanied by a disgusting sucking sound. The weapon can be no greater than light bulk, and it disappears completely inside your arm or arm like appendage. Thereafter for the duration of the spell, you can extend and retract the weapon as a move action.\n" +
              "While extended, the weapon remains partially melded with your hand and arm. While the weapon is retracted, its shape adjusts to fit inside your arm, and you retain the use of your hand. Spotting the weapon on casual inspection is impossible, but anyone frisking you can attempt a Perception check to notice the weapon hidden inside your arm. The DC of this Perception check is equal to 15 + 1/2 your caster level + your key ability score modifier.\n" +
              "\n" +
              "If you cast this spell again while a casting is in effect, you can hide another weapon inside another arm, to a maximum of one weapon per arm you have. You can extend and retract all weapons hidden this way as part of the same action. If you’re disarmed of a melded weapon, this spell immediately ends for that weapon.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","WtchW 4"),
      spellTitle = "Hold Monster",
      spellPreviewDescription = "Paralyze one creature.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "359",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions as hold person, except it can target any living creature.\n" +
        "\n" +
        "(Hold Person: The target becomes paralyzed and freezes in place. It is aware and breathes normally but can’t take any physical actions, even speech. A held creature can’t cast spells. Each round on its turn, the target can spend a full action to attempt a new saving throw to end the effect. This does not provoke attacks of opportunity. A winged creature that is paralyzed can’t flap its wings and falls. A swimmer can’t swim and may drown.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Hold Person",
      spellPreviewDescription = "Paralyze one humanoid.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "359",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one humanoid creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "yes",
      spellDescriptionFull = "The target becomes paralyzed and freezes in place. It is aware and breathes normally but can’t take any physical actions, even speech. A held creature can’t cast spells. Each round on its turn, the target can spend a full action to attempt a new saving throw to end the effect. This does not provoke attacks of opportunity. A winged creature that is paralyzed can’t flap its wings and falls. A swimmer can’t swim and may drown.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Prcg 1","Tchn 1","WtchW 1"),
      spellTitle = "Hold Portal",
      spellPreviewDescription = "Hold a door shut.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "359",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one portal up to 20 sq. ft./level",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell magically holds shut a door, gate, shutter, or window of any standard material (metal, plastic, stone, wood, and so on), or it reinforces an electronic lock. The magic affects the portal just as if it were securely closed and normally locked. A knock spell or a successful dispel magic spell can negate a hold portal spell.\n" +
              "\n" +
              "Add 5 to the normal DC for forcing open a portal or hacking an electronic lock affected by this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3"),
      spellTitle = "Hologram Memory",
      spellPreviewDescription = "Extract a creature’s memory and replay it as a hologram.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "359",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 full action",
      spellRange = "touch",
      spellTargets = "one living or deceased sentient creature; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "no",
      spellDescriptionFull = "You reach into the target’s mind, extract a specific memory, and project that memory into a small hologram that plays in front of you and is visible to all creatures who can see it. The hologram memory can be no longer than 1 minute; if the extracted memory is longer than this, the hologram simply ends. The hologram includes audio as well as visual components, but it does not contain haptic, olfactory, or other components. The hologram typically plays a memory that takes place in a single scene, though it can cut to multiple scenes, if they are accurate to the memory and its length allows. The hologram plays the memory exactly as the target experienced it and from the target’s perspective, so it often lacks context. The target creature must remain quiet and still while the hologram plays or the spell and hologram end.\n" +
              "\n" +
              "This spell can target any living, unconscious, or deceased sentient creature with an Intelligence score of 3 or higher (or a modifier of –4 or higher). If the target is deceased, it cannot have been dead for longer than 1 week, or this spell fails; once a corpse has been subjected to hologram memory by any caster, any subsequent attempts to cast hologram memory on that corpse fail.\n" +
              "\n" +
              "If the target is unwilling to share this memory (or if it would be unable to share the memory, in the case of an unconscious or deceased target), it can attempt a Will saving throw with a +4 bonus to negate this spell and its effects.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Holographic Image",
      spellPreviewDescription = "Illusory double of your likeness can talk and cast spells.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "360",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "see text",
      spellTargets = "",
      spellArea = "see text",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "Will disbelief",
      spellResistance = "no",
      spellDescriptionFull = "You weave nearby photons into illusory holograms that can take almost any form you can imagine. These holograms are usually effective against cameras, robots, and living creatures.\n" +
              "\n" +
              "1st: When you cast holographic image as a 1st-level spell, it produces a purely visual hologram at long range (400 feet + 40 feet/level). The image has no sound, smell, texture, or temperature. The image can’t extend beyond four 10-foot cubes plus one 10-foot cube per caster level. The image lasts for as long as you concentrate. You can move the image within the limits of the size of the effect.\n" +
              "\n" +
              "2nd: When you cast holographic image as a 2nd-level spell, it produces a hologram as per the 1st-level version of the spell, except the hologram can include minor sounds, but not understandable speech. The image lasts for as long as you concentrate plus 2 additional rounds.\n" +
              "\n" +
              "3rd: When you cast holographic image as a 3rd-level spell, it produces a hologram as per the 1st-level version of the spell, except the hologram can include sound, smell, and thermal illusions (but not speech). The image disappears when it is struck by an opponent, unless you cause the hologram to react appropriately. The image lasts for as long as you concentrate plus 3 additional rounds.\n" +
              "\n" +
              "4th: When you cast holographic image as a 4th-level spell, it produces a hologram as per the 3rd-level version of the spell, except the hologram follows a script determined by you. It follows that script for 1 minute per level without you having to concentrate on it. The hologram can include intelligible speech, if you wish.\n" +
              "\n" +
              "5th: When you cast holographic image as a 5th-level spell, it produces a hologram as per the 4th-level version of the spell, except the size of the hologram can’t extend beyond a 20-foot cube plus one 10-foot cube per caster level.\n" +
              "\n" +
              "You can choose to make the hologram permanent at the time of casting. By concentrating, you can move the image within the limits of the range, but it is static while you are not concentrating.\n" +
              "\n" +
              "Alternatively, you can have the hologram activate when a specific condition (which you set at the time of casting) occurs. The event that triggers the hologram can be as general or as specific and detailed as desired, but it must be based on an audible, olfactory, tactile, or visual trigger. The trigger can’t be based on some quality not normally obvious to the senses, such as alignment. The spell lasts until it is triggered, and then the hologram lasts for 1 round per caster level.\n" +
              "\n" +
              "6th: When you cast holographic image as a 6th-level spell, it creates a quasi-real, illusory version of yourself at medium range (100 feet + 10 feet/level). This hologram looks, sounds, and smells like you, but it is intangible. The hologram mimics your actions (including speech) unless you use a move action to direct it to act differently. You can see through its eyes and hear through its ears as if you were standing where it is, and during your turn you can switch from using its senses to using your own, or back again, as a move action. While you are using its senses, your body is considered blinded and deafened.\n" +
              "\n" +
              "If you desire, any spell you cast with a range of touch or greater can originate from the hologram instead of from you. The hologram can’t cast spells on itself except for illusion spells. Spells cast in this manner affect other targets normally, despite originating from the hologram.\n" +
              "\n" +
              "An object isn’t deceived by illusions (treat as if it had succeeded at its Will saving throw). The hologram remains for 1 round per level, and you must maintain line of effect to the hologram at all times. If your line of effect is obstructed, the spell ends. If you use dimension door, plane shift, teleport, or a similar spell that breaks your line of effect, even momentarily, the spell ends. This casting of the spell is a shadow effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0"),
      spellTitle = "Holographic Interface",
      spellPreviewDescription = "Generate a holographic interface that lets you interact with a computer.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "76",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one computer you're observing",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You conjure a holographic interface you can use to communicate with the target computer. The interface allows you to operate an unfamiliar computer or one that lacks an interface as though you did have an interface, but it doesn't change your level of access.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5"),
      spellTitle = "Holographic Terrain",
      spellPreviewDescription = "Create a large hologram that depicts terrain and structures.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "360",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "",
      spellArea = "one 20-ft. cube/level (S)",
      spellEffect = "",
      spellDuration = "2 hours/level (D)",
      spellSavingThrow = "Will disbelief",
      spellResistance = "no",
      spellDescriptionFull = "You make terrain look, sound, and smell like some other sort of terrain. Equipment, structures, and vehicles within the area can be hidden or changed in appearance. The illusion includes audible, olfactory, tactile, and visual elements and is effective against cameras, living creatures, robots, and scrying spells. This spell can’t disguise or add creatures nor can it make them invisible (though creatures within the area might hide themselves within the illusion just as they can hide themselves within a real location).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Hoverdisk",
      spellPreviewDescription = "Conjure a hovering disk to ride or transport cargo.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "136",
      spellSourceBookFull = "Character Operations Manual6",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels); see text",
      spellTargets = "",
      spellArea = "",
      spellEffect = "3-ft. diameter disk of force",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no",
      spellDescriptionFull = "You create a thin, circular plane of force 3 feet in diameter and able to hover up to 3 feet above the ground. When you cast this spell, you can give the disk general instructions, such as “Take me across this field of lava,” or “Take the rescued shirren back to town.” You can tell the disk to go to any location you are familiar with, and it follows these instructions without error, even traveling beyond the spell’s range. If you give the disk no instructions, it follows 5 feet behind you. The disk can carry up to 20 bulk for each caster level you have, has a fly speed of 60 feet (no higher than 3 feet), and can move beyond the spell’s range. It moves at your command or the command of a creature you designate, as a move action, and it raises and lowers itself on similar command, so getting on or off the disk can be done as part of the move action to move into the disk’s space. As a standard action, you can give the disk new general instructions.\n" +
              "\n" +
              "If the spell ends before the disk completes its task, the disk completes as much as it can before disappearing. When the disk disappears, whatever it was carrying falls to the surface beneath it.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5"),
      spellTitle = "Hoverdisk, Mass",
      spellPreviewDescription = "Create several hovering disks of force for creatures to ride or to transport cargo.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "137",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level); see text",
      spellTargets = "",
      spellArea = "",
      spellEffect = "up to 1 disk of force/caster level, each of which is 3 feet in diameter",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no",
      spellDescriptionFull = "This spell functions as hoverdisk, except as noted above. As part of casting this spell, you can give a single set of instructions to all disks, or you can give separate instructions to each disk. You must spend a standard action to give new or additional instructions to any one disk, although you can give a group of disks the same instructions as part of the same action.\n" +
              "(Hoverdisk: You create a thin, circular plane of force 3 feet in diameter and able to hover up to 3 feet above the ground. When you cast this spell, you can give the disk general instructions, such as “Take me across this field of lava,” or “Take the rescued shirren back to town.” You can tell the disk to go to any location you are familiar with, and it follows these instructions without error, even traveling beyond the spell’s range. If you give the disk no instructions, it follows 5 feet behind you. The disk can carry up to 20 bulk for each caster level you have, has a fly speed of 60 feet (no higher than 3 feet), and can move beyond the spell’s range. It moves at your command or the command of a creature you designate, as a move action, and it raises and lowers itself on similar command, so getting on or off the disk can be done as part of the move action to move into the disk’s space. As a standard action, you can give the disk new general instructions.\n" +
              "\n" +
              "If the spell ends before the disk completes its task, the disk completes as much as it can before disappearing. When the disk disappears, whatever it was carrying falls to the surface beneath it.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2"),
      spellClassesWithLevelPreview = listOf("Myst 2"),
      spellTitle = "Hurl Forcedisk",
      spellPreviewDescription = "Disc deals 3d6 force damage to one target then ricochets to other targets, dealing 2d6 force damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "360",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. +10 ft./level)",
      spellTargets = "up to five creatures; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You create a spinning disk made of pure, shimmering force and hurl it at one opponent within range, potentially striking other nearby enemies as the disk ricochets. Choose the initial target, and make a ranged attack against its EAC. If the attack hits, the disk deals 3d6 damage. The disk then ricochets to hit up to four more creatures of your choice, each no more than 15 feet from the last target. Make a ranged attack against each successive target’s EAC in turn; the disk deals 2d6 damage to each secondary target struck (this damage is rolled separately for each target). The disk continues to ricochet in this way until it has attempted to strike five creatures, or until there are no more valid targets, or until you voluntarily end the spell. A creature can take damage only once from a single casting of this spell.\n" +
              "\n" +
              "The forcedisk is subject to spell resistance, so you must attempt a caster level check (1d20 + your caster level) against each target with spell resistance before determining whether the target might take damage. If you fail this check, the spell ends.\n" +
              "\n" +
              "The exact shape of the forcedisk is superficially changeable; as part of casting this spell, a spellcaster can decide to make it shaped differently from a traditional disk. For example, using this spell to create a starknife made of force is popular among Desna’s followers. The spell still deals the amount of damage described above regardless of the disk’s shape.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("WtchW 3"),
      spellTitle = "Ice Bolt",
      spellPreviewDescription = "You cause the ambient atmosphere or water to flash freeze, creating a jagged icicle that deals 5d6 cold and 5d6 piercing to each creature in its area.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "evocation (water)",
      spellCastingTime = "1 standard action",
      spellRange = "50 ft.",
      spellTargets = "",
      spellArea = "line-shaped burst",
      spellEffect = "",
      spellDuration = "",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You cause the ambient atmosphere or water to flash freeze, creating a jagged icicle that deals 5d6 cold and 5d6 piercing to each creature in its area. When cast underwater, this spell deals an additional 2d6 cold damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6","WtchW 6"),
      spellTitle = "Ice Prison",
      spellPreviewDescription = "Deal 8d6 cold damage and cause a creature to become paralyzed, along with additional damage per round.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "76",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (cold)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You encase a creature in a block of ice. The creature takes 8d6 cold damage and becomes paralyzed. A creature that succeeds at a Reflex saving throw halves the damage it takes and avoids becoming paralyzed. Each round on its turn, a paralyzed creature takes an additional 4d6 cold damage and can spend a full action to attempt a new saving throw to end the paralyzed effect. The ice prison has hardness 21, 51 Hit Points, and vulnerability to fire. If the ice prison is destroyed, the spell ends. Casting this spell doesn't provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Id Insinuation",
      spellPreviewDescription = "By invading targets with your psychic presence, you isolate parts of their minds, preventing them from functioning in a coherent manner.",
      spellSourceBookPreview = "AdvP#23",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #23: Hive of Minds",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "up to one creature/4 levels, no two of which can be more than 30 ft. apart",
      spellEffect = "",
      spellDuration = "concentration + 1 round",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "By invading targets with your psychic presence, you isolate parts of their minds, preventing them from functioning in a coherent manner. Targets who fail their save are confused for the duration. Each round, a target rolls twice to determine their behavior due to the confused condition, and you choose which result applies.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","Tchn 1","WtchW 1"),
      spellTitle = "Identify",
      spellPreviewDescription = "Gain +10 bonus to identify items of a magic or technological nature.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "361",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "5 ft.",
      spellTargets = "one magic or technological object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell allows you to attempt to identify the function of a magic item (with Mysticism) or technological device (with Engineering) each round. You gain a +10 insight bonus to skill checks to identify the properties and command words or passwords of items targeted when using this spell. This spell does not allow you to identify artifacts.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Identity Storm",
      spellPreviewDescription = "This spell causes all creatures in the area to perceive all other creatures as copies of someone they have a strong impression of, whether a friend, enemy, or even themselves.",
      spellSourceBookPreview = "Ports",
      spellSourcePage = "123",
      spellSourceBookFull = "Ports of Call",
      spellSchool = "illusion (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "15-ft.-radius burst",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell causes all creatures in the area to perceive all other creatures as copies of someone they have a strong impression of, whether a friend, enemy, or even themselves. At the start of each of each affected creature’s turn, that creature chooses to treat all other creatures it can perceive as allies or enemies. The creature must attempt attacks of opportunity whenever any enemy provokes them and can’t target allies (or squares containing allies) with harmful effects. Any affected creature that’s attacked immediately treats all other creatures as enemies. Any affected creature targeted with a beneficial effect immediately treats all other creatures as friends. An affected creature can spend a move action to attempt a Will Save to end the effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Illusory Star Field",
      spellPreviewDescription = "Use illusory stars to grant a +3 bonus to Bluff checks made to convince creatures of their location.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "137",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to 3 creatures/level, no two of which can be more than 20 feet apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "Will disbelief",
      spellResistance = "no",
      spellDescriptionFull = "This spell causes targets to see an illusory star pattern, naturally occurring space phenomena, or another general skyscape you choose the details of during casting. The spell’s effects grant a +3 circumstance bonus to Bluff checks or related skill checks to convince the targets of something related to the false skyscape, such as their location on a planet according to the stars.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Implant Data",
      spellPreviewDescription = "Embed one piece of data per level in a target computer or system.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "361",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one computer system or module",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level or until triggered; see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You subtly rearrange the internal circuitry of a computer system or module, programming it to convey a certain dataset when accessed (either normally or if it is hacked). You can implant up to one piece of data per caster level. A piece of data consists of a simple fact, such as a creature or object’s location or physical description, a creature or object’s tangible or intangible value, or another simple statement. When an affected computer system or module is accessed, this implanted data is the first data the accessing individual gains, regardless of what data the individual is actually looking for, though the accessing individual can access the system or module’s actual information if it looks beyond the implanted data. The implanted data vanishes from the system or module once the accessing individual has reviewed it. If this spell’s duration ends before an individual accesses the implanted data, the implanted data vanishes.\n" +
              "\n" +
              "The implanted data can be made permanent with a special ritual, which takes 1 hour and requires materials worth 5,000 credits. Once it’s made permanent, the implanted data temporarily vanishes after it is accessed, but it returns 1 hour later.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Prcg 1","Tchn 1"),
      spellTitle = "Incompetence",
      spellPreviewDescription = "Targeted creatures lose proficiency with one type of weapons",
      spellSourceBookPreview = "Armory",
      spellSourcePage = "157",
      spellSourceBookFull = "Armory",
      spellSchool = "enchantment (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close",
      spellTargets = "one creature/level",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You cause all targets of this spell to lose proficiency with one class of weapons of your choice (basic or advanced melee weapons, small arms, longarms, heavy weapons, grenades, or natural weapons) and suffer the normal penalties for attacks made with weapons they are not proficient with.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Infect Blood",
      spellPreviewDescription = "Alter a target’s blood to deal 3d8 damage per round and impose the sickened condition.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "137",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude half; see text",
      spellResistance = "yes",
      spellDescriptionFull = "You alter the target’s internal chemistry, causing their body to reject its composition. The target takes 3d8 damage each round, but can attempt a Fortitude save for half damage, and has the sickened condition for the duration.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2","WtchW 2"),
      spellTitle = "Inflame",
      spellPreviewDescription = "If target takes any physical damage the spell dead 4d6 damage to target and all around them.",
      spellSourceBookPreview = "Alien#4",
      spellSourcePage = "19",
      spellSourceBookFull = "Alien Archive 4",
      spellSchool = "evocation (acid)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (see text)",
      spellSavingThrow = "Fortitude negates",
      spellResistance = "yes",
      spellDescriptionFull = "You make a melee attack against a single target’s EAC. If you hit, the target must succeed at a Fortitude save or it is sickened and develops painful blisters and boils that last for the spell’s duration. If the target takes bludgeoning, piercing, or slashing damage while inflamed, the boils burst, dealing 4d6 acid damage to the target and all adjacent creatures; adjacent creatures can halve this damage with a successful Reflex save. Once the boils burst, the spell ends and the sickened effect continues until the end of the target’s next turn.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2"),
      spellClassesWithLevelPreview = listOf("Myst 2"),
      spellTitle = "Inflict Pain",
      spellPreviewDescription = "Wracking pain imposes –2 penalty to ability checks, attack rolls, and skill checks on one target.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "361",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (mind-affecting, pain)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You telepathically rack the target’s mind and body with agonizing pain that imposes a –2 penalty to ability checks, attack rolls, and skill checks. A target that succeeds at a Will saving throw reduces the duration to 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6"),
      spellClassesWithLevelPreview = listOf("Myst 6"),
      spellTitle = "Inflict Pain, Mass",
      spellPreviewDescription = "Wracking pain imposes –2 penalty to ability checks, attack rolls, and skill checks on one target per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "361",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (mind-affecting, pain)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions as inflict pain, except as noted above.\n" +
              "\n" +
              "You telepathically rack the target’s mind and body with agonizing pain that imposes a –2 penalty to ability checks, attack rolls, and skill checks. A target that succeeds at a Will saving throw reduces the duration to 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Inject Nanobots",
      spellPreviewDescription = "Touch deals 4d8 damage to target and causes the confused condition.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "361",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one living creature or construct",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous and 1 round/level; see text",
      spellSavingThrow = "Fortitude partial and Will partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You concentrate key particles in your blood into tiny biological nanobots that you can inject into a foe with a touch, disrupting and damaging its natural processes. Make a melee attack against the target’s EAC; if you hit, the nanobots deal 4d8 damage and swarm through the target’s biological or mechanical systems, causing the creature to be confused, as per confusion, for 1 round per your caster level. If the target succeeds at a Fortitude save, it takes only half damage and negates the confusion effect. A confused target can attempt a Will saving throw at the beginning of its turn each round to end the confusion effect.\n" +
              "\n" +
              "Casting this spell doesn’t provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 0"),
      spellClassesWithLevelPreview = listOf("Prcg 0"),
      spellTitle = "Injury Echo",
      spellPreviewDescription = "Deal 1d6 bludgeoning, piercing, or slashing damage to a creature.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "76",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You manifest an injury from the target's future or past. Choose bludgeoning, piercing, or slashing when you cast this spell. The target must succeed at a Will saving throw or take 1d6 damage of the chosen type.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Instant Upgrade",
      spellPreviewDescription = "Briefly conjure a cybernetic augmentation.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "137",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one willing creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no (harmless)",
      spellDescriptionFull = "You conjure bits of technology infused with magic to create one functional, temporary cybernetic augmentation with a level equal to or lower than your caster level. You decide which cybernetic augmentation to create when you cast this spell. The target must have the chosen system available for augmentation. If the target’s chosen system already has its maximum number of augmentations, this spell has no effect. The augmentation appears without harm and functions for the spell’s duration, dissipating harmlessly into nothing when the spell ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Instant Virus",
      spellPreviewDescription = "Inflict technological construct with disease.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "361",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one construct with the technological subtype",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous; see text",
      spellSavingThrow = "Fortitude negates, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You overwhelm your target’s programming, installing a dangerous self-replicating programming virus. This works like a physical or mental disease (your choice), except it ignores the target’s immunity to diseases. The programming virus has a frequency of 1 hour and requires two consecutive saving throws to cure. Detect affliction can reveal the existence of this virus in a construct (the virus is considered a disease for purposes of that spell). Additionally, remove affliction can remove this virus.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3"),
      spellTitle = "Intellect Fortress",
      spellPreviewDescription = "When you or a creature within range is subjected to a mind‑affecting effect while this spell is active, you disrupt it with the power of pure logic.",
      spellSourceBookPreview ="AdvP#23",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #23: Hive of Minds",
      spellSchool = "abjuration",
      spellCastingTime = "1 reaction",
      spellRange = "20 ft.",
      spellTargets = "",
      spellArea = "20-ft.-radius spherical emanation centered on you",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "none",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "When you or a creature within range is subjected to a mind‑affecting effect while this spell is active, you disrupt it with the power of pure logic. Mind-affecting effects deal only half damage—including ability score damage—to creatures in the area, before any reduction due to successful saves or other effects. When a creature within the area succeeds at a saving throw against an emotion or fear effect, they are not affected by that effect, even if that effect would have a partial effect on a successful saving throw. Ongoing emotion and fear effects are also suppressed for creatures within the area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Interplanetary Teleport",
      spellPreviewDescription = "Teleport between planets.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "362",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "solar system or plane; see text",
      spellTargets = "you and touched objects or touched willing or unconscious creatures",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none, Will negates (object)",
      spellResistance = "no, yes (object)",
      spellDescriptionFull = "This spell functions as teleport, except there is no hard range limit and you don’t need to have seen your destination. You can teleport to anywhere you are familiar with on the planet you are on while casting the spell, or you can teleport to any other planet in the same solar system. You must have an unambiguous idea of which world you wish to travel to (“the third planet from the sun” is an acceptable destination, but “a habitable world with oceans” is not). If you have a specific location on a planet in mind, you arrive there without a chance of failure; otherwise, you arrive at a location that would not immediately be life threatening. If no such safe landing zone exists on the world, such as someone attempting to travel into the sun without the proper precautions in place, the spell simply fails.\n" +
              "\n" +
              "You can also attempt to teleport to planets in different solar systems that you have visited before. This increases the casting time to 1 hour and costs a number of Resolve Points equal to the number of days it would take to reach the planet through Drift travel (assume a base engine with a Drift rating of 1; the GM rolls this randomly, after you begin casting the spell). If you don’t have enough Resolve Points, you spend all the Resolve Points you have available and the spell fails.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Invisibility To Technology",
      spellPreviewDescription = "Technological items can’t detect target.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "137",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "The target and its gear cannot be detected by cameras, motion detectors, technological armor upgrades such as infrared sensors, biotech and cybernetic eyes or ears, or other technological devices, and it is invisible to constructs with the technological subtype. The target is missing from technological images captured while the spell lasts, security cameras do not display the target, microphones pick up no sounds the target makes, and the target cannot trigger technological traps. This spell creates disadvantages for the target, as well. Talking on a comm unit is impossible while subjected to this spell, and automatic doors do not open for the target.\n" +
              "\n" +
              "Items dropped, put down, or thrown by the target become visible to technology. Items picked up disappear if tucked into clothing or a bag carried by the target. Light remains visible to technology, but a source of light might be invisible. If any part of an item the target carries extends more than 10 feet from the target, that part becomes visible to technology. This spell ends under the same circumstances as an invisibility spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Invisibility, Greater",
      spellPreviewDescription = "Target is invisible for 1 round per level, even if it attacks.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "362",
      spellSourceBookFull = "Adventure PathCore Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions like invisibility, except it doesn’t end if the target attacks.\n" +
        "\n" +
        "(Invisibility: The creature or object touched becomes invisible (see page 264). If the target is a creature, any gear it is carrying vanishes as well. If you cast the spell on someone else, neither you nor your allies can see the target unless you can normally see invisible things or you employ magic to do so.\n" +
                "\n" +
                "The spell ends if the target attacks any creature. For purposes of this spell, an attack includes any spell or harmful effect targeting a foe or whose area or effect includes a foe. Actions directed at unattended objects don’t break the spell. Spells that specifically affect allies but not foes are not attacks for this purpose, even when they include foes in their area. Causing harm indirectly is not an attack. Thus, an invisible being can open doors, talk, eat, climb stairs, summon security forces and have them attack, start a trash compactor with foes inside, remotely trigger traps, and so forth.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","Tchn 2","WtchW 2"),
      spellTitle = "Invisibility",
      spellPreviewDescription = "Target is invisible for 1 minute per level or until it attacks.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "362",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or object no more than 10 bulk/level",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will negates (harmless, object), see text",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "The creature or object touched becomes invisible (see page 264). If the target is a creature, any gear it is carrying vanishes as well. If you cast the spell on someone else, neither you nor your allies can see the target unless you can normally see invisible things or you employ magic to do so.\n" +
              "\n" +
              "The spell ends if the target attacks any creature. For purposes of this spell, an attack includes any spell or harmful effect targeting a foe or whose area or effect includes a foe. Actions directed at unattended objects don’t break the spell. Spells that specifically affect allies but not foes are not attacks for this purpose, even when they include foes in their area. Causing harm indirectly is not an attack. Thus, an invisible being can open doors, talk, eat, climb stairs, summon security forces and have them attack, start a trash compactor with foes inside, remotely trigger traps, and so forth.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Invisibility, Mass",
      spellPreviewDescription = "Multiple targets are invisible for 1 minute per level or until one target attacks or moves away from other targets affected by spell.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "362",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "any number of creatures, no two of which can be more than 180 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will negates (harmless, object), see text",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "This spell functions like invisibility, except the effect moves with the group and is broken when anyone in the group attacks. Individuals in the group can’t see one another. Any individual who moves more than 180 feet from the nearest member of the group loses the benefit of this spell. If only two individuals are affected, the one moving away from the other one loses its invisibility. If both are moving away from each other, they both become visible when the distance between them exceeds 180 feet.\n" +
        "\n" +
        "(Invisibility: The creature or object touched becomes invisible (see page 264). If the target is a creature, any gear it is carrying vanishes as well. If you cast the spell on someone else, neither you nor your allies can see the target unless you can normally see invisible things or you employ magic to do so.\n" +
              "\n" +
              "The spell ends if the target attacks any creature. For purposes of this spell, an attack includes any spell or harmful effect targeting a foe or whose area or effect includes a foe. Actions directed at unattended objects don’t break the spell. Spells that specifically affect allies but not foes are not attacks for this purpose, even when they include foes in their area. Causing harm indirectly is not an attack. Thus, an invisible being can open doors, talk, eat, climb stairs, summon security forces and have them attack, start a trash compactor with foes inside, remotely trigger traps, and so forth.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3","WtchW 3"),
      spellTitle = "Irradiate",
      spellPreviewDescription = "Flood area with dangerous radiation.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "362",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation, disease, poison, radiation)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "10-ft.-radius spread; see text",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude partial, see text",
      spellResistance = "no",
      spellDescriptionFull = "This spell floods the area of effect with dangerous radiation. The strength of the radiation you create depends on your caster level, as detailed below. The central irradiated area is always a 10-foot-radius spread that expands normally per the rules for radiation areas of effect (see page 403). Creatures within the area are exposed to the radiation only once; the radiation does not linger in the area. The saving throw to resist the radiation effects is set by the spell rather than the standard save DC for radiation.\n" +
              "\n" +
              "Caster Level : Radiation Level\n" +
              "6th or lower : Low\n" +
              "7th–9th : Medium\n" +
              "10th–16th : High\n" +
              "17th or higher : Severe",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Jolting Surge",
      spellPreviewDescription = "Touch deals 4d6 electricity damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "363",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (electricity)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You touch a target with a device you’re holding that uses electricity, requiring a melee attack against the target’s EAC. Alternatively, you can instead touch an electrical device a target is wearing (or a target that is an electrical device, such as a robot) with your hand, gaining a +2 bonus to your attack roll. Either way, if your attack hits, the electrical device surges out of control, dealing 4d6 electricity damage to your target.\n" +
              "\n" +
              "Casting this spell doesn’t provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Junk Armor",
      spellPreviewDescription = "You turn a pile of technological junk into a suit of light armor, or use it to upgrade a suit of light armor into heavy armor.",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "205",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "at least 1 bulk of inert electronic equipment; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "24 hours (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You turn a pile of technological junk into a suit of light armor, or use it to upgrade a suit of light armor into heavy armor. You must target inert, nonworking electronic equipment of at least 1 bulk.\n" +
              "\n" +
              "You can cause the armor to be created on yourself or an adjacent willing or unconscious ally. Light or heavy armor you create requires proficiency to use without penalties as normal. If you use this spell to create light armor, the armor has an EAC bonus equal to your caster level, a KAC bonus equal to your caster level + 2, and a maximum Dex bonus equal to 1 + one quarter your caster level. Using junk armor to temporarily turn light armor into heavy armor increases the armor’s EAC bonus by 1 and its KAC bonus by 2, reduces its maximum Dexterity bonus by 3, and worsens its armor check penalty by 2.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Junk Barricade",
      spellPreviewDescription = "You turn a pile of technological junk into a barricade that provides cover.",
      spellSourceBookPreview = "Junker",
      spellSourcePage = "52",
      spellSourceBookFull = "Junker's Delight",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "at least 1 bulk of inert electronic equipment; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You turn a pile of technological junk into a barricade that provides cover. You must target inert, nonworking electronic equipment of at least 1 bulk.\n" +
              "The junk you target stacks and reinforces itself to form a low wall along one edge of your square. The barricade grants cover against attacks with a line of effect that pass through it. The barricade has hardness and Hit Points as a piece of equipment with an item level equal to your caster level.\n" +
              "\n" +
              "You can target 1 additional bulk of inert electronic equipment for every 4 caster levels you have beyond 4th, extending the barricade across an equal number of adjacent squares. Alternatively, for each additional bulk you can target, you can increase the bonuses to AC and Reflex saves provided by one square of the barricade by 1 (to a maximum of improved cover—+8 bonus to AC and +4 bonus to Reflex saves).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Junk Grenade",
      spellPreviewDescription = "You transform a pile of technological junk into three grenades.",
      spellSourceBookPreview = "Ports",
      spellSourcePage = "83",
      spellSourceBookFull = "Ports of Call",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "1 bulk of inert electronic equipment",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You transform a pile of technological junk into three grenades. You must target inert, nonworking electronic equipment of at least 1 bulk. Valid targets include a broken computer system, nonworking or unconnected computer or robot parts, a destroyed robot or another such trashed mechanical system, or any combination of related electronic components from the above, as long as the junk is found in sufficient quantity.\n" +
              "\n" +
              "You’re automatically proficient with these grenades, and these grenades function only for you. Each grenade’s damage and explode radius varies by the spell’s level. If the spell lets you choose between multiple damage types, you can choose for grenades to deal different damage types (for a grenade that deals energy damage, choose acid, cold, electricity, or fire). As a full action, you can change the damage and damage type of a junk grenade you’re holding into a different type allowed by the spell. Creatures affected by a junk grenade can attempt a Reflex saving throw using your spell’s saving throw DC to take half damage.\n" +
              "\n" +
              "When you cast this spell as a 2nd-level or higher spell, rather than creating 3 grenades, you can choose to create 5 grenades using the next lowest spell level (such as 5 grenades that deal 2d6 piercing damage when casting this as a 3rd-level spell).\n" +
              "\n" +
              "1st: Each junk grenade deals 1d6 piercing damage and has an explode radius of 10 feet.\n" +
              "\n" +
              "2nd: Each junk grenade deals 2d6 piercing damage and has an explode radius of 10 feet.\n" +
              "\n" +
              "3rd: Each junk grenade deals either 4d6 piercing damage or 4d4 energy damage and has an explode radius of 10 feet.\n" +
              "\n" +
              "4th: Each junk grenade deals either 6d6 piercing damage or 6d4 energy damage and has an explode radius of 15 feet.\n" +
              "\n" +
              "5th: Each junk grenade deals either 8d6 piercing damage or 8d4 energy damage and has an explode radius of 15 feet.\n" +
              "\n" +
              "6th: Each junk grenade deals either 11d6 piercing damage or 11d4 energy damage and has an explode radius of 15 feet.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Junk Restraints",
      spellPreviewDescription = "You turn a pile of technological junk into fetters and shackles that restrain a creature within range.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "156",
      spellSourceBookFull = "Near Space",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "at least 1 bulk of inert electronic equipment; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/2 levels (D)",
      spellSavingThrow = "Reflex negates; see text",
      spellResistance = "no",
      spellDescriptionFull = "You turn a pile of technological junk into fetters and shackles that restrain a creature within range. You must target inert, nonworking electronic equipment of at least 1 bulk.\n" +
              "\n" +
              "While casting this spell, you use your magic and technological know-how to rearrange the junked parts and infuse them with energy powerful enough to restrain a Large or smaller creature. The junk flies towards the creature and ensnares it, usually by attaching to the creature’s limbs. If the targeted creature succeeds at a Reflex save, the junk lands adjacent to them without harm. Otherwise, the ensnared target gains the entangled condition for the duration of the spell, or until it ends the condition by taking a move action and succeeding at an Acrobatics or Athletics check with a DC equal to 15 + 1-1/2 × your caster level.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5"),
      spellTitle = "Junk Shanty",
      spellPreviewDescription = "You turn a pile of technological junk into an extradimensional shelter.",
      spellSourceBookPreview = "Junker",
      spellSourcePage = "58",
      spellSourceBookFull = "Junker's Delight",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "at least 1 bulk of inert electronic equipment",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You turn a pile of technological junk into an extradimensional shelter. You must target inert, nonworking electronic equipment of at least 1 bulk.\n" +
              "\n" +
              "The junk you target forms into a doorway 4 feet wide and 8 feet high, which becomes the entrance to an extra-dimensional dwelling that can comfortably fit up to 8 Medium creatures. A Large creature counts as two Medium creatures, and a Huge creature counts as four Medium creatures. Only those you designate can enter the shanty. When you enter it, the portal shuts and the doorway reverts to a pile of junk. You can reform the doorway and the portal again from your side at will.\n" +
              "\n" +
              "The shanty is one large room with furnishings made of scrap and debris. Despite its shabby appearance, it’s surprisingly comfortable. Characters who take a full night’s rest within the shanty benefit as if they underwent complete bed rest for 24 hours, recovering Hit Points and ability damage at double the usual rate. The atmosphere and temperature inside the shelter are enjoyable for your species. Since it can be entered only through its special portal, outside conditions do not affect the shanty, nor do conditions inside it pass beyond.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Junk Shards",
      spellPreviewDescription = "You summon sharp fragments of technological junk that fly toward your target and deal 3d6 piercing and slashing damage.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "156",
      spellSourceBookFull = "Near Space",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "creates 1 bulk of inert electronic equipment",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You summon sharp fragments of technological junk that fly toward your target and deal 3d6 piercing and slashing damage. The spell leaves behind 1 bulk of junked electronic equipment in the target creature’s space that is suitable for targeting with spells such as battle junkbot, handy junkbot, healing junkbot, junk armor, junk restraints, or junksword. The junked electronics have no resale value and cannot be repaired into any functioning item. A creature trained in Engineering or Physical Science can reveal the useless nature of the junk by directly examining it.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Junksword",
      spellPreviewDescription = "Turn junk into a one-handed melee weapon",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "205",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "1 bulk of inert electronic equipment",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You turn a pile of technological junk into a one-handed melee weapon that you can wield against your foes. You must target inert, nonworking electronic equipment of at least 1 bulk. Valid targets include a large broken computer system, nonworking or unconnected computer or robot parts, a destroyed robot or another such trashed mechanical system, or any related electronic components or combination of the above, as long as the junk is found in sufficient quantity.\n" +
              "\n" +
              "You are automatically proficient with this melee weapon, and you add 1-1/2 times your caster level to damage rolls with it (in place of a Weapon Specialization bonus). A junksword functions only for its creator, and once created it cannot leave your hand. Should you wish to sheathe it, the junksword obliges by collapsing into a wreath of junk that surrounds your hand like a glove.\n" +
              "\n" +
              "You can grant your junksword additional abilities based on the spell’s level. You can change one modification to your junksword as a move action, or you can completely reconfigure all of its modifications as a full action.\n" +
              "\n" +
              "1st: Your junksword deals 1d4 bludgeoning and slashing damage and has the analog weapon special property. In addition, you can grant your junksword up to two of the following special properties: block, disarm, nonlethal, reach, or trip.\n" +
              "\n" +
              "2nd: Your junksword deals 1d8 bludgeoning and slashing damage and has the analog weapon special property. In addition, you can grant your junksword up to three of the special properties from the 1st-level list.\n" +
              "\n" +
              "3rd: Your junksword has either the analog or powered (capacity 30, usage 2) weapon special property (your choice). It deals 2d4 bludgeoning and slashing damage if it’s an analog weapon, or 2d4 electricity damage if it’s a powered weapon. In addition, you can grant your junksword up to three of the special properties from the 1st-level list, plus the staggered critical effect. If you select the powered option, your junksword’s battery is integrated and cannot be removed, recharged, replaced, or used to power other devices.\n" +
              "\n" +
              "4th: This functions as the 3rd-level junksword, but it deals 2d8 bludgeoning and slashing damage if it’s an analog weapon or 3d4 damage if it’s a powered weapon, and it gains the stunned critical effect (rather than staggered).\n" +
              "\n" +
              "5th: This functions as the 3rd-level casting of junksword, but the junksword deals 3d10 bludgeoning and slashing damage if it’s an analog weapon or 3d6 electricity damage if it’s a powered weapon, and it gains the stunned critical effect (rather than staggered).\n" +
              "\n" +
              "6th: This functions as the 3rd-level casting of junksword, but the junksword deals 6d6 bludgeoning and slashing damage if it’s an analog weapon or 3d8 electricity damage if it’s a powered weapon, and it gains the stunned critical effect (rather than staggered). Additionally, you can grant the junksword one of the following weapon fusions: dispelling, entangling, ghost killer, merciful, or spellthrower.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2","WtchW 2"),
      spellTitle = "Jury-Rig",
      spellPreviewDescription = "You can use magic to temporarily fix an object.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one broken object of up to 1 bulk/level",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "You can use magic to temporarily fix an object. This spell doesn’t restore Hit Points to an object; instead, it temporarily negates the broken condition, allowing the object to function normally. During the spell’s duration, the object’s hardness is also doubled. If parts of the object are missing, the magic temporarily substitutes for these parts. Jury-rig can temporarily fix destroyed magic items and items with charges, but these items have the exact same number of charges as when they were destroyed. Charges spent while under the effects of jury-rig are consumed as normal. Single-use consumable items (such as serums and grenades) can’t be fixed with jury-rig.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","Tchn 1"),
      spellTitle = "Keen Senses",
      spellPreviewDescription = "Target gains low-light vision and a +2 bonus to Perception checks.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "363",
      spellSourceBookFull = " Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The target gains a +2 insight bonus to Perception checks and gains low-light vision. Targets that have low-light vision double the distance they can see under the effects of this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","Tchn 2","WtchW 2"),
      spellTitle = "Knock",
      spellPreviewDescription = "Opens a locked or magically sealed door.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "363",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one door, container, or portal with an area of up to 10 sq. ft./level",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous; see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Knock opens barred, computer-sealed, locked, or stuck doors, as well as those subject to hold portal or security seal. When you complete the casting of this spell, attempt a caster level check (1d20 + your caster level) against the DC of the lock or computer seal with a +10 bonus. If successful, knock opens up to two means of closure. This spell opens secret doors (but doesn’t identify secret doors you haven’t found) as well as locked or trick-opening containers, starship doors, and similar secured entryways. It also loosens chains, shackles, or welds (provided they serve to hold something shut). If used to open a door closed with security seal, the spell doesn’t remove the seal but simply suspends its functioning for 10 minutes. In all other cases, the door does not relock itself or become stuck again on its own. Knock does not raise barred gates or similar impediments (such as a force field barrier) or open any door or container larger than the spell’s area, nor does it affect ropes, webs, and the like.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","Tchn 1"),
      spellTitle = "Know Coordinates",
      spellPreviewDescription = "Learn the exact location of one creature on the same world as you.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "137",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You learn the general location of one creature on the same planetary body as you, up to the size of a large planet, such as a gas giant. You must be able to identify the creature clearly from personal knowledge of who they are. If you and the creature you identify are not on the same planet-sized body, the spell fails. You can input the coordinates into any computer attached to an infosphere on the same planet to find general directions. If you use the Piloting skill’s navigation task to reach the coordinates, these directions make your familiarity seldom visited (DC 15) even if the area would normally be unfamiliar.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Laser Net",
      spellPreviewDescription = "Fill a chamber or hall with deadly laser beams.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "137",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "lasers in a 20-ft.-radius spread",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Reflex negates, see text",
      spellResistance = "no",
      spellDescriptionFull = "This spell creates a net of dangerous lasers between two solid points. The net can appear only if there are appropriate anchoring surfaces at both ends of the beams, such as two walls, a wall and a ceiling, or the like. Otherwise, the spell fails.\n" +
              "\n" +
              "Creatures that move through the laser net must succeed at a Reflex saving throw or take 1d6+1 fire damage per 5 feet of laser net they move through. Creatures that move no more than 5 feet in the laser net receive a +2 circumstance bonus to this saving throw, but creatures that move through more than 15 feet of the laser net in a single turn take a –2 penalty to the saving throw.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2"),
      spellTitle = "Last Gasp",
      spellPreviewDescription = "Stop a creature from suffocating.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "abjuration (air)",
      spellCastingTime = "1 reaction",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one willing creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You can cast last gasp as a reaction when a creature within range would die from suffocation. They instead begin attempting Constitution checks as though they had just run out of air (including resetting the DC of such checks to 10).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Life Bubble",
      spellPreviewDescription = "Encase targeted creatures with a shell of tolerable atmosphere.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "363",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 day/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You surround the target creatures with a constant and movable 1-inch shell of tolerable living conditions customized for each creature. This shell enables the targets to breathe freely in a variety of atmospheric conditions (including in corrosive, thick, thin, and toxic atmospheres), as well as underwater or in a vacuum. It also makes the targets immune to harmful gases and vapors, including inhaled diseases and poisons as well as spells with a harmful gaseous effect. In addition, the shell protects targets (and their equipment) from extreme temperatures (between –50° and 140° F) without having to attempt Fortitude saving throws, as well as extreme pressures.\n" +
              "\n" +
              "Life bubble doesn’t provide protection from energy damage, negative or positive energy (such as found on the Negative and Positive Energy Planes), or radiation; it also doesn’t provide the ability to see in conditions of poor visibility (such as in smoke or fog) or the ability to move or act normally in conditions that impede movement (such as underwater).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Lifting Frame",
      spellPreviewDescription = "Holographic lifting frame increases the target’s Strength modifier for carrying capacity and destroying objects.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "138",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one willing creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no",
      spellDescriptionFull = "You create a holographic lifting frame around the target to subtly reinforce the target’s musculature and posture. For the duration, the target’s Strength modifier is +5 for carrying capacity and destroying objects using Strength.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
      spellTitle = "Locate Hive",
      spellPreviewDescription = "Designate a familiar structure or starship, and know its direction and distance.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "76",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "This spell was created by formian myrmarchs to prevent workers from getting lost when sent far afield. When you cast this spell, you designate a specific building as your hive. Your hive must be a familiar structure (or starship) that you can picture clearly in your mind. You can have only one hive at a time, and designating a new hive immediately replaces any previous hive. As a full action when you're away from your hive, you can mentally focus on your hive to determine the direction and distance to your hive. If you aren't on the same plane or planetary body as your hive, this spell fails.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Logic Bomb",
      spellPreviewDescription = "Target computer deals 6d6 energy damage to the first creature that tries and fails to use it.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "364",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one computer system or module",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 day/level or until triggered",
      spellSavingThrow = "see text",
      spellResistance = "see text",
      spellDescriptionFull = "You infuse one computer system or module with protective energy, inuring it against attempts to access it.\n" +
              "\n" +
              "As long as this spell is in effect, the first time a creature unsuccessfully attempts to access, destroy, or manipulate the affected computer system or module (using the Computers skill or otherwise), it takes 6d6 damage (either cold, electricity, or fire damage; you choose when casting the spell, and the spell gains the appropriate descriptor). The creature can attempt a Fortitude saving throw for half damage, and spell resistance applies. This damage is in addition to any negative effects the creature suffers due to the system’s other countermeasures.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Luminous Tag",
      spellPreviewDescription = "You conjure a shining beacon that flies across the battlefield, latching onto a target in range.",
      spellSourceBookPreview = "AdvP#59",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #49: A Light in the Dark",
      spellSchool = "conjuration (light)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute",
      spellSavingThrow = "Reflex negates",
      spellResistance = "no",
      spellDescriptionFull = "You conjure a shining beacon that f ies across the battlefield, latching onto a target in range. The beacon illuminates the target with normal light. This makes it impossible for the target to gain concealment from, or hide in, areas of dim light or darkness.\n" +
              "\n" +
              "A creature within reach of the beacon can attempt to remove the beacon as a standard action by succeeding at a Strength check against the spell's DC. If the beacon is removed, it immediately vanishes.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Magic Mark",
      spellPreviewDescription = "Place a visible or invisible mark of your choosing on a creature or object.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "76",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "permanent",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You place a magical mark, about 1 square foot in size, on the target. When you create it, the mark can be visible, invisible, or invisible to everyone but you. A visible mark can be something electronically readable, such as a barcode. Those who can observe invisible things can observe an invisible mark. Any magic mark is apparent to someone using detect magic (Starfinder Core Rulebook pg. 348).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Magic Missile",
      spellPreviewDescription = "Two missiles deal 1d4+1 force damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "364",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action; see text",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to three creatures, no two of which can be more than 15 ft. apart; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You fire two missiles of magical energy that strike targets unerringly (the creatures must still be valid targets) and deal 1d4+1 damage each. You can’t target specific parts of a creature, and objects are not damaged by the spell.\n" +
              "\n" +
              "You can target a single creature or several creatures, but each missile can strike only one creature. You must designate targets before you attempt to overcome spell resistance or roll damage.\n" +
              "\n" +
              "You can cast this spell as a full action. If you do, you fire three missiles instead of two.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Magic Seal, Greater",
      spellPreviewDescription = "Place a seal in an area that interferes with creatures' ability to use magic.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "77",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 round",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius emanation centered on one creature, one unattended object or object you touch, or a point in space",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You create a seal that suppresses magic in an area, which radiates from a creature or an object and moves with that target. An unwilling target can attempt a saving throw against this spell and use its spell resistance, and the sealed area fails to manifest if either defense works. If you target a point, the effect is stationary.\n" +
              "\n" +
              "Once the field is established, each round a creature starts even partially in the area, that creature is affected as if by a magic seal spell, and can attempt a saving throw and apply its spell resistance against the effect. A creature that saves one round might be affected the next. The effect also ends on a creature that leaves the area, but the creature can be affected again if it reenters the area. In any case, a creature protected by its spell resistance can't be affected again by the same casting of this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Magic Seal",
      spellPreviewDescription = "Place a seal on a creature that interferes with its ability to use magic.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "76",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "no",
      spellDescriptionFull = "You place a seal on a creature, possibly preventing it from casting spells (including from magic items), using spell-like abilities, and using supernatural abilities that affect anything other than it. This seal has no effect on non-spell capabilities of magic items, spells already ongoing, abilities that affect only the targeted creature (such as the supernatural ability to fly), spells with a range of personal (except when that magic is then used on another), or any spells with which the creature targets only itself. While this spell lasts, the first time during any round that the targeted creature uses a restricted ability or attempts to affect a target other than itself with such magic, attempt a dispel check (11 + your caster level). This check requires neither your awareness nor presence, nor any action on your part. The DC equals 11 + the creature's caster level, or the creature's level or CR for supernatural abilities. If you succeed, the affected magic has no effect. The action the targeted creature used in the attempt is lost. This spell has no effect on artifacts or deities.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2"),
      spellTitle = "Make Mischief",
      spellPreviewDescription = "Invisible tendrils form that you can use to cause mischief.",
      spellSourceBookPreview = "AdvP#35",
      spellSourcePage = "55",
      spellSourceBookFull = "Adventure Path #35: Merchants of the Void",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "While this spell lasts, nearly invisible tendrils of energy surround you. As part of casting this spell or as a move action once per round, you can direct the energy to do one of the following:\n" +
              "\n" +
              "- Attempt a dirty trick combat maneuver as a melee attack against an adjacent creature. When attempting this melee attack, you can use your key ability score modifier in place of your Strength modifier.\n" +
              "\n" +
              "- Direct bothersome and distressing sensations against an adjacent creature. That creature must succeed at a Will save (DC = 12 + your key ability score modifier) or become flat-footed until the beginning of your next turn.\n" +
              "\n" +
              "- Grant you concealment until the start of your next turn.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","Tchn 2","WtchW 2"),
      spellTitle = "Make Whole",
      spellPreviewDescription = "Restore 5d6 Hit Points to an object or construct.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "364",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "10 minutes",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one object of up to 1 bulk/level or one construct of any size",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "This spell functions as mending, except it restores 5d6 Hit Points when cast on an object or construct creature.\n" +
              "\n" +
              "Make whole can fix destroyed magic items, and it restores the magic properties of the item if your technomancer level is at least twice the item’s level. Items with charges (such as batteries) and single-use items (such as potions and grenades) can’t be repaired in this way. When you cast make whole on a construct, the spell bypasses any immunity to magic as if the spell did not allow spell resistance.\n" +
              "\n" +
              "(Mending: This spell repairs damaged objects and constructs, restoring 1d4 Hit Points. If the object has the broken condition, this condition is removed if the object is restored to at least half its original Hit Points. All of the pieces of an object must be present for this spell to function. A construct can benefit from this spell only once per day. Magic items can be repaired by this spell, but magic items that are destroyed don’t have their magic abilities restored. This spell doesn’t reverse effects that warp or otherwise transmute items, but it can still repair damage dealt to such items.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Manipulate Tech",
      spellPreviewDescription = "Operate a weapon or technological item from a distance.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "138",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one piece of unattended technology; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no (harmless)",
      spellDescriptionFull = "You can briefly align your will to the circuitry or structure of an unattended technological weapon or a technological item with a usage entry, provided the target has an item level equal to or lower than your caster level + 3. The target can even have the broken condition. When you do so, you can cause the item to act as if you activated it without moving it from its space. If the target is a weapon, you can cause it to fire or activate for the rest of your turn. Then, you can make one attack against a creature in range using your ranged attack bonus plus your Intelligence modifier or your melee attack bonus plus your Intelligence modifier, whichever is applicable for the weapon you activate. If the target is a technological item with a usage entry, the item activates for the time listed in that usage entry. This spell provides any charges or ammunition used by your activation.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 0","Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Prcg 0","Tchn 0"),
      spellTitle = "Measure",
      spellPreviewDescription = "Learn the measurements of creatures and objects in an area.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "77",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "",
      spellArea = "cone-shaped emanation",
      spellEffect = "",
      spellDuration = "concentration, up to 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You learn the approximate measurements (length, width, depth, height, mass) of creatures and objects you can observe in the area. If an object or creature extends out of the area, you learn only the measurements within the area but nothing about what you can't observe. For example, you can't determine the thickness or weight of a wall you can observe only one side of or the depth of water that extends beyond the spell's range. Each round you concentrate on the same area, you can learn the exact measurements of one creature or object in the area, including imprecisions or anomalies that might indicate structural weakness. A target magically altered to appear different than what you observe still gives you accurate measurements when you concentrate on it. Such anomalies might provide clues that other skills can help decipher, such as Engineering to determine if a structure can support your weight. Magical traps incorporate wards that thwart this spell, giving you information that reflects what you observe rather than accurate measurements. A force field blocks this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Megavitamin",
      spellPreviewDescription = "Create a small number of nutritional supplements.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "138",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "",
      spellArea = "",
      spellEffect = "2d4 vitamins",
      spellDuration = "24 hours",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You create 2d4 powerful vitamins. One of these supplements meets its eater’s food needs for 24 hours and causes the eater to regain 1 Hit Point. A creature can regain no more than 8 Hit Points from any megavitamin spell in a 24-hour period.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Memory Lapse",
      spellPreviewDescription = "You inspire a moment of confusion that causes a creature to forget what occurred over the last round if it fails its saving throw.",
      spellSourceBookPreview = "AdvP#25",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #25: The Chimera Mystery",
      spellSchool = "enchantment (mind-affecting)",
      spellCastingTime = "1 move action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You inspire a moment of confusion that causes a creature to forget what occurred over the last round if it fails its saving throw. If you have failed a skill check against that target since the beginning of your last turn, you can attempt that check again without a penalty (if you have the appropriate number of actions remaining), or simply avoid the normal consequences of that failed skill check. If the target was in the middle of a task that requires longer than a single round to accomplish, it must begin again. If you target a creature casting a spell with a casting time of 1 round or longer, they must attempt a second Will save to continue casting the spell or the spell fails.\n" +
              "\n" +
              "A creature you have injured in the last hour gains a +4 circumstance bonus to its Will saving throw.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4"),
      spellTitle = "Memory Prism",
      spellPreviewDescription = "You copy one memory you have and cause it to crystallize into a small prism of negligible bulk.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "123",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "24 hours (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You copy one memory you have and cause it to crystallize into a small prism of negligible bulk. The memory can’t exceed 10 minutes in length, and the spell doesn’t work on memories that have been removed (such as with displace memory) or that you know have been magically altered (such as with modify memory). For the spell’s duration, any creature touching the crystal can observe the memory as if with share memory, though they witness 1 minute of memory per round spent reviewing the crystal’s contents.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4"),
      spellClassesWithLevelPreview = listOf("Myst 4"),
      spellTitle = "Displace Memory",
      spellPreviewDescription = "You deposit a memory into a small object",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "134",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "one object of negligible bulk",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none (object)",
      spellResistance = "no (object)",
      spellDescriptionFull = "You move one of your memories into the target object. You can select up to 5 minutes of continuous memory, or you can select every memory associated with one person, place, or object you name when you cast this spell. If you select continuous memory, you lose those memories, and if you try to recall them, you remember a blank gap instead of any details. If you select a person, place, or object, you remember events related to that thing, but not the presence or details of the thing you named.\n" +
              "\n" +
              "For example, if after a visit with your sister to a specific world you use this spell to forget that world, you remember traveling with your sister, but you forget where you went. Alternatively, if you used this spell to forget your sister, you remember going somewhere with someone, but not who was with you.\n" +
              "\n" +
              "Anyone touching the object into which you placed your memories can recall those memories by speaking a command word that you designate at the time of casting. Alternatively, you can designate no command word so that no one can recall the memories when touching the object. If the object is destroyed, the memories placed within return to you.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Mending",
      spellPreviewDescription = "Restore 1d4 Hit Points to an object or construct.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "364",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "10 minutes",
      spellRange = "10 ft.",
      spellTargets = "one object of up to 1 bulk or one construct of up to Medium size",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "This spell repairs damaged objects and constructs, restoring 1d4 Hit Points. If the object has the broken condition, this condition is removed if the object is restored to at least half its original Hit Points. All of the pieces of an object must be present for this spell to function. A construct can benefit from this spell only once per day. Magic items can be repaired by this spell, but magic items that are destroyed don’t have their magic abilities restored. This spell doesn’t reverse effects that warp or otherwise transmute items, but it can still repair damage dealt to such items.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3"),
      spellTitle = "Mental Block",
      spellPreviewDescription = "Cause creatures to forget how to use their feats and abilities",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "206",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "enchantment (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates; see text",
      spellResistance = "yes",
      spellDescriptionFull = "You cause targets of this spell to lose access to their procedural memory, preventing them from using any feat, extraordinary ability, spell, spell-like ability, or supernatural ability that requires an action of any kind. Each round at the end a target’s turn, that target can attempt another Will save to end this effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Mental Muscle, Greater",
      spellPreviewDescription = "You channel your mental mastery as magic that directly reinforces your body, allowing you to perform brief physical feats as acts of willpower.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "63",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/2 levels",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "This spell functions as mental muscle, except as noted above. Casting this spell takes intense focus and requires you to spend 1 Resolve Point.\n" +
        "\n" +
        "(Mental Muscle: You channel your mental mastery as magic that directly reinforces your body, allowing you to perform brief physical feats as acts of willpower. You gain one of the following three benefits of your choice.\n" +
              "\n" +
              "Smart Strength: You apply your Intelligence modifier in place of your Strength modifier for melee or thrown weapon attack rolls, melee damage rolls, ability checks, and skill checks.\n" +
              "\n" +
              "Insightful Agility: You apply your Wisdom modifier in place of your Dexterity modifier for attack rolls, Reflex saving throws, initiative checks, and calculating your Armor Class. Your armor’s maximum Dex bonus instead limits how much of your Wisdom modifier you can apply to AC.\n" +
              "\n" +
              "Confident Endurance: You apply your Charisma modifier in place of your Constitution modifier for Fortitude saving throws. You gain temporary Hit Points equal to your Charisma modifier × half your caster level.\n" +
              "\n" +
              "When you perform a full action, you can cast this spell as part of that action (and apply the spell’s effects to that action) rather than casting it as a swift action.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","Tchn 2","WtchW 2"),
      spellTitle = "Mental Muscle",
      spellPreviewDescription = "You channel your mental mastery as magic that directly reinforces your body, allowing you to perform brief physical feats as acts of willpower.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "63",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "transmutation",
      spellCastingTime = "1 swift action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You channel your mental mastery as magic that directly reinforces your body, allowing you to perform brief physical feats as acts of willpower. You gain one of the following three benefits of your choice.\n" +
              "\n" +
              "Smart Strength: You apply your Intelligence modifier in place of your Strength modifier for melee or thrown weapon attack rolls, melee damage rolls, ability checks, and skill checks.\n" +
              "\n" +
              "Insightful Agility: You apply your Wisdom modifier in place of your Dexterity modifier for attack rolls, Reflex saving throws, initiative checks, and calculating your Armor Class. Your armor’s maximum Dex bonus instead limits how much of your Wisdom modifier you can apply to AC.\n" +
              "\n" +
              "Confident Endurance: You apply your Charisma modifier in place of your Constitution modifier for Fortitude saving throws. You gain temporary Hit Points equal to your Charisma modifier × half your caster level.\n" +
              "\n" +
              "When you perform a full action, you can cast this spell as part of that action (and apply the spell’s effects to that action) rather than casting it as a swift action.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Mental Silence",
      spellPreviewDescription = "You create an anti-telepathic field around yourself.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "22",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "30-foot-radius spread centered on you",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You create an anti-telepathic field around yourself. A creature within the area attempting to communicate or gain information using telepathy or limited telepathy, or attempting to cast the spells detect thoughts, mind link, mind probe, telepathic bond, telepathic message, or telepathy—or abilities that work as those spells, such as the mindlink and telepathic bond mystic class features—must succeed at a caster level check (DC = 15 + your caster level). On a failure, the effect targeting you fails.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2"),
      spellClassesWithLevelPreview = listOf("Myst 2"),
      spellTitle = "Merge Consciousness",
      spellPreviewDescription = "You merge your consciousness with one touched creature, sharing your strengths and compensating for each other's weaknesses.",
      spellSourceBookPreview = "AdvP#29",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #29: The Cradle Infestation",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "touch (see text)",
      spellTargets = "you and one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You merge your consciousness with one touched creature, sharing your strengths and compensating for each other's weaknesses. For the duration of the spell, the targets can communicate by telepathy to a range of 30 feet; if either has telepathy from another source, they may both use that range instead. As long as the targets are within this telepathy range, they share the higher of their two saving throw modifiers against mind-affecting effects and have a +2 enhancement bonus against fear effects.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3","WtchW 3"),
      spellTitle = "Meticulous Match",
      spellPreviewDescription = "You compare two similar items and know if they are identical to one another or not.",
      spellSourceBookPreview = "AdvP#25",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #25: The Chimera Mystery",
      spellSchool = "divination",
      spellCastingTime = "10 minutes",
      spellRange = "touch",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "",
      spellSavingThrow = "Fort negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "You compare two similar items and know if they are identical to one another or not. The spell can indicate an identical match, a categorical match, or no match. For instance, blood samples are identical if they are from the same creature. They are categorical if they are from the same species. No match exists if the blood samples are from different species or if one sample is stage blood.\n" +
              "\n" +
              "Alternatively, you can compare dissimilar items and know if they have a potential relationship. For instance, you can compare a creature’s tooth against a bite mark and know whether that creature could have caused the bite mark. This spell is fallible. An identical match can result from comparing items that are duplicates of one another. For instance, a knife might have an identical match with a stab wound if an identical knife was used to inflict the wound. Identical twins might have identical blood or tissues.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Miasma",
      spellPreviewDescription = "Create air that sickens those who breathe it.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "138",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration (creation, poison)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "30-ft.-radius spread",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude partial; see text",
      spellResistance = "no",
      spellDescriptionFull = "You turn the atmosphere in your immediate area into a hazy, green miasma that does not flow like normal air. It instead remains in its area for the duration and penetrates armor environmental protections. Creatures within the miasma have concealment against attackers. A creature that breathes in the miasma must attempt a Fortitude saving throw. On a failure, the creature is nauseated while it remains in the area and is sickened for a number of rounds equal to your caster level once it leaves the area. If the creature succeeds at its saving throw, it is instead sickened while in the spell’s area and unaffected after leaving that area. If a creature leaves the spell’s area but reenters it, the creature must attempt a new saving throw.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Microbot Assault",
      spellPreviewDescription = "Cloud of tiny robots harasses creatures within it.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "364",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "distracting cloud of microbots",
      spellDuration = "concentration + 1 round",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You pull latent technological energy from the air to form a cloud of fist-sized hindering microbots that fill an area you designate. The microbots begin in a 10-foot-square area when you create them, and you can create the cloud so that it shares the space of other creatures. If no creatures are within the cloud’s area, the microbots pursue and harass the nearest creature that is hostile to you as best they can each round. Although the microbots generally know which creatures are your enemies, you have no control over their targets or direction of travel. If there are multiple valid targets the microbots can harass, the cloud will split into a maximum of four 5-foot-square segments and pursue different targets.\n" +
              "\n" +
              "The cloud (and any segments thereof) has a fly speed of 20 feet. Each round on your turn, the microbot cloud grants harrying fire (see page 247) against the foes in its spaces. In addition, the cloud grants covering fire (see page 246) to anyone attacked by foes in its spaces. The microbots constantly repair themselves and the cloud generates new microbots every few seconds, so any attack against them is essentially ineffective.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Might of the Ellicoth",
      spellPreviewDescription = "Increase the amount of bulk a creature can carry",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "206",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "24 hours",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "With a touch, you cause a surge of power to flow through the target’s slow-twitch muscle fiber (or its equivalent physiology if it has no muscle fibers), increasing the amount of bulk the creature can carry by 3.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3"),
      spellTitle = "Mind of Three",
      spellPreviewDescription = "You split your mind, retaining your normal consciousness but gaining two other personas.",
      spellSourceBookPreview = "AdvP#22",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #22: The Forever Reliquary",
      spellSchool = "enchantment (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You split your mind, retaining your normal consciousness but gaining two other personas. These personas are nearly identical to your original personality, but each emphasize a different aspect of your personality. Your divided personas are aware of and can psychically communicate with one another, allowing them to coordinate their efforts and assist each other. At any point during the spell’s duration, you can focus a persona on assisting with a task, granting you one of the following abilities. A persona granting one of these abilities doesn’t take an action, but it causes that persona to merge with your normal consciousness, disappearing. When the two additional personas are reintegrated, the spell ends.\n" +
              "\n" +
              "-When you fail a saving throw against a mind-affecting effect, you can compartmentalize it within one persona. If you do so, you are unaffected.\n" +
              "\n" +
              "-When you fail an Intelligence-, Wisdom-, or Charisma-based skill check, you can reroll it.\n" +
              "\n" +
              "-When you fail a caster level check, you can reroll it.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4"),
      spellTitle = "Mind Probe",
      spellPreviewDescription = "Potentially access a target creature’s memories and its knowledge.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "365",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 minute",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You gain access to the target’s memories and knowledge, and you can pry the information you want from them involuntarily.\n" +
              "\n" +
              "You can attempt to learn the answer to one question of your choice per round; after each question, the target can attempt a Will saving throw to end the spell. If it fails, the creature can attempt a Bluff check with a DC equal to 11 + your Sense Motive modifier. If it fails its Bluff check, you gain the answer you desire. If it succeeds at its check, you gain no information. If it succeeds by 5 or more, it answers however it chooses and you believe that wrong answer to be the truth. Your questions are purely telepathic inquiries, and the answers to those questions are imparted directly into your mind. You and the target don’t need to speak the same language, though less intelligent creatures may yield up only appropriate sensory images in answer to your questions.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6"),
      spellClassesWithLevelPreview = listOf("Myst 6"),
      spellTitle = "Mind Swap",
      spellPreviewDescription = "Swap your mind with the target",
      spellSourceBookPreview = "Alien#3",
      spellSourcePage = "137",
      spellSourceBookFull = "Alien Archive 3",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 round",
      spellRange = "medium",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "Your mind moves into the target’s body, and its mind moves into yours. You do not need line of sight or line of effect to the target if you know its location. Each target gains the mind-swapped template graft. You can maintain the swap at any range on the same plane. You can shift back to your body as a standard action, and doing so ends the spell. If your new body is killed, you return to your body and the target dies. If your body is killed, you can remain in the host’s body for the duration or until it is killed. Then, you die if your body is still dead. However, if you recast this spell, you can reset the duration you remain in the target’s body. You can cast this spell from a body that is not your own, swapping minds with a new target and resetting the spell’s duration. However, you can return only to your body.\n" +
              "\n" +
              "If a creature saves against your casting of this spell, it is immune to your casting of this spell for 24 hours.\n" +
              "\n" +
              "Mind-Swapped:\n" +
              "Traits: Each creature gains the other’s mental ability scores (Intelligence, Wisdom, Charisma), trained capabilities (class features, proficiencies, saving throw bonuses, skills, spellcasting), languages, and mental powers, such as spell-like and supernatural abilities. A creature retains any senses based on other abilities it retains. The effectiveness of retained abilities is based on the creature’s original level or CR. Each target also retains its Hit Points and Stamina Points. A creature in an unfamiliar body gains the following trait.\n" +
              "\n" +
              "Awkward (Ex): The creature takes a –4 penalty to attack rolls and Strength- and Dexterity-based skill checks. Every 24 hours the mind swap continues, a creature that has this trait can attempt a Will saving throw with a DC equal to that of the effect that created the mind swap. On a success, this trait fades away, along with its mechanical limitations.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Mindlink",
      spellPreviewDescription = "Instantly and telepathically communicate information to a creature.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "365",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You link your mind to that of a touched creature to swiftly communicate a large amount of complex information in an instant. You decide what the target learns, limited to any amount of information that otherwise could be communicated in 10 minutes. This information comes in a series of visual images and emotional sensations, and it isn’t language dependent.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Minibot Messenger",
      spellPreviewDescription = "You conjure a miniature messenger robot that appears in your space.",
      spellSourceBookPreview = "Ports",
      spellSourcePage = "83",
      spellSourceBookFull = "Ports of Call",
      spellSchool = "conjuration (summoning)",
      spellCastingTime = "1 standard action",
      spellRange = "",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You conjure a miniature messenger robot that appears in your space. The robot is a Tiny construct with the technological subtype. Its KAC and EAC are each equal to 10 + your caster level, it uses your saving throw modifiers, it has the evasion ability of a 2nd-level operative, and it has a number of Hit Points equal to your caster level. It has a 30-foot land speed, a 30-foot fly speed with average maneuverability, and a Perception bonus equal to your caster level.\n" +
              "\n" +
              "Until given instructions, the robot remains in your space, either following you or perching on you. As a move action, you can command the robot to deliver a message or deliver an object to a place or creature of your choice. Once commanded, and each round thereafter, the robot performs two move actions to travel toward the intended target. The robot seeks the recipient based on your simple instructions and its own senses, and if it can’t find the recipient, it tries to return before the end of the spell’s duration to report its failure.\n" +
              "\n" +
              "Upon arriving, it plays back the message audibly (though you can choose for the robot to communicate via displayed text or sign language) or presents the object (which the recipient can take from the robot with a free hand without spending an action). The robot then lingers for 1 round, either recording a response of 10 words or less or accepting an item from the recipient, after which the robot travels back toward you and delivers that message or item. A message must be 10 words or less, though for every additional move action you spend instructing the robot, you can increase the message length by 3 words or by a number of words equal to your Intelligence modifier, whichever is greater. The robot can carry only an item of light bulk or negligible bulk.\n" +
              "\n" +
              "1st: The robot travels a maximum distance from you equal to 100 feet plus 10 feet per caster level. Once it returns to you, the spell ends.\n" +
              "\n" +
              "2nd: The robot travels a maximum distance from you equal to 1,000 feet plus 100 feet per caster level. The spell doesn’t automatically end when the robot returns to you; you can command the robot to make a number of deliveries equal to 1 + 1 for every 4 caster levels you have before the spell ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 9"),
      spellClassesWithLevelPreview = listOf("Myst -"),
      spellTitle = "Miracle",
      spellPreviewDescription = "Alter reality to better suit you.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "366",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "see text",
      spellTargets = "see text",
      spellArea = "see text",
      spellEffect = "see text",
      spellDuration = "see text",
      spellSavingThrow = "see text",
      spellResistance = "yes",
      spellDescriptionFull = "When you cast miracle, you state what you would like to have happen and request that the power to which you are connected intercede. A request that is out of line with the power’s nature is refused. A miracle can do any of the following things.\n" +
              "\n" +
              "-Duplicate any mystic spell of 6th level or lower.\n" +
              "\n" +
              "-Duplicate any other spell of 5th level or lower.\n" +
              "\n" +
              "-Undo the harmful effects of certain spells, such as feeblemind.\n" +
              "\n" +
              "-Produce any effect whose power level is in line with the above effects.\n" +
              "\n" +
              "At the GM’s discretion, you may try to use a miracle to produce greater effects than these, but doing so may be dangerous or the spell may have only a partial effect.\n" +
              "\n" +
              "A duplicated spell allows saving throws and spell resistance as normal, but the save DCs are the same as for a 7th-level spell. For the purpose of other effects that depend on spell level, miracle counts as a 9th-level spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","Tchn 2","WtchW 2"),
      spellTitle = "Mirror Image",
      spellPreviewDescription = "Create decoy duplicates of yourself.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "366",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "This spell creates a number of illusory doubles of you that inhabit your square. These doubles make it difficult for enemies to precisely locate and attack you.\n" +
              "\n" +
              "When you cast mirror image, it creates 1d4 figment images. These images remain in your space and move with you, mimicking your movements, sounds, and actions exactly. Whenever you are attacked or are the target of a spell that requires an attack roll, there is a possibility that the attack targets one of your images instead. If the attack hits, roll randomly to see whether the selected target is real or a figment. If it is a figment, the figment is destroyed. If the attack misses by 5 or less, one of your figments is destroyed by the near miss, and an attack that misses you due to a miss chance also destroys an image. Area spells and effects that don’t require an attack roll affect you normally and don’t destroy any of your figments. Spells with a range of touch are harmlessly discharged if used to destroy a figment.\n" +
              "\n" +
              "An attacker must be able to see the figments to be fooled. If you are invisible or the attacker is blind, the spell has no effect. Blindsense doesn’t help distinguish the figments from the real you, but blindsight is sufficient to do so.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0","WtchW 0"),
      spellTitle = "Misfire",
      spellPreviewDescription = "Cause an item to fail to function.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "77",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one object that uses batteries or ammunition, is of no more than 3 bulk, and has an item level lower than the caster's level",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour",
      spellSavingThrow = "Will negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "The next time the targeted object is used in a way that consumes charges or ammo, the device fails to work. A weapon fails to fire or operate, or a technological device doesn't respond to its activation. This spell ends once it prevents the targeted object from working that one time. An object can be the target of this spell only once every 24 hours.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","Tchn 5","WtchW 5"),
      spellTitle = "Mislead",
      spellPreviewDescription = "Make yourself invisible and create an illusory double of your likeness.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "366",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "personal; see text",
      spellTargets = "",
      spellArea = "",
      spellEffect = "one illusory double",
      spellDuration = "1 round/level (D) and concentration + 3 rounds; see text",
      spellSavingThrow = "none or Will disbelief, see text",
      spellResistance = "no",
      spellDescriptionFull = "You become invisible (as greater invisibility), and at the same time, a figment double of you (as per a 3rd-level casting of holographic image) appears. The double appears within close range (25 feet + 5 feet/2 levels) but thereafter moves as you direct it (which requires concentration beginning on the first round after the casting). You can make the figment appear superimposed perfectly over your own body so that observers don’t notice an image appearing and you turning invisible. You and the figment can then move in different directions. The double moves at your speed and can talk and gesture as if it were real, but it can’t attack or cast spells, though it can pretend to do so.\n" +
              "\n" +
              "The illusory double lasts as long as you concentrate upon it plus 3 additional rounds. After you cease concentration, the illusory double continues to carry out the same activity until the duration expires. The invisibility lasts for 1 round per level, regardless of concentration.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","WtchW 5"),
      spellTitle = "Modify Memory",
      spellPreviewDescription = "Change 5 minutes of target’s memories.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "366",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 round; see text",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "permanent",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You reach into the target’s mind and modify up to 5 minutes of its memories in one of the following ways.\n" +
              "\n" +
              "-Eliminate all memory of an event the target actually experienced. This spell cannot negate charm person, suggestion, or similar spells.\n" +
              "\n" +
              "-Allow the target to recall with perfect clarity an event it actually experienced.\n" +
              "\n" +
              "-Change the details of an event the target actually experienced.\n" +
              "\n" +
              "-Implant a memory of an event the target never experienced.\n" +
              "\n" +
              "Casting the spell takes 1 round. If the target fails its saving throw, you proceed with the spell by spending as much as 5 minutes (a period of time equal to the amount of memory you want to modify) visualizing the memory you wish to modify in the target. If your concentration is disturbed before the visualization is complete, or if the target moves beyond the spell’s range at any point during this time, the spell fails.\n" +
              "\n" +
              "A modified memory does not necessarily affect the target’s actions, particularly if it contradicts the creature’s natural inclinations. An illogical modified memory is usually dismissed as a bad dream, a hallucination, or another similar excuse.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Prcg 4","WtchW 4"),
      spellTitle = "Modify Outcome",
      spellPreviewDescription = "You peer across the multiverse at the possible outcomes for this timeline, watching fate branch outward.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "156",
      spellSourceBookFull = "Near Space",
      spellSchool = "divination",
      spellCastingTime = "1 reaction",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one ally",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "no",
      spellDescriptionFull = "You peer across the multiverse at the possible outcomes for this timeline, watching fate branch outward. When an ally within range fails an attack roll, skill check, saving throw, or ability check, you can spend 1 Resolve Point to attempt to shift their reality to one where they succeed instead. That ally can immediately reroll the failed check. A creature can’t benefit from this spell again until they take a 10-minute rest to recover Stamina Points.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","Tchn 1","WtchW 1"),
      spellTitle = "Modulate Frequency",
      spellPreviewDescription = "Modify the sounds emitted by an object or creature.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "77",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one object or creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "At dire risk from certain sonic frequencies, a conclave of quorlu mystics devised the modulate frequency spell, which enables you to change the frequencies of the sounds emitted by the target object or creature. For the duration of the spell, the sounds emitted by the target object or creature can be manipulated along the full sound spectrum, including extremely high and low frequencies that can't be sensed by some species. The modulate frequency spell can distort the voice of a targeted creature, imposing a –5 penalty to checks attempted to identify the target's voice, and such identification can succeed only by relying on speech patterns, distinguishing phrases, and other idiosyncrasies of the target's speech rather than the sound of their voice itself. Voice commands uttered by the target creature can thus be made indecipherable to constructs and electronic devices.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Mystic Cure, Mass",
      spellPreviewDescription = "Restore 3d8/ 5d8 + your Wisdom modifier Hit Points to one living creature per level.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "367",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels); see text",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will half (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You restore a number of Hit Points to a number of targets. Choose one of these targets within 10 feet of you; if that target regains all of its Hit Points as a result of this healing, you can apply the remaining healing to yourself, as long as you are a living creature. On the other hand, if this isn’t enough to restore all of that target’s Hit Points, you can transfer any number of your own Hit Points to that target, healing the target that amount. You can’t transfer more Hit Points than you have or more Hit Points than the target is missing.\n" +
              "\n" +
              "The number of Hit Points mass mystic cure restores to each target depends on the spell’s level.\n" +
              "\n" +
              "5th: 3d8 + your Wisdom modifier\n" +
              "\n" +
              "6th: 5d8 + your Wisdom modifier",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Tchn 6"),
      spellTitle = "Mystical Aegis, Greater",
      spellPreviewDescription = "Grant a creature a barrier against magic effects as well as the benefits of a death ward spell.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "78",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level or until discharged",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as mystical aegis, but it provides the benefits of a death ward spell and has 100 temporary Hit Points.\n" +
        "\n" +
        "(Mystical Aegis: You grant the target a barrier that deflects magic and absorbs supernatural damage. While it lasts, the barrier grants the target a +2 morale bonus to saving throws against spells, spell-like abilities, and supernatural abilities. While protected, the target takes half damage from these sources as well as half damage from the attacks of summoned creatures. If the target succeeds at a save against a spell that normally has a partial effect on a successful save, the spell instead has no effect on the target.\n" +
              "\n" +
              "This barrier also grants the target 45 temporary Hit Points. These temporary Hit Points deplete when the target takes damage from a spell, spell-like ability, supernatural ability, or a summoned creature. Any other damage is applied to Stamina and Hit Points as normal. When the barrier's temporary Hit Points drop to 0, the spell is discharged.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Tchn 5"),
      spellTitle = "Mystical Aegis, Mass",
      spellPreviewDescription = "Grant multiple creatures a barrier against magic effects.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "78",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature per 3 levels within range",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as mystical aegis except as noted above.\n" +
              "\n" +
              "(Mystical Aegis: You grant the target a barrier that deflects magic and absorbs supernatural damage. While it lasts, the barrier grants the target a +2 morale bonus to saving throws against spells, spell-like abilities, and supernatural abilities. While protected, the target takes half damage from these sources as well as half damage from the attacks of summoned creatures. If the target succeeds at a save against a spell that normally has a partial effect on a successful save, the spell instead has no effect on the target.\n" +
              "\n" +
              "This barrier also grants the target 45 temporary Hit Points. These temporary Hit Points deplete when the target takes damage from a spell, spell-like ability, supernatural ability, or a summoned creature. Any other damage is applied to Stamina and Hit Points as normal. When the barrier's temporary Hit Points drop to 0, the spell is discharged.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4"),
      spellTitle = "Mystical Aegis",
      spellPreviewDescription = "Grant a creature a barrier against magic effects.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "78",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level or until discharged",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You grant the target a barrier that deflects magic and absorbs supernatural damage. While it lasts, the barrier grants the target a +2 morale bonus to saving throws against spells, spell-like abilities, and supernatural abilities. While protected, the target takes half damage from these sources as well as half damage from the attacks of summoned creatures. If the target succeeds at a save against a spell that normally has a partial effect on a successful save, the spell instead has no effect on the target.\n" +
              "\n" +
              "This barrier also grants the target 45 temporary Hit Points. These temporary Hit Points deplete when the target takes damage from a spell, spell-like ability, supernatural ability, or a summoned creature. Any other damage is applied to Stamina and Hit Points as normal. When the barrier's temporary Hit Points drop to 0, the spell is discharged.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Nanite Form",
      spellPreviewDescription = "Target becomes a cloud of floating nanites.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "138",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one willing creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "The target and its gear are transformed into a cloud of nanites that fills a 5-foot cube. This cloud of nanites cannot attack or cast spells, but it has construct immunities and all-around vision; can’t be entangled, flanked, flat-footed, off-kilter, off-target, pinned, prone, or staggered; and has immunity to critical hits. It takes only half damage from any effect that targets only one creature. Automatic fire must hit the target as if it were three targets to deal it damage. In addition, the target loses its land speed and gains a fly speed of 20 feet (perfect maneuverability). It can move through openings 1 inch wide without squeezing, and it can squeeze to move through microscopic openings.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1"),
      spellTitle = "Necromantic Revitalization",
      spellPreviewDescription = "Restore hit points to an undead creature",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "206",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one undead creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will half (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "With a touch, you replenish the negative energies that animate your target, restoring a number of Hit Points. If the target regains all of its Hit Points as a result of this healing, you can apply the remaining healing to yourself, as long as you are an undead creature.\n" +
              "\n" +
              "Necromantic revitalization restores a number of Hit Points to your target depending on the spell’s level.\n" +
              "\n" +
              "1st: 1d8 + your Intelligence modifier\n" +
              "\n" +
              "2nd: 3d8 + your Intelligence modifier\n" +
              "\n" +
              "3rd: 5d8 + your Intelligence modifier\n" +
              "\n" +
              "4th: 7d8 + your Intelligence modifier\n" +
              "\n" +
              "5th: 9d8 + your Intelligence modifier\n" +
              "\n" +
              "6th: 11d8 + your Intelligence modifier\n" +
              "\n" +
              "In addition, unlike with most healing, when you cast necromantic revitalization as a spell of 4th level or higher, you have two options to enhance its effects. The first option is to restore an extra 5d8 Hit Points with a 4th-level necromantic revitalization spell, an extra 7d8 Hit Points with a 5th-level necromantic revitalization spell, or an extra 9d8 Hit Points with a 6th-level necromantic revitalization spell. The second option is to restore a target that was destroyed within the past 2 rounds, bringing it back to its undead state with the number of Hit Points that would otherwise be restored by this spell. This spell can’t reanimate creatures that were destroyed by effects that specifically target or have a special effect against the undead (such as wall of fire) or creatures whose bodies were significantly mutilated, disintegrated, or otherwise obliterated. It also cannot restore an undead creature whose existence is tied to an object (such as a necrovite’s electroencephalon) if that object has been destroyed.\n" +
              "\n" +
              "Casting this spell doesn’t provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Negate Spell",
      spellPreviewDescription = "Negate a spell being cast that's 3rd level or lower.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "78",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 reaction",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one spell",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You interpose your will between the casting of a spell and the magical energies powering that spell, preventing it from manifesting in this reality. As a reaction when you observe a spell that's 3rd level or lower and being cast within range, you can cast this spell. If you do, you can attempt a dispel check (1d20 + your caster level). The DC equals 11 + the other spellcaster's caster level. If you succeed, the spell fails and has no effect. This spell has no effect on artifacts or deities.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3"),
      spellTitle = "Nightmare",
      spellPreviewDescription = "Send a terrible nightmare to a distant target.",
      spellSourceBookPreview = "AdvP#10",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #10: The Diaspora Strain",
      spellSchool = "illusion (mind-affecting)",
      spellCastingTime = "10 minutes",
      spellRange = "plane",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You precisely identify a target, such as by name or via a material connection like a personal possession or lock of its hair. The spell fails without expending a spell slot if the target isn’t asleep or in a resting state similar to sleep. If you’ve never met the target in person and lack a material connection to the target, the target gains a +5 bonus to the saving throw. If the spell works, the target remains resting for 1 minute, then has a nightmare, rouses, and becomes frightened for 2d6 rounds. The target can’t willingly reenter the affected resting state for 1 hour. To do so after this time has elapsed, the target must succeed at the saving throw again. If this save fails, the target can try again once per hour thereafter. After 24 hours have passed, this restless state ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Nondetection",
      spellPreviewDescription = "Hide target from divination and surveillance.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "367",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "Will negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "The warded creature or object becomes difficult to detect by divination spells such as clairaudience/clairvoyance and spells with the word “detect” in their names. Nondetection also prevents location by magic items such as crystal balls and technological items such as cameras and surveillance systems. Casting this spell places significant stress on you, and requires you to spend 1 Resolve Point.\n" +
              "\n" +
              "If a magic divination is attempted against the warded creature or item, the caster of the divination must succeed at a caster level check (1d20 + caster level) against a DC equal to 11 + your caster level. If surveillance is attempted with remote cameras or sensors, the viewer must succeed at a Perception check against a DC equal to 11 + your caster level to see the target. If you cast nondetection on yourself or on an item currently in your possession, the DC for each these checks is equal to 15 + your caster level. If cast on a creature, nondetection wards the creature’s gear as well as the creature itself.\n" +
              "\n" +
              "Nondetection protects the target only from discovery by items and remote sensors, not by creatures. A camera mounted to a wall and monitored from a security booth is subject to nondetection, but a camera in a creature (including constructs) is not.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
      spellTitle = "Novelty Obsession",
      spellPreviewDescription = "You instill in the target an overwhelming obsession for new experiences.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You instill in the target an overwhelming obsession for new experiences. Whenever the affected creature attacks with the same weapon, casts the same spell, performs the same skill task, or takes the same full action 2 turns in a row, they become sickened until the end of their next turn. A target that’s sickened by this spell while already under the sickened effect due to this spell also becomes staggered until the end of their next turn.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Obfuscate Drift Beacons",
      spellPreviewDescription = "You obscure the Drift beacons in your current star system, making it more difficult to travel to that system.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "123",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "transmutation",
      spellCastingTime = "1 hour",
      spellRange = "system-wide",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 day/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You obscure the Drift beacons in your current star system, making it more difficult to travel to that system. For the duration of the spell, the system takes 2d6 additional days to reach for the purposes of Drift travel to that system. This addition is factored in before dividing the result by a Drift engine’s rating, and a system can be affected by only one casting of this spell at a time.\n" +
              "\n" +
              "This spell has no effect if cast while not in a star system or while within the Drift, and it doesn’t increase the time it takes to travel to Absalom Station.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0"),
      spellTitle = "Omnitool",
      spellPreviewDescription = "Create tools needed for Engineering checks.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "78",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one object of negligible bulk, or 5 UPBs",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "While you hold the touched object, it transmutes into tools you need for Engineering checks. This tool provides no bonuses to Engineering checks, but it prevents you from taking a penalty for lacking a tool. If the transmuted object leaves your grasp, it reverts to normal.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Optimize Technology",
      spellPreviewDescription = "Protect a vehicle, or technological device from environmental hazards.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "138",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one technological item of up to 1 bulk/level, or one technological vehicle of any size",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "Will negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "You expend 1 Resolve Point to render a vehicle, or technological device immune to corrosive atmospheres, water, heat, radiation, and other natural environmental dangers. If the target regains Hit Points while affected, its Hit Points are restored to their maximum.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3"),
      spellTitle = "Orient",
      spellPreviewDescription = "Gain a +10 bonus to certain Survival checks.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "78",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 round",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You focus on your surroundings, from the ground beneath your feet to the skies high above, gaining supernatural insight about your place on the planet. You gain a +10 bonus to Survival checks to determine precisely where you are and how far you've traveled, to live off the land, and to predict weather. If you aren't on a planet when you cast this spell, orient automatically fails.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","Tchn 2","WtchW 2"),
      spellTitle = "Osmose",
      spellPreviewDescription = "Instantly interrogate a source of data for relevant info.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "79",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "touch",
      spellTargets = "one data set contained within a touched object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Initially developed by impatient bantrid students, this spell has grown in popularity among those that want to consume a lot of information quickly. You touch one object and concentrate on a single data set contained within the object, such as a story, email, file, video, or website. You understand the gist of the data set and can quickly locate the most relevant pages or sections to your search. If the data set is written in a language you don't know, or you attempt to gain information from a computer you don't have access to, this spell automatically fails.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Prcg 1","Tchn 1","WtchW 1"),
      spellTitle = "Overheat",
      spellPreviewDescription = "Deal 2d8 fire damage to creatures in cone.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "367",
      spellSourceBookFull = "Starfinder Core Rulebook",
      spellSchool = "evocation (fire)",
      spellCastingTime = "1 standard action",
      spellRange = "15 ft.",
      spellTargets = "",
      spellArea = "cone-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You collect the heat generated by nearby bodies and devices and vent it outward in a thermal wave, dealing 2d8 fire damage to creatures and objects in the area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Overload Systems",
      spellPreviewDescription = "Target creature has a 50% chance to lose each action.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "368",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude negates",
      spellResistance = "yes",
      spellDescriptionFull = "By touching the target (usually requiring a melee attack roll against the target’s EAC, but you can add your key ability score modifier instead of your Strength modifier if it is higher), you flood the target’s body with random jolts of electricity or other interference. On a failed Fortitude save, the target is overwhelmed and potentially unable to perform tasks as normal. While this spell is in effect, whenever the target takes any action or reaction, there is a 50% chance that the target simply takes no action instead. Roll this chance separately for each action the target would take. For example, if the target wishes to move and attack during its turn, it would roll d% twice to determine whether it could take those actions—once before each action it wishes to take. Each attack of a full attack action counts as separate action.\n" +
              "\n" +
              "This spell is effective against living and unliving creatures, and casting it doesn’t provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","WtchW 2"),
      spellTitle = "Parallel Form",
      spellPreviewDescription = "Disguise creatures’ forms and equipment, and give targets a bonus to Bluff checks to impersonate individuals",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "138",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one willing creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will disbelief",
      spellResistance = "no",
      spellDescriptionFull = "You pluck details from alternate-reality versions of targets to weave parallel forms, making the targets appear and act differently. You affect the targets as if they were each under a disguise self spell, deciding the details when you cast this spell. In addition, parallel form provides the mannerisms of the chosen form, and the tactile and audible properties of the target’s equipment can seem different, although all the target’s gear must appear to be of the same sort (for example, a melee weapon can appear to be only another sort of melee weapon). If you cast this spell to make the target appear to be a specific individual, the target gains a +4 circumstance bonus to Bluff checks to claim to be that individual. A creature that interacts with the target and succeeds at a Will saving throw recognizes the parallel form as an illusion.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2"),
      spellTitle = "Paranoia",
      spellPreviewDescription = "Force a creature to lash out at everyone, even their friends.",
      spellSourceBookPreview = "AdvP#10",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #10: The Diaspora Strain",
      spellSchool = "illusion (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "The target treats all other creatures as enemies and only itself as an ally. It must attempt attacks of opportunity whenever any creature provokes them. In addition, the target is shaken while adjacent to more than one creature.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","Tchn 5","WtchW 5"),
      spellTitle = "Passwall",
      spellPreviewDescription = "Create a passage through most walls.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "368",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "",
      spellArea = "",
      spellEffect = "5-ft.-by-8-ft. opening",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You can create a passage through metal, plaster, plastic, stone, or wooden walls, but you can not create one through force fields, starship bulkheads, or other harder materials. The passage is 30 feet deep. If the wall’s thickness is more than the depth of the passage created, then a single casting of passwall simply makes a niche or short tunnel. Several castings of passwall can then form a continuing passage to breach very thick walls. When passwall ends, creatures within the passage are ejected out the nearest exit. If someone dispels passwall or you dismiss it, creatures in the passage are ejected out the far exit, if there is more than one, or out the sole exit.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Patch Tech",
      spellPreviewDescription = "Gain a +3 bonus to checks to arm explosives, disable devices, and repair items.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "139",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one technological item",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You gain a +3 insight bonus to Engineering checks to arm explosives, disable devices, and repair items.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
      spellTitle = "Perfect Recall",
      spellPreviewDescription = "Recall one memory unaltered by magic perfectly.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "139",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "enchantment",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one willing or unconscious creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no (harmless)",
      spellDescriptionFull = "The target is able to recall memories with perfect clarity. If the target has been subjected to displace memory, modify memory, or a similar effect, this spell provides no recall of those lost memories. However, the target realizes its memories have been altered by such a spell or effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2","WtchW 2"),
      spellTitle = "Personal Gravity",
      spellPreviewDescription = "You alter gravity’s effects on you.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "156",
      spellSourceBookFull = "Near Space",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You alter gravity’s effects on you. You treat gravity as if it were your choice of 1 step higher or lower (for example, if you were in an area of low gravity, you could choose either standard gravity or zero-g). You can suppress or resume this affect as a reaction or swift action. While under the effects of this spell, you can also reduce the distance of any forced movement that would affect you by 5 feet (minimum 0 feet), and you ignore penalties from the off-kilter condition.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Petal Storm",
      spellPreviewDescription = "You conjure a 5-foot storm of leaves and flower petals from another world, magically honing their edges to be sharp as razors.",
      spellSourceBookPreview = "AdvP#42",
      spellSourcePage = "43",
      spellSourceBookFull = "Adventure Path #42: Whispers of the Eclipse",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "5-ft.-diameter storm of petals and leaves",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex negates",
      spellResistance = "no",
      spellDescriptionFull = "You conjure a 5-foot storm of leaves and flower petals from another world, magically honing their edges to be sharp as razors. You create the storm in a square within range and can take a move action to move it up to 30 feet in any direction. If the storm enters (or is created in) a square containing a creature, the petal storm can’t move any farther that round and deals 3d6 slashing damage to that creature (Reflex negates). If you don’t move the storm, it remains where it is.\n" +
              "\n" +
              "Any creature that shares its space with the storm has concealment (attacks have a 20% miss chance).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Phantasmal Maze",
      spellPreviewDescription = "You create an illusion of a complex maze that creatures in the area perceive.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "95",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. +10 ft/level)",
      spellTargets = "",
      spellArea = "15-ft.-radius burst",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will partial (special; see text)",
      spellResistance = "yes",
      spellDescriptionFull = "You create an illusion of a complex maze that creatures in the area perceive. The maze matches the terrain and decor of the area it’s cast in. Those within it perceive walls, doors, barriers, twists, turns, and constant, confusing obstructions. The maze prevents creatures from perceiving any creature farther than 10 feet away from them, and makes it impossible for them to move except by taking guarded steps. If an affected creature is in a complex, mazelike area when this spell is cast, they can’t attempt a saving throw against it until they have some reason to believe they aren’t in a normal maze (normally requiring interacting with the maze in some way, such as trying to map it out or use sensors to find a way through it). Creatures that succeed at a Will save against the spell realize the maze is illusory but are still bombarded with false sensory data as they deal with the fake turns and twists around them. These targets choose at the beginning of their turn to be flat-footed or off-target, but they don’t suffer any other effects of the spell.\n" +
              "\n" +
              "At the end of each turn, characters affected by this spell can attempt a new Will save; if successful, they’re immune to this spell for 24 hours.\n" +
              "\n" +
              "Nuars are immune to the effects of this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Phantom Cycle",
      spellPreviewDescription = "Summon a ghostly motorcycle.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "139",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "",
      spellArea = "",
      spellEffect = "one magical vehicle",
      spellDuration = "1 hour/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You conjure a motorcycle out of raw magic. This phantom cycle is only partially real, with a shadowy finish, dark trim, and tires of ghostly mist. Only you can pilot this cycle, although anyone can be a passenger. For every caster level you have above 6th, your phantom cycle gains a 5-foot increase in speed, a 50-foot increase to its full speed, and a 5-mph increase to its overland movement.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Phase Blade",
      spellPreviewDescription = "You infuse the weapon with magic, allowing you to phase the weapon in and out of existence to partially bypass armor.",
      spellSourceBookPreview = "Alien#4",
      spellSourcePage = "73",
      spellSourceBookFull = "Alien Archive 4",
      spellSchool = "transmutation",
      spellCastingTime = "1 swift action",
      spellRange = "touch",
      spellTargets = "one melee weapon",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You infuse the weapon with magic, allowing you to phase the weapon in and out of existence to partially bypass armor. For the duration of the spell, attacks made with the weapon target EAC, even if the weapon deals kinetic damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Tchn 5","WtchW 5"),
      spellTitle = "Physical Stability, Mass",
      spellPreviewDescription = "Grant multiple creatures a +2 circumstance bonus against transmutation effects.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "79",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell functions like physical stability, except as noted above.\n" +
        "\n" +
        "Drawing upon the order and stability of the lawful outer planes, you stabilize a creature's form with a touch. The target gains a +2 circumstance bonus against transmutation spells and effects. Physical stability counters baleful polymorph and polymorph, and it counters and negates fluidity of form. If you cast physical stability on a creature already under the effects of a transmutation effect, you can try to dispel one transmutation effect affecting the target. If you do, attempt a dispel check (1d20 + caster level) with a DC equal to 11 + the caster level of the transmutation effect to end the effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3","WtchW 3"),
      spellTitle = "Physical Stability",
      spellPreviewDescription = "Grant a creature a +2 circumstance bonus against transmutation effects.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "79",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one willing or unconscious creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Drawing upon the order and stability of the lawful outer planes, you stabilize a creature's form with a touch. The target gains a +2 circumstance bonus against transmutation spells and effects. Physical stability counters baleful polymorph and polymorph, and it counters and negates fluidity of form. If you cast physical stability on a creature already under the effects of a transmutation effect, you can try to dispel one transmutation effect affecting the target. If you do, attempt a dispel check (1d20 + caster level) with a DC equal to 11 + the caster level of the transmutation effect to end the effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3"),
      spellTitle = "Pinpoint Navigation",
      spellPreviewDescription = "Gain +10 to Piloting checks for navigation.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "139",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "1 round",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one humanoid",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You focus your mind on time and space around you, gaining supernatural insight about your physical place in the universe. You gain a +10 bonus to Piloting checks to navigate and astrogate, and you can plot a course in half the normal time.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Planar Barrier",
      spellPreviewDescription = "Seal an area against all planar travel into or within it.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "368",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "6 rounds",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "one 60-ft. cube/level (S)",
      spellEffect = "",
      spellDuration = "24 hours",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "Planar barrier seals an area against all planar travel into or within it. This includes all teleportation spells, summoning spells, plane shifting, astral travel, and ethereal travel. Such effects simply fail automatically. Starships cannot enter or emerge from Drift travel in an area affected by this spell.\n" +
              "\n" +
              "Dispel magic does not dispel your planar barrier effect unless the caster level of the creature attempting to dispel it is at least as high as your own. You can’t have multiple overlapping planar barrier effects. If planar barrier effects woulds overlap, the more recent effect stops at the boundary of the older effect.\n" +
              "\n" +
              "A planar barrier can be made permanent with a special ritual, which takes 1 hour and requires materials worth 15,000 credits per 60-foot cube.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Planar Binding",
      spellPreviewDescription = "Trap an extraplanar creature of CR 10 or lower until it performs a task.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "369",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (calling ; see text)",
      spellCastingTime = "10 minutes",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous; see text",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "Casting this spell attempts a dangerous act: to lure a creature from another plane to a specifically prepared trap, created by the spell within its range. The called creature is held in the trap until it agrees to perform one service in return for its freedom or breaks free. The kind of creature to be bound must be known and stated. If you wish to call a specific individual, you must use that individual’s proper name in casting the spell. The CR of the outsider you can call with planar binding depends on the spell’s level.\n" +
              "\n" +
              "4th: One outsider of CR 4 or lower\n" +
              "\n" +
              "5th: One outsider of CR 7 or lower\n" +
              "\n" +
              "6th: One outsider of CR 10 or lower\n" +
              "\n" +
              "The target creature can attempt a Will saving throw. If the creature succeeds at the saving throw, it resists the spell. If it fails, the creature is immediately drawn to the trap (spell resistance does not keep it from being called). The creature can escape from the trap by successfully using its spell resistance (meaning you fail a caster level check against its spell resistance), by dimensional travel, or with a successful Charisma check (DC = 15 + half your caster level + your Charisma modifier). It can try each method once per day, and a natural 20 on this check always succeeds (and a natural 1 on your caster level check always fails). If it breaks loose, it can flee or attack you. A planar barrier spell cast in the area prevents the creature from escaping via dimensional travel.\n" +
              "\n" +
              "If the creature does not break free of the trap, you can keep it bound for as long as you dare. You can attempt to convince the creature to perform a task for you in exchange for release and perhaps some sort of reward. The creature decides which terms it is willing to accept, and it must willingly agree to the terms; magical compulsion isn’t sufficient. This continues until the creature promises to serve, until it breaks free, or until you decide to get rid of it by means of some other spell. It never agrees to unreasonable commands.\n" +
              "\n" +
              "Once the requested service has been completed, the creature need only to inform you to be instantly sent back to its home plane. The creature might later seek revenge against you for having imprisoned it. If you assign some open-ended task that the creature can’t complete through its own actions, the spell remains in effect for 10 days and the creature gains an immediate chance to break free. A defined task that will take longer than 10 days usually counts as unreasonable. Note that a clever recipient can subvert some instructions.\n" +
              "\n" +
              "When you use this spell to call a creature with the air, chaotic, earth, evil, fire, good, lawful, or water subtype, the spell gains that descriptor.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Planar Phase",
      spellPreviewDescription = "You open and step through an extraplanar detour that teleports you to any unoccupied space within the spell’s range, as per dimension door.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "139",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action or 1 move action",
      spellRange = "5 ft./level or 5 ft./3 levels",
      spellTargets = "personal",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous and 1 round/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You open and step through an extraplanar detour that teleports you to any unoccupied space within the spell’s range, as per dimension door. Choose one of the following damage types: acid, bludgeoning, cold, electricity, or fire. Your brief jaunt through another plane doesn’t harm you, but it does infuse your weapons with that plane’s matter or energy, causing your weapon attacks to deal additional damage of the chosen type for the spell’s duration. If you cast this spell as a standard action, the spell’s range is 5 feet per caster level, and your weapons deal an additional 3d8 damage with your first successful attack, 2d8 with the second successful attack, and 1d8 with the third successful attack. If you cast this spell as a move action, the spell’s range is 5 feet per 3 caster levels, and your weapons deal an additional 3d4 damage with your first successful attack, 2d4 with the second successful attack, and 1d4 with the third successful attack. If your attack would damage multiple creatures, you deal the additional damage to one creature of your choice.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Plane Shift",
      spellPreviewDescription = "As many as eight creatures travel to another plane of your choice.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "369",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature, or up to eight willing or unconscious creatures",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You move yourself or some other creature to another plane of existence or alternate dimension. If several willing or unconscious creatures are linked by hand in a circle, as many as eight can be affected by a single casting of plane shift. Arriving at a precise location on the intended plane is nigh impossible. From the Material Plane, you can reach any other plane (except for the Drift), though you appear 5 to 500 miles (5d%) from the last place one of the targets (your choice) was located last time that target traveled to that plane. If it’s the first time traveling to a particular plane for all targets, you appear at a random location on the plane, though you can use other means of transit, such as interplanetary teleport, to travel on the new plane. Mystics must have an object attuned to a specific plane or native to that plane in order to use plane shift to travel to a plane. A technomancer requires a planar navigational program for a specific plane in order to travel to that plane with plane shift. Special rituals, jealously hoarded by powerful technomancers and mystics, can allow you to travel to specific locations on the chosen plane, or even to unknown worlds.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","WtchW 3"),
      spellTitle = "Planned Obsolescence",
      spellPreviewDescription = "You transform a weapon or suit of armor into an antique version of itself, giving it the analog and archaic properties.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "156",
      spellSourceBookFull = "Near Space",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one weapon or suit of armor",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "yes",
      spellDescriptionFull = "You transform a weapon or suit of armor into an antique version of itself, giving it the analog and archaic properties. Any technological or hybrid armor upgrades cease to function for the duration of the spell. Entirely magical enhancements, such as weapon fusions, continue to function normally. Weapons that normally deal energy damage deal bludgeoning and piercing damage instead, lose any critical hit effects, and target KAC. Other weapon special properties, such as boost and bright, might also cease to function for the duration of the spell, at the GM’s discretion.\n" +
              "\n" +
              "This spell has no effect on natural weapons and weapons entirely of magical or supernatural origins, such as a solarian’s solar weapon.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Plasma Field",
      spellPreviewDescription = "You superimpose the surface of a dying star onto the battlefield, forming a field of roiling plasma.",
      spellSourceBookPreview = "AdvP#49",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #49: A Light in the Dark",
      spellSchool = "conjuration (electricity, fire, light)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius spread",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You superimpose the surface of a dying star onto the battlefield, forming a f eld of roiling plasma. If a creature begins its turn in the area, or the first time a creature enters the area on its turn, it takes 3d6 fire damage and 3d6 electricity damage. The area is bright light. It sheds normal light out to a range of 30 feet, and dim light for another 30 feet.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Plasma Snare",
      spellPreviewDescription = "Attempt an attack to deal 3d6 electricity and fire damage and entangle a target, dealing further damage.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "79",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (electricity, fire)",
      spellCastingTime = "1 standard action",
      spellRange = "10 ft.",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Reflex partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You conjure a volatile string of plasma and lash the target. Attempt a melee attack against the target's EAC. If you hit, the target takes 3d6 electricity and fire damage (critical knockdown) and is entangled (escape DC equals the spell's save DC + 4). Each time the target fails to escape, it takes 2d6 electricity and fire damage. If the target escapes, the plasma snare drops to the ground in that space—if the target ends its turn there, the target takes 1d6 electricity and fire damage.\n" +
              "\n" +
              "If a turn ends with the plasma snare holding no creature entangled, the spell ends. As a reaction to the end of a turn (before the snare disappears) or the target escaping, provided you're within 30 feet of the snare, you can detonate the plasma snare, discharging the spell. If you do, the plasma explodes in a 10-foot radius. Creatures in the area take 4d6 electricity and fire damage and gain the burning (1d6) condition. Those who succeed at a Reflex saving throw take half as much damage and don't gain the burning condition. If the target is still entangled when the plasma detonates, the target takes a –6 penalty to this saving throw.\n" +
              "\n" +
              "Casting this spell doesn't provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","WtchW 3"),
      spellTitle = "Pocket Vacuum",
      spellPreviewDescription = "The affected area becomes a vacuum.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "123",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "20-ft.-radius burst",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "The affected area becomes a vacuum (Starfinder Core Rulebook 294). Creatures take 3d6 bludgeoning damage from decompression (unless they were already in vacuum) and 1d6 bludgeoning damage per round, and they begin suffocating.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Polar Vortex",
      spellPreviewDescription = "You generate an arctic storm of harsh winds and battering hail and snow.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "156",
      spellSourceBookFull = "Near Space",
      spellSchool = "evocation (cold)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "cylinder (20-ft. radius, 40 ft. high)",
      spellEffect = "",
      spellDuration = "1 round plus 1 round/level",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You generate an arctic storm of harsh winds and battering hail and snow. Creatures that enter or start their turn in the area during the first round of the spell take 3d6 cold damage plus 6d6 bludgeoning damage and are affected by freezing, hurricane-strength winds. For the duration of the spell, creatures flying in the area must succeed at an Acrobatics check to fly in dangerous wind conditions, and terrain within the spell’s area is covered with ice and snow, causing it to become difficult terrain.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4","WtchW 4"),
      spellTitle = "Polymorph, Mass",
      spellPreviewDescription = "Change multiple target's shapes to that of another creature",
      spellSourceBookPreview = "Alien#2",
      spellSourcePage = "146",
      spellSourceBookFull = "Alien Archive 2",
      spellSchool = "transmutation (polymorph)",
      spellCastingTime = "1 round",
      spellRange = "close",
      spellTargets = "up to four willing creatures, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "none",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as polymorph, except as noted in this description. Each target must take the same form.\n" +
              "\n" +
              "4th: This spell can transform the targets as per the 1st-level version of polymorph.\n" +
              "\n" +
              "5th: This spell can transform the targets as per the 2nd-level version of polymorph.\n" +
              "\n" +
              "6th: This spell can transform the targets as per the 3rd-level version of polymorph.\n" +
              "\n" +
              "(Polymorph 1st-3rd: You change a willing target’s shape into a predetermined polymorphed form of your choice. When you select this spell as a spell known, you design four polymorphed forms for each spell level at which you can cast this spell. These forms should be premade, following the rules for spells with the polymorph descriptor (starting on page 141) and the restrictions for each spell level of this spell, and be as ready to use in play as all other aspects of a character are. Each time you gain a character level, you can change which forms you have available.\n" +
              "\n" +
              "You choose which of these predetermined polymorph forms the target changes into each time you cast the spell.\n" +
              "\n" +
              "1st: Casting polymorph as a 1st-level spell allows you to transform the target into one of the four 1st-level polymorphed forms you know. Your polymorphed forms must comply with the additional restrictions that follow. Unlike most polymorph effects, these forms are close enough to the target’s true form to make the target recognizable, and they cannot duplicate any other specific individual. Each form must be of the animal or humanoid type. You can target only creatures that are Small or Medium with this spell, and all your polymorphed forms must be Small or Medium. CR: The maximum CR is 1. Defenses: The form can grant DR 1/magic or resistance 2 to one energy type. Movement: The form can grant a land speed of up to 30 feet or a swim speed of up to 20 feet. Racial Traits: You cannot grant racial traits. Senses: The form can grant low-light vision or tracking (scent), but not both.\n" +
              "\n" +
              "2nd: Casting polymorph as a 2nd-level spell allows you to completely transform the target into one of the four 2ndlevel polymorphed forms you know. Your polymorphed forms must comply with the additional restrictions that follow. Each form must be an animal, fey, humanoid, magical beast, or monstrous humanoid. All your polymorphed forms must be Small or Medium.\n" +
              "\n" +
              "CR: The maximum CR is 3.\n" +
              "\n" +
              "Defensive Abilities: The form can grant DR 2/magic or resistance 5 to one energy type.\n" +
              "\n" +
              "Racial Traits: The form can grant only one racial trait to each polymorphed form, and you can’t grant racial traits that include spell-like abilities.\n" +
              "\n" +
              "Senses: The form can grant one of the following options: blindsense (scent) out to 5 feet, darkvision out to 60 feet, lowlight vision, or tracking (scent).\n" +
              "\n" +
              "Speed: The form can grant the target a maximum land speed of 40 feet, climb speed of 20 feet, or swim speed of 30 feet.\n" +
              "\n" +
              "3rd: Casting polymorph as a 3rd-level spell allows you to completely transform the target into one of the four 3rd-level polymorphed forms you know. Your polymorphed forms must comply with the additional restrictions that follow. Each form must be an aberration, animal, fey, humanoid, magical beast, monstrous humanoid, or vermin. See the vermin benefits in the Type and Subtype section of the polymorph rules. All your polymorphed forms must be Small or Medium.\n" +
              "\n" +
              "CR: The maximum CR is 6.\n" +
              "\n" +
              "Defensive Abilities: The form can grant DR 3/magic, resistance 5 to two different energy types, or resistance 10 to one energy type.\n" +
              "\n" +
              "Racial Traits: The form can grant up to two racial traits (which must be from the same race) to each polymorphed form, one of which can include spell-like abilities.\n" +
              "\n" +
              "Senses: The form can grant one of the following options: blindsense (scent, sound, or vibration) out to 15 feet, darkvision out to 60 feet, low-light vision, or tracking (scent).\n" +
              "\n" +
              "Speed: The form can grant the target a maximum land speed of 40 feet, a burrow speed of up to 20 feet, a climb speed of 20 feet, a fly speed of 20 feet (Ex) with clumsy maneuverability, or a swim speed of 30 feet.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Polymorph",
      spellPreviewDescription = "Change the target's shape into that of another creature",
      spellSourceBookPreview = "Alien#2",
      spellSourcePage = "145",
      spellSourceBookFull = "Alien Archive 2",
      spellSchool = "transmutation (polymorph)",
      spellCastingTime = "1 round",
      spellRange = "close",
      spellTargets = "one willing creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "none",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You change a willing target’s shape into a predetermined polymorphed form of your choice. When you select this spell as a spell known, you design four polymorphed forms for each spell level at which you can cast this spell. These forms should be premade, following the rules for spells with the polymorph descriptor (starting on page 141) and the restrictions for each spell level of this spell, and be as ready to use in play as all other aspects of a character are. Each time you gain a character level, you can change which forms you have available.\n" +
              "\n" +
              "You choose which of these predetermined polymorph forms the target changes into each time you cast the spell.\n" +
              "\n" +
              "1st: Casting polymorph as a 1st-level spell allows you to transform the target into one of the four 1st-level polymorphed forms you know. Your polymorphed forms must comply with the additional restrictions that follow. Unlike most polymorph effects, these forms are close enough to the target’s true form to make the target recognizable, and they cannot duplicate any other specific individual. Each form must be of the animal or humanoid type. You can target only creatures that are Small or Medium with this spell, and all your polymorphed forms must be Small or Medium. CR: The maximum CR is 1. Defenses: The form can grant DR 1/magic or resistance 2 to one energy type. Movement: The form can grant a land speed of up to 30 feet or a swim speed of up to 20 feet. Racial Traits: You cannot grant racial traits. Senses: The form can grant low-light vision or tracking (scent), but not both.\n" +
              "\n" +
              "2nd: Casting polymorph as a 2nd-level spell allows you to completely transform the target into one of the four 2ndlevel polymorphed forms you know. Your polymorphed forms must comply with the additional restrictions that follow. Each form must be an animal, fey, humanoid, magical beast, or monstrous humanoid. All your polymorphed forms must be Small or Medium.\n" +
              "\n" +
              "CR: The maximum CR is 3.\n" +
              "\n" +
              "Defensive Abilities: The form can grant DR 2/magic or resistance 5 to one energy type.\n" +
              "\n" +
              "Racial Traits: The form can grant only one racial trait to each polymorphed form, and you can’t grant racial traits that include spell-like abilities.\n" +
              "\n" +
              "Senses: The form can grant one of the following options: blindsense (scent) out to 5 feet, darkvision out to 60 feet, lowlight vision, or tracking (scent).\n" +
              "\n" +
              "Speed: The form can grant the target a maximum land speed of 40 feet, climb speed of 20 feet, or swim speed of 30 feet.\n" +
              "\n" +
              "3rd: Casting polymorph as a 3rd-level spell allows you to completely transform the target into one of the four 3rd-level polymorphed forms you know. Your polymorphed forms must comply with the additional restrictions that follow. Each form must be an aberration, animal, fey, humanoid, magical beast, monstrous humanoid, or vermin. See the vermin benefits in the Type and Subtype section of the polymorph rules. All your polymorphed forms must be Small or Medium.\n" +
              "\n" +
              "CR: The maximum CR is 6.\n" +
              "\n" +
              "Defensive Abilities: The form can grant DR 3/magic, resistance 5 to two different energy types, or resistance 10 to one energy type.\n" +
              "\n" +
              "Racial Traits: The form can grant up to two racial traits (which must be from the same race) to each polymorphed form, one of which can include spell-like abilities.\n" +
              "\n" +
              "Senses: The form can grant one of the following options: blindsense (scent, sound, or vibration) out to 15 feet, darkvision out to 60 feet, low-light vision, or tracking (scent).\n" +
              "\n" +
              "Speed: The form can grant the target a maximum land speed of 40 feet, a burrow speed of up to 20 feet, a climb speed of 20 feet, a fly speed of 20 feet (Ex) with clumsy maneuverability, or a swim speed of 30 feet.\n" +
              "\n" +
              "4th: Casting polymorph as a 4th-level spell allows you to completely transform the target into one of the four 4th-level polymorphed forms you know. Your polymorphed forms must comply with the additional restrictions that follow. Each form must be an aberration, animal, fey, humanoid, magical beast, monstrous humanoid, or vermin. See the vermin benefits in the Type and Subtype section of the polymorph rules. All your polymorphed forms must be Small, Medium, or Large.\n" +
              "\n" +
              "CR: The maximum CR is 9.\n" +
              "\n" +
              "Defensive Abilities: The form can grant DR 5/magic, resistance 5 to three different energy types, resistance 10 to two different energy types, or resistance 15 to one energy type.\n" +
              "\n" +
              "Racial Traits: The form can grant up to two racial traits to each polymorphed form; one can include spell-like abilities.\n" +
              "\n" +
              "Senses: The form can grant one of the following options: blindsense (scent, sound, or vibration) out to 30 feet, blindsight (scent, sound, or vibration) out to 5 feet, darkvision out to 60 feet and low-light vision, or tracking (scent).\n" +
              "\n" +
              "Speed: The form can grant the target a maximum land speed of 40 feet, a burrow speed of up to 30 feet, a climb speed of 30 feet, a fly speed of 30 feet (Ex) with clumsy maneuverability, or a swim speed of 40 feet.\n" +
              "\n" +
              "5th: Casting polymorph as a 5th-level spell allows you to completely transform the target into one of the four 5th-level polymorphed forms you know. Your polymorphed forms must comply with the additional restrictions that follow. Each form must be an aberration, animal, construct (only if cast as a technomancer spell), elemental, fey, humanoid, magical beast, monstrous humanoid, plant (only if cast as a mystic spell), or vermin. See the construct, elemental, plant, and vermin benefits in the Type and Subtype section of the polymorph rules. All your polymorphed forms must be Tiny, Small, Medium, or Large.\n" +
              "\n" +
              "CR: The maximum CR is 12.\n" +
              "\n" +
              "Defensive Abilities: The form can grant DR 5/—, resistance 10 to three different energy types, resistance 15 to two different energy types, or resistance 20 to one energy type.\n" +
              "\n" +
              "Racial Traits: The form can grant up to three racial traits to each polymorphed form; one can include spell-like abilities.\n" +
              "\n" +
              "Senses: The form can grant one of the following options: blindsense (scent, sound, or vibration) out to 30 feet, blindsight (scent, sound, or vibration) out to 15 feet, darkvision out to 90 feet and low-light vision, or tracking (scent).\n" +
              "\n" +
              "Speed: The form can grant the target a maximum land speed of 40 feet, a burrow speed of up to 40 feet, a climb speed of 40 feet, a fly speed of 40 feet (Ex) with average maneuverability, or a swim speed of 40 feet.\n" +
              "\n" +
              "6th: Casting polymorph as a 6th-level spell allows you to completely transform the target into one of the four 6th-level polymorphed forms you know. Your polymorphed forms must comply with the additional restrictions that follow. Each form must be an aberration, animal, construct (only if cast as a technomancer spell), elemental, fey, humanoid, magical beast, monstrous humanoid, plant (only if cast as a mystic spell), undead, or vermin. See the construct, elemental, plant, undead, and vermin benefits in the Type and Subtype section of the polymorph rules. All your polymorphed forms must be Diminutive, Tiny, Small, Medium, Large, or Huge.\n" +
              "\n" +
              "CR: The maximum CR is 15.\n" +
              "\n" +
              "Defensive Abilities: The form can grant DR 5/—, resistance 10 to three different energy types, resistance 15 to two different energy types, resistance 20 to one energy type, or immunity to disease, poison, or radiation.\n" +
              "\n" +
              "Racial Traits: The form can grant up to four racial traits to each polymorphed form; one can include spell-like abilities.\n" +
              "\n" +
              "Senses: The form can grant one of the following options: blindsense (scent, sound, or vibration) out to 30 feet, blindsight (scent, sound, or vibration) out to 15 feet, darkvision out to 90 feet and low-light vision, or tracking (scent).\n" +
              "\n" +
              "Speed: The form can grant the target a maximum land speed of 60 feet, a burrow speed of up to 60 feet, a climb speed of 60 feet, a fly speed of 60 feet (Ex) with perfect maneuverability, or a swim speed of 60 feet.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
      spellTitle = "Predict Foe",
      spellPreviewDescription = "As a reaction, shout a warning to an ally and grant that ally concealment against an attack.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "139",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, up to 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You reach into the target’s mind, extracting a sense of its immediate intentions. For the duration, you can warn a creature the target intends to attack, providing that creature with concealment against the attack. You convey this warning, verbally or telepathically (transcending language), as part of concentrating on this spell. You can continue to concentrate on this spell, and the effect continues if you do, even if the target leaves your line of sight.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3"),
      spellTitle = "Prescience",
      spellPreviewDescription = "Concentrate on an enemy, predict their actions, and prepare an appropriate response.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "139",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration + 1 round",
      spellSavingThrow = "Reflex partial; see text",
      spellResistance = "no",
      spellDescriptionFull = "You peer into the future of multiple realities, collating and perceiving actions the target is likely to take. When that target takes an action during the duration, as a reaction you can execute one of the following effects. These effects are resolved after the target declares an intended action but before that action is resolved. The target can attempt a Reflex save to negate your reaction’s effect. If the effect successfully interrupts the target’s action, that action is still expended unless otherwise noted. Once a target has been successfully affected three times by one casting of this spell, the spell ends. You can attempt each effect only once per casting.\n" +
              "\n" +
              "-Trip the target. A target tripped after it declares its intent to cast a spell does not lose that spell slot.\n" +
              "\n" +
              "-Hinder the target’s ranged weapon, imposing a –4 penalty on its next ranged attack roll or a –2 penalty to multiple ranged attack rolls during a full attack.\n" +
              "\n" +
              "-Wrench the target’s weapon-wielding appendage, imposing a –4 penalty on its next melee attack roll or a –2 penalty on multiple melee attack rolls during a full attack.\n" +
              "\n" +
              "-Short out an item—whether magic, hybrid, or technological—wasting the target’s declared action to activate that item.\n" +
              "\n" +
              "-Jam a weapon or weapon-like object in place as the target attempts to draw or sheathe it, thwarting that attempt.\n" +
              "\n" +
              "-Cause the target to fumble with ammunition, wasting its declared action to reload a weapon.\n" +
              "\n" +
              "-Unleash a blast of force from eddying realities, causing the foe to waste its declared action to stand up from prone.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Preserve Specimen",
      spellPreviewDescription = "You harmlessly render a willing or unconscious living creature inert, placing it in stasis where it does not need to eat, breathe, or sleep.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "23",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./level)",
      spellTargets = "one living willing or unconscious creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 week/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You harmlessly render a willing or unconscious living creature inert, placing it in stasis where it does not need to eat, breathe, or sleep. The creature cannot attack, use any abilities, or move while affected by preserve specimen, nor does the creature age or change in any way. It is not aware of its surroundings and does not experience any sensation or passage of time. If the creature was affected by any diseases, poisons, or other afflictions or conditions before you cast preserve specimen, they cease to progress for the duration of the spell, but the creature retains them. Their progression resumes once the spell ends. Any attack against a creature affected by preserve specimen, or any spell or effect that would cause the specimen to take damage or attempt a saving throw, immediately ends this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1"),
      spellTitle = "Preserved Path",
      spellPreviewDescription = "For the duration of the spell, moving causes you to leave behind a faint illusory string in the spaces you move through",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "95",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "illusion",
      spellCastingTime = "1 move action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "For the duration of the spell, moving causes you to leave behind a faint illusory string in the spaces you move through; the string follows the path of your center of gravity, emits dim light to a range of 5 feet, and lasts until the end of the spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Pressurize",
      spellPreviewDescription = "You increase the water pressure in pressurize’s area, dealing 2d10 bludgeoning damage to creatures that enter or start their turn in the area.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "transmutation (water)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius sphere",
      spellEffect = "",
      spellDuration = "concentration + 1 round",
      spellSavingThrow = "Fortitude half (see text)",
      spellResistance = "yes",
      spellDescriptionFull = "You increase the water pressure in pressurize’s area, dealing 2d10 bludgeoning damage to creatures that enter or start their turn in the area; this damage isn’t reduced as a result of being underwater. Succeeding at the saving throw reduces damage by half. A creature that fails its saving throw by 10 or more must immediately attempt a Constitution check to hold its breath as if it had run out of air; if it fails, it becomes unconscious but stable and continues to suffocate normally unless moved out of the area or the spell ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","Tchn 5","WtchW 5"),
      spellTitle = "Private Sanctum",
      spellPreviewDescription = "Prevent anyone from viewing or scrying an area for 24 hours.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "369",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "10 minutes",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "one 30-ft. cube/level (S)",
      spellEffect = "",
      spellDuration = "24 hours (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell ensures privacy. Anyone looking into the area from outside sees only a dark, foggy mass. Darkvision cannot penetrate it. No sounds, no matter how loud, can escape the area, so nobody can eavesdrop from outside. Those inside can see out normally.\n" +
              "\n" +
              "Divination (scrying) spells can’t perceive anything within the area, and those within are immune to detect thoughts. The ward prevents speech between those inside and those outside (because it blocks sound), and technological communication (as it blocks broadcasts), but it doesn’t prevent other magic communication, such as a telepathic message spell, or telepathic communication.\n" +
              "\n" +
              "The spell does not prevent creatures or objects from moving into and out of the area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Probability Prediction",
      spellPreviewDescription = "Reroll one attack roll, save, or check.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "369",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D); see text",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You open your mind to read the underlying probability of the universe. At any point during the duration of this spell, you can discharge it to reroll any one of your d20 rolls (attack roll, saving throw, skill check, etc.); see page 243. This takes no action, but you must choose to do it before you learn the results of the first roll. You must take the result of the second roll, even if it is worse.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 0","Tchn 5","WtchW 5"),
      spellTitle = "Probability Prediction, Mass",
      spellPreviewDescription = "This spell functions as probability predication, except as noted.",
      spellSourceBookPreview = "AdvP#51",
      spellSourcePage = "50",
      spellSourceBookFull = "Adventure Path#51: Into the Dataverse",
      spellSchool = "divination",
      spellCastingTime = "",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as probability predication, except as noted above.\n" +
              "\n" +
              "(Probability Predication: You open your mind to read the underlying probability of the universe. At any point during the duration of this spell, you can discharge it to reroll any one of your d20 rolls (attack roll, saving throw, skill check, etc.); see page 243. This takes no action, but you must choose to do it before you learn the results of the first roll. You must take the result of the second roll, even if it is worse.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","Tchn 2","WtchW 2"),
      spellTitle = "Propelled Leap",
      spellPreviewDescription = "You magically propel yourself through the air to a space within range.",
      spellSourceBookPreview = "RdsR",
      spellSourcePage = "59",
      spellSourceBookFull = "Redshift Rally",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You magically propel yourself through the air to a space within range. Select an empty space within close range (25 feet plus 5 feet per two levels). You’re catapulted into the air and land in that space without harm. Your movement provokes attacks of opportunity only for the space you launch from and the space you land in. If you attempt to bring another creature along with you, this spell fails.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 3"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Protection From Undead",
      spellPreviewDescription = "You shroud yourself with traces of negative energy, appearing to undead creatures as if you’re undead.",
      spellSourceBookPreview = "AdvP#45",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #45: The Culling Shadow",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "",
      spellTargets = "personal",
      spellArea = "",
      spellEffect = "",
      spellDuration = "",
      spellSavingThrow = "Will (see text)",
      spellResistance = "no",
      spellDescriptionFull = "You shroud yourself with traces of negative energy, appearing to undead creatures as if you’re undead. You gain a +10 circumstance bonus to disguise yourself as an undead creature when dealing with other undead creatures. Unintelligent undead must succeed at a Will save to take hostile actions against you. On a failure, they lose their attempted action, but once a creature succeeds on this Will save, it’s unaffected by your casting of this spell for the remainder of the spell’s duration.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Prowling Junkbot",
      spellPreviewDescription = "This spell functions as the handy junkbot spell, but instead creates a stealthy drone that can investigate and spy, transmitting what it sees back to you.",
      spellSourceBookPreview = "AdvP#25",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #25: The Chimera Mystery",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "1 bulk of inert electronic equipment",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell functions as the handy junkbot spell, but instead creates a stealthy drone that can investigate and spy, transmitting what it sees back to you. A prowling junkbot is Tiny, its EAC and KAC are each equal to 12 + your caster level, and it has a number of Hit Points equal to one tenth of your own (but no Stamina Points). It has a land speed and a climb speed of 30 feet. It can accomplish all tasks described in the Computers, Perception, Sleight of Hand, and Stealth skills, as well as the disable device task of Engineering, is considered trained in those skills, and has a total skill bonus in each equal to 3 + your caster level. A prowling junkbot is treated as if it were using a hacker’s kit when using the Computers skill and an engineering kit when using the Engineering skill. A prowling junkbot has low-light vision and darkvision with a range of 60 feet, and it telepathically transmits everything it sees and hears to you or a computer terminal you touch as part of the original casting of the spell. Images and sound transmitted to a terminal can be recorded.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1"),
      spellTitle = "Proximity Alert",
      spellPreviewDescription = "Set a magical alarm in an area.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "79",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "30-ft.-radius emanation",
      spellEffect = "",
      spellDuration = "2 hours/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You ward an area to alert you when creatures enter without your permission. When you cast proximity alert, select a password. Whenever a Small or larger corporeal creature of a CR lower than your caster level enters the spell's area without speaking the password, proximity alert sends you a mental alert or an audible alarm (your choice). Either option automatically awakens you, and the audible alarm allows each creature in the area to attempt a DC 15 Perception check to wake up.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","Tchn 5"),
      spellTitle = "Prying Eyes",
      spellPreviewDescription = "Twenty floating eyes scout for you.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "370",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "1 mile",
      spellTargets = "",
      spellArea = "",
      spellEffect = "20 magical sensors",
      spellDuration = "1 hour/level (D); see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You create 20 semitangible, visible magical orbs called “eyes.” These eyes move out, scout around, and return as you direct them when casting the spell. Each eye can see 120 feet (normal vision only) in all directions.\n" +
              "\n" +
              "While the individual eyes are quite fragile, they’re small and difficult to spot. Each eye is a Fine construct (about the size of a small apple) with the magical subtype. They each have 1 Hit Point and EAC and KAC of 18, and they fly at a speed of 30 feet with a +20 bonus to Acrobatics checks to fly and a +16 bonus to Stealth checks. An eye has a +20 Perception bonus and is subject to darkness, fog, illusions, and any other factors that affect your ability to receive visual information about your surroundings. An eye traveling in darkness must find its way by touch.\n" +
              "\n" +
              "When you create the eyes, you specify instructions you want them to follow in a command of no more than 25 words. The eyes know anything you know.\n" +
              "\n" +
              "In order to report their findings, the eyes must return to your hand. Each eye replays in your mind all that it has seen during its existence. It takes an eye 1 round to replay 1 hour of recorded images. After relaying all of its findings, an eye simply disappears.\n" +
              "\n" +
              "If an eye ever gets more than 1 mile away from you, it instantly ceases to exist. However, your link with the eye is such that you won’t know if the eye was destroyed because it wandered out of range or because of some other event.\n" +
              "\n" +
              "The eyes exist for up to 1 hour per caster level or until they return to you. Dispel magic can destroy the eyes. Roll separately for each eye caught in an area dispel.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Psychic Sonar",
      spellPreviewDescription = "You project a sonar-like blast of psychic energy that rebounds a moment later.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "63",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "varies by spell level",
      spellTargets = "",
      spellArea = "cone-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous, plus 1 round",
      spellSavingThrow = "Will partial",
      spellResistance = "yes",
      spellDescriptionFull = "You project a sonar-like blast of psychic energy that rebounds a moment later. Creatures in the spell’s area each attempt a Will save. Those who fail take the full damage, and until the end of your next turn, you can sense those creatures as though you had blindsense (thought) with a range equal to the spell’s range. Those who succeed take half damage and can’t be detected with the spell’s blindsense effect. During your next turn, you can repeat this spell’s effect once without spending an action; however, the cone instead must originate from one of the creatures you can sense with the spell’s blindsense effect (and doesn’t include that creature in the spell’s area). You’re immune to your own psychic sonar, and this spell has no effect on creatures without an Intelligence score.\n" +
              "\n" +
              "1st: When you cast psychic sonar as a 1st-level spell, it deals 1d8 damage in a 15-foot cone.\n" +
              "\n" +
              "2nd: When you cast psychic sonar as a 2nd-level spell, it deals 2d8 damage in a 15-foot cone.\n" +
              "\n" +
              "3rd: When you cast psychic sonar as a 3rd-level spell, it deals 3d8 damage in a 20-foot cone.\n" +
              "\n" +
              "4th: When you cast psychic sonar as a 4th-level spell, it deals 5d8 damage in a 30-foot cone.\n" +
              "\n" +
              "5th: When you cast psychic sonar as a 5th-level spell, it deals 5d10 damage in a 30-foot cone.\n" +
              "\n" +
              "6th: When you cast psychic sonar as a 6th-level spell, it deals 7d10 damage in a 60-foot cone.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6"),
      spellTitle = "Psychic Surgery",
      spellPreviewDescription = "Cure all Intelligence, Wisdom, and Charisma damage and drain, plus remove other mental afflictions and conditions.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "370",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (mind-affecting)",
      spellCastingTime = "10 minutes",
      spellRange = "touch",
      spellTargets = "one willing or unconscious, living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Psychic surgery heals the target of all Intelligence, Wisdom, and Charisma damage, and it restores all points permanently drained from the target’s Intelligence, Wisdom, and Charisma scores. It also eliminates all ongoing confusion, fear, and insanity effects. Psychic surgery also removes any mental afflictions that could be removed with dispel magic, as well as mental diseases. Psychic surgery removes all effects magically altering the target’s memory, even instantaneous effects, and it can restore a memory to perfect clarity (even if the memory loss is due to the mundane passage of time).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Psychokinetic Hand",
      spellPreviewDescription = "Telekinetically move an object of 1 bulk or less.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "370",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one unattended object of no more than 10 lbs. or 1 bulk",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You point your finger at the target object, gaining the ability to lift it and move it at will from a distance. As a move action, you can propel the object as far as 15 feet in any direction, though the spell ends if the distance between you and the object ever exceeds the spell’s range. You can’t perform complex operations, such as firing a gun or using a computer, but you can shut a mechanical door or lid and work simple buttons to open or close automated doors or trigger an alarm.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","WtchW 0"),
      spellTitle = "Psychokinetic Shove",
      spellPreviewDescription = "Deal 1 damage with the force descriptor to a creature or object and attempt to move it.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "79",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "one creature or one object, see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "A targeted creature takes 1 damage with the force description unless it succeeds at a Reflex saving throw. A creature that takes the damage is also subjected to a bull rush. Attempt the bull rush combat maneuver, using your caster level + your key ability score modifier as your attack bonus. You can push your target no more than 5 feet.\n" +
              "\n" +
              "An object must be unattended or held by you. It takes 1 damage with the force descriptor. You can also push it up to 10 feet away from you if it weighs 2 bulk or less or up to 5 feet away from you if it weighs up to 5 bulk. The object moves at a harmless velocity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Psychokinetic Strangulation",
      spellPreviewDescription = "Concentrate to immobilize target and deal 3d8 damage per round.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "370",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature that breathes",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration up to 1 round/level",
      spellSavingThrow = "Fortitude partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You manipulate the mystical energy around a creature’s throat into a viselike grip, potentially choking the life out of your victim.\n" +
              "\n" +
              "Each round you concentrate on this spell, it deals 3d8 bludgeoning damage and immobilizes the target. A creature immobilized in this way cannot move and must hold its breath (see page 404). The creature can still attack with any of its weapons (except any bite attacks), cast spells, and so on. Each round the spell affects the target, the target can attempt a Fortitude saving throw to halve the damage and avoid being immobilized.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("WtchW 1"),
      spellTitle = "Puncture Veil",
      spellPreviewDescription = "Tiny needles deal damage plus additional bleed damage for 3 rounds.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "140",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action; see text",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one or two creatures; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You grasp onto a space-time filled with microscopic needles and use them to pierce into your reality. One creature takes 1d4 piercing damage and gains bleeding 1 for 3 rounds.\n" +
              "You can cast this spell as a full action. If you do, you have two options. You can target two creatures within 20 feet of each other with the effect described above, or target only one creature, who takes 2d4 piercing damage and gains bleeding 2 for 3 rounds.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Pyre Wreath",
      spellPreviewDescription = "Creates 3 orbs that can absorb fire damage for the user.",
      spellSourceBookPreview = "AdvP#18",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #18: Assault on the Crucible",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell creates a circle of three fist-sized orbs of flame around the target creature. The orbs increase the light level by one step within a 10-foot-radius of the target. Anytime the target of the spell takes fire damage from an attack or spell, they can spend a reaction to have one of the orbs absorb the blow. That orb disappears and the amount of fire damage is reduced by 5. The orbs cannot be used to absorb fire damage that comes from a continuous or natural environmental effect, such as walking in lava or damage from the burning condition. The spell ends when all three orbs are expended in this manner.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Quick Change",
      spellPreviewDescription = "Adjacent creatures who are unaware of your true form are flat-footed until the beginning of their next turn.",
      spellSourceBookPreview = "AdvP#27",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #27: Deceivers’ Moon",
      spellSchool = "transmutation (polymorph)",
      spellCastingTime = "1 reaction",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Adjacent creatures who are unaware of your true form are flat-footed until the beginning of their next turn. You can cast this spell if you are attacked, or if you attack. If you have the shapechanger subtype or are benefiting from a polymorph effect, you revert to your true form.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Prcg 0","WtchW 0"),
      spellTitle = "Quick Change (Galactic Magic)",
      spellPreviewDescription = "Change the appearance of armor and clothing you're wearing.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "80",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You change the appearance of armor and clothing you wear, provided it all weighs no more than 3 bulk. A creature that interacts with you can attempt a Will saving throw to recognize the illusion.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5","WtchW 5"),
      spellTitle = "Radiation Ray",
      spellPreviewDescription = "Deal 8d12 fire damage to a creature and expose it to high radiation.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "80",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "necromancy (disease, poison, radiation)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You fire a beam of radiation at an opponent. You must attempt a ranged attack against your opponent's EAC, adding your key ability score modifier instead of your Dexterity modifier if it's higher. On a hit, the target takes 8d12 fire damage and is exposed to high radiation. On a critical hit, the target must succeed at a Fortitude save or contract radiation sickness. The target isn't irradiated, and other nearby creatures don't need to attempt Fortitude saves to prevent radiation. The saving throw to resist the radiation effects is set by the spell rather than the standard save DC for radiation.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","WtchW 5"),
      spellTitle = "Raise Dead",
      spellPreviewDescription = "Restore life to a creature that died no more than 1 day per level ago.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "370",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "1 minute",
      spellRange = "touch",
      spellTargets = "one dead creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none, see text",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You restore life to a deceased creature. You can raise a creature that has been dead for no longer than 1 day per caster level. In addition, the target’s soul must be free and willing to return. If the target’s soul is not willing to return, the spell fails; therefore, a target that wants to return to life receives no saving throw against this spell. Casting this spell requires you to create a complex representation of the target deceased creature, worth at least 5,000 credits, to serve as a beacon for the creature’s soul. This object is consumed when you cast the spell.\n" +
              "\n" +
              "Coming back from the dead is an ordeal. The target of the spell gains 2 permanent negative levels when it is raised, just as if it had been hit by a creature’s ability that bestows permanent negative levels. If the target is 1st or 2nd level, it takes 2 Constitution drain instead (if this would reduce its Constitution to 0 or less, it can’t be raised). A raised creature returns with no Resolve Points, no Stamina Points, and no spell slots (until it rests to recover them normally). It has 5 Hit Points. Any ability scores reduced to 0 are raised to 1. Normal poison and normal disease are cured in the process of raising the target, but magical diseases and curses are not undone. While the spell closes mortal wounds and repairs lethal damage of most kinds, the body of the creature to be raised must be whole. Otherwise, missing parts are still missing when the creature is brought back to life.\n" +
              "\n" +
              "The spell can’t bring back a creature that has died of old age. Constructs, elementals, and outsiders can’t be raised by this spell. It is possible to bring back a creature that has been turned into an undead creature, but the beacon for the creature’s soul must be more powerful, and must be worth at least 15,000 credits.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","Tchn 5","WtchW 5"),
      spellTitle = "Rapid Repair",
      spellPreviewDescription = "Construct or weapon regains 2d8 Hit Points per round for 1 minute.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "371",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one construct or weapon",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute",
      spellSavingThrow = "Fortitude negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "On each round, the target construct or weapon regains 2d8 Hit Points. This does not stack with any fast healing the construct or weapon already has. You can’t target a construct or weapon that has been brought to 0 Hit Points or destroyed.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Ray of Exhaustion",
      spellPreviewDescription = "Ray makes target exhausted.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "371",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Fortitude partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You create an enervating ray of magic. You must make a ranged attack against your opponent’s EAC. On a hit, the target is immediately exhausted for the spell’s duration. A creature that succeeds at a Fortitude saving throw is only fatigued, unless it is already fatigued, in which case it instead becomes exhausted despite the saving throw.\n" +
              "\n" +
              "This spell has no effect on a creature that is already exhausted. Unlike normal exhaustion or fatigue, the effect ends as soon as the spell’s duration expires.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4"),
      spellClassesWithLevelPreview = listOf("Myst 4"),
      spellTitle = "Read the Flames",
      spellPreviewDescription = "Gives you a single use bonus in the near future.",
      spellSourceBookPreview = "AdvP#18",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #18: Assault on the Crucible",
      spellSchool = "divination",
      spellCastingTime = "10 minutes",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "24 hours",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "While casting this spell, you must focus on a semi-controlled flame (such as one produced by a lighter or a weapon with the flaming weapon fusion), centering your mind and analyzing the blaze’s movements for subtle patterns that describe the underlying fundamentals of the universe. Once during the spell’s duration, you can center yourself as a standard action (this is a purely mental action) to remember your time spent scrutinizing the flame, choosing one of the benefits below. When the chosen effect ends, so does the spell.\n" +
              "\n" +
              "Mental Clarity: At some point during the next 10 minutes, you can reroll one skill check with a +4 circumstance bonus.\n" +
              "\n" +
              "Physical Clarity: You gain a +4 circumstance bonus to EAC and KAC until the end of your next turn.\n" +
              "\n" +
              "Spiritual Clarity: You can immediately attempt a new saving throw against any mind-affecting effect currently affecting you.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","WtchW 0"),
      spellTitle = "Realign",
      spellPreviewDescription = "End the off-kilter condition.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "80",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature in a zero-gravity environment",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You magically right a creature that's disoriented while floating in a zero-gravity environment. If the target has the off-kilter condition, that condition ends. This doesn't prevent the target from regaining the off-kilter condition.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","WtchW 5"),
      spellTitle = "Reality Bend",
      spellPreviewDescription = "Concentrate on an ally, and shift them up to 10 feet once per round when it’s most convenient.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "140",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one willing creature; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration + 1 round",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no",
      spellDescriptionFull = "You concentrate on overlapping realities and focus them on the target. Once per round, even when it is not your turn, you can move your target up to 10 feet into a space it is willing and able to occupy. This movement can occur only between resolved actions and does not trigger reactions. When you concentrate on this spell, you can shift your focus to a different target.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("WtchW 2"),
      spellTitle = "Reality Leap",
      spellPreviewDescription = "Hop through to another spot within range in this reality with a 50% chance to arrive slightly off target.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "140",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "personal",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none, Will negates (object)",
      spellResistance = "no, yes (object)",
      spellDescriptionFull = "You open an unstable tear in reality and leap into the unknown, emerging at another nearby but unpredictable point in this version of existence. When you cast this spell, you state the direction you wish to travel, the distance within range, and the specific square in which you’re trying to arrive. You can bring along objects, provided their weight doesn’t exceed your maximum load. You travel the correct direction and distance, but you have a 50% chance to arrive elsewhere than your intended square. If you do, use the Missing with a Thrown Weapon diagram to determine the direction you deviate from the intended destination. You arrive 1d6 squares away in that direction, although your deviation cannot cause you to exceed this spell’s range. If you arrive in a place already occupied by a solid object or body, you take 1d6 damage and are shunted to the nearest open space with a suitable surface.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","Tchn 6"),
      spellTitle = "Reanimate",
      spellPreviewDescription = "Reanimate a recently destroyed construct or undead",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "207",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "necromancy",
      spellCastingTime = "1 minute",
      spellRange = "touch",
      spellTargets = "one dead construct or undead creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none, see text",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You can reanimate a dead construct or destroyed undead creature that has been dead or destroyed for no longer than 1 day per caster level. If the target had a soul, that soul must be free and willing to return; a target that wants to be reanimated receives no saving throw against this spell, but if the target’s soul is not willing to return, the spell fails. Casting this spell requires you to create a complex representation of the target deceased creature worth at least 7,500 credits to serve as a blueprint regarding its reanimation. This object is consumed when you cast the spell. If the target is an undead whose existence is tied to an object (such as a necrovite and its electroencephalon), it cannot be brought back without a new version of that object (with at least the same price as the original).\n" +
              "\n" +
              "A reanimated creature returns with no Resolve Points, no Stamina Points, and no spell slots (until it rests to recover them normally). It has 5 Hit Points. Any ability scores reduced to 0 are raised to 1 (though any ability score it normally does not have is unchanged). Diseases, poisons, curses, and computer programming or viruses that affected the target at the time of its destruction remain in effect after reanimation. The spell closes wounds and repairs lethal damage of most kinds, but if the body of the creature to be reanimated isn’t whole, any missing parts are still missing when the creature is brought back to life.\n" +
              "\n" +
              "This spell can reanimate constructs and undead but cannot raise outsiders or restore life to other creatures. Reanimated undead return to unlife as the same type of undead that they were prior to their destruction.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4"),
      spellTitle = "Reanimate Construct",
      spellPreviewDescription = "This spell turns a destroyed construct into a creature that obeys your spoken commands.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "157",
      spellSourceBookFull = "Near Space",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one destroyed construct creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell turns a destroyed construct into a creature that obeys your spoken commands. As a standard action, you can instruct a reanimated construct to either follow you or attack any creature (or type of creature) within 100 feet. This spell otherwise functions like animate dead, and constructs you reanimate with this spell count against the total amount of undead you can control with that spell (and vice versa).\n" +
              "\n" +
              "The reanimated construct is similar to a fully functional version of that creature with the following changes. It has only half of its original Hit Points; any technological gear functions without batteries but technological weapons that require a charge deal only half damage; and it does not regain any uses of consumable items or weapons, such as grenades, or daily-use abilities. The reanimated construct is treated as both magical and technological for all effects (whichever type allows an ability to affect them for abilities that affect only one type, and whichever is worse for abilities that affect both types).\n" +
              "\n" +
              "The target construct must be mostly intact; creatures that have self-destructed, been disintegrated, been used as the target of a spell with “junk” in its name, and the like are not valid targets for this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Prcg 1","Tchn 1"),
      spellTitle = "Recall",
      spellPreviewDescription = "Once during the duration, as a reaction, you can reroll a failed skill check to recall knowledge.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "23",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "24 hours or until expended",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Once during the duration, as a reaction, you can reroll a failed skill check to recall knowledge.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","Tchn 2"),
      spellTitle = "Recharge",
      spellPreviewDescription = "Replenish charges in a battery or item capable of holding charges.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "372",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "one object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "You restore up to 10 charges to a battery or 5 charges to a technological item capable of being charged by a battery. Since this spell takes your personal energy, you must spend 1 Resolve Point to cast it. If you recharge a battery, there is a 20% chance the battery is destroyed by the attempt. If you restore more charges than the item can hold, the item must succeed at a Fortitude saving throw or take 1d6 electricity damage for each excess charge. This spell provides no knowledge of how many charges an item can safely hold, but you can choose to bestow fewer charges than the maximum allowed to reduce the risk; you must declare how many charges you are restoring before casting this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1"),
      spellTitle = "Reflecting Armor",
      spellPreviewDescription = "Sheath of mystical force can reflect damage back on foe.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "372",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration (force)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level or until dismissed (D); see text",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You create a shimmering skin-like coating of mystical force that covers your body, allowing you to reflect damage you take back against your attacker. At any time during this spell’s duration, when you take damage from an attack made with a weapon by a foe within 100 feet, you can choose to dismiss the spell as a reaction. If you do, the armor crackles with energy as it disappears, arcing through the air to strike the attacking creature, which takes an amount of damage equal to the damage dealt to you at the time this spell was dismissed (maximum 10). This damage also has the force descriptor. The target can attempt a Reflex save for half damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4","WtchW 4"),
      spellTitle = "Reformat",
      spellPreviewDescription = "This spell attacks the target creature’s programming, erasing important subroutines that allow the creature function.",
      spellSourceBookPreview = "AdvP#51",
      spellSourcePage = "50",
      spellSourceBookFull = "Adventure Path #51: Into the Dataverse",
      spellSchool = "necromancy (curse)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature with the technological subtype",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates and Fortitude half",
      spellResistance = "yes",
      spellDescriptionFull = "This spell attacks the target creature’s programming, erasing important subroutines that allow the creature function. It’s banned on several tech-heavy worlds like Aballon.\n" +
              "\n" +
              "If the target fails the initial saving throw, then for the duration of the spell, there’s a 50% chance the target is staggered for 1 round at the start of its turn. During any round the target isn’t staggered due to this spell, it takes 8d6damage as a result of missing code; the target can attempt a Fortitude save to halve this damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6"),
      spellTitle = "Regenerate",
      spellPreviewDescription = "Grow back target’s severed limbs, restore 12d8 Hit Points, and remove exhaustion and fatigue.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "372",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "3 rounds",
      spellRange = "touch",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The target’s severed body members (fingers, toes, hands, feet, arms, legs, tails, or even heads of multiheaded creatures), broken bones, and ruined organs (including eyes) grow back. After the spell is cast, the physical regeneration is complete in 1 round if the severed members are present and touching the creature. It takes 2d10 rounds otherwise.\n" +
              "\n" +
              "Regenerate also restores 12d8 Hit Points, rids the target of exhaustion and fatigue, and eliminates all nonlethal damage the target has taken. It has no effect on nonliving creatures (including undead).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Reincarnate",
      spellPreviewDescription = "Bring a target dead creature back to life in a random body.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "372",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "10 minutes",
      spellRange = "touch",
      spellTargets = "one dead creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous; see text",
      spellSavingThrow = "none, see text",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "When you cast this spell, you bring back a dead creature in another body, provided that its death occurred no more than 1 week before the casting of the spell and the target’s soul is free and willing to return. If the target’s soul is not willing to return, the spell fails; therefore, a target that wants to return receives no saving throw. Casting this spell requires a special monument worth at least 1,000 credits to serve as a beacon for the departed creature’s soul. This object is consumed when you cast the spell.\n" +
              "\n" +
              "Since the dead creature is returning in a new body, all physical ills and afflictions are removed. The condition of the creature’s remains is not a factor. So long as some small portion of the creature’s body still exists, it can be reincarnated, but the portion receiving the spell must have been part of the creature’s body at the time of death. The magic of the spell creates an entirely new young adult body for the soul to inhabit from the natural elements at hand. This process takes 1 hour to complete. When the body is ready, the target is reincarnated.\n" +
              "\n" +
              "A reincarnated creature recalls the majority of its former life and form. It retains any class features, feats, and skill ranks it formerly had. Its class, base attack bonus, base save bonuses, and Hit Points are unchanged. The creature should recalculate its ability scores from scratch as a member of its new race (remembering to include any ability score increases from leveling up). The target of the spell gains 2 permanent negative levels when it is reincarnated. If the target is 1st level, it takes 2 Constitution drain instead (if the Constitution drain would reduce its Constitution to 0 or less, the creature cannot be reincarnated). The target creature can decide whether its new body retains any of the implants it had in its former body. A spellcasting creature has a 50% chance of losing any given unused spell slot as if it had been used to cast a spell.\n" +
              "\n" +
              "For a humanoid creature, the new incarnation is determined using the table on the facing page. For nonhumanoid creatures, a similar table of creatures of the same type should be created.\n" +
              "\n" +
              "Elementals, outsiders, and undead creatures can’t be reincarnated. Any creature that can’t benefit from the mystic cure spell cannot be reincarnated. The spell can bring back a creature that has died of old age.\n" +
              "\n" +
              "The reincarnated creature gains all abilities associated with its new form, including any forms of movement and speeds, natural attacks, extraordinary abilities, and the like, but it does not automatically speak the language of the new form it takes.\n" +
              "\n" +
              "D% : Incarnation\n" +
              "1–6 : Android\n" +
              "7–14 : Dwarf\n" +
              "15–22 : Elf\n" +
              "23–30 : Gnome\n" +
              "31–34 : Half-elf\n" +
              "35–38 : Half-orc\n" +
              "39–46 : Halfling\n" +
              "47–55 : Human\n" +
              "56–64 : Lashunta\n" +
              "65–73 : Kasatha\n" +
              "74–81 : Shirren\n" +
              "82–90 : Vesk\n" +
              "91–99 : Ysoki\n" +
              "100 : Other (GM’s choice)\n" +
              "\n" +
              "A miracle or wish spell can restore a reincarnated creature to its original form.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2"),
      spellClassesWithLevelPreview = listOf("Myst 2"),
      spellTitle = "Reject Augmentation",
      spellPreviewDescription = "Targeted creature is sickened and can't use any augmentations for the duration",
      spellSourceBookPreview = "Armory",
      spellSourcePage = "148",
      spellSourceBookFull = "Armory",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Fortitude negates",
      spellResistance = "yes",
      spellDescriptionFull = "You urge the target creature’s natural systems to reassert themselves, causing its body to temporarily reject augmentations that have been installed in its systems. For the spell’s duration, the creature is sickened and can’t use any augmentations that require an action to activate. Creatures that don’t have augmentations are not affected by this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 3"),
      spellTitle = "Remembrance",
      spellPreviewDescription = "Glimpse a past event.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "80",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 hour",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Formulated in conjunction with shimmerstone-induced meditation, kothama favor the use of this spell to contemplate the past. Through an intense meditative trance, you peer into the past and experience a glimpse of historical events that occurred surrounding a specific event, object, person, or place. Casting this spell requires you to expend 1 Resolve Point, and you must declare the focus of your remembrance when you cast the spell. The information granted by this spell can be as simple as a series of images in your mind, or it might take the form of a cryptic message. The chance for a correct remembrance is 75% for events that occurred within the past 50 years, 60% for events that occurred between 51 and 150 years ago, and 45% for events that occurred between 151 years ago and the Gap. Attempts to glean information from during the Gap or earlier automatically fail. If the die roll fails, you know the spell failed, unless specific magic yielding false information is at work.\n" +
              "\n" +
              "Unlike divination, multiple castings of remembrance about the same topic by the same caster use the same die result as the first remembrance spell but yield different pieces of information each time.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Remote Operation",
      spellPreviewDescription = "Remotely operate the controls of a computer or vehicle out to a short distance.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "140",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "one operable technological device no larger than a vehicle that is not a starship",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration + 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "A holographic duplicate of the target’s controls appears within your reach. If the target has no controls, the spell fails. As part of concentrating on this spell, you (and only you) can use these holocontrols to operate the target as if you were able to touch its actual controls. The spell ends if the target moves out of range.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3"),
      spellTitle = "Remote Pilot",
      spellPreviewDescription = "Pilot a vehicle remotely as though you were in it.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "80",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one vehicle with a level no greater than your level + 1",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You transfer a sliver of your consciousness into a vehicle, enabling you to take actions to pilot it remotely. During the spell's duration, you can pilot the vehicle as if you were in it, except you can use your Mysticism skill to pilot the vehicle in place of Piloting. As long as you remotely pilot the vehicle, the vehicle is considered controlled. This spell ends if you lose sight of the vehicle.\n" +
              "\n" +
              "Uncontrolled and unsecured vehicles are automatically affected by this spell. If you attempt to affect a controlled vehicle, the pilot can attempt a Piloting check with a DC equal to 11 + your caster level to negate the effect. Each round a creature within the vehicle attempts to pilot or take control of the vehicle, they must attempt a Piloting check opposed by your Mysticism check. On a success, they take control of the vehicle, otherwise, you retain control.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","WtchW 3"),
      spellTitle = "Remove Affliction",
      spellPreviewDescription = "Neutralize curses, diseases, infestations, poisons, and other harmful conditions affecting a creature.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "373",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous or 10 minutes/level; see text",
      spellSavingThrow = "Will negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "You remove impurities from a creature or object, potentially neutralizing the curses, diseases, infestations, poisons, and other harmful conditions affecting it. If the target is a creature, you must attempt a caster level check (1d20 + your caster level) for each curse, disease, infestation, and poison affecting it (DC = 4 + the DC of the affliction). Success means that affliction is removed. Additionally, if the target is blind or deaf due to an affliction or damage, remove affliction restores vision and hearing unless the appropriate organ has been entirely removed from the creature’s body.\n" +
              "\n" +
              "A creature that is cured with remove affliction takes no additional effects from the curses, diseases, infestations, or poisons removed, and any temporary effects are ended, but the spell does not reverse instantaneous effects, such as Hit Point damage, temporary ability damage, or effects that don’t go away on their own (such as poison states). This spell cannot remove the curse from a cursed item, though a successful caster level check enables the creature afflicted with any such cursed item to remove the curse and get rid of it. Since the spell’s duration is instantaneous, it does not prevent the target from suffering from the same curse, disease, infestation, or poison after a new exposure at a later date.\n" +
              "\n" +
              "You can instead cast this spell to neutralize the poison in a poisonous creature or object for 10 minutes per level. If you cast it on a creature, the creature can attempt a Will saving throw to negate the effect.\n" +
              "\n" +
              "Remove affliction counters bestow curse.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","WtchW 5"),
      spellTitle = "Remove Condition, Greater",
      spellPreviewDescription = "Remove all harmful conditions affecting a creature.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "373",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as lesser remove condition, except you remove all of the following conditions affecting the target: cowering, dazed, frightened, nauseated, panicked, paralyzed, shaken, sickened, staggered, and stunned.\n" +
        "\n" +"(Remove Condition, Lesser: You remove any one of the following conditions affecting the target: shaken, sickened, or staggered. If the condition is the result of a disease or another ongoing effect, this spell removes the condition but does not cure the disease or ongoing effect, and the target can regain the condition from that effect as normal, potentially immediately. Lesser remove condition also doesn’t cure or remove other damage or conditions the target is suffering from any source, even the same source that caused the removed condition. Since this spell’s duration is instantaneous, it does not prevent the target from gaining the condition again.\n" +
              "\n" +
              "Casting this spell doesn’t provoke attacks of opportunity.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","WtchW 1"),
      spellTitle = "Remove Condition, Lesser",
      spellPreviewDescription = "Remove one minor harmful condition affecting a creature.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "373",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You remove any one of the following conditions affecting the target: shaken, sickened, or staggered. If the condition is the result of a disease or another ongoing effect, this spell removes the condition but does not cure the disease or ongoing effect, and the target can regain the condition from that effect as normal, potentially immediately. Lesser remove condition also doesn’t cure or remove other damage or conditions the target is suffering from any source, even the same source that caused the removed condition. Since this spell’s duration is instantaneous, it does not prevent the target from gaining the condition again.\n" +
              "\n" +
              "Casting this spell doesn’t provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","WtchW 2"),
      spellTitle = "Remove Condition",
      spellPreviewDescription = "Remove one moderate harmful condition affecting a creature.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "373",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions in the same way as lesser remove condition, except you remove any one of the following conditions affecting the target: frightened, nauseated, paralyzed, shaken, sickened, or staggered.\n" +
              "\n" +"(Remove Condition, Lesser: You remove any one of the following conditions affecting the target: shaken, sickened, or staggered. If the condition is the result of a disease or another ongoing effect, this spell removes the condition but does not cure the disease or ongoing effect, and the target can regain the condition from that effect as normal, potentially immediately. Lesser remove condition also doesn’t cure or remove other damage or conditions the target is suffering from any source, even the same source that caused the removed condition. Since this spell’s duration is instantaneous, it does not prevent the target from gaining the condition again.\n" +
              "\n" +
              "Casting this spell doesn’t provoke attacks of opportunity.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Remove Radioactivity",
      spellPreviewDescription = "Remove ongoing radiation effects from a creature or object.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "374",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or object",
      spellArea = "one 20-ft.-radius area or",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "You remove all ongoing effects of radiation from a single target if you succeed at a caster level check (DC = the DC associated with the radiation effect). The target is cured of both the radiation’s poison effects and the radiation sickness disease, moving the target to the healthy state on both tracks. When cast on an area, a single casting of remove radioactivity removes radiation from a 20-foot-radius area around the point you touch. This spell has no power to negate naturally radioactive materials, and as long as such materials remain in an area, the radiation that was removed may return.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5","WtchW 5"),
      spellTitle = "Render",
      spellPreviewDescription = "This spell creates a digital representation of an extraplanar creature, object, or magical effect.",
      spellSourceBookPreview = "AdvP#51",
      spellSourcePage = "50",
      spellSourceBookFull = "Adventure Path #51: Into the Dataverse",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "see text",
      spellTargets = "",
      spellArea = "",
      spellEffect = "see text",
      spellDuration = "see text",
      spellSavingThrow = "Will disbelief (if interacted with); varies; see text",
      spellResistance = "yes; see text",
      spellDescriptionFull = "This spell creates a digital representation of an extraplanar creature, object, or magical effect. Render can mimic any conjuration (creation) or conjuration (summoning) spell of 4th level or lower. These digital representations are made up of hardlight and code and are only one-fourth (25%) as strong as the real things, though creatures that believe the rendered representations are real are affected by them at full strength. Any creature that interacts with the effect of the spell can attempt a Will saving throw to recognize its true nature. A creature that succeeds at its save sees the rendered effect as translucent digital representations with a small amount of pixelation around the image’s edges.\n" +
              "\n" +
              "Spells that deal damage have normal effects unless the affected creature succeeds at a Will save. Each disbelieving creature takes only one-fourth (25%) damage from the representation’s attack. If the disbelieved attack has a special effect other than damage, it’s only 25% likely to occur. Regardless of the result of the save to disbelieve, an affected creature is also allowed any save that the spell being simulated allows, but the save DC is set according to render’s level (5th) rather than the spell’s normal level. In addition, any effect created by render allows spell resistance, even if the spell it’s simulating doesn’t. Rendered objects or substances have normal effects except against those that disbelieve them. Against disbelievers, they’re 25% likely to work.\n" +
              "\n" +
              "A rendered hardlight creature has one-fourth the Hit Points of a normal creature of its kind (regardless of whether it’s recognized as a digital representation). It deals normal damage and has all normal abilities and weaknesses. Against a creature that recognizes it as a digital representation, however, the rendered creature’s damage is one-fourth (25%) of the normal damage, and all special abilities that don’t deal lethal damage are only 25% likely to work as normal. (Roll for each use and affected character separately.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Resilient Sphere",
      spellPreviewDescription = "Force globe protects but traps one target.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "374",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one Large or smaller creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Reflex negates",
      spellResistance = "yes",
      spellDescriptionFull = "A 10-foot-diameter globe of shimmering force encloses the target creature. The sphere contains the target for the spell’s duration. The sphere functions in the same way as a wall of force, except it can be negated by dispel magic. A target inside the sphere can breathe normally. The sphere can’t be physically moved either by creatures outside it or by the struggles of those within.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
      spellTitle = "Resist Radiation",
      spellPreviewDescription = "Automatically succeed at saving throws against weak radiation and suppress radiation sickness.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "140",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "none (harmless)",
      spellResistance = "no (harmless)",
      spellDescriptionFull = "You protect targets from radiation. They succeed at saving throws against low radiation and radiation sickness with a DC of 13 or lower. If the target has radiation sickness with a saving throw DC of 13 or lower, the sickness’s effects are suppressed for the duration. Against radiation and radiation sickness with higher save DCs, this spell instead grants targets a +2 circumstance bonus to the saving throws.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Tchn 5","WtchW 5"),
      spellTitle = "Resistant Aegis",
      spellPreviewDescription = "Grant up to 10 creatures DR 5/— or energy resistance 5 to all energy types.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "374",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "up to 10 creatures wearing armor within range",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as lesser resistant armor, except as indicated above, and the wearers and their gear gain DR 5/— or energy resistance 5 that protects against all five energy types.\n" +
              "\n" +
              "(Lesser Resist Armor: Lesser resistant armor grants the target (and its gear) protection from your choice of either kinetic damage or energy damage. If you choose kinetic damage, the target and her gear gain DR 5/— that protects against bludgeoning, piercing, and slashing damage. If you choose energy damage, pick any two of acid, cold, electricity, fire, and sonic damage. The target and her gear gain energy resistance 5 that protects against the chosen types of energy. This damage reduction or energy resistance doesn’t stack with any damage reduction or energy resistance the target already has, and multiple castings of this spell don’t stack.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Resistant Armor, Greater",
      spellPreviewDescription = "Grant DR 15/— or energy resistance 15 against four energy types.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "374",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature wearing armor",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as lesser resistant armor, but the target and her gear gain DR 15/— or energy resistance 15 that protects against four energy types.\n" +
              "\n" +
              "(Lesser Resist Armor: Lesser resistant armor grants the target (and its gear) protection from your choice of either kinetic damage or energy damage. If you choose kinetic damage, the target and her gear gain DR 5/— that protects against bludgeoning, piercing, and slashing damage. If you choose energy damage, pick any two of acid, cold, electricity, fire, and sonic damage. The target and her gear gain energy resistance 5 that protects against the chosen types of energy. This damage reduction or energy resistance doesn’t stack with any damage reduction or energy resistance the target already has, and multiple castings of this spell don’t stack.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Resistant Armor, Lesser",
      spellPreviewDescription = "Grant DR 5/— or energy resistance 5 against two energy types.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "374",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature wearing armor",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "Lesser resistant armor grants the target (and its gear) protection from your choice of either kinetic damage or energy damage. If you choose kinetic damage, the target and her gear gain DR 5/— that protects against bludgeoning, piercing, and slashing damage. If you choose energy damage, pick any two of acid, cold, electricity, fire, and sonic damage. The target and her gear gain energy resistance 5 that protects against the chosen types of energy. This damage reduction or energy resistance doesn’t stack with any damage reduction or energy resistance the target already has, and multiple castings of this spell don’t stack.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Resistant Armor",
      spellPreviewDescription = "Grant DR 10/— or energy resistance 10 to three energy types.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "374",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature wearing armor",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as lesser resistant armor, but the target and her gear gain DR 10/— or energy resistance 10 that protects against three energy types.\n" +
              "\n" +
              "(Lesser Resist Armor: Lesser resistant armor grants the target (and its gear) protection from your choice of either kinetic damage or energy damage. If you choose kinetic damage, the target and her gear gain DR 5/— that protects against bludgeoning, piercing, and slashing damage. If you choose energy damage, pick any two of acid, cold, electricity, fire, and sonic damage. The target and her gear gain energy resistance 5 that protects against the chosen types of energy. This damage reduction or energy resistance doesn’t stack with any damage reduction or energy resistance the target already has, and multiple castings of this spell don’t stack.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
      spellTitle = "Restoration, Lesser",
      spellPreviewDescription = "Dispel magical ability penalty or cure 1d4 ability damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "374",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "3 rounds",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "Lesser restoration dispels any magical effects reducing one of the target’s ability scores, or it heals 1d4 temporary ability damage to one of the target’s ability scores. It also eliminates any fatigue suffered by the creature or improves an exhausted condition to fatigued, but it doesn’t remove any underlying source of fatigue or exhaustion. It also doesn’t heal permanent ability drain. A target that has benefited from the removal of fatigue or the reduction of exhaustion from lesser restoration can’t benefit from either effect again for 24 hours.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4"),
      spellTitle = "Restoration",
      spellPreviewDescription = "Restores ability score drain and negative levels.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "374",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "3 rounds",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as lesser restoration, except it also removes temporary negative levels or 1 permanent negative level. You must spend 5 Resolve Points when casting this spell to remove a permanent negative level. This spell can’t be used to remove more than 1 permanent negative level from a target in a 1-week period.\n" +
              "\n" +
              "Restoration heals all temporary ability damage, and it restores all points permanently drained from a single ability score (your choice if more than one is drained). It also eliminates any fatigue or exhaustion suffered by the target, but it doesn’t remove any underlying source of fatigue or exhaustion. A target that has benefited from the removal of fatigue or exhaustion from this spell can’t benefit from either effect again for 24 hours.\n" +
              "\n" +
              "(Lesser Restoration: Lesser restoration dispels any magical effects reducing one of the target’s ability scores, or it heals 1d4 temporary ability damage to one of the target’s ability scores. It also eliminates any fatigue suffered by the creature or improves an exhausted condition to fatigued, but it doesn’t remove any underlying source of fatigue or exhaustion. It also doesn’t heal permanent ability drain. A target that has benefited from the removal of fatigue or the reduction of exhaustion from lesser restoration can’t benefit from either effect again for 24 hours.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2"),
      spellTitle = "Restore Consumable",
      spellPreviewDescription = "Create a new copy of a consumable item when it's used.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "80",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration",
      spellCastingTime = "1 reaction",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "As a reaction after an ally uses a consumable item (such as a grenade or serum, but not ammunition), you can rewind time to the moment before the item's use, creating a new copy of the item in its position before use. You immediately lose a combination of credits, UPBs, or both equal to the price of the item. You can't cast this spell if you don't have sufficient credits or UPBs to pay for the item.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5"),
      spellTitle = "Retrocognition",
      spellPreviewDescription = "Gain psychic impressions of past events in a certain location.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "375",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, up to 1 minute/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "This spell allows you to gain psychic impressions from past events that occurred in your current location. Retrocognition reveals psychic impressions from events that occurred over the course of the last hour throughout the first minute of the spell’s duration, followed by impressions from the next hour back throughout the next minute you concentrate, and so on. If a psychically traumatic or turbulent event happened during that period, you must succeed at a Will saving throw (DC = 15, 20, or 25, depending on the severity of the traumatic or turbulent event) or lose your concentration on the spell. If you fail this saving throw, the spell ends.\n" +
              "\n" +
              "At caster level 16th and higher, you can choose to collect impressions from over the course of a longer interval of time than an hour, beginning at 1 week per minute of concentration (as listed on the table below). The amount of detail you receive diminishes, so this eventually makes it harder to distinguish impressions left by anything but the most major events. In most circumstances, you can’t glean information about what occurred during the Gap with this spell.\n" +
              "\n" +
              "Caster Level : Period\n" +
              "16th–17th : 1 week per minute\n" +
              "18th–19th : 1 year per minute\n" +
              "20th : 1 decade per minute",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6"),
      spellTitle = "Rewire Flesh, Mass",
      spellPreviewDescription = "Deal 3d6 damage per round and reducing targets’ speed during that time.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "376",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to one living creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D); see text",
      spellSavingThrow = "Will negates and Fortitude half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "This functions as rewire flesh, except as stated above.\n" +
              "\n" +
              "(Rewire Flash: Like rewriting the code that makes up a computer program, you manipulate the target’s DNA to painfully rewire that target’s biological functions to mimic the cold and rigid processes of a robot. The target must succeed at a Will saving throw, or all of its movement speeds are halved and it takes 3d6 slashing damage per round on its turn as its internal organs shift and transform to become more like the inner components of a robot. Each round, the target can attempt a Fortitude saving throw to halve the damage this spell causes.\n" +
              "\n" +
              "While this spell is in effect, the target’s body becomes visibly more robotic; its voice is tinny and halting, its movements are jerky, and its face is unmoving and emotionless. The target has the flat-footed condition, and it takes a –2 penalty to all Sense Motive checks as well as to all Charisma-based and Dexterity-based skill and ability checks.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Rewire Flesh",
      spellPreviewDescription = "Turn target partially into a robot, dealing 3d6 damage per round and reducing speed.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "375",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D); see text",
      spellSavingThrow = "Will negates and Fortitude half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "Like rewriting the code that makes up a computer program, you manipulate the target’s DNA to painfully rewire that target’s biological functions to mimic the cold and rigid processes of a robot. The target must succeed at a Will saving throw, or all of its movement speeds are halved and it takes 3d6 slashing damage per round on its turn as its internal organs shift and transform to become more like the inner components of a robot. Each round, the target can attempt a Fortitude saving throw to halve the damage this spell causes.\n" +
              "\n" +
              "While this spell is in effect, the target’s body becomes visibly more robotic; its voice is tinny and halting, its movements are jerky, and its face is unmoving and emotionless. The target has the flat-footed condition, and it takes a –2 penalty to all Sense Motive checks as well as to all Charisma-based and Dexterity-based skill and ability checks.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 9"),
      spellClassesWithLevelPreview = listOf("Prcg -"),
      spellTitle = "Rewrite Time",
      spellPreviewDescription = "You unknit the fabric of time and remake it to suit your will.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "81",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "universal",
      spellCastingTime = "1 standard action",
      spellRange = "see text",
      spellTargets = "see text",
      spellArea = "see text",
      spellEffect = "see text",
      spellDuration = "see text",
      spellSavingThrow = "see text",
      spellResistance = "see text",
      spellDescriptionFull = "You unknit the fabric of time and remake it to suit your will. A rewrite time spell can produce one of the following effects.\n" +
              "\n" +
              "-Duplicate any precog spell of 6th level or lower.\n" +
              "\n" +
              "-Duplicate any other spell of 5th level or lower.\n" +
              "\n" +
              "-Undo the harmful effects of certain spells, such as feeblemind.\n" +
              "\n" +
              "-Produce an effect of a power level in line with the above.\n" +
              "\n" +
              "At the GM's discretion, rewrite time can produce greater effects, but can be dangerous or might have only a partial effect.\n" +
              "\n" +
              "A duplicated spell allows saving throws and spell resistance as normal, but the save DCs are as for a 7th-level spell. For other effects based on spell level, rewrite time is a 9th- level spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Rhapsodic Aegis",
      spellPreviewDescription = "Use sonic energy as a protective barrier.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "81",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "30-ft.-radius emanation centered on you",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Rhapsodic aegis, a spell devised by the battle musicians of ancient Pulonis, allows its caster to compose sonic energy into a protective barrier. Casting this spell grants you and each ally within range sonic resistance 5 and 10 temporary Hit Points. If lost, these temporary Hit Points can't be restored, and they don't stack with any other source of temporary Hit Points.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Ride The Wave",
      spellPreviewDescription = "You briefly become a miniature River Between, coursing across the landscape in an instant.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "123",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "evocation (water)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You briefly become a miniature River Between, coursing across the landscape in an instant.\n" +
              "\n" +
              "When you cast this spell, you transform into a stream of water and can move up to 120 feet with a supernatural fly speed (perfect maneuverability). This movement can pass through (but can’t end in) enemy spaces and doesn’t provoke attacks of opportunity. The transformation ends at the end of your movement. Creatures and objects whose space you pass through take 5d8 bludgeoning damage. A creature or object takes this damage only once even if you pass through its space multiple times.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","Tchn 5"),
      spellTitle = "Rocket Dash, Greater",
      spellPreviewDescription = "This spell functions like rocket dash, except it deals 11d6 fire damage to all creatures in the line.",
      spellSourceBookPreview = "RdsR",
      spellSourcePage = "59",
      spellSourceBookFull = "Redshift Rally",
      spellSchool = "evocation (fire)",
      spellCastingTime = "1 standard action",
      spellRange = "90 ft.",
      spellTargets = "",
      spellArea = "line-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions like rocket dash, except it deals 11d6 fire damage to all creatures in the line. On a failed saving throw, a creature additionally gains the burning condition for 1d6 points of fire damage.\n" +
              "(Rocket Dash: You briefly transform into a rocket of flame and blast forward, moving in a straight line and dealing 5d6 fire damage to all creatures and objects in the line, and then you reappear at the end of the line. This movement doesn’t provoke attacks of opportunity and allows you to move through enemy spaces.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","Tchn 2"),
      spellTitle = "Rocket Dash",
      spellPreviewDescription = "You briefly transform into a rocket of flame and blast forward, moving in a straight line and dealing 5d6 fire damage to all creatures and objects in the line, and then you reappear at the end of the line.",
      spellSourceBookPreview = "RdsR",
      spellSourcePage = "59",
      spellSourceBookFull = "Redshift Rally",
      spellSchool = "evocation (fire)",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "line-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You briefly transform into a rocket of flame and blast forward, moving in a straight line and dealing 5d6 fire damage to all creatures and objects in the line, and then you reappear at the end of the line. This movement doesn’t provoke attacks of opportunity and allows you to move through enemy spaces.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1","Tchn 1","WtchW 1"),
      spellTitle = "Scan Environment",
      spellPreviewDescription = "You analyze the naturally occurring environment in the area, learning the state of the atmosphere, biomes, and gravity.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "23",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "1 mile/level",
      spellTargets = "",
      spellArea = "emanation with radius of 1 mile/level centered on you",
      spellEffect = "",
      spellDuration = "concentration, up to 1 minute/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You analyze the naturally occurring environment in the area, learning the state of the atmosphere, biomes, and gravity. You do not learn the location of or direction to these conditions, only their presence. However, after concentrating for a time, you can learn the following additional information.\n" +
              "\n" +
              "1 Minute: Forecast the weather for the next 48 hours, including the direction it will come from.\n" +
              "\n" +
              "5 Minutes: Learn which atmospheres, biomes, and gravity are in the area, if they vary, as well as the direction and distance to those elements.\n" +
              "\n" +
              "10 Minutes: Learn if anything in the area presents an environmental hazard, including cold or heat dangers (at what temperature range), radiation (at what severity), smoke effects, and underwater conditions. You gain a general sense of where and how far away these dangers are.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2","WtchW 2"),
      spellTitle = "School Spirit",
      spellPreviewDescription = "In your time of need, you call upon a spirit of your school to help you.",
      spellSourceBookPreview = "AdvP#30",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #30: Puppets Without Strings",
      spellSchool = "enchantment (emotion, fear, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./level)",
      spellTargets = "",
      spellArea = "30-ft.-radius spread",
      spellEffect = "",
      spellDuration = "1 minute",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "In your time of need, you call upon a spirit of your school to help you. The spirit might manifest as a famous graduate of your school, your school’s mascot, your school’s symbol, or just the specter of a terrifying professor; regardless, the spirit’s ghostly appearance demoralizes your foes. Enemies who begin their turn within the effect or who enter it must succeed at a Will saving throw or be shaken for 1 minute.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Secret Locker",
      spellPreviewDescription = "You banish a storage container—such as a backpack, chest, or trunk—to a random location on the Ethereal Plane.",
      spellSourceBookPreview = "AdvP#32",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #32: The Starstone Blockade",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one portable storage container and its contents; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 day; see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You banish a storage container—such as a backpack, chest, or trunk—to a random location on the Ethereal Plane. The container must be no larger than 1 cubic foot per caster level, can have contents of up to 1 bulk per 2 caster levels, and can contain no sentient creatures. You can return the container to your space with a move action; this ends the spell. Every day, when you regain your spell slots, you can choose to expend a 4th-level spell slot to keep the targeted container on the Ethereal Plane for another day. If you choose not to do so, the container is lost on the Ethereal Plane and you can no longer recall it with this spell, though you can search for it in other ways. Time passes normally for the container and its contents.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6"),
      spellTitle = "Security Protocol",
      spellPreviewDescription = "Protect a building or starship with various technological and magical defenses.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "140",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "abjuration",
      spellCastingTime = "30 minutes",
      spellRange = "see text",
      spellTargets = "one building or starship up to 200 sq. ft./level in size; see text (D)",
      spellArea = "",
      spellEffect = "",
      spellDuration = "2 hours/level",
      spellSavingThrow = "see text",
      spellResistance = "see text",
      spellDescriptionFull = "You protect one building or starship you are within by outfitting it with various technological and magical effects. This spell can protect a contiguous area delineated by walls or other enclosed structures, such as part of a large indoor complex, but you must designate the area along the walls or other significant partitions that separate rooms and corridors—the area cannot protect only part of any room or hallway.\n" +
              "\n" +
              "Once cast, this spell creates the following effects. Effects that allow saving throws or spell resistance say so. Spell effects are treated as if you had cast that spell at your caster level, have a save DC equal to this spell’s, and last as long as this spell does.\n" +
              "\n" +
              "Confusion: Where choices in direction exist, a minor confusing effect imposes a 50% chance that the creature goes in a random wrong direction. This is an enchantment, mind-affecting effect. Spell resistance applies.\n" +
              "\n" +
              "Doors: Doors you choose are affected as if by security seal.\n" +
              "\n" +
              "Fog: Areas you designate are filled with dense fog clouds that obscure the area like a fog cloud spell, up to a number of clouds equal to half your caster level.\n" +
              "\n" +
              "Hidden Doors: One door per caster level can be concealed with a 1st-level holographic image that makes it appear to be a plain wall. This effect allows a Will saving throw to disbelieve the illusion, with a DC equal to this spell’s DC.\n" +
              "\n" +
              "Laser Nets: Areas you designate are protected as if by the laser net spell . This effect allows Reflex saves as described in that spell, with a DC equal to this spell’s DC.\n" +
              "\n" +
              "In addition, when you cast this spell, you can place one of the following effects.\n" +
              "\n" +
              "-Dancing lights (Core Rulebook pg. 347) in four corridors, as the spell.\n" +
              "\n" +
              "-Grease (Core Rulebook pg. 357) in two places. This effect allows Reflex saving throws as described in that spell, with a DC equal to this spell’s DC.\n" +
              "\n" +
              "-Logic bomb (Core Rulebook pg. 364) on two computers in the area. This effect allows a Fortitude saving throw as described in that spell, and spell resistance applies.\n" +
              "\n" +
              "-A smog bank (Character Operations Manual pg. 141) in two places.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Security Seal",
      spellPreviewDescription = "Magically lock a portal, a container, or a security system.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "376",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one door, container, or portal up to 30 sq. ft./level in size",
      spellArea = "",
      spellEffect = "",
      spellDuration = "24 hours",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "A security seal spell magically locks a single door, container with a lid or latch, portal, or computer system. Casting this spell requires you to spend 1 Resolve Point. You can freely bypass your own security seal without affecting it. If the sealed object has a lock, the DC to open that lock increases by 5 while it remains attached to the object. If the object doesn’t have a lock, this spell creates one that can only be opened with a successful DC 20 Engineering check to disable devices. If the sealed object has computer security, the DC to bypass that security increases by 5. A door or object secured with this spell can be opened only by breaking in or with a successful dispel magic or knock spell. Add 5 to the normal DC to break open a door or portal affected by this spell. A knock spell removes the security seal automatically, counting as one means of closure.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","Tchn 2","WtchW 2"),
      spellTitle = "See Invisibility",
      spellPreviewDescription = "See invisible creatures or objects.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "376",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You can see any invisible or ethereal objects or beings within your range of vision, as if they were normally visible. Such creatures are visible to you as translucent shapes, allowing you easily to discern the difference between visible and invisible or ethereal creatures.\n" +
              "\n" +
              "The spell doesn’t reveal the method used to obtain invisibility, doesn’t reveal illusions or enable you to see through opaque objects, and doesn’t reveal creatures that are simply concealed, hiding, or otherwise hard to see.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Seeking Shot",
      spellPreviewDescription = "Cause a single attack to ignore cover and concealment",
      spellSourceBookPreview = "PactW",
      spellSourcePage = "207",
      spellSourceBookFull = "Pact Worlds",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one weapon",
      spellArea = "",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You create a spiritual link between a weapon you touch and one target you can perceive with a precise sense at the time of casting. The next attack made with that weapon against that target (as long as it is within 1 minute) ignores cover and concealment. If the attack is a ranged attack, it does not need a line of effect as long as some route exists between the weapon and the target (regardless of how circuitous that route is). The attack is subject to the normal penalties from range increments.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Selective Invisibility",
      spellPreviewDescription = "As invisibility but you can pick someone who can still see you.",
      spellSourceBookPreview = "AdvP#35",
      spellSourcePage = "55",
      spellSourceBookFull = "Adventure Path #35: Merchants of the Void",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "you and one other creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "Upon casting this spell, you turn invisible, as invisibility, and you choose a second target. That creature can still see you as though you weren’t invisible, and you can attack that creature without ending the invisibility effect. If you attack any other creature, this spell ends. If you cast this spell multiple times, you can attack any of the affected creatures without ending the spell.\n" +
              "\n" +
              "(Invisibility: The creature or object touched becomes invisible (see page 264). If the target is a creature, any gear it is carrying vanishes as well. If you cast the spell on someone else, neither you nor your allies can see the target unless you can normally see invisible things or you employ magic to do so.\n" +
              "\n" +
              "The spell ends if the target attacks any creature. For purposes of this spell, an attack includes any spell or harmful effect targeting a foe or whose area or effect includes a foe. Actions directed at unattended objects don’t break the spell. Spells that specifically affect allies but not foes are not attacks for this purpose, even when they include foes in their area. Causing harm indirectly is not an attack. Thus, an invisible being can open doors, talk, eat, climb stairs, summon security forces and have them attack, start a trash compactor with foes inside, remotely trigger traps, and so forth.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Sensor Mask",
      spellPreviewDescription = "Using a complicated digital program encoded on a magical subroutine, the target’s digital footprint attempts to match information stored in local security databases.",
      spellSourceBookPreview = "AdvP#51",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #51: Into the Dataverse",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "Using a complicated digital program encoded on a magical subroutine, the target’s digital footprint attempts to match information stored in local security databases. When attempting to bypass automated technological security (such as biometric scanners or facial recognition programs), the target gains a +10 circumstance bonus to any related skill checks (usually Computers or Disguise) attempted for the duration of the spell. This doesn’t alter the target’s physical appearance, so it doesn’t fool sapient beings.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Tchn 5"),
      spellTitle = "Shadow Body",
      spellPreviewDescription = "Merge yourself with the essence of Shadow, giving you great powers for a time.",
      spellSourceBookPreview = "AdvP#10",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #10: The Diaspora Strain",
      spellSchool = "transmutation (polymorph, shadow)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You transform the matter of your body and any objects you carry or wear into the essence of the Shadow Plane. You are visible as an unattached shadow in bright light or normal light, but you gain total concealment in dim light or darkness (reduced to concealment against creatures that have darkvision). Your body and gear are incorporeal, but you can’t fly or pass through solid objects or creatures, and your gear can’t be removed from you or used by anyone. You can move at your normal speed along any surface, including horizontal and vertical surfaces and liquids, and difficult terrain doesn’t slow you. However, you can’t attack physically or manipulate objects. You can speak, cast spells that require no items to cast, and perform mental actions. If you can use spells that have a range of touch and such a spell requires an attack roll, you target EAC. If you lose consciousness, you and your gear return to your natural form.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4"),
      spellTitle = "Shadow Jump",
      spellPreviewDescription = "Travel through the Shadow Plane to move to a distant shadow.",
      spellSourceBookPreview = "AdvP#12",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #12: Heart of Night",
      spellSchool = "conjuration (shadow, teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "you and touched objects",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, 1 round + 1 round/3 levels (D)",
      spellSavingThrow = "none, Will negates (object)",
      spellResistance = "no, yes (object)",
      spellDescriptionFull = "Your body forms a connection to the Shadow Plane, allowing you to teleport through it, rather than the Astral Plane, with ease. While this spell is active, as a move action, you can teleport to any area of dim light or darkness you can see within range. If you leave a threatened space, you have concealment (20% miss chance) against any foe that makes an attack of opportunity against you.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Tchn 6","WtchW 6"),
      spellTitle = "Shadow Walk",
      spellPreviewDescription = "Step into a shadowy realm to travel to a destination rapidly.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "376",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion (shadow)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "up to one Medium creature or vehicle/level",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "Will negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "To use shadow walk, you must be in an area of dim light. You and any creature or vehicle you touch are then transported along a coiling path of shadowstuff to the edge of the Material Plane where it borders the Plane of Shadow. The effect is largely illusory, but the path is quasi-real.\n" +
              "\n" +
              "All targets affected must be in direct contact with one another. A Large target counts as two Medium targets, a Huge target counts as four Medium targets, and so forth. Creatures you transport this way can opt to follow you, wander off through the plane, or stumble back into the Material Plane (50% chance for either of the latter results if the creatures are lost or abandoned by you). Creatures unwilling to accompany you into the Plane of Shadow can attempt a Will saving throw to negate the effect.\n" +
              "\n" +
              "In the region of shadow, you move at a rate of 200 miles per hour. Because of the blurring of reality between the Plane of Shadow and the Material Plane, you can’t make out details of the terrain or areas you pass over during transit nor can you predict perfectly where your travel will end. It’s impossible to judge distances accurately, making the spell virtually useless for scouting or spying. Furthermore, when the spell effect ends, you are shunted 1d10 × 100 feet in a random horizontal direction from your desired endpoint. If this would place you within a solid object, you (and any creatures with you) are shunted to the nearest empty space available, but the strain of this activity renders each creature fatigued (no saving throw).\n" +
              "\n" +
              "Shadow walk can also be used to travel to other planes that border on the Plane of Shadow (except for the Drift), but this usage requires you to travel across the Plane of Shadow to arrive at a border with another plane of reality, which takes 1d4 hours.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6"),
      spellTitle = "Shadowy Fleet",
      spellPreviewDescription = "Illusion of starships deals 3d6 piercing damage and 3d6 fire damage to all creatures in the affected area.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "376",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion (shadow)",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "",
      spellArea = "60-ft. radius",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will disbelief and Reflex half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You create a powerful vision of a fleet of hostile starships overhead that appears to rain fiery laser shots mercilessly at your enemies. The ships appear to be 1,000 feet overhead and target a 60-foot-radius area that you designate on the ground. You can’t cast this spell indoors unless you are within a structure that a fleet of starships could believably fit within.\n" +
              "\n" +
              "Each round this spell is in effect, the starships deal 3d6 piercing damage and 3d6 fire damage to all hostile creatures in the area as the ships appear to shoot lasers at your enemies. If a creature interacts with the illusion (such as by taking damage), it can attempt a Will saving throw to take only half of this damage per round for the remainder of the spell. Regardless of whether a creature disbelieves the illusion, each round it takes damage from this spell, it can attempt a Reflex saving throw to instead take half damage; thus, if a creature that succeeded at its Will saving throw also succeeds at its Reflex save in a given round, it takes one-quarter the spell’s damage that round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Share Language",
      spellPreviewDescription = "Target understands chosen languages.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "377",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "24 hours",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "For 24 hours, the target can read, understand, and communicate to the best of its ability in up to three languages that you already know. This doesn’t change the physical nature of the creature (if it lacks a means of speech, it still can’t talk) or its attitude toward you. It does, however, allow intelligent creatures that normally have no language to understand and (if physically capable) communicate in the languages granted by this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Precog 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Prcg 1"),
      spellTitle = "Share Memory",
      spellPreviewDescription = "Target shares memory with you and five others.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "141",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "one willing creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, up to 1 minute/level (D)",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You allow the target to share a memory with you and up to five other creatures, all of whom must be willing and within 30 feet of the target when you cast this spell. You designate which memories the target shares when you cast this spell, although the target can guide you in this designation. The designated memory can be as specific as “the conversation you just had with the captain” or as vague as “your favorite childhood memory of being with your father.” For the duration, those sharing the memory experience it through the target’s senses as the target did. Anyone sharing the memory can cease participation at any time. If you end the effect for yourself, or the target ceases sharing, the spell ends. If the memory’s length exceeds the duration, it plays out while this spell lasts and then ends with the duration. This spell does not work on memories that have been magically altered or removed through spells such as displace memory or modify memory.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Shared Evolution",
      spellPreviewDescription = "You must be a barathu to learn this spell. When you cast it, you activate your early stage adaptation while also extending it to your allies.",
      spellSourceBookPreview = "AdvP#29",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #29: The Cradle Infestation",
      spellSchool = "transmutation",
      spellCastingTime = "1 swift action",
      spellRange = "",
      spellTargets = "you and up to one willing creature/level within 30 ft.",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You must be a barathu to learn this spell. When you cast it, you activate your early stage adaptation while also extending it to your allies. You can’t have used early stage adaptation since the start of your last turn, and once you cast this spell, you can’t use it until the start of your next turn. When you choose the adaptation, it applies both to you and to all the spell’s targets.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4","WtchW 4"),
      spellTitle = "Shared Gravity",
      spellPreviewDescription = "Adjust gravity for creatures and objects in an area.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "81",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "60-ft.-radius spread centered on you",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "Fortitude negates, see text",
      spellResistance = "yes, see text",
      spellDescriptionFull = "Copaxis understand personal gravity adaptation well, and they and others have learned to share this adaptation. For the duration, you radiate a field of altered gravity. You and creatures and objects in the area treat gravity as if it were your choice of one step higher or lower, although a creature that succeeds at the saving throw is unaffected until it leaves the area and reenters. Then, the creature must repeat the saving throw. If you fail to overcome a creature's spell resistance, that creature is unaffected by the same casting of this spell. You can suppress or resume this affect as a reaction or swift action. While under the effects of this spell, a creature affected by forced movement can reduce the distance it moves by 5 feet (minimum 0 feet). Affected creatures ignore penalties from the off-kilter condition.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Sharpen Senses",
      spellPreviewDescription = "Grant a creature blindsight and a bonus to Perception checks.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "81",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The target gains a +3 insight bonus to Perception checks and blindsight (hearing or scent as determined by the caster) for the duration of the spell. If the target already has blindsight for the sense chosen, the range of their blindsight is instead doubled for the duration of the spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
      spellTitle = "Shield Other",
      spellPreviewDescription = "You take half of the target’s Hit Point damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "377",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell wards the target and creates a mystic connection between you and the target so that some of its wounds are transferred to you. Casting this spell requires you to spend 1 Resolve Point. The target takes only half damage from all wounds and attacks (including those dealt by special abilities) that deal Hit Point damage, and you take the amount of damage not taken by the target. Only Hit Point damage is transferred in this manner; the target’s Stamina Points are damaged as normal. If you still have Stamina Points, you take the damage to your Stamina Points before Hit Points, as with normal damage.\n" +
              "\n" +
              "Forms of harm that do not involve Hit Points, such as charm effects, temporary ability damage, ability drain, permanent negative levels, and death effects, are not affected. When the spell ends, subsequent damage is no longer divided between the target and you, but damage already split is not reassigned to the target. If you and the target of the spell move out of range of each other, the spell ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Shifting Shadows",
      spellPreviewDescription = "You stop all Attacks of Opportunity and makes everyone able to flank.",
      spellSourceBookPreview = "AdvP#35",
      spellSourcePage = "55",
      spellSourceBookFull = "Adventure Path #35: Merchants of the Void",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius emanation",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Waves of shifting shadows obscure the appearance of creatures caught within the emanation, making it harder to tell friends from foes.\n" +
              "\n" +
              "This spell doesn’t cause affected creatures to risk accidentally attacking their allies, but it does require them to concentrate harder to keep track of their allies and foes. While this spell is in effect, every creature in the area can treat any other creature in the area as an allied threatening creature for the purpose of flanking. Additionally, creatures in the area can’t attempt attacks of opportunity. These shadows don’t hinder precision-based attacks or create areas of dim light. Creatures with blindsight or blindsense, or those under the effect of true seeing, are not affected by this spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("WtchW 1"),
      spellTitle = "Shifting Surge",
      spellPreviewDescription = "A creature or weapon can deal a different type of energy damage as well as extra damage.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "141",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one willing creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You touch a willing creature and affect one of its energy damage attacks or weapons, changing the energy damage type of one of its attacks to one other type until the end of your next turn. Even if you don’t change the damage, the next affected attack that hits deals 2d6 additional damage if it targets only one target, or 1d6 additional damage if it affects an area or multiple targets.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Shrink Object",
      spellPreviewDescription = "You shrink the target item, transmuting it into a smaller version of itself.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "29",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "one object touched; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 day/level (D)",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "yes",
      spellDescriptionFull = "You shrink the target item, transmuting it into a smaller version of itself. You can target an attended object only if the creature attending the object is willing, and you cannot target worn objects. While shrunken, the object takes up less space and bulk, but it can’t be used or worn. When the spell ends, the object returns to normal size, moving through any nearby opening it can to reach a space that can accommodate it, but it does not expand with any force and does no harm to containers too small for it. This spell can affect objects of a size and bulk limited by the spell’s level. Likewise, the spell’s level determines the target’s size after the spell takes effect. For this spell, vehicles and other objects without a specified weight count as an object with bulk equal to the number of squares of the object’s space squared.\n" +
              "\n" +
              "1st: You can target an object up to 1 cubic foot in size and weighing up to 10 bulk. The target’s dimensions are reduced to a 6-inch cube, and its bulk is reduced to L.\n" +
              "\n" +
              "2nd: As the 1st-level version, but you shrink an object up to 4 cubic feet in size weighing up to 40 bulk. If you target an object that’s 1 cubic foot or smaller and weighs no more than 10 bulk, its dimensions are further reduced to a 1-inch cube and its bulk is reduced to negligible.\n" +
              "\n" +
              "3rd: As the 1st-level version, but you can shrink an object up to 7 cubic feet in size weighing up to 70 bulk. If you target an object that’s 4 cubic feet or smaller and weighs no more than 40 bulk, its dimensions are further reduced to a 1-inch cube and its bulk is reduced to negligible.\n" +
              "\n" +
              "4th: As the 1st-level version, but you can shrink an object up to 10 cubic feet in size weighing up to 100 bulk. If you target an object that’s 7 cubic feet or smaller and weighs no more than 70 bulk, dimensions are further reduced to a 1-inch cube and its bulk is reduced to negligible.\n" +
              "\n" +
              "5th: As the 1st-level version, but you can shrink an object up to 13 cubic feet in size weighing up to 130 bulk. If you target an object that’s 10 cubic feet or smaller and weighs no more than 10 bulk, its dimensions are further reduced to a 1-inch cube and its bulk is reduced to negligible.\n" +
              "\n" +
              "6th: As the 1st-level version, but you can shrink an object up to 16 cubic feet in size weighing up to 160 bulk. If you target an object that’s 13 cubic feet or smaller and weighs no more than 130 bulk, its dimensions are further reduced to a 1-inch cube and its bulk is reduced to negligible.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Sinking Ship",
      spellPreviewDescription = "You conjure a massive spectral shipwreck that drops into the designated area then vanishes.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "conjuration",
      spellCastingTime = "1 round",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "40-ft.-radius sphere",
      spellEffect = "one summoned spectral shipwreck",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex partial",
      spellResistance = "yes",
      spellDescriptionFull = "You conjure a massive spectral shipwreck that drops into the designated area then vanishes. In atmosphere, this spell deals 6d10 bludgeoning damage (Reflex half) to creatures in the area. Underwater, this spell deals half damage as normal, but it also pushes creatures who fail the saving throw 20 feet straight down. If a creature in the area can’t move the full 20 feet (because of the seafloor or an obstacle), it takes full damage as it gets crushed between the ship and the obstacle.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("WtchW 2"),
      spellTitle = "Slice Reality",
      spellPreviewDescription = "Tear gashes in reality, dealing 2d6 damage to all targets or 2d6 damage plus staggering a single target.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "141",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "1 creature + 1 creature/3 levels",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude half",
      spellResistance = "yes",
      spellDescriptionFull = "You expose targets to churning entropy which turns parts of their body sickly and black. Each target takes 2d6 damage. A successful Fortitude save halves this damage.\n" +
              "You can focus on only one target rather than multiple. If you target only a single creature with this spell and it fails its save, the target is also staggered for a number of rounds equal to your caster level.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Slip Through Space",
      spellPreviewDescription = "You tear open two temporary rifts, one beneath you and one 10 feet in the air above your intended destination within range.",
      spellSourceBookPreview = "RdsR",
      spellSourcePage = "59",
      spellSourceBookFull = "Redshift Rally",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "you",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "see text",
      spellResistance = "no",
      spellDescriptionFull = "You tear open two temporary rifts, one beneath you and one 10 feet in the air above your intended destination within range. You fall into the rift beneath you and out the exit rift, landing without harm as the rifts close. As you land, you release a shockwave of energy, dealing bludgeoning damage in a burst (Reflex for half damage) and making all spaces in the area difficult terrain until the beginning of your next turn; this damage has the force descriptor. Creatures not in contact with the ground aren’t damaged. If you attempt to bring another creature along with you, this spell fails.\n" +
              "\n" +
              "3rd: You deal 5d6 bludgeoning damage in a 5-footradius burst.\n" +
              "\n" +
              "4th: You deal 7d6 bludgeoning damage in a 5-footradius burst.\n" +
              "\n" +
              "5th: You deal 5d8 bludgeoning damage in a 10-footradius burst.\n" +
              "\n" +
              "6th: You deal 6d8 bludgeoning damage in a 15-footradius burst.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Slithering Chain",
      spellPreviewDescription = "Summon a chain from the Shadow Plane to trip your enemy.",
      spellSourceBookPreview = "AdvP#12",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #12: Heart of Night",
      spellSchool = "conjuration (summoning)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "a chain (or chains) sharpened at one end",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "no",
      spellDescriptionFull = "You call forth a chain from the Shadow Plane, causing it to burst out from the ground and attempt to hinder a target within the spell’s range. The chain attempts a trip combat maneuver against the target; its attack bonus is equal to your base attack bonus + your key ability score modifier + 4. If the chain successfully trips the target, that target must attempt a Will saving throw or become shaken for 1d4 rounds.\n" +
              "\n" +
              "You can cast this spell as a full action. If you do, you summon two chains instead of one. Each chain attempts its combat maneuver separately and they must attack two different targets within the spell’s range.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Slow",
      spellPreviewDescription = "One creature per level moves and acts slower.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "377",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "An affected creature moves and attacks at a drastically slowed rate. Creatures affected by this spell are staggered (see page 277). A slowed creature moves at half its normal speed (round down to the next 5-foot increment). Multiple slow effects don’t stack. Slow counters and negates haste.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3"),
      spellTitle = "Smog Bank",
      spellPreviewDescription = "Noxious fog cloud sickens creatures.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "141",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius spread",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "Fortitude negates, see text",
      spellResistance = "no",
      spellDescriptionFull = "You create a noxious cloud similar to fog cloud that is harmful to living creatures. Smog bank obscures sight just as fog cloud does. Living creatures without environmental protections that are in the area when the spell is cast or who enter the area must attempt a Fortitude save or be sickened for as long as they remain in the cloud and for 1d4+1 rounds thereafter.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","WtchW 5"),
      spellTitle = "Sniper's Edge",
      spellPreviewDescription = "Fire a sniper weapon with supernatural precision.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "82",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 move action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Made popular by sarcesian snipers, this spell allows you to peer a split second into the future to line up a perfect shot. The next time you attempt an attack with a ranged weapon before the end of this turn, roll your attack twice and keep the better result. Casting this spell counts as aiming a sniper weapon as a move action for the purposes of the sniper weapon special property.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6"),
      spellTitle = "Snuff Life",
      spellPreviewDescription = "Instantly kill or massively damage one creature per 2 caster levels, depending on targets’ CRs.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "377",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy (death)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to one creature/2 levels, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You twist the essence of life that flows through your targets, snuffing the spark out of weaker creatures and debilitating or disabling others. This spell’s effects depend on each target’s CR.\n" +
              "\n" +
              "A creature of CR 5 or lower is slain by this spell. If it succeeds at a Fortitude saving throw, it is instead reduced to 1 Hit Point.\n" +
              "\n" +
              "A creature of CR 6–10 takes 10d20 damage and is stunned for 3 rounds. If it succeeds at a Fortitude saving throw, it takes half damage and negates the stunned effect.\n" +
              "\n" +
              "A creature of CR 11–14 takes 8d20 damage and is staggered for 3 rounds. If it succeeds at a Fortitude saving throw, it takes half damage and negates the staggered effect.\n" +
              "\n" +
              "A creature of CR 15 or higher takes 6d20 damage. If it succeeds at a Fortitude saving throw, it takes half damage.\n" +
              "\n" +
              "Regardless of whether the target succeeds at its saving throw, it still might die from the damage this spell deals, though in this case the spell is not a death effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
      spellTitle = "Social Reset",
      spellPreviewDescription = "Social Reset: Reroll a failed Culture check to recall information, or Diplomacy check to change attitude or gather information.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "82",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 reaction",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You can recover from social blunders and cultural misinterpretations so quickly, as if they never happened. When you fail a Culture check to recall information, or a Diplomacy check to change attitude or gather information, you can cast this spell to reroll the failed check. You can't cast this spell again until you take a 10-minute rest to recover Stamina Points.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Song Of The Cosmos",
      spellPreviewDescription = "Creatures near you must succeed at a Will saving throw or be fascinated for 1 round.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "141",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "",
      spellTargets = "",
      spellArea = "20-ft.-radius spread centered on you",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You thrum a discordant tune that underlies existence and hints at the deep secrets of the universe. Creatures in the area must succeed at a Will saving throw or be fascinated for the duration.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Song Of The Cosmos, Greater",
      spellPreviewDescription = "Creatures near you are fascinated or dazzled for 1d4 rounds.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "141",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "20 ft.",
      spellTargets = "",
      spellArea = "20-ft.-radius spread centered on you",
      spellEffect = "",
      spellDuration = "1d4+1 rounds",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "As song of the cosmos, except as noted above, and creatures that fail their Will saves are also dazzled for the duration.\n" +
              "\n" +
              "(Song Of The Cosmos: You thrum a discordant tune that underlies existence and hints at the deep secrets of the universe. Creatures in the area must succeed at a Will saving throw or be fascinated for the duration.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6","WtchW 6"),
      spellTitle = "Sonic Form",
      spellPreviewDescription = "You transform your body and your equipment into semisolid sound.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "transmutation (polymorph, sonic)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You transform your body and your equipment into semisolid sound. While in this sonic form, you’re considered incorporeal, except that you can’t move through solid objects and you can be detected by senses based on sound or vibrations. You take no penalties for squeezing and you can move through spaces without penalty as if you were a creature three size categories smaller. You can make a magical melee attack as a standard action that deals 6d6 sonic damage and has the deafen critical hit effect (DC = 10 + half your spellcaster level + your key ability score modifier). Any nonmagical kinetic attacks you make deal half damage.\n" +
              "\n" +
              "If you end your turn in an area of vacuum or a place where sound is somehow suppressed, you take 4d6 damage (no saving throw). If this spell’s duration ends when you’re in a square that a creature of your size can’t normally occupy, you take 3d6 damage and are shunted to the nearest open space that you can normally occupy.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Sonic Scream",
      spellPreviewDescription = "Deal 6d12 damage in a cone that's more effective underwater.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "82",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (sense-dependent, sonic)",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "cone-shaped burst",
      spellEffect = "",
      spellDuration = "",
      spellSavingThrow = "Reflex half, see text",
      spellResistance = "yes",
      spellDescriptionFull = "Developed by kalo explorers as a deterrent when dealing with aquatic predators, you scream at your opponents, sending your voice rippling through air and water currents. All targets in the cone take 6d12 damage. If you cast this spell while submerged in liquid, the damage increases by 1d12, and creatures that fail their saving throw are nauseated for 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Soothing Protocol",
      spellPreviewDescription = "Calm a target hostile technological construct.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "377",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one construct with the technological subtype; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "Waves of calming programming ebb from your touch, potentially stabilizing a construct’s harmful intentions toward you and your allies. The target construct must have a CR lower than your level; if it does, the construct is convinced that you and your allies pose no threat. It can’t take violent actions against you or your allies, and it can’t do anything that would otherwise harm or threaten you (though it continues to carry out orders to take actions that do not harm or threaten you). Any aggressive action or damage dealt by you or your allies to a construct soothed in this way or its allies immediately ends this spell’s effects (and could cause the construct to attack you, if it was doing so previously).\n" +
              "\n" +
              "If an affected construct is under the control of a spellcaster or another creature, the controlling creature can spend a full action to remove soothing protocol, as long as it can either touch the construct or give it an order.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Soul Reap",
      spellPreviewDescription = "Each undead creature in the area takes 10d8 damage and is staggered for 1 round.",
      spellSourceBookPreview = "Alien#4",
      spellSourcePage = "91",
      spellSourceBookFull = "Alien Archive 4",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius spread",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You engulf an area in a comet-like spiral of energy, untethering the souls or animating vital essence from undead in the area. Each undead creature in the area takes 10d8 damage and is staggered for 1 round. A creature that succeeds at a Will saving throw takes half damage and ignores the staggered effect. Mindless undead receive no saving throw. This spell has no effect on creatures that are not undead.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Soul Surge",
      spellPreviewDescription = "Attempt an attack versus EAC to deal force damage.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "82",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Soul surge was innovated by Hanakan mystics concomitant with the attunement of their soulstones. With this spell, you draw forth a tiny bit of your essence to attack your opponent, losing a number of Hit Points equal to the number of damage dice you roll for your soul surge. Attempt a ranged attack against a single target's EAC, adding your key ability score modifier to the attack roll instead of your Dexterity modifier if it's higher. Your soul surge does piercing damage that has the force descriptor, and the amount of damage it does depends on the level at which it's cast.\n" +
              "\n" +
              "1st: When you cast soul surge as a 1st-level spell, it deals 3d8 damage to the target.\n" +
              "\n" +
              "2nd: When you cast soul surge as a 2nd-level spell, it deals 6d8 damage to the target.\n" +
              "\n" +
              "3rd: When you cast soul surge as a 3rd-level spell, it deals 10d8 damage to the target.\n" +
              "\n" +
              "4th: When you cast soul surge as a 4th-level spell, it deals 14d8 damage to the target.\n" +
              "\n" +
              "5th: When you cast soul surge as a 5th-level spell, it deals 21d8 damage to the target.\n" +
              "\n" +
              "6th: When you cast soul surge as a 6th-level spell, it deals 24d8 damage to the target.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Spark",
      spellPreviewDescription = "Ignite a flammable object.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "82",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (electricity or fire)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one unattended object of no more than 1 bulk",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "You agitate molecules within the surface of the object you touch, causing it to catch fire if it's flammable and the atmosphere allows combustion. This spell can't cause substances within closed containers, such as the fuel in a petrol tank, to ignite.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","WtchW 3"),
      spellTitle = "Speak with Dead",
      spellPreviewDescription = "Corpse answers up to six questions.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "378",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy (language-dependent)",
      spellCastingTime = "10 minutes",
      spellRange = "10 ft.",
      spellTargets = "one dead creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "no",
      spellDescriptionFull = "You grant the semblance of life to a corpse, allowing it to answer questions. You can ask up to six questions. The corpse’s knowledge is limited to what it knew during life, including the languages it spoke. Answers are brief, cryptic, or repetitive, especially if the creature would have opposed you in life.\n" +
              "\n" +
              "If the dead creature was friendly or helpful toward you in life, the spell works automatically. Otherwise, the corpse can attempt a Will saving throw to resist the spell as if it were alive. On a successful save, the corpse can refuse to answer your questions or attempt to deceive you using its Bluff skill. The target can speak only about what it knew in life. It can’t answer any questions that pertain to events that occurred after its death.\n" +
              "\n" +
              "If the corpse has been subjected to speak with dead within the past week, this spell fails. You can cast this spell on a corpse that has been deceased for any amount of time, but the body must be mostly intact to be able to respond. A damaged corpse might be able to give partial answers or partially correct answers, but it must have at least a mouth in order to speak at all. This spell does not affect a corpse that has been turned into an undead creature.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Prcg 1","WtchW 1"),
      spellTitle = "Spell Redirection",
      spellPreviewDescription = "When an ally within range is targeted by a non-harmless spell or spell-like ability, you can redirect the spell so it targets you instead.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "131",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "transmutation",
      spellCastingTime = "1 reaction",
      spellRange = "20 ft.",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates;",
      spellResistance = "",
      spellDescriptionFull = "When an ally within range is targeted by a non-harmless spell or spell-like ability, you can redirect the spell so it targets you instead. Spell redirection fails if you’re immune to the triggering spell’s effects. It can’t redirect spells that affect an area, though it can change one target of a spell that affects multiple targets. The spell’s caster can attempt a Will save to negate this effect. The maximum spell level spell redirection can affect depends on the spell level of spell redirection.\n" +
              "\n" +
              "1st: You can redirect a spell whose level is 2nd or lower.\n" +
              "\n" +
              "2nd: You can redirect a spell whose level is 3rd or lower.\n" +
              "\n" +
              "3rd: You can redirect a spell whose level is 4th or lower.\n" +
              "\n" +
              "4th: You can redirect a spell whose level is 5th or lower.\n" +
              "\n" +
              "5th: You can redirect a spell whose level is 6th or lower.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2"),
      spellTitle = "Spider Climb",
      spellPreviewDescription = "Grant ability to walk on walls and ceilings.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "378",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "The target can climb and travel on vertical surfaces or even traverse ceilings as well as a spider does. An affected creature with four limbs must have three limbs free (not holding equipment or being used to perform skills and so on) to climb in this manner. A creature with six limbs needs only four available. In general, other creatures must have 75% of their limbs available to benefit from this spell. The target gains a climb speed of 20 feet (and the +8 racial bonus to Athletics checks to climb granted by that climb speed); furthermore, it doesn’t need to attempt Athletics checks to climb to traverse a vertical or horizontal surface (even upside down). An affected creature climbing in this way is not flat-footed while climbing, and opponents get no special bonus to their attacks against it. The creature, however, can’t use the run action while climbing.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Spirit-bound Armor",
      spellPreviewDescription = "A benevolent spirit steadies a creature wearing armor, offsetting flat-footed and off-kilter penalties.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "141",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one suit of armor",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will (harmless)",
      spellResistance = "yes",
      spellDescriptionFull = "You divert a benevolent spirit from the River of Souls to temporarily inhabit a suit of armor. The spirit steadies the nerves and balance of the creature wearing the armor. If the target becomes flat-footed during the duration, it ignores the penalty to AC that condition imposes. Similarly, the off-kilter condition has no effect on the target while this spell is in effect.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Spirit-bound Computer",
      spellPreviewDescription = "A benevolent spirit inhabits a computer and can make Computers checks you request.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "142",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one computer system",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration, up to 1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You divert a benevolent spirit from the River of Souls to inhabit a computer. You can communicate with the spirit while you concentrate; the spirit is trained in Computers and can make Computers checks you request with a total bonus equal to 3 + your caster level + your key ability score modifier.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","WtchW 2"),
      spellTitle = "Spiritual Bonds",
      spellPreviewDescription = "Grant allies within 30 feet a +1 morale bonus to saving throws, along with other benefits.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "82",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "enchantment (emotion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "the caster and all willing or unconscious allies",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "no",
      spellDescriptionFull = "Dwarves call on their ancestors to cast this spell of traditional sharing of burdens. This spell connects you and allies in the area on a spiritual level. Each target gains a +1 morale bonus to saving throws. You know when an affected ally is unconscious or dying, provided the creature is within 120 feet of you. Affected creatures can, as a standard action, spend Resolve Points on behalf of an affected ally within 30 feet to help that ally either stabilize or stay in the fight. Two different allies doing so can allow both to occur during the same round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1"),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Spiritual Consultation",
      spellPreviewDescription = "You draw a spirit into a comm unit or computer, allowing you to consult the spirit for information.",
      spellSourceBookPreview = "TechR",
      spellSourcePage = "27",
      spellSourceBookFull = "Tech Revolution",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one comm unit or computer",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You draw a spirit into a comm unit or computer, allowing you to consult the spirit for information. As a swift action, you can ask the spirit a question; you can ask a question in this way a number of times equal to your key ability score modifier. The spirit attempts to recall knowledge with any of its available skills, then transmits a response to your question via the device at the start of your next turn. Questions asked of a spirit are wasted if they aren’t relevant to its field of expertise or aren’t achievable with skill checks to recall knowledge.\n" +
              "\n" +
              "1st: When you cast spiritual consultation as a 1st-level spell, the spirit has a bonus of +6 in one skill of your choice.\n" +
              "\n" +
              "2nd: When you cast spiritual consultation as a 2nd-level spell, the spirit has a bonus of +10 in one skill of your choice.\n" +
              "\n" +
              "3rd: When you cast spiritual consultation as a 3rd-level spell, the spirit has a bonus of +14 in one skill of your choice.\n" +
              "\n" +
              "4th: When you cast spiritual consultation as a 4th-level spell, the spirit has a bonus of +17 in two skills of your choice.\n" +
              "\n" +
              "5th: When you cast spiritual consultation as a 5th-level spell, the spirit has a bonus of +20 in two skills of your choice, and the duration of the spell increases to 10 minutes/level.\n" +
              "\n" +
              "6th: When you cast spiritual consultation as a 6th-level spell, the spirit has a bonus of +23 in two skills of your choice, the duration of the spell increases to 10 minutes/level, and the number of questions you can ask the spirit doubles.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","WtchW 0"),
      spellTitle = "Sprout",
      spellPreviewDescription = "You speed the growth of a seed you touch, causing it to instantly sprout.",
      spellSourceBookPreview = "AdvP#42",
      spellSourcePage = "43",
      spellSourceBookFull = "Adventure Path #42: Whispers of the Eclipse",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one seed touched",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You speed the growth of a seed you touch, causing it to instantly sprout. If you plant this sprouted seed in a suitable environment, the seed continues to live, growing at its normal pace. Otherwise, the sprout withers and dies over the course of 1d4 days.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","WtchW 6"),
      spellTitle = "Star Storm",
      spellPreviewDescription = "Hailing plasma deals 6d8 electricity damage and 6d8 fire damage to creatures and objects in the area.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "142",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "cylinder (40-ft. radius, 40 ft. high)",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "Stellar plasma rains down in the area, dealing 6d8 electricity damage and 6d8 fire damage to creatures and objects in the area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","WtchW 6"),
      spellTitle = "Star Touch",
      spellPreviewDescription = "Form a miniature star core, dealing massive electricity and fire damage, and creating medium radiation.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "82",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature or object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude partial (object)",
      spellResistance = "yes",
      spellDescriptionFull = "You attempt to form a miniature star's core inside your target. Choose a point that adjoins the target's space and is within your reach. Then, attempt a melee attack against the target's EAC, adding the higher of your key ability modifier or your Strength modifier to the attack roll. On a miss, the effect fills a 5-foot-radius spread, and creatures in the area must attempt Fortitude saving throws. Creatures that fail take 6d10 electricity and fire damage and fall prone. Those that succeed take only half the electricity and fire damage. Medium radiation fills the area, spreading in normal increments, for 1 minute. On a hit, the target must attempt a Fortitude saving throw, taking 20d10 electricity and fire damage and falling prone on a failure. On a success, the target rejects the star core, and the effect is as if you missed. If the damage reduces the hit target to 0 Hit Points, or the target is an object, it (or a cube of the object with edges within 5 feet of the chosen point, a 10-foot cube total) collapses into a tiny orb of luminous plasma at the chosen point. Any nonmagical objects a target creature wears or carries are destroyed. High radiation then fills the area from the chosen point, spreading in normal increments, for 1 minute.\n" +
              "\n" +
              "Casting this spell doesn't provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","WtchW 6"),
      spellTitle = "Star Wall",
      spellPreviewDescription = "Create a wall of glowing gas that sends damaging waves of energy and radiation in one direction.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "83",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (electricity, fire)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "charged, radioactive plasma wall up to 20 ft. long/level or a ring with a radius up to 5 ft./2 levels; either form 20 ft. high",
      spellDuration = "concentration + 1 round/level",
      spellSavingThrow = "Reflex partial, see text",
      spellResistance = "no",
      spellDescriptionFull = "An immobile, vertical curtain of glowing, electromagnetically charged gas springs into existence. The wall raises the light level to bright within 20 feet of it, raises the light level to normal within 20 more feet, and raises the light level one step (up to normal) within 20 more feet. A creature within 5 feet of the wall when it appears must succeed at a Reflex save or become blinded for 1 round and dazzled for 1 round thereafter.\n" +
              "\n" +
              "One side of the wall, selected by you, sends forth waves of charged particles, dealing 6d6 fire and electricity damage to creatures within 10 feet, 3d6 fire and electricity damage to those beyond 10 feet but within 20 feet, and 1d6 fire and electricity damage to those beyond 20 feet but within 30 feet. Also, the wall sheds high radiation within 10 feet, with the radiation diminishing to medium between 10 and 20 feet, and to low between 20 and 30 feet. The wall deals its damage when it appears and on your turn each subsequent round. The wall also deals 12d6 fire and electricity damage to any creature passing through it. The wall deals double damage to undead creatures and any creature damaged by sunlight. If you evoke the wall so that it appears where creatures are, each creature takes damage as if passing through the wall.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Starlit Span",
      spellPreviewDescription = "You conjure a sparkling bridge made of quintessence from the Astral Plane.",
      spellSourceBookPreview = "Ports",
      spellSourcePage = "123",
      spellSourceBookFull = "Ports of Call",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch and close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "2 hours/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You conjure a sparkling bridge made of quintessence from the Astral Plane. The bridge is 10 feet wide and connects one point you touch to another point within close range. Both sides must be anchored to a solid object like a ledge or wall, and the bridge can slope at no greater than a 45-degree angle. The bridge is watertight and supports creatures and vehicles, though it’s somewhat fragile, with hardness equal to your caster level and Hit Points equal to 3 × your caster level. The spell ends if you move more than 100 feet from the bridge.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Tchn 0","WtchW 0"),
      spellTitle = "Starwalk",
      spellPreviewDescription = "You can better control your movement in zero gravity.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "114",
      spellSourceBookFull = "Galaxy Exploration Manual",
      spellSchool = "evocation",
      spellCastingTime = "see text",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You can better control your movement in zero gravity. As a swift action, you can cast this spell to end the off-kilter condition gained from movement in zero gravity. If you cast this spell as a move action, you can move up to half your speed in zero gravity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","WtchW 2"),
      spellTitle = "Status",
      spellPreviewDescription = "Monitor condition and position of allies.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "379",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "up to one living creature touched/3 levels",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "When you need to keep track of comrades who get separated, status allows you to mentally monitor their relative positions and general conditions. You are aware of the direction of and distance to the creatures and any conditions or states affecting them: confused, diseased, dying, nauseated, panicked, poisoned, staggered, stunned, unconscious, unharmed, wounded, wounded and out of Stamina points, and the like. Once the spell has been cast upon the targets, the distance between them and the caster does not affect the spell as long as they are on the same plane of existence. If a target leaves the plane (including via Drift travel) or dies, the spell ceases to function for that creature.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3"),
      spellTitle = "Storm-Deflecting Sphere",
      spellPreviewDescription = "You surround yourself with an intangible crystalline sphere that grants you electricity resistance 10 for the spell’s duration.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "123",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "abjuration (electricity)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level or until dismissed (D); see text",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You surround yourself with an intangible crystalline sphere that grants you electricity resistance 10 for the spell’s duration. As a reaction when you resist electricity damage or cast another spell with the electricity descriptor, you can dismiss the spell to shatter the sphere, releasing its energy; creatures adjacent to you take 2d12 electricity damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Prcg 0","WtchW 0"),
      spellTitle = "Stumble",
      spellPreviewDescription = "Cause a creature to become off-target and move at half speed for one round.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "83",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex negates",
      spellResistance = "yes",
      spellDescriptionFull = "You momentarily transpose the position of the limbs the target is using to move or interfere with its proprioception. If the target fails its Reflex save, it's off-target and can move at only half speed for 1 round. A flying creature also descends 10 feet.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","WtchW 6"),
      spellTitle = "Subjective Reality",
      spellPreviewDescription = "You convince yourself one creature or object is an illusion.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "379",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "Choose one object or creature you can see within long range (400 feet + 40 feet/level). You alter your perceptions to become convinced the target is an illusion. For you, the target becomes transparent and does not create sound or smell. Until the spell ends, you can move through the target unimpeded and the target can move through you. The target’s nonmagical attacks can’t harm you, and the target’s magical attacks deal half damage to you. The target’s non-damaging magical abilities have only a 50% chance of affecting you, and you are immune to all its sonic, language-dependent, and scent-based attacks. However, your attacks deal no damage to the target, and your magical abilities don’t affect the target at all. You or the target can affect each other normally through intermediaries. For instance, while the target would be immune to the direct effects of your charm monster spell, if you charmed another creature that then attacked the target creature, the target would not be immune to the damage from that attack.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5"),
      spellTitle = "Subzero Clutch",
      spellPreviewDescription = "Attempt a melee attack for 10d8 cold damage along with a free attempt to grapple.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "83",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (cold)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "A sleeve of ice encases your striking limb. Attempt a melee attack against the target's EAC. On a hit, the target takes 10d8 cold damage and moves at half speed for the duration. You can also attempt a free grapple check, adding the higher of your key ability modifier or your Strength modifier to the attack roll, and an additional +4 from the ice. Encasing ice also increases the DC to escape your grapple by 4. Each round the target remains grappled, it takes 4d8 cold damage.\n" +
              "\n" +
              "Casting this spell doesn't provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("WtchW 5"),
      spellTitle = "Sudden Collision",
      spellPreviewDescription = "You pull a high-speed race from another world into your own, superimposing it onto the area.",
      spellSourceBookPreview = "RdsR",
      spellSourcePage = "59",
      spellSourceBookFull = "Redshift Rally",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "90 ft.",
      spellTargets = "",
      spellArea = "15-ft.-wide line-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You pull a high-speed race from another world into your own, superimposing it onto the area. Enemies in the area are struck by passing vehicles, which deftly swerve around objects and your allies. Each enemy in the area takes 7d6 bludgeoning damage. On a failed saving throw, a damaged creature is additionally pushed back 10 feet and knocked prone.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6"),
      spellClassesWithLevelPreview = listOf("Myst 6"),
      spellTitle = "Suggestion, Mass",
      spellPreviewDescription = "Compel one target per level to follow stated course of action.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "379",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, language-dependent, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level or until completed",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions as suggestion, except it can affect more creatures. All of the affected creatures are subject to the same suggestion.\n" +
              "\n" +"(Suggestion: You influence the actions of the target creature by suggesting a course of activity (limited to a sentence or two). The suggestion must be worded in such a manner as to make the activity sound reasonable. Asking the creature to do some obviously harmful act automatically negates the effect of the spell.\n" +
              "\n" +
              "The suggested course of activity can continue for the entire duration of the spell. If the suggested activity can be completed in a shorter time, the spell ends when the target finishes what it was asked to do. You can instead specify conditions that will trigger a special activity during the duration. If the condition is not met before the spell’s duration expires, the activity is not performed.\n" +
              "\n" +
              "A very reasonable suggestion imparts a penalty (such as –1 or –2) to the target’s saving throw.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Suggestion",
      spellPreviewDescription = "Compel a target to follow stated course of action.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "379",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, language-dependent, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level or until completed",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You influence the actions of the target creature by suggesting a course of activity (limited to a sentence or two). The suggestion must be worded in such a manner as to make the activity sound reasonable. Asking the creature to do some obviously harmful act automatically negates the effect of the spell.\n" +
              "\n" +
              "The suggested course of activity can continue for the entire duration of the spell. If the suggested activity can be completed in a shorter time, the spell ends when the target finishes what it was asked to do. You can instead specify conditions that will trigger a special activity during the duration. If the condition is not met before the spell’s duration expires, the activity is not performed.\n" +
              "\n" +
              "A very reasonable suggestion imparts a penalty (such as –1 or –2) to the target’s saving throw.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","WtchW 6"),
      spellTitle = "Summon Corpse",
      spellPreviewDescription = "Summon the body of a deceased creature to your side.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "83",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "1 standard action",
      spellCastingTime = "1 standard action",
      spellRange = "unlimited",
      spellTargets = "one dead creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You summon the body of a deceased creature that has been dead for no longer than 1 day per caster level from its current position to your side. Deceased creatures up to Large size can be summoned from any location, on any plane, regardless of the current state of their body. The body doesn't come with any objects or possessions. This spell fails automatically if the deceased has been returned to life or is undead. This spell can't be used to summon corpses from the Drift to another plane, or from another plane to the Drift.\n" +
              "\n" +
              "Casting this spell requires you to create a complex representation of the target body, worth at least 10,000 credits, to serve as a beacon for the body's return. This object is consumed when you cast the spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Summon Creature",
      spellPreviewDescription = "This spell summons an extraplanar creature.",
      spellSourceBookPreview = "Alien#1",
      spellSourcePage = "144",
      spellSourceBookFull = "Alien Archive",
      spellSchool = "conjuration (summoning)",
      spellCastingTime = "1 round",
      spellRange = "medium",
      spellTargets = "",
      spellArea = "",
      spellEffect = "one or more summoned creatures",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell summons an extraplanar creature (typically an elemental, magical beast native to another plane, or outsider, but also occasionally even extraplanar constructs). The summoned creature appears where you designate and acts immediately on your turn. It attacks your opponents to the best of its ability. If you can communicate with the creature, you can direct it to not attack, to attack particular enemies, or to perform other actions.\n" +
              "\n" +
              "When you gain this spell as a spell known, select four creatures from the appropriate list in Table 8: Summon Creature for each level at which you can cast this spell. For example, for the 1st-level summon creature spell, you could choose Tiny air, earth, fire, and water elementals. Note that a particular alignment or class is sometimes required to choose certain creatures, as listed in Table 8. In place of a single selection, you can choose a creature from a lower-level summoning list; doing so allows you the option of summoning multiple such creatures at a time. Each time you gain a character level, you can change these selections.\n" +
              "\n" +
              "You can gain summon creature a second time at the highest spell level you know, selecting four additional appropriate creatures at each level you can cast this spell.\n" +
              "\n" +
              "You choose which of the selected creatures you summon each time you cast the spell.\n" +
              "\n" +
              "1st: When you cast summon creature as a 1st-level spell, you summon one creature from your selection of creatures from the 1st-level summoning list.\n" +
              "\n" +
              "2nd: When you cast summon creature as a 2nd-level spell, you summon one creature from your selection of creatures from the 2nd-level summoning list. If the chosen creature is from a lower-level summoning list, you summon three such creatures instead.\n" +
              "\n" +
              "3rd: When you cast summon creature as a 3rd-level spell, you summon one creature from your selection of creatures from the 3rd-level summoning list. If the chosen creature is from a lower-level summoning list, you summon three such creatures instead.\n" +
              "\n" +
              "4th: When you cast summon creature as a 4th-level spell, you summon one creature from your selection of creatures from the 4th-level summoning list. If the chosen creature is from a lower-level summoning list, you summon three such creatures instead.\n" +
              "\n" +
              "5th: When you cast summon creature as a 5th-level spell, you summon one creature from your selection of creatures from the 5th-level summoning list. If the chosen creature is from a lower-level summoning list, you summon three such creatures instead.\n" +
              "\n" +
              "6th: When you cast summon creature as a 6th-level spell, you summon one creature from your selection of creatures from the 6th-level summoning list. If the chosen creature is from a lower-level summoning list, you summon three such creatures instead.\n" +
              "\n" +
              "A summoned creature can’t use teleportation or planar travel abilities or magical divination abilities. Creatures can’t be summoned into an environment that can’t support them (such as summoning a breathing creature into a vacuum). Creatures summoned using this spell can’t use spells or spell-like abilities that duplicate spells that require expending Resolve Points or expensive materials to cast (such as raise dead).\n" +
              "\n" +
              "To generate statistics for a summoned creature, first check the Stat Block column of the below tables. If the stat block is \"Alien\", use the creature’s stat block on that link, though it is altered slightly depending on your alignment. Otherwise, if the entry is Tiny, Small, Medium, Large, Huge, or elder, use the elemental stat block of the same name and apply the appropriate graft, listed in the Applied Graft column. Non-elemental creatures lose elemental immunities and do not gain an elemental graft. For example, to get the statistics of an angel from the 1st-level list, you use the tiny elemental stat block and apply the angel summoning graft.\n" +
              "\n" +
              "1st Level\n" +
              "Creature - Stat Block\nApplied Graft - Summoner Requirements\n" +
              "-------------------------------------\n" +
              "Aeon - Tiny\nSummoning - Neutral-aligned\n" +
              "-------------------------------------\n" +
              "Agathion - Tiny\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Angel - Tiny\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Archon - Tiny\nSummoning - Nonchaotic and nonevil\n" +
              "-------------------------------------\n" +
              "Azata - Tiny\nSummoning - Nonevil and nonlawful\n" +
              "-------------------------------------\n" +
              "Daemon - Tiny\nSummoning - Nongood\n" +
              "-------------------------------------\n" +
              "Demon - Tiny\nSummoning - Nongood and nonlawful\n" +
              "-------------------------------------\n" +
              "Devil - Tiny\nSummoning - Nonchaotic and nongood\n" +
              "-------------------------------------\n" +
              "Elemental, Air - Tiny\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Earth - Tiny\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Fire - Tiny\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Water - Tiny\nElemental - None\n" +
              "-------------------------------------\n" +
              "First World Beast - Tiny\nSummoning - Mystic\n" +
              "-------------------------------------\n" +
              "Inevitable - Tiny\nSummoning - Nonchaotic\n" +
              "-------------------------------------\n" +
              "Protean - Tiny\nSummonin - Nonlawful\n" +
              "-------------------------------------\n" +
              "Robot - Tiny\nSummoning - Technomancer\n" +
              "-------------------------------------\n" +
              "Shadow Creature - Tiny\nSummoning - None\n" +
              "-------------------------------------\n" +
              "Skittermander Whelp - Alien\nSimple - None\n" +
              "-------------------------------------\n" +
              "\n" +
              "\n" +
              "2nd Level\n" +
              "Creature - Stat Block\nApplied Graft - Summoner Requirements\n" +
              "-------------------------------------\n" +
              "Aeon - Small\nSummoning - Neutral-aligned\n" +
              "-------------------------------------\n" +
              "Agathion - tSmall\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Angel - Small\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Archon - Small\nSummoning - Nonchaotic and nonevil\n" +
              "-------------------------------------\n" +
              "Azata - Small\nSummoning - Nonevil and nonlawful\n" +
              "-------------------------------------\n" +
              "Daemon - Small\nSummoning - Nongood\n" +
              "-------------------------------------\n" +
              "Demon - Small\nSummoning - Nongood and nonlawful\n" +
              "-------------------------------------\n" +
              "Devil - Small\nSummoning - Nonchaotic and nongood\n" +
              "-------------------------------------\n" +
              "Elemental, Air - Small\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Earth - Small\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Fire - Small\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Water - Small\nElemental - None\n" +
              "-------------------------------------\n" +
              "First World Beast - Small\nSummoning - Mystic\n" +
              "-------------------------------------\n" +
              "Inevitable - Small\nSummoning - Nonchaotic\n" +
              "-------------------------------------\n" +
              "Protean - Small\nSummoning - Nonlawful\n" +
              "-------------------------------------\n" +
              "Robot - Small\nSummoning - Technomancer\n" +
              "-------------------------------------\n" +
              "Security Robot, Observer-Class - Alien\nSimple - Technomancer\n" +
              "-------------------------------------\n" +
              "Shadow Creature - Small\nSummoning - None\n" +
              "-------------------------------------\n" +
              "\n" +
              "\n" +
              "3rd Level\n" +
              "Creature - Stat Block\nApplied Graft - Summoner Requirements\n" +
              "-------------------------------------\n" +
              "Aeon - Medium\nSummoning - Neutral-aligned\n" +
              "-------------------------------------\n" +
              "Agathion - Medium\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Angel - Medium\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Archon - Medium\nSummoning - Nonchaotic and nonevil\n" +
              "-------------------------------------\n" +
              "Azata - Medium\nSummoning - Nonevil and nonlawful\n" +
              "-------------------------------------\n" +
              "Crest-Eater - Alien\nSimple - None\n" +
              "-------------------------------------\n" +
              "Daemon - Medium\nSummoning - Nongood\n" +
              "-------------------------------------\n" +
              "Demon - Medium\nSummoning - Nongood and nonlawful\n" +
              "-------------------------------------\n" +
              "Devil - Medium\nSummoning - Nonchaotic and nongood\n" +
              "-------------------------------------\n" +
              "Elemental, Air - Medium\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Earth - Medium\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Fire - Medium\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Water - Medium\nElemental - None\n" +
              "-------------------------------------\n" +
              "First World Beast - Medium\nSummoning - Mystic\n" +
              "-------------------------------------\n" +
              "Haan - Alien\nSimple - None\n" +
              "-------------------------------------\n" +
              "Inevitable - Medium\nSummoning - Nonchaotic\n" +
              "-------------------------------------\n" +
              "Ksarik - Alien\nSimple - None\n" +
              "-------------------------------------\n" +
              "Protean - Medium\nSummoning - Nonlawful\n" +
              "-------------------------------------\n" +
              "Robot - Medium\nSummoning - Technomancer\n" +
              "-------------------------------------\n" +
              "Shadow Creature - Medium\nSummoning - None\n" +
              "-------------------------------------\n" +
              "\n" +
              "\n" +
              "4th Level\n" +
              "Creature - Stat Block\nApplied Graft - Summoner Requirements\n" +
              "-------------------------------------\n" +
              "Aeon - Large\nSummoning - Neutral-aligned\n" +
              "-------------------------------------\n" +
              "Agathion - Large\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Angel - Large\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Archon - Large\nSummoning - Nonchaotic and nonevil\n" +
              "-------------------------------------\n" +
              "Azata - Large\nSummoning - Nonevil and nonlawful\n" +
              "-------------------------------------\n" +
              "Daemon - Large\nSummoning - Nongood\n" +
              "-------------------------------------\n" +
              "Demon - Large\nSummoning - Nongood and nonlawful\n" +
              "-------------------------------------\n" +
              "Devil - Large\nSummoning - Nonchaotic and nongood\n" +
              "-------------------------------------\n" +
              "Elemental, Air - Large\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Earth - Large\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Fire - Large\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Water - Large\nElemental - None\n" +
              "-------------------------------------\n" +
              "First World Beast - Large\nSummoning - Mystic\n" +
              "-------------------------------------\n" +
              "Inevitable - Large\nSummoning - Nonchaotic\n" +
              "-------------------------------------\n" +
              "Mountain Eel - Alien\nSimple - None\n" +
              "-------------------------------------\n" +
              "Orocoran - Alien\nSimple - None\n" +
              "-------------------------------------\n" +
              "Protean - Large\nSummoning - Nonlawful\n" +
              "-------------------------------------\n" +
              "Robot - Large\nSummoning - Technomancer\n" +
              "-------------------------------------\n" +
              "Shadow Creature - Large\nSummoning - None\n" +
              "-------------------------------------\n" +
              "\n" +
              "\n" +
              "5th Level\n" +
              "Creature - Stat Block\nApplied Graft - Summoner Requirements\n" +
              "-------------------------------------\n" +
              "Aeon - Huge\nSummoning - Neutral-aligned\n" +
              "-------------------------------------\n" +
              "Agathion - Huge\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Angel - Huge\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Archon - Huge\nSummoning - Nonchaotic and nonevil\n" +
              "-------------------------------------\n" +
              "Azata - Huge\nSummoning - Nonevil and nonlawful\n" +
              "-------------------------------------\n" +
              "Daemon - Huge\nSummoning - Nongood\n" +
              "-------------------------------------\n" +
              "Demon - Huge\nSummoning - Nongood and nonlawful\n" +
              "-------------------------------------\n" +
              "Devil - Huge\nSummoning - Nonchaotic and nongood\n" +
              "-------------------------------------\n" +
              "Elemental, Air - Huge\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Earth - Huge\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Fire - Huge\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Water - Huge\nElemental - None\n" +
              "-------------------------------------\n" +
              "First World Beast - Huge\nSummoning - Mystic\n" +
              "-------------------------------------\n" +
              "Inevitable - Huge\nSummoning - Nonchaotic\n" +
              "-------------------------------------\n" +
              "Protean - Huge\nSummoning - Nonlawful\n" +
              "-------------------------------------\n" +
              "Robot - Huge\nSummoning - Technomancer\n" +
              "-------------------------------------\n" +
              "Shadow Creature - Huge\nSummoning - None\n" +
              "-------------------------------------\n" +
              "Surnoch - Alien\nSimple - None\n" +
              "-------------------------------------\n" +
              "\n" +
              "\n" +
              "6th Level\n" +
              "Creature - Stat Block\nApplied Graft - Summoner Requirements\n" +
              "-------------------------------------\n" +
              "Aeon - Elder\nSummoning - Neutral-aligned\n" +
              "-------------------------------------\n" +
              "Agathion - Elder\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Angel - Elder\nSummoning - Nonevil\n" +
              "-------------------------------------\n" +
              "Archon - Elder\nSummoning - Nonchaotic and nonevil\n" +
              "-------------------------------------\n" +
              "Azata - Elder\nSummoning - Nonevil and nonlawful\n" +
              "-------------------------------------\n" +
              "Daemon - Elder\nSummoning - Nongood\n" +
              "-------------------------------------\n" +
              "Demon - Elder\nSummoning - Nongood and nonlawful\n" +
              "-------------------------------------\n" +
              "Devil - Elder\nSummoning - Nonchaotic and nongood\n" +
              "-------------------------------------\n" +
              "Elemental, Air - Elder\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Earth - Elder\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Fire - Elder\nElemental - None\n" +
              "-------------------------------------\n" +
              "Elemental, Water - Elder\nElemental - None\n" +
              "-------------------------------------\n" +
              "First World Beast - Elder\nSummoning - Mystic\n" +
              "-------------------------------------\n" +
              "Inevitable - Elder\nSummoning - Nonchaotic\n" +
              "-------------------------------------\n" +
              "Protean - Elder\nSummoning - Nonlawful\n" +
              "-------------------------------------\n" +
              "Robot - Elder\nSummoning - Technomancer\n" +
              "-------------------------------------\n" +
              "Shadow Creature - Elder\nSummoning - None\n" +
              "-------------------------------------",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Summon Drift Beacons",
      spellPreviewDescription = "You conjure several Drift beacons into your current star system.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "157",
      spellSourceBookFull = "Near Space",
      spellSchool = "conjuration (summoning)",
      spellCastingTime = "1 hour",
      spellRange = "system-wide",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 day/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You conjure several Drift beacons into your current star system. The beacons appear orbiting the star or stars at various distances but are not in danger of colliding with any other celestial bodies. For the duration of the spell, the system takes 2d6 fewer days to reach for the purposes of Drift travel to that system, to a minimum of 1 day. This reduction is factored in before dividing the result by a Drift engine’s rating, and a system can benefit from only one casting of this spell at a time. The beacons return to where they came from when the spell ends.\n" +
              "\n" +
              "This spell has no effect if cast while not in a star system or while within the Drift, and it does not reduce the time it takes to travel to Absalom Station.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Supercharge Armor",
      spellPreviewDescription = "You supercharge the target armor.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "157",
      spellSourceBookFull = "Near Space",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one suit of armor worn by a creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You supercharge the target armor. The armor’s hardness doubles; the armor sheds light in a 20-foot radius, increasing the light level 1 step to a maximum of normal light; and the creature wearing the armor gains temporary Hit Points equal to 5 + your caster level as long as it wears the armor.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Supercharge Weapon",
      spellPreviewDescription = "Touched weapon deals extra damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "379",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one weapon",
      spellArea = "",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You supercharge the target weapon. If the weapon’s next attack hits (provided it is made before the end of the next round), the attack deals 4d6 additional damage if the weapon is a single target attack or 2d6 additional damage if the weapon attacks all creatures in an area. This bonus damage is of the same type as the weapon’s normal damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Suppressing Field",
      spellPreviewDescription = "Weaken spells cast in an area.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "83",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius emanation centered on a creature, an object, or a point in space",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "You create a field of dampening magic, which radiates from a creature or an object and moves with that target. If you target a point, the effect is stationary. Any spell cast into or from this area is subjected to all the effects of a 2nd-level version of dampen spell.\n" +
              "\n" +"(Dampen Spell 2nd-level effects: Reduce: Halve the area or number of targets the spell can affect.\n" +
              "\n" +
              "Shorten: If the spell's duration is measured in hours, halve that duration (round down, minimum 30 minutes for 1 hour rounded down). You can't shorten a spell that has a duration measured in longer increments.\n" +
              "\n" +
              "Weaken: Halve the spell's damage or healing done.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2","WtchW 2"),
      spellTitle = "Sustaining Shelter",
      spellPreviewDescription = "You gently coax the surrounding terrain into a defensive dome capable of protecting you from harmful environments.",
      spellSourceBookPreview = "AdvP#42",
      spellSourcePage = "43",
      spellSourceBookFull = "Adventure Path #42: Whispers of the Eclipse",
      spellSchool = "transmutation",
      spellCastingTime = "1 minute",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "10-ft. cube",
      spellEffect = "magical shelter",
      spellDuration = "1 day/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You gently coax the surrounding terrain into a defensive dome capable of protecting you from harmful environments. This simple shelter has a single entrance, no doors, and occupies a 10-ft. cube. For the duration of the spell, the shelter provides environmental protections as if it were armor, using your caster level as the item level of the armor.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Prcg 1","WtchW 1"),
      spellTitle = "Swap Initiative",
      spellPreviewDescription = "Switch places in initiative order with a willing creature.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "84",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 reaction",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "yourself and one willing creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You sift through the threads of this timeline and rearrange them to your liking. After you and at least one other ally roll initiative to begin combat, you can cast this spell to switch places in initiative order with an ally or other willing creature, acting on one another's original initiative counts for the duration of the combat.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Swim",
      spellPreviewDescription = "You magically enhance one or more targets’ physiologies to allow them to swim through liquids with increasing levels of ease and grace.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action; see text",
      spellRange = "see text",
      spellTargets = "see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You magically enhance one or more targets’ physiologies to allow them to swim through liquids with increasing levels of ease and grace.\n" +
              "\n" +
              "1st: When you cast swim as a 1st-level spell, you can target one Medium or smaller creature per caster level at close range (25 feet + 5 feet/2 levels) that’s partially or fully submerged in water or another liquid. The targets must all be within 20 feet of each other. A Large creature or object counts as two Medium creatures, a Huge creature or object counts as four Medium creatures, and so on. The affected targets gain a +8 bonus to their Athletics checks to swim. For each target, this casting of the spell lasts 1 round per caster level or until that target leaves the water (whichever happens first).\n" +
              "\n" +
              "The 1st-level version of this spell can be cast as a reaction, but when you do so, you can’t take a standard action on your next turn.\n" +
              "\n" +
              "2nd: When you cast swim as a 2nd-level spell, you can target one willing or unconscious touched creature and give it a swim speed of 40 feet, and the spell lasts until the creature leaves the water or for 1 minute per caster level (whichever happens first).\n" +
              "\n" +
              "3rd: When you cast swim as a 3rd-level spell, you can target one willing or unconscious touched creature and affect it as per the 2nd-level version of the spell, except the target gains a swim speed of 60 feet and the spell lasts for 10 minutes per caster level.\n" +
              "\n" +
              "4th: When you cast swim as a 4th-level spell, you can target multiple willing or unconscious creatures at close range (25 feet + 5 feet/2 levels) and affect them as per the 3rd-level version of the spell. You can target one creature per caster level, all of which must be within 30 feet of each other.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6"),
      spellTitle = "Sympathetic Vibration",
      spellPreviewDescription = "Deal 2d10 damage per round to freestanding structure.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "379",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (sonic)",
      spellCastingTime = "10 minutes",
      spellRange = "touch",
      spellTargets = "one freestanding structure or vehicle",
      spellArea = "",
      spellEffect = "",
      spellDuration = "up to 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "By attuning yourself to a freestanding structure or vehicle (this doesn’t include starships), you can create a damaging vibration within it. Once it begins, the vibration deals 2d10 sonic damage per round to the target, bypassing hardness. You can choose at the time of casting to limit the duration of the spell; otherwise, it lasts for 1 round per level. If the spell is cast upon a target that is not freestanding, the surrounding material dissipates the effect and no damage occurs.\n" +
              "\n" +
              "Sympathetic vibration can’t affect creatures (even if they are constructs).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5"),
      spellTitle = "Synapse Overload",
      spellPreviewDescription = "Target takes 18d8 damage and is staggered for 1 minute.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "380",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude partial",
      spellResistance = "yes",
      spellDescriptionFull = "To affect the target, you must hit with a melee attack against its EAC; you can add your key ability score modifier to this attack roll instead of your Strength modifier if it is higher. You then overload the target’s mind, causing the target’s synapses to violently trigger. The target takes 18d8 damage and is staggered for 1 minute. A target can negate the staggered effect with a successful Fortitude saving throw, but still takes full damage.\n" +
              "\n" +
              "Casting this spell doesn’t provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Synaptic Pulse, Greater",
      spellPreviewDescription = "Stun all creatures within 20 feet for 1d4 rounds.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "380",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "20 ft.",
      spellTargets = "",
      spellArea = "20-ft.-radius spread centered on you",
      spellEffect = "",
      spellDuration = "1d4 rounds",
      spellSavingThrow = "Will partial",
      spellResistance = "yes",
      spellDescriptionFull = "You stun all creatures in range for 1d4 rounds. With a successful Will saving throw, a creature is instead sickened for 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Synaptic Pulse",
      spellPreviewDescription = "Stun all creatures within 20 feet for 1 round.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "380",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "20 ft.",
      spellTargets = "",
      spellArea = "20-ft.-radius spread centered on you",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You stun all creatures in range for 1 round.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Tectonic Shift",
      spellPreviewDescription = "You create the sensation of a massive earthquake for a short period of time, causing affected creatures to become unsteady on their feet.",
      spellSourceBookPreview = "GaExM",
      spellSourcePage = "75",
      spellSourceBookFull = "Galaxy Exploration Manual",
      spellSchool = "enchantment (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "see text",
      spellTargets = "see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You create the sensation of a massive earthquake for a short period of time, causing affected creatures to become unsteady on their feet.\n" +
              "\n" +
              "1st: When you cast tectonic shift as a 1st-level spell, you can target a creature within close range (25 feet + 5 feet/2 levels). The target must succeed at a Will saving throw or be shaken for 1 round.\n" +
              "\n" +
              "2nd: When you cast tectonic shift as a 2nd-level spell, you can target a creature within medium range (100 feet + 10 feet/level). The target must succeed at a Will saving throw or be shaken for 1d4 rounds. A creature that fails the save by 5 or more is knocked prone.\n" +
              "\n" +
              "3rd: When you cast tectonic shift as 3rd-level spell, you can target up to 5 creatures within medium range (100 feet + 10 feet/level). Each target must succeed at a Will saving throw or be shaken for 1d4 rounds. Creatures that fail the save by 5 or more are stunned for 1 round and knocked prone.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5"),
      spellTitle = "Telekinesis",
      spellPreviewDescription = "Move an object, attack creatures, or hurl objects or creatures with your mind.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "380",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration (up to 1 round/level) or instantaneous; see text",
      spellSavingThrow = "none, Will negates (object), see text",
      spellResistance = "yes (object), see text",
      spellDescriptionFull = "You move objects or creatures by concentrating on them. Depending on your desired effect (choose one from below), the spell can perform a variety of combat maneuvers, provide a gentle, sustained force, or exert a single short, violent thrust.\n" +
              "\n" +
              "Combat Maneuver: Once per round, you can use telekinesis to perform a ranged attack that acts as a bull rush, disarm, grapple (including pin), or trip combat maneuver. Resolve these attempts as normal, but use your caster level plus your key ability score modifier as your attack bonus. No saving throw is allowed against these attempts, but spell resistance applies normally. This version of the spell can last 1 round per caster level, but it ends if you cease concentrating.\n" +
              "\n" +
              "Sustained Force: A sustained force moves an object of no more than 25 pounds or 2 bulk per caster level up to 20 feet per round in any direction (including up or down). A creature can negate the effect on an object it holds with a successful Will save or with spell resistance. This version of the spell lasts 1 round per caster level, but it ends if you cease concentrating. The spell ends if the object is forced beyond the spell’s range.\n" +
              "\n" +
              "You can telekinetically manipulate an object as if with one hand. For example, a lever can be pulled, a key turned, a button pushed, an object rotated, and so on if the force required is within the weight limitation. You might even be able to untie simple knots, though a delicate activity such as this requires a successful DC 15 Intelligence check.\n" +
              "\n" +
              "Violent Thrust: The spell energy can be spent in a single round. You can hurl up to 15 objects or creatures that are within range (no two of which can be more than 10 feet apart) toward any target within 150 feet of all the objects. You can hurl up to a total weight of 400 pounds or 40 bulk. You must make attack rolls (one per creature or object thrown) to hit the target with the items, using your base attack bonus plus your key ability score modifier as your attack bonus. All objects cause damage ranging from 1 damage per 25 pounds or 2 bulk (for less dangerous objects) to 1d10 damage per 25 pounds or 2 bulk (for extremely dangerous objects, such as weapons or bladed or spiked objects). Objects and creatures that miss the target land in a square adjacent to the target. Creatures that fall within the weight capacity of the spell can be hurled, but they can attempt Will saving throws (or rely on spell resistance) to negate the effect, as can those whose held possessions are targeted by the spell. If a thrown creature is hurled against a solid surface, it takes 1d6 damage as if it had fallen 10 feet.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Telekinetic Projectile",
      spellPreviewDescription = "Telekinetically hurl an object, dealing 1d6 damage to the target and object.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "380",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one object and one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You fling an unattended object weighing up to 5 pounds (less than 1 bulk) at the target, making a ranged attack against its KAC. If you hit, you deal 1d6 bludgeoning damage to both the target and the object. The type of object thrown doesn’t change the damage type or any other properties of the attack.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4"),
      spellClassesWithLevelPreview = listOf("Myst 4"),
      spellTitle = "Telepathic Bond",
      spellPreviewDescription = "Link allows allies to communicate.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "381",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "you plus up to one willing creature per 3 levels, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You forge a telepathic bond between yourself and a number of willing creatures, each of which must have an Intelligence score of 3 or higher (or a modifier of –4 or higher). Each creature included in the link is linked to all the others. The creatures can communicate telepathically through the bond regardless of language. No special power or influence is established as a result of the bond. Once the bond is formed, it works over any distance (although not from one plane to another).\n" +
              "\n" +
              "If desired, you can leave yourself out of the telepathic bond forged. This decision must be made at the time of casting.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6"),
      spellClassesWithLevelPreview = listOf("Myst 6"),
      spellTitle = "Telepathic Jaunt",
      spellPreviewDescription = "Use your telepathic bond with a creature to teleport to its location.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "381",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "you and touched objects and other touched willing or unconscious creatures",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none, Will negates (object)",
      spellResistance = "no, yes (object)",
      spellDescriptionFull = "Telepathic jaunt thrums along the mental connection you have with a creature with which you currently have an active telepathic bond via your mystic telepathic bond class feature (but not via the telepathic bond spell), and it instantly teleports you to that creature. This spell teleports you to a random, unoccupied square adjacent to the creature with which you have the telepathic bond. If no such square is available, you teleport to the closest eligible square; if the nearest eligible square is more than 50 feet away from the creature, this spell fails.\n" +
              "\n" +
              "You can be transported any distance within a plane, even across the galaxy, but you can’t travel between planes, and you can’t transport yourself to a creature if one of you is traveling via Drift travel and the other isn’t. In addition to yourself, you can transport any objects you carry as long as their weight doesn’t exceed your maximum load. You can also bring up to six additional willing or unconscious Medium or smaller creatures (each carrying gear or objects up to its maximum load) or their equivalent. A Large creature counts as two Medium creatures, and a Huge creature counts as two Large creatures. All creatures to be transported must be in contact with one another, and at least one of those creatures must be in contact with you. Exceeding this limit causes the spell to fail. There must be sufficient space near the creature with which you have the telepathic bond for all the creatures you are teleporting, or this spell fails.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Telepathy",
      spellPreviewDescription = "Communicate mentally with any creatures within 100 feet.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "381",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minute/level",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You can mentally communicate with any other creature within 100 feet that has a language. It is possible to address multiple creatures at once telepathically, although maintaining a telepathic conversation with more than one creature at a time is just as difficult as speaking and listening to multiple people simultaneously. You can’t use telepathy to locate creatures to communicate with them, but once you’ve established telepathic communication, you don’t require line of effect to maintain it.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","Tchn 5","WtchW 5"),
      spellTitle = "Teleport",
      spellPreviewDescription = "Instantly teleport as far as 2,000 miles.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "381",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "2,000 miles",
      spellTargets = "you and touched objects and other touched willing or unconscious creatures",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none, Will negates (object)",
      spellResistance = "no, yes (object)",
      spellDescriptionFull = "This spell instantly transports you to a designated destination within 2,000 miles. Interplanar and interplanetary travel is not possible, and neither is travel between two moving starships during combat, though you might be able to teleport to a planet’s surface from an orbiting starship. You can bring along objects as long as their weight doesn’t exceed your maximum bulk limit. You can also bring up to five additional willing or unconscious Medium or smaller creatures (carrying gear or objects up to its maximum load) or their equivalent. A Large creature counts as two Medium creatures, and a Huge creature counts as four Medium creatures. All creatures to be transported must be in contact with one another, and at least one of those creatures must be in contact with you. As the caster, you need not attempt a saving throw, nor is spell resistance applicable to you. Only objects held or in use by another creature receive saving throws and benefit from spell resistance.\n" +
              "\n" +
              "You must have some clear idea of the location and layout of the destination. The clearer your mental image, the more likely the teleportation works. Areas of strong physical or magical energy can make teleportation more hazardous or even impossible. To see how well the teleportation works, roll d% and consult Table 10–1. Refer to the following information for definitions of the terms on the table.\n" +
              "\n" +
              "Familiarity: “Very familiar” describes a place you have been very often and where you feel at home. “Studied carefully” describes a place you know well, either because you can currently physically see it or because you’ve been there often. “Seen casually” describes a place you have been to more than once but with which you are not very familiar. “Viewed once” describes a place you have seen once in person or have extensively studied through scrying magic, remote cameras, or recorded images (for a remote-viewed location, you still need to have a clear idea of the location; you can’t teleport to an unknown location that you’ve seen in a holovid).\n" +
              "\n" +
              "“False destination” describes a place that doesn’t truly exist, or if you are teleporting to an otherwise familiar location, it is a place that no longer exists as such or has been so completely altered as to no longer be familiar to you. When traveling to a false destination, roll 1d20+80 to obtain results on the table, rather than rolling d%, since there is no real destination for you to hope to arrive at or even be off target from.\n" +
              "\n" +
              "On Target: You appear where you want to be.\n" +
              "\n" +
              "Off Target: You appear safely a random distance away from the destination in a random direction. The distance off target is d% of the distance that was to be traveled. The direction off target is determined randomly.\n" +
              "\n" +
              "Similar Area: You wind up in an area that’s visually or thematically similar to the target area. Generally, you appear in the closest similar place within range. If no such area exists within the spell’s range, the spell simply fails instead.\n" +
              "\n" +
              "Mishap: You and anyone else teleporting with you have gotten “scrambled.” You each take 2d10 damage, and you reroll on the chart to see where you wind up. For these rerolls, roll 1d20+80. Each time “mishap” comes up, the creatures take more damage and must reroll.\n" +
              "\n" +
              "Familiarity / On Target / Off Target / Similar Area / Mishap\n" +
              "Very familiar / 1–97 / 98–99 / 100 / —\n" +
              "Studied carefully / 1–94 / 95–97 / 98–99 / 100\n" +
              "Seen casually / 1–88 / 89–94 / 95–98 / 99–100\n" +
              "Viewed once / 1–76 / 77–88 / 89–96 / 97–100\n" +
              "False destination / — / — / 81–92 / 93–100",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3"),
      spellTitle = "Temporal Bullets",
      spellPreviewDescription = "When an ally's weapon attack misses, you cause it to hit instead, dealing up to 40 damage.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "84",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation",
      spellCastingTime = "1 reaction",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature your ally missed with a weapon attack",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "no",
      spellDescriptionFull = "You rewind time to a moment of missed opportunity and unleash the damage from a failed attack onto the original target of the attack. As a reaction after an ally's attack with a weapon misses an enemy, you redirect the missed attack's damage onto that enemy. Temporal bullets deals damage of the same amount and type the ally's attack would have dealt, up to a maximum of 40 damage.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","WtchW 5"),
      spellTitle = "Temporal Flash",
      spellPreviewDescription = "Spend a Resolve Point to avoid an attack and teleport to an empty space you could reach with a single move action.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "84",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 reaction",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You shift positions in your current timeline to avoid damage dealt by an attack. As a reaction when you're hit by an attack, spell, or other ability that would deal damage to you, you can spend 1 Resolve Point to instantly teleport to an empty space you could reach with a single move action, avoiding the damage you would have taken. This movement doesn't provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2"),
      spellTitle = "Temporal Shudder",
      spellPreviewDescription = "You cause a ripple in time that affects all creatures in the area.",
      spellSourceBookPreview = "AdvP#48",
      spellSourcePage = "52",
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "",
      spellTargets = "",
      spellArea = "30-ft.-radius emanation centered on you",
      spellEffect = "",
      spellDuration = "1 round",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You cause a ripple in time that affects all creatures in the area. At the start of each creature’s turn, there’s a 50% chance the creature is affected by a haste spell until the end of its turn; otherwise, it’s affected by a slow spell until the end of its turn.\n" +
              "\n" +
              "(Haste: When making a full attack, a hasted creature can also take a separate move action in order to move. The movement can occur before, after, or between the attacks from the full attack. All movement must occur at the same time.\n" +
              "\n" +
              "All of the hasted creature’s modes of movement (including base, burrow, climb, fly, and swim speeds) increase by 30 feet, to a maximum of twice the target’s normal speed using that form of movement. This increase counts as an enhancement bonus, and it affects the creature’s jumping distance as normal for increased speed. Multiple haste effects don’t stack. Haste counters and negates slow.)\n" +
              "\n" +
              "(Slow: Creatures affected by this spell are staggered (see Core Rulebook page 277). A slowed creature moves at half its normal speed (round down to the next 5-foot increment). Multiple slow effects don’t stack. Slow counters and negates haste.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Tenacious Plow",
      spellPreviewDescription = "You conjure a magical 10-foot-square vehicle in an unoccupied space within range.",
      spellSourceBookPreview = "RdsR",
      spellSourcePage = "60",
      spellSourceBookFull = "Redshift Rally",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "10-ft. square mobile plow",
      spellDuration = "1 round/level",
      spellSavingThrow = "Reflex negates",
      spellResistance = "no",
      spellDescriptionFull = "You conjure a magical 10-foot-square vehicle in an unoccupied space within range. For the spell’s duration, you can take a move action to slam the vehicle into a creature within 30 feet of the vehicle’s current location, moving it to an empty space adjacent to the target and dealing 6d10 bludgeoning damage (Reflex negates).\n" +
              "\n" +
              "If you don’t move the vehicle, it remains where it is and doesn’t deal any damage to any creatures, even if a creature is adjacent to the vehicle. The vehicle can’t hold any occupants or be damaged.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "Terraform",
      spellPreviewDescription = "Alter terrain and climate.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "382",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 hour",
      spellRange = "100 ft.",
      spellTargets = "",
      spellArea = "100-ft.-radius emanation centered on you",
      spellEffect = "",
      spellDuration = "1 day/level; see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You alter the area’s terrain and climate to a new terrain and climate type appropriate to the planet or plane. For example, you might transform a desert into plains. To cast this spell, you must spend 10 Resolve Points along with technological gear worth 30,000 credits (which is magically augmented to do much of the terraforming, then consumed by the spell). A xenodruid mystic instead uses crystals and incenses worth 30,000 credits. This magically alters the area’s climate and normal plants to those appropriate to the new terrain, but it doesn’t affect creatures or the configuration of the ground. Transforming rocky hills into forested areas converts grasses into shrubs and small trees, but it doesn’t flatten the hills or change the animals to suit the new environment.\n" +
              "\n" +
              "You can alter the climate by one step (cold, temperate, or warm). The maximum extent of the terrain change is up to the GM, but in general it changes to a similar terrain type or by one step within that terrain type (such as from a typical forest to a forest with massive trees or light undergrowth, from a shallow bog to a deep bog, and so on).\n" +
              "\n" +
              "Multiple castings of the spell in the same area can create an area with radically different terrain and climate than the surrounding land. The GM can decide that certain terrain shifts are unsustainable and shorten the duration or that some are suitable for the area and extend the duration. This spell could have many secondary effects based on the nature of the change, the type of bordering terrain, and so on; these should be determined by the GM on a case-by-case basis. For example, transforming a desert requires drawing water up from underground to sustain the plants, which could deplete the water table in nearby areas.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Thought Ripple",
      spellPreviewDescription = "You overload a target’s mind with so much psychic stimuli that it ripples to another target, triggering the initial spell as well as overloading the new target with residual psychic overload.",
      spellSourceBookPreview = "Ports",
      spellSourcePage = "123",
      spellSourceBookFull = "Ports of Call",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "1 primary target and 1 secondary target/spell level, no two of which can be more than 30 ft. from the primary target",
      spellArea = "",
      spellEffect = "",
      spellDuration = "Instantaneous",
      spellSavingThrow = "Will half",
      spellResistance = "yes",
      spellDescriptionFull = "You overload a target’s mind with so much psychic stimuli that it ripples to another target, triggering the initial spell as well as overloading the new target with residual psychic overload. This spell deals 2d8 damage to the target, plus 2d8 damage for each prior target that already took damage from this casting of the spell. You choose the order in which targets are affected. Each secondary target of this spell takes a –1 penalty to their Will Save for each opposing alignment of the primary target (so if the primary target was lawful evil, a secondary chaotic evil target takes a –1 penalty, and a secondary chaotic good target takes a –2 penalty). If this spell damages four targets, it incites a thought storm that causes each target to become confused (as per the confusion spell) for 1 round on a failed save.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 3"),
      spellClassesWithLevelPreview = listOf("Prcg 3"),
      spellTitle = "Time Crawl",
      spellPreviewDescription = "Create an area of warped time that acts as difficult terrain and staggers creatures.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "84",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "20-ft.-radius spread",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude partial",
      spellResistance = "no",
      spellDescriptionFull = "You distort time in the area, forcing it to pass slowly. This area is difficult terrain. Creatures in the area when the spell is cast, or who enter the area, are staggered for as long as they remain in the area. A creature that succeeds at a Fortitude saving throw negates the staggered condition and instead has all their speeds reduced by 10 feet for as long as they remain in the area. Creatures use the result of their initial saving throw against this spell, no matter how many times they leave and reenter the area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 4"),
      spellClassesWithLevelPreview = listOf("Prcg 4"),
      spellTitle = "Time Loop, Mass",
      spellPreviewDescription = "Confuse and entangle multiple creatures.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "84",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell functions as time loop, except as noted above.\n" +
              "\n" +
              "(Time Loop: You immerse a creature in a time loop of your creation. The target sees and reacts to events that no longer coincide with the current timeline, becoming confused for 1 round and entangled for the duration. If the target succeeds at a Will saving throw to ignore the time loop, they're instead off-target for the duration.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2"),
      spellTitle = "Time Loop",
      spellPreviewDescription = "Confuse and entangle a creature.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "84",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You immerse a creature in a time loop of your creation. The target sees and reacts to events that no longer coincide with the current timeline, becoming confused for 1 round and entangled for the duration. If the target succeeds at a Will saving throw to ignore the time loop, they're instead off-target for the duration.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","WtchW 3"),
      spellTitle = "Time's Edge",
      spellPreviewDescription = "Deal 10d6 slashing damage to creatures and objects in an area.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "84",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "120 ft.",
      spellTargets = "",
      spellArea = "line-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You refract latent energy from the Dimension of Time into your current plane in the form of a massive blade. This deals 10d6 slashing damage to all creatures and objects in the area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Token Spell",
      spellPreviewDescription = "Perform simple magical effects.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "382",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "10 ft.",
      spellTargets = "see text",
      spellArea = "see text",
      spellEffect = "see text",
      spellDuration = "1 hour",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "Token spells are often some of the first minor changes that spellcasters produce when they begin experimenting with magic. Once cast, token spell enables you to perform simple magical effects for 1 hour. The effects are minor and have severe limitations. You can slowly lift one item of light bulk. You can alter items in a 1-foot cube each round, coloring, cleaning, soiling, cooling, warming, or flavoring them. You can create small objects, but they look artificial and are extremely fragile (they can’t be used as tools or weapons). You can illuminate an object to shed dim light in a 30-foot radius.\n" +
              "\n" +
              "Token spell lacks the power to duplicate any other spell effects. Any actual change to an object (beyond moving, cleaning, or soiling it) persists for only 1 hour.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Precog 3","Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Prcg 3","Tchn 3","WtchW 3"),
      spellTitle = "Tongues",
      spellPreviewDescription = "Target can speak and understand any language.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "382",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "no",
      spellDescriptionFull = "This spell grants the creature touched the ability to speak and understand the spoken or signed language of any intelligent creature, whether it is a racial tongue or a regional dialect. The target can speak only one language at a time, although it may be able to understand several languages. Tongues does not enable the target to speak with creatures who don’t speak. The target can make itself understood as far as its voice carries.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 0","Tchn 4"),
      spellTitle = "Tracking Mark",
      spellPreviewDescription = "Place a mark on a creature or object that allows you to track it.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "84",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature or one object",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You place a unique magical mark, which is about 1 square inch in size, on a creature or object. The mark is invisible, but detect magic and similar effects can reveal its presence. Unattended objects are always affected by this spell. If you attempt to affect a creature or an object in a creature's possession, the creature can attempt a Reflex save to negate the effect.\n" +
              "\n" +
              "Once the tracking mark is in place, you can follow the tracking mark by succeeding at a DC 20 Mysticism check. You're able to detect the tracking mark up to 1,000 feet away, and you must be on the same plane as the tracking mark to follow it.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 0","Technomancer 0"),
      spellClassesWithLevelPreview = listOf("Prcg 0","Tchn 0"),
      spellTitle = "Transfer Charge",
      spellPreviewDescription = "Move charges from one power source to another source of the same type.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "383",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "two objects of the same type; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "yes (object)",
      spellDescriptionFull = "You can transfer any number of charges from one battery to another battery or from one power cell to another power cell. You can only transfer charges using two objects of the exact same type (two batteries of the same size, two identical power cells, or the like); you transfer charges from the source object to the receiving object.\n" +
              "\n" +
              "You must declare how many charges you are transferring before casting this spell. If you transfer more charges from the source than the receiving item can hold, the receiving item must succeed at a Fortitude saving throw or take 1d6 electricity damage. This spell provides no knowledge of how many charges a receiving item can safely hold, but you can choose to transfer fewer charges than the maximum allowed to reduce the risk.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5"),
      spellTitle = "Transfer Consciousness",
      spellPreviewDescription = "Transfer your mind into a computer or willing technological construct, and control its functions.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "142",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "divination",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "one computer or willing technological construct; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "You transfer your mind into a computer or technological construct. If you transfer your mind into a computer, its tier can be no higher than half your caster level. If you transfer into a construct, it must be willing or, if nonsapient, not hostile to you. The construct’s CR or level can be no higher than your caster level.\n" +
              "\n" +
              "While your mind is in a computer system, you have direct control over its commands. You can perform Computers checks related to that system in half the usual time.\n" +
              "\n" +
              "If you transfer your mind into a technological construct, you have access to its functions, allowing you to control the creature directly. You can’t cast the construct’s spells or use its spell-like or supernatural abilities. You can cast your own spells.\n" +
              "\n" +
              "While this spell lasts, your body falls prone and helpless, as if you were unconscious. When the spell ends, your mind transfers back to your body instantly, provided your body and the target are on the same plane. Otherwise, you die.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "You instantly transfer an object held in your hand to the hand of a willing creature within range.",
      spellPreviewDescription = "You instantly transfer an object held in your hand to the hand of a willing creature within range.",
      spellSourceBookPreview = "AdvP#42",
      spellSourcePage = "43",
      spellSourceBookFull = "Adventure Path #42: Whispers of the Eclipse",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one object held of up to 1 bulk",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "You instantly transfer an object held in your hand to the hand of a willing creature within range. The object can be no heavier than 1 bulk. The creature you teleport the object to must have at least one empty hand to hold the object.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Transport Passengers",
      spellPreviewDescription = "Create extradimensional seating space inside a vehicle or Tiny starship.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "142",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 minute",
      spellRange = "touch",
      spellTargets = "one vehicle or Tiny starship; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "none (object)",
      spellResistance = "no (object)",
      spellDescriptionFull = "You create an extradimensional space in the passenger area of a vehicle or Tiny starship, allowing it to carry one additional Medium creature per caster level. This spell must be cast on a vehicle able to carry more than one passenger, or the spell fails. The extradimensional space appears in the vehicle’s seating area or the starship’s bridge or passenger section, and it looks like a thin, glowing gap in reality. Creatures that step through this gap are shunted into the extradimensional space, which appears to be and functions as another compartment in the vehicle. A creature can exit the extradimensional space as part of a move action to move through the gap in reality, though a creature cannot exit the extradimensional space unless room to accommodate it exists in the normal seating area.\n" +
              "\n" +
              "Creatures that are encumbered or overburdened cannot enter the extradimensional space. If a creature is larger than Medium, each size category counts as one additional creature for determining the capacity of the extradimensional space.\n" +
              "\n" +
              "Creatures within the extradimensional space can’t interact with anything outside the vehicle, nor can creatures outside the vehicle perceive or interact with occupants and contents of the space. If the vehicle is destroyed or the extradimensional space is dispelled, the extradimensional space collapses. Anything within the extradimensional space when the vehicle or starship is destroyed, the space is dispelled, or this spell ends are shunted to the nearest open spaces outside the target.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2","WtchW 2"),
      spellTitle = "Trifold Explosion",
      spellPreviewDescription = "By drawing on the latent energy that surrounds everything, you trigger a series of magical explosions.",
      spellSourceBookPreview = "AdvP#49",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #49: A Light in the Dark",
      spellSchool = "evocation (fire)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "three bursts, no two of which can have their centers more than 30 feet apart",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "By drawing on the latent energy that surrounds everything, you trigger a series of magical explosions, dealing fire damage to creatures in areas that you designate when casting the spell. The amount of damage and the size of the explosions depend on the spell's level. Overlapping areas of Trifold Explosion do not do additional damage and creatures in overlapping areas of the spell's effect are only affected by the spell once.\n" +
              "\n" +
              "2nd: When you cast trifold explosion as a 2nd-level spell, it deals 3d6 fire damage in three 5-ft.-radius bursts.\n" +
              "\n" +
              "3rd: When you cast trifold explosion as a 3rd-level spell, it deals 5d6 fire damage in three 5-ft.-radius bursts.\n" +
              "\n" +
              "4th: When you cast trifold explosion as a 4th-level spell, it deals 7d6 fire damage in three 10-ft.-radius bursts.\n" +
              "\n" +
              "5th: When you cast trifold explosion as a 5th-level spell, it deals 8d6 fire damage in three 10-ft.-radius bursts.\n" +
              "\n" +
              "6th: When you cast trifold explosion as a 6th-level spell, it deals 10d6 fire damage in three 10-ft.-radius bursts.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Technomancer 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","Tchn 3"),
      spellTitle = "Tripartite Beam, Greater",
      spellPreviewDescription = "You fire three spiraling beams of glowing energy at a target that intertwine midflight into a single tripartite ray.",
      spellSourceBookPreview = "AdvP#49",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #49: A Light in the Dark",
      spellSchool = "evocation (acid, electricity, fire)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "This spell functions like tripartite beam, except as noted above. In addition, it deals 3d6 acid damage, 3d6 electricity damage, and 3d6 fire damage, rather than the damage listed in tripartite beam. On a critical hit, the target is blinded for 3 rounds, rather than dazzled.\n" +
              "\n" +
              "(Tripartite Beam: You fire three spiraling beams of glowing energy at a target that intertwine midflight into a single tripartite ray. Make a ranged attack roll against your target's EAC. If you hit, the target takes 1d6 acid damage, 1d6 electricity damage, and 1d6 f re damage. On a critical hit, they're additionally dazzled for 3 rounds.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1"),
      spellTitle = "Tripartite Beam",
      spellPreviewDescription = "You fire three spiraling beams of glowing energy at a target that intertwine midflight into a single tripartite ray.",
      spellSourceBookPreview = "AdvP#49",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #49: A Light in the Dark",
      spellSchool = "evocation (acid, electricity, fire)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./level)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You fire three spiraling beams of glowing energy at a target that intertwine midflight into a single tripartite ray. Make a ranged attack roll against your target's EAC. If you hit, the target takes 1d6 acid damage, 1d6 electricity damage, and 1d6 f re damage. On a critical hit, they're additionally dazzled for 3 rounds.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6","Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6","Tchn 6","WtchW 6"),
      spellTitle = "True Seeing",
      spellPreviewDescription = "Target can see things as they really are.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "383",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You confer upon the target the ability to see all things within 120 feet as they actually are. The target sees through normal and magical darkness, notices secret doors hidden by magic, sees the exact locations of creatures or objects that are invisible or displaced, sees through illusions, and sees the true form of changed or transmuted things. Further, the target can focus its vision to see into the Ethereal Plane (but not into extradimensional spaces).\n" +
              "\n" +
              "True seeing, however, does not penetrate solid objects. It in no way confers X-ray vision or its equivalent. It does not negate concealment, including that caused by fog and the like. True seeing does not help the viewer see through mundane disguises, spot creatures who are simply hiding, or notice secret doors hidden by mundane means.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("WtchW 4"),
      spellTitle = "Uncanny Eruption",
      spellPreviewDescription = "You form the crater of an active volcano at a target location, immediately exposing all creatures in the area to lava.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "75",
      spellSourceBookFull = "Galaxy Exploration Manual",
      spellSchool = "evocation (fire)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "20-ft.-radius crater filled with 2-footdeep magma",
      spellDuration = "concentration + 1 round/level (D)",
      spellSavingThrow = "Fortitude half",
      spellResistance = "no",
      spellDescriptionFull = "You form the crater of an active volcano at a target location, immediately exposing all creatures in the area to lava (Core Rulebook 403), dealing 2d6 fire damage immediately, and continuing to expose creatures who begin their turn in the area, who take the appropriate fire damage at the beginning of their turn. Damage from the lava continues for 1d3 rounds after a creature leaves the area, but this additional damage is only 1d6 fire damage per round.\n" +
              "\n" +
              "In addition, every 1d4 rounds, creatures in or within 30 feet of the crater must succeed at a Reflex save or take an additional 5d6 fire damage as the crater periodically erupts.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Prcg 2","WtchW 2"),
      spellTitle = "Uncanny Luck",
      spellPreviewDescription = "Reroll a saving throw or an enemy's attack roll.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "85",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 reaction",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "yes, see text",
      spellDescriptionFull = "Mimicking the luck of halflings, you presciently react or tug on the strands of fate, casting this spell just after a d20 roll you attempt for a saving throw or an enemy attempts for an attack against you. The triggering roll must be rerolled, unless it's an attack roll made by an enemy who saves or whose spell resistance you fail to overcome.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","WtchW 5"),
      spellTitle = "Undo Mistake",
      spellPreviewDescription = "Establish a mental link with an ally and spend a Resolve Point to allow them to reroll a failed skill check with a +2 circumstance bonus.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "85",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "touch",
      spellTargets = "one willing ally",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "Frequently used by formian taskmasters to assist with training workers in new fields or avoiding costly mistakes, this spell has become popular among educators, managers, parents, and mentors of all kinds. You establish a minor but long-range mental link with the target and are alerted whenever the target fails a skill check. Once during the spell's duration, you can nudge the universe into undoing the target's mistakes and allowing the target a second chance. As a reaction when the target fails a skill check, you can spend 1 Resolve Point to allow the target to reroll the failed skill check with a +2 circumstance bonus. After the target rerolls a skill check, this spell ends. If you and the target are ever more than 10 miles apart, this spell ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Precog 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Prcg 2","WtchW 2"),
      spellTitle = "Unmask",
      spellPreviewDescription = "Remove a creature's magical or nonmagical disguise.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "85",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "enchantment",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "Embri cast this spell to shame other embri who break decorum, and precogs manifest this spell by revealing a creature's true future appearance. If the target fails the saving throw, nonmagical disguises or face coverings fall away harmlessly, revealing the creature's face or otherwise showing its real identity. A shapechanger must revert to its true form. A creature can't successfully disguise itself, change its shape, or use a magic item to alter its appearance again for 10 minutes. During this time, the creature can't be the target of another's attempt at a nonmagical disguise, but it can be the target of another's disguising magic.\n" +
              "\n" +
              "If, when you cast this spell, the effect disguising a creature is magical (other than a shapechanger's capabilities), you must attempt a caster level check (1d20 + your caster level). The DC equals 11 + the level, item level, or CR of the effect's creator. If you succeed, the magic is dispelled and can't be renewed for 10 minutes. This spell has no effect on artifacts or deities.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","Tchn 5","WtchW 5"),
      spellTitle = "Unravel Magic",
      spellPreviewDescription = "Permanently remove a magic item's magical properties.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "85",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one unattended hybrid or magic item",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Fortitude negates (object)",
      spellResistance = "no",
      spellDescriptionFull = "You unravel the magic imbuing a magic item, permanently removing its magical properties. To do so, you must attempt a caster level check (1d20 + your caster level). The DC equals 11 + the item's level, or 5 + a consumable item's level. If you succeed, the item becomes nonmagical, but its physical properties remain unchanged. This spell has no effect on artifacts.\n" +
              "\n" +
              "If you unravel a non-consumable magic item of an item level of 4 or higher, you can harvest a portion of the unraveling energy. Divide the item's level by 4, and you can gain one spell slot of that level or lower. That spell slot vanishes if you fail to use it within 24 hours or after you rest to regain the use of daily-use abilities, whichever comes first.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1"),
      spellTitle = "Unseen Servant",
      spellPreviewDescription = "Invisible force obeys your commands.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "383",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "one invisible, mindless, shapeless servant",
      spellDuration = "1 hour/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "The spell conjures an invisible, mindless, shapeless force that performs simple tasks at your command (a move action). It can run and fetch things, open unstuck doors, and hold chairs, as well as clean and mend. The servant can perform only one activity at a time, but it repeats the same activity over and over again if told to do so as long as you remain within range. It has an effective Strength score of 2 (so it can lift up to 20 pounds or 2 bulk or drag up to 100 pounds or 10 bulk). It can trigger traps and such, but it can’t exert enough force to activate certain pressure plates and other devices. It can’t perform any task that requires a skill check with a DC higher than 10 or that requires a check using a skill that can’t be used untrained. This servant can’t fly, climb, or swim (though it can walk on water). Its land speed is 15 feet.\n" +
              "\n" +
              "The servant can’t attack in any way; it is never allowed to make attack rolls. It can’t be killed, but it dissipates if it takes 6 or more damage from area attacks; it gets no saving throws against attacks.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("WtchW 6"),
      spellTitle = "Unspeakable Presences",
      spellPreviewDescription = "Enemies in the area take 4d6 damage per round, cannot move, and might be devoured whole.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "142",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "",
      spellArea = "60-ft. radius",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none; see text",
      spellResistance = "no",
      spellDescriptionFull = "You swap the space beneath your enemies with the gnashing maws, tentacles, and claws of hideous beasts from another reality. A foe in the area takes 4d6 damage per round and cannot move until it succeeds at a Reflex saving throw, which it can attempt at the end of each of its turns. At that point, the opponent can be affected again only if it leaves the spell’s area and then returns.\n" +
              "\n" +
              "A creature that takes damage from this spell 3 rounds in a row must succeed at a Fortitude save or be consumed by the unspeakable presences. That creature dies, and when the spell ends, its body and gear disappear into the realities from whence the presences came. This is a death effect. Only miracle, warp reality, and wish can bring back a creature slain this way.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Tchn 5","WtchW 5"),
      spellTitle = "Unwilling Guardian",
      spellPreviewDescription = "Charm a target into protecting you during combat.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "383",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./level)",
      spellTargets = "one creature with CR lower than your level; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "Your overwhelming presence bores into the target’s mind, cowing its will. This turns it into an automaton-like guardian that protects you at all costs. As soon as it is able, the target mindlessly moves along the most direct route toward you and stops when it is within 10 feet of you (provoking attacks of opportunity for movement as normal). If you are being attacked in melee by a creature within 10 feet, the target instead takes the quickest route to intercept that creature from a square within 10 feet of you and attack it on your behalf.\n" +
              "\n" +
              "While this spell is in effect, the target attacks any creature that attacks you in melee, though it can’t move more than 10 feet from you to do so. If multiple creatures are attacking you in melee, you can choose which creature the target attacks on your behalf as part of combat banter. If you are the target of ranged attacks and your guardian is not attacking a melee assailant on your behalf, it moves to provide cover against the ranged attacks. Due to the strong momentary connection between you and your unwilling guardian, if you are the single target of a hostile creature’s spell or effect, the creature must succeed at a caster level check (DC = 6 + your caster level) or the spell or effect instead targets your guardian. This spell has no effect on area of effect or multi-target spells or other effects that include you as a target.\n" +
              "\n" +
              "When this spell ends, the target regains control of its faculties entirely and it knows and remembers that you used magic to control it. Once a creature has been the target of unwilling guardian, it can’t be targeted with this spell again for 24 hours if cast by the same spellcaster.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4","WtchW 4"),
      spellTitle = "Upgrade Summon, Greater",
      spellPreviewDescription = "This spell functions as upgrade summon, except that you can apply two of the listed benefits above to the target summoned creature.",
      spellSourceBookPreview = "AdvP#51",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #51: Into the Dataverse",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one summoned creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell functions as upgrade summon, except that you can apply two of the listed benefits above to the target summoned creature.\n" +
              "\n" +
              "(Upgrade Summon: This spell temporarily empowers the abilities of a summoned creature. When you cast this spell, choose one of the following benefits. This upgrade lasts for the spell’s duration or until the summoned creature is dismissed or returns to its native plane. A summoned creature can only benefit from one of these upgrades at a time; casting this spell a second time on a summoned creature immediately ends the first casting’s benefits.\n" +
              "\n" +
              "-The summoned creature’s maximum Hit Points increases by 10%.\n" +
              "\n" +
              "-The Armor Class of the summoned creature increases by 2.\n" +
              "\n" +
              "-The summoned creature gains a +1 bonus to all attack rolls.\n" +
              "\n" +
              "-One of the summoned creature’s attacks deals an additional die of damage of the same size.\n" +
              "\n" +
              "-When the summoned creature makes a full attack, it can also take a separate move action to move. The movement can occur before, after, or between the attacks from the full attack. All movement must occur at the same time. (This benefit doesn’t stack with the benefits of haste.)",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2","WtchW 2"),
      spellTitle = "Upgrade Summon",
      spellPreviewDescription = "This spell temporarily empowers the abilities of a summoned creature.",
      spellSourceBookPreview = "AdvP#51",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #51: Into the Dataverse",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one summoned creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "This spell temporarily empowers the abilities of a summoned creature. When you cast this spell, choose one of the following benefits. This upgrade lasts for the spell’s duration or until the summoned creature is dismissed or returns to its native plane. A summoned creature can only benefit from one of these upgrades at a time; casting this spell a second time on a summoned creature immediately ends the first casting’s benefits.\n" +
              "\n" +
              "-The summoned creature’s maximum Hit Points increases by 10%.\n" +
              "\n" +
              "-The Armor Class of the summoned creature increases by 2.\n" +
              "\n" +
              "-The summoned creature gains a +1 bonus to all attack rolls.\n" +
              "\n" +
              "-One of the summoned creature’s attacks deals an additional die of damage of the same size.\n" +
              "\n" +
              "-When the summoned creature makes a full attack, it can also take a separate move action to move. The movement can occur before, after, or between the attacks from the full attack. All movement must occur at the same time. (This benefit doesn’t stack with the benefits of haste.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Prcg 6","WtchW 6"),
      spellTitle = "Usher Apocalypse",
      spellPreviewDescription = "Deal fire damage, create difficult terrain, and potentially anchor foes to the ground in the area.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "142",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "illusion (shadow)",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "",
      spellArea = "60-ft. radius",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will disbelief and Reflex partial; see text",
      spellResistance = "yes",
      spellDescriptionFull = "You create a quasi-real apocalypse to tear through the area, causing several effects. When the spell first takes effect, illusory hellfire crashes to the ground, dealing 6d6 fire damage to your enemies in the area. Creatures can attempt a Will saving throw to disbelieve the fiery vision and take only half damage.\n" +
              "\n" +
              "Then, for the duration, two more effects continue. An illusion makes the ground appear to be unstable crust over lava, which your foes treat as difficult terrain. Grasping hands appear to reach out from the ground to grab at enemies. Each time an enemy starts its turn in the area, it must succeed at a Reflex saving throw or be unable to leave its space for the turn.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4","WtchW 4"),
      spellTitle = "Usurp Spell",
      spellPreviewDescription = "Take control of another spell being cast nearby.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "85",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "abjuration",
      spellCastingTime = "1 reaction",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "one spell",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You override the will of another spellcaster, taking control of their spell. As a reaction when you observe a spell being cast within range, you can cast this spell. If you do, you can attempt a dispel check (1d20 + your caster level). The DC equals 11 + the other spellcaster's caster level + 2 per level of the spell above 4th. If you succeed, you determine the spell's parameters as if you had cast it. This spell has no effect on artifacts or deities.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
      spellTitle = "Vanishing Trick",
      spellPreviewDescription = "Turn an object invisible.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "85",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one unattended object of no more than 1 bulk",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "Will negates (harmless, object)",
      spellResistance = "yes (harmless, object)",
      spellDescriptionFull = "The object you touch becomes invisible.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0","WtchW 0"),
      spellTitle = "Varied Veneer",
      spellPreviewDescription = "Make an object appear broken or nonfunctional, or make a broken object appear to be functional.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "85",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one unattended object of no more than 2 bulk",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour",
      spellSavingThrow = "Will disbelief",
      spellResistance = "no",
      spellDescriptionFull = "You make the object you touch appear to be broken or otherwise worthless, or you make a broken object appear to be functional. A creature that handles the object can attempt a Will saving throw to recognize the illusion. The object functions as its actual condition indicates—this spell ends if someone attempts to use the object for its intended function.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6","WtchW 6"),
      spellTitle = "Veil",
      spellPreviewDescription = "Change appearance of a group of creatures.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "384",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "up to one or more creatures, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration + 1 hour/level (D)",
      spellSavingThrow = "Will negates or disbelief, see text",
      spellResistance = "yes, see text",
      spellDescriptionFull = "You instantly change the appearance of the targets and then maintain that appearance for the spell’s duration. You can make the targets appear to be anything you wish. The targets look, feel, and smell just like what the spell makes them resemble. Affected creatures return to their normal appearances if slain. You must succeed at a Disguise check to duplicate the appearance of a specific individual. This spell gives you a +10 bonus to such a check (since it counts as altering your form).\n" +
              "\n" +
              "An unwilling target can negate the spell’s effect on it by succeeding at a Will saving throw or by relying on spell resistance. Those who interact with the targets can attempt Will saving throws to disbelieve the illusion, but spell resistance doesn’t help pierce the illusion.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Venomous Weapon",
      spellPreviewDescription = "You touch a weapon that deals bludgeoning, piercing, or slashing damage and imbue it with poison.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "23",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "conjuration (poison)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "weapon touched",
      spellArea = "",
      spellEffect = "imbues weapon with poison",
      spellDuration = "1 minute/level",
      spellSavingThrow = "none (see text)",
      spellResistance = "no",
      spellDescriptionFull = "You touch a weapon that deals bludgeoning, piercing, or slashing damage and imbue it with poison. The next five attacks made using the weapon are poisoned. Each creature damaged by these attacks must succeed at a Fortitude save or be sickened for 2d4 rounds.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","WtchW 2"),
      spellTitle = "Verdant Blast",
      spellPreviewDescription = "Emit a blast of plants dealing 3d6 piercing damage to all creatures and objects in the area.",
      spellSourceBookPreview = "AdvP#42",
      spellSourcePage = "43",
      spellSourceBookFull = "Adventure Path #42: Whispers of the Eclipse",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "120 ft.",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "Tapping into the life-giving energy of your home world, you emit a blast of rapidly growing roots, branches, vines, and thorns that puncture creatures in a line, dealing 3d6 piercing damage to all creatures and objects in the area.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Tchn 1","WtchW 1"),
      spellTitle = "Verdant Code",
      spellPreviewDescription = "You turn data into plant matter that either instantly explodes outward or lurks within a device.",
      spellSourceBookPreview = "NearS",
      spellSourcePage = "129",
      spellSourceBookFull = "Near Space",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one computer system or module",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 hour/level or until triggered, then 1 minute/level, see text",
      spellSavingThrow = "Will negates (object), Reflex partial, see text",
      spellResistance = "yes (object), see text",
      spellDescriptionFull = "You turn data into plant matter that either instantly explodes outward or lurks within a device.\n" +
              "\n" +
              "Instant Growth: You immediately incite growth from the targeted device. A creature can negate the effect on an object it holds with a successful Will save or with spell resistance. For both this and the dormant growth effect (see below), the plant matter explodes from the targeted device, filling all squares within a 20-foot-radius spread. Each creature in the area must attempt a Reflex save. On a failure, it takes 5d6 slashing damage and is entangled; on a successful save, it takes half damage, isn’t entangled, and is shunted to the nearest empty space available. A creature can escape the entangled effect with a successful Acrobatics or Athletics check as a standard action, using the spell save DC as the skill check DC. A square of plant matter has hardness 8 and 15 Hit Points. The growth also covers the device, preventing non-remote access until the plant matter is destroyed or disintegrates at the end of the spell’s duration.\n" +
              "\n" +
              "Dormant Growth: You implant verdant code into an computer system or module you have root access to. The next time the device is accessed, plant matter explodes from the device (see above). A device can hold only one instance of verdant code at a time, and new instances erase the previous instance. If this spell’s duration ends before the implanted code is accessed, the code vanishes. This code can be made permanent, as implant data.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Vigilant Junkbot",
      spellPreviewDescription = "Create a temporary robot made of junk that can protect you from ranged or melee attacks.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "143",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "1 bulk of inert electronic equipment; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You turn the target into a robot that can guard you. This spell works like handy junkbot insofar as targeting parameters and your inability to target the same equipment after the spell ends. The junkbot you create is Tiny and appears in your space.\n" +
              "\n" +
              "A vigilant junkbot can take no actions. Instead, you instruct the junkbot to perform its melee protocol or ranged protocol. You can change the protocol telepathically as a move action. In its melee protocol, the junkbot attaches to you, granting you a +1 bonus to KAC for every 4 technomancer levels you have. In its ranged protocol, the vigilant junkbot hovers at strategic angles to cover you, granting you concealment against ranged attacks. Additionally, when you take damage from an attack that matches the protocol (melee or ranged), the junkbot takes the first 3 damage. Any additional damage passes to you.\n" +
              "\n" +
              "Enemies can target the junkbot instead of you. Its KAC and EAC are each 10 + your caster level, and it has Hit Points equal to one-quarter of your own (but no Stamina Points). The junkbot uses your saving throw bonuses, and it is a construct with the magical and technological subtypes.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3"),
      spellClassesWithLevelPreview = listOf("Myst 3"),
      spellTitle = "Viral Destruction",
      spellPreviewDescription = "You can cast this spell only immediately after a creature in range dies.",
      spellSourceBookPreview = "AdvP#2",
      spellSourcePage = "51",
      spellSourceBookFull = "Adventure Path #2: Temple of the Twelve pg. 51",
      spellSchool = "necromancy",
      spellCastingTime = "1 reaction",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one newly dead creature; see text",
      spellArea = "",
      spellEffect = "",
      spellDuration = "Instantaneous; see text",
      spellSavingThrow = "Will negates, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You can cast this spell only immediately after a creature in range dies. On its next turn in the initiative order, the corpse stands up (if applicable; this does not require a move action), can take a single move action to move up to its speed, and makes a single attack using the weapons and bonuses it had when alive (though it can’t use class features, spell-like abilities, or spells). You can choose the target of the affected creature’s attack or allow the target corpse to select a target entirely at random. If the target of this spell was friendly or helpful toward you in life, the spell works automatically; otherwise, the corpse can attempt a Will saving throw to negate this spell, as if the creature were still alive. After making its attack, the creature that you have targeted with viral destruction falls and is dead as normal. However, if this attack kills the affected creature’s target or if it knocks it unconscious, that target must succeed at a Will saving throw (using the spell’s DC) or be subject to viral destruction and make a single attack on its next turn before returning to its normal dead or unconscious state. If the secondary target of viral destruction is merely unconscious and becomes conscious again before its next action, that creature is freed from the viral destruction effect and the spell ends. Each attack caused by this spell can transfer the viral destruction effect to its target if that target is knocked unconscious or killed by the attack, until the spell has affected a number of creatures equal to your mystic level.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 6","Precog 6"),
      spellClassesWithLevelPreview = listOf("Myst 6","Prcg 6"),
      spellTitle = "Vision",
      spellPreviewDescription = "Answer a question about a person, place, or object.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "384",
      spellSourceBookFull = "Starfinder Core Rulebook",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "see text",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You pose a question about some person, place, or object while casting this spell. If the person or object is at hand or if you are in the place in question and you succeed at a caster level check (1d20 + your caster level, DC 20), you receive a vision about that person, place, or object. The information gained includes everything available about the target that could be discovered by spending weeks in dedicated research with excellent-quality but standard reference works.\n" +
              "\n" +
              "If the person or object is not at hand or you are not in the place and you know only detailed information about the person, place, or object, the DC of the caster level check is 25 and the information gained is incomplete (though it often provides enough information to help you find the person, place, or thing, thus allowing a better vision result next time). If you know only rumors, the DC is 30 and the information gained is vague (though it often directs you to more detailed information, thus allowing a better vision result next time). In most circumstances, you can’t glean information about what occurred during the Gap with this spell.\n" +
              "\n" +
              "Casting this spell requires access to a computer or similar device, which displays the information gained. Additionally, casting this spell places considerable strain on you, requiring you to spend 1 Resolve Point.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","WtchW 4"),
      spellTitle = "Void Grasp",
      spellPreviewDescription = "Attempt a melee attack to deal 8d8 damage and sicken a creature.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "86",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/level",
      spellSavingThrow = "Fortitude partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "Reaching to worlds beyond, you siphon your foe's life force as a shared offering to some extraplanar entity. Attempt a melee attack against the target's EAC, adding the higher of your key ability modifier or your Strength modifier to the attack roll. On a hit, the target takes 8d8 damage and must attempt a Fortitude saving throw. A target that fails is sickened for the duration. One who succeeds is sickened for only 1 round, and then the spell ends. In either case, you gain temporary Hit Points equal to half the damage you dealt.\n" +
              "\n" +
              "Casting this spell doesn't provoke attacks of opportunity.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2","WtchW 2"),
      spellTitle = "Void Vessel",
      spellPreviewDescription = "You grant one or more targets the ability to survive in vacuum.",
      spellSourceBookPreview = "DrftCs",
      spellSourcePage = "123",
      spellSourceBookFull = "Drift Crisis",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "1 creature/level",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You grant one or more targets the ability to survive in vacuum. Affected targets gain the void adaptation universal creature rule and sprout wings of pure energy that grant a supernatural fly speed of 60 feet (average maneuverability) that functions only in vacuum.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Void Whispers",
      spellPreviewDescription = "The target’s mind is flooded with elder mysteries from the dark between the stars, galaxies, and dimensions.",
      spellSourceBookPreview = "GaExM",
      spellSourcePage = "115",
      spellSourceBookFull = "Galaxy Exploration Manual",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 round/3 levels",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "The target's mind is flooded with elder mysteries from the dark between the stars, galaxies, and dimensions. The target must attempt a Will save; on a failure, it begins whispering incoherently and moves half its speed in a random direction. On its turn, it does nothing except whisper incoherently and move half its speed in a random direction. When it moves, the target takes the safest route and doesn't enter hazardous terrain. If the target is attacked, the spell ends immediately.\n" +
              "\n" +
              "Creatures that begin their turn within 20 feet of the target and can hear it whispering must succeed at a Will saving throw or become confused for 1 round. A creature that succeeds at this save is immune to the whispers until the spell ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Volcanic Wrath",
      spellPreviewDescription = "You summon an erupting volcano that unleashes molten rock over an area, dealing fire and bludgeoning damage.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "115",
      spellSourceBookFull = "Interstellar Species",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "varies by level",
      spellEffect = "",
      spellDuration = "instantaneous, plus 1 round/level",
      spellSavingThrow = "Reflex half",
      spellResistance = "yes",
      spellDescriptionFull = "You summon an erupting volcano that unleashes molten rock over an area, dealing fire and bludgeoning damage. The eruption leaves molten rocks, thick ash, and smoke, making the entire area of effect difficult terrain for the duration of the spell.\n" +
              "\n" +
              "1st: When you cast volcanic wrath as a 1st-level spell, it deals 2d6 damage in a 10-ft-radius, 20 ft. high burst.\n" +
              "\n" +
              "2nd: When you cast volcanic wrath as a 2nd-level spell, it deals 4d6 damage in a 10-ft-radius, 20 ft. high cylinder.\n" +
              "\n" +
              "3rd: When you cast volcanic wrath as a 3rd-level spell, it deals 7d6 damage in a 20-ft-radius, 40 ft. high cylinder.\n" +
              "\n" +
              "4th: When you cast volcanic wrath as a 4th-level spell, it deals 10d6 damage in a 20-ft-radius, 40 ft. high cylinder.\n" +
              "\n" +
              "5th: When you cast volcanic wrath as a 5th-level spell, it deals 15d6 damage in a 30-ft-radius, 60 ft. high cylinder.\n" +
              "\n" +
              "6th: When you cast volcanic wrath as a 6th-level spell, it deals 17d6 damage in a 30-ft-radius, 60 ft. high cylinder.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Tchn 3","WtchW 3"),
      spellTitle = "Wall of Air",
      spellPreviewDescription = "You cause a massive sheet of flowing air to appear.",
      spellSourceBookPreview = "AdvP#36",
      spellSourcePage = "53",
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy",
      spellSchool = "evocation (air)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "wall up to 20 ft. long/level or a ring with a radius of up to 5 ft./2 levels; either form 40 ft. tall",
      spellDuration = "concentration + 1 round/level (D)",
      spellSavingThrow = "Reflex (see text)",
      spellResistance = "no",
      spellDescriptionFull = "You cause a massive sheet of flowing air to appear. When you cast wall of air, choose whether the air flows upward or downward. This spell has different effects depending on the environment in which it is cast (below). You can place a wall of air so that it’s in multiple environments at once; in this case, it affects each environment separately. This spell can’t be cast in a vacuum.\n" +
              "\n" +
              "In Atmosphere: The wall’s area is treated as a windstorm, which requires flying creatures to attempt Acrobatics checks to fly through it and imparts a –4 penalty on ranged attacks that deal kinetic damage. Attacks with archaic ranged weapons made through or within the wall of air automatically miss. Small or smaller creatures starting their turn in the wall’s area must succeed at a Reflex save or be knocked prone.\n" +
              "\n" +
              "In Water: The wall of air creates a massive sheet of bubbles that provides concealment. A creature that moves through the wall of air must succeed at an Athletics check to swim in stormy conditions with the DC increased by your caster level; on a failure, it’s moved 10 feet in the direction you chose for the wall’s air to flow. In addition, any creature within a wall of air while underwater can breathe air as if in a normal atmosphere. This wall doesn’t adversely affect water-breathing creatures.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Wall of Earth",
      spellPreviewDescription = "Create an earthen barrier.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "86",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "earthen wall with area up to one 5-ft. square/level, see text",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "An earthen barrier springs into existence, anchored to surrounding solid surfaces or, at least, supported by a firm foundation. The stress of casting this spell requires you to spend 1 Resolve Point. The wall fails to manifest in any area already occupied by a creature or object, or where it's likely to fall or collapse. However, the wall can fit into any space of surrounding nonliving material if its area is sufficient to do so.\n" +
              "\n" +
              "A typical wall of earth is 1 foot thick, but you can double the thickness by halving the area, or vice versa. You can crudely shape the wall in almost any way you desire, provided the shape you choose has enough support. Each 5-foot section of the wall has hardness 0 and 5 Hit Points per inch of thickness. A section of wall is breached if reduced to 0 Hit Points. If a creature tries to break through the wall with a single attack, the DC for the Strength check is 20.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4","WtchW 4"),
      spellTitle = "Wall of Fire",
      spellPreviewDescription = "Blazing curtain deals 2d6 fire damage out to 10 feet and 1d6 fire damage out to 20 feet; passing through the wall deals 5d6 fire damage.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "384",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (fire)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "wall up to 20 ft. long/level or a ring with a radius up to 5 ft./2 levels; either form 20 ft. high",
      spellArea = "",
      spellEffect = "",
      spellDuration = "concentration + 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "An immobile blazing curtain of opaque, shimmering, violet fire springs into existence. One side of the wall, selected by you, sends forth waves of heat, dealing 2d6 fire damage to creatures within 10 feet and 1d6 fire damage to those beyond 10 feet but within 20 feet. The wall deals this damage when it appears and on your turn each subsequent round. In addition, the wall deals 5d6 fire damage to any creature passing through it. The wall deals double damage to undead creatures.\n" +
              "\n" +
              "If you evoke the wall so that it appears where creatures are, each creature takes damage as if passing through the wall. If any 5-foot length of wall takes 20 or more cold damage in 1 round, that length goes away.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Technomancer 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","Tchn 1","WtchW 1"),
      spellTitle = "Wall of Fog",
      spellPreviewDescription = "Create a bank of obscuring fog.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "86",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "fog up to 20 ft. long/level or a ring with a radius up to 5 ft./2 levels; either form up to 20 ft. high",
      spellDuration = "concentration + 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "A billowing wall of dense mist forms in a vertical plane, provided the wall is neither underwater nor in a vacuum. In those cases, the spell fails. Creatures and objects on one side of the wall have concealment (20% miss chance) from creatures on the opposite side of the wall. A moderate wind (11+ mph) disperses this fog in 2 rounds; a strong wind (21+ mph) disperses the fog in 1 round, although the wall returns if you're still concentrating on it and the wind ends.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Precog 5","Technomancer 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Prcg 5","Tchn 5","WtchW 5"),
      spellTitle = "Wall of Force",
      spellPreviewDescription = "Invisible wall is difficult to destroy.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "384",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "evocation (force)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "wall with area up to one 10-ft. square/level",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "Wall of force creates an invisible wall of pure force. You can form the wall into a flat, vertical plane whose area is up to one 10-foot square per level. The wall must be continuous and unbroken when formed. If its surface is broken by any object or creature, the spell fails.\n" +
              "\n" +
              "This counts as a force field for effects that can’t penetrate a force field. The wall can’t move and is not easily destroyed. A wall of force is immune to dispel magic. A greater dispel magic specifically targeting the wall of force can dispel it, but treat the wall of force’s caster level as being 5 higher than the actual caster level. A wall of force can be damaged by spells and attacks as normal, but a wall of force has hardness 30 and 300 Hit Points. Disintegrate instantly destroys a wall of force.\n" +
              "\n" +
              "Breath weapons and spells can’t pass through a wall of force in either direction, though dimension door, teleport, and similar effects can bypass the barrier. The wall blocks ethereal creatures as well as material ones (though ethereal creatures can usually circumvent the wall by going around it, through material floors and ceilings). Gaze attacks operate normally through a wall of force.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Wall of Ice",
      spellPreviewDescription = "Create a barrier made of ice.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "86",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration (creation, cold)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "anchored plane of ice, up to one 10-ft. square/level, or hemisphere of ice with a radius of up to 3 ft. + 1 ft./level; the ice is 1-inch thick/level",
      spellDuration = "1 minute/level, see text",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "An icy barrier, your choice of a plane or hemisphere, springs into existence. A plane can be oriented in any fashion, provided it's anchored. If vertical, the wall needs only a solid foundation; a horizontal or slanting wall must be anchored on two opposite sides. A hemisphere must have a solid foundation. Either form can fit into any space of surrounding nonliving material if it has sufficient area to do so. An ice wall fails to manifest in any area already occupied by a creature or object or where it will likely fall or collapse. The hemisphere version fails to manifest if it can't entirely contain a creature or object occupying the same space. Each 10-foot section of ice has 0 hardness and 3 hit points per inch of thickness. Fire deals full damage to a wall of ice. A section of wall is breached if reduced to 0 Hit Points. If a creature tries to break through the wall with a single attack, the DC for the Strength check is 20.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2","Technomancer 2","Witchwarper 2"),
      spellClassesWithLevelPreview = listOf("Myst 2","Tchn 2","WtchW 2"),
      spellTitle = "Wall of Steam",
      spellPreviewDescription = "Create a wall of fog that emits scalding steam in one direction.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "86",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "conjuration (creation, fire)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "scalding fog up to 20 ft. long/level or a ring with a radius up to 5 ft./2 levels; either form up to 20 ft. high",
      spellDuration = "concentration + 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "This spell functions as wall of fog, except you can select one side of the wall to give off searing steam. Creatures within 5 feet of this side of the wall take 2d4 fire damage, and those beyond 5 feet but within 10 feet take 1d4 fire damage. The wall deals this damage when it appears and on your turn each subsequent round. In addition, the wall deals 3d4 fire damage to any creature passing through it. If you conjure the wall so that it appears where creatures are, each creature takes damage as if passing through the wall.\n" +
              "\n" +
              "The steam can be dispersed as a wall of fog can. Also, if any 5-foot length of wall takes 10 or more cold damage in 1 round, that length crystallizes and melts away, disappearing.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 6","Witchwarper 6"),
      spellClassesWithLevelPreview = listOf("Tchn 6","WtchW 6"),
      spellTitle = "Wall of Steel",
      spellPreviewDescription = "Wall has 45 Hit Points per inch of thickness and hardness 15.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "385",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "steel wall with area up to one 5-ft. square/level; see text",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You cause a flat, vertical steel wall to spring into existence. The stress of casting this spell requires you to spend 1 Resolve Point. The wall can fit into any space of surrounding nonliving material if its area is sufficient to do so. The wall can’t be conjured so that it occupies the same space as a creature or another object. It must always be a flat plane, though you can shape its edges to fit the available space.\n" +
              "\n" +
              "A wall of steel is 4 inches thick. You can double the wall’s area by halving its thickness. Each 5-foot square of the wall has hardness 15 and 45 Hit Points per inch of thickness. A section of wall that is reduced to 0 Hit Points is breached. The DC of the Strength check for a creature to break through the wall with a single attack is 30. The wall is firmly anchored to its surroundings, and it doesn’t easily tip over; it can’t be summoned into any area where it is likely to fall or collapse.\n" +
              "\n" +
              "Like any steel wall, this wall is subject to perforation and other natural phenomena, though it doesn’t rust or corrode under typical circumstances. The metal created by this spell is not suitable for use in the creation of other objects and can’t be sold.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Tchn 4"),
      spellTitle = "Wall of Stone",
      spellPreviewDescription = "Wall has 15 Hit Points per inch of thickness and hardness 10.",
      spellSourceBookPreview = "AdvP#17",
      spellSourcePage = "58",
      spellSourceBookFull = "Adventure Path #17: Solar Strike",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "stone wall with area up to one 5-ft. square/level; see text",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You cause a flat, vertical stone wall to spring into existence. The stress of casting this spell requires you to spend 1 Resolve Point. The wall can fit into any space of surrounding nonliving material if its area is sufficient to do so. The wall can’t be conjured so that it occupies the same space as a creature or another object. It must always be a flat plane, though you can shape its edges to fit the available space.\n" +
              "\n" +
              "A wall of stone is 4 inches thick. You can double the wall’s area by halving its thickness. Each 5-foot square of the wall has hardness 10 and 15 Hit Points per inch of thickness. A section of wall that is reduced to 0 Hit Points is breached. The DC of the Strength check for a creature to break through the wall with a single attack is 25. The wall is firmly anchored to its surroundings, and it doesn’t easily tip over; it can’t be summoned into any area where it is likely to fall or collapse.\n" +
              "\n" +
              "Like any stone wall, this wall is subject to perforation and other natural phenomena, though it doesn’t rust or corrode under typical circumstances. The metal created by this spell is not suitable for use in the creation of other objects and can’t be sold.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 0","Witchwarper 0"),
      spellClassesWithLevelPreview = listOf("Tchn 0","WtchW 0"),
      spellTitle = "Wardrobe Change",
      spellPreviewDescription = "You magically alter whatever clothes you’re wearing, transforming them into a new outfit.",
      spellSourceBookPreview = "AdvP#44",
      spellSourcePage = "49",
      spellSourceBookFull = "Adventure Path #44: Allies Against the Eye pg. 49",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
      spellArea = "",
      spellEffect = "",
      spellDuration = "permanent",
      spellSavingThrow = "",
      spellResistance = "",
      spellDescriptionFull = "You magically alter whatever clothes you’re wearing, transforming them into a new outfit. Your new clothes must have a price in credits equal to or less than your original clothing. For example, if you’re wearing formal clothing with a price of 5 credits, you could transform your clothes into professional clothing or a different set of formal clothing, but you couldn’t transform your clothes into environmental or travel clothing, both of which have a price of 10 credits.\n" +
              "\n" +
              "This spell also allows you to create other minor, cosmetic changes to your appearance, such as altering your hairstyle; it doesn’t, however, disguise you, and it grants no bonus to Disguise checks. If you want to create especially fashionable clothing, or clothing especially appropriate to a given situation (such as your first encounter with a new alien species or duplicating the uniform of a security guard you wish to impersonate), your GM might ask you to attempt a Culture check with a DC based on the complexity of the clothing you want to create.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Witchwarper 9"),
      spellClassesWithLevelPreview = listOf("WtchW -"),
      spellTitle = "Warp Reality",
      spellPreviewDescription = "Alter reality to better suit you.",
      spellSourceBookPreview = "Ch Op",
      spellSourcePage = "143",
      spellSourceBookFull = "Character Operations Manual",
      spellSchool = "universal",
      spellCastingTime = "1 standard action",
      spellRange = "see text",
      spellTargets = "see text",
      spellArea = "see text",
      spellEffect = "see text",
      spellDuration = "see text",
      spellSavingThrow = "see text",
      spellResistance = "see text",
      spellDescriptionFull = "Beckoning to all realities at once, you pull in new possibilities and alter your world to suit you. A warp reality spell can produce one of the following effects.\n" +
              "\n" +
              "-Duplicate any witchwarper spell of 6th level or lower.\n" +
              "\n" +
              "-Duplicate any other spell of 5th level or lower.\n" +
              "\n" +
              "-Undo the harmful effects of certain spells, such as feeblemind.\n" +
              "\n" +
              "-Produce an effect of a power level in line with the above.\n" +
              "\n" +
              "At the GM’s discretion, warp reality can produce greater effects but can be dangerous or might have only a partial effect.\n" +
              "\n" +
              "A duplicated spell allows saving throws and spell resistance as normal, but the save DCs are as for a 7th-level spell. For other effects based on spell level, warp reality is a 9th-level spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 3","Witchwarper 3"),
      spellClassesWithLevelPreview = listOf("Myst 3","WtchW 3"),
      spellTitle = "Warpwave",
      spellPreviewDescription = "You blast your target with the ripples of myriad realities, causing it to transform in unpredictable ways that are typically temporary.",
      spellSourceBookPreview = "Alien#4",
      spellSourcePage = "87",
      spellSourceBookFull = "Alien Archive 4",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level (see text)",
      spellSavingThrow = "Fortitude negates",
      spellResistance = "yes",
      spellDescriptionFull = "You blast your target with the ripples of myriad realities, causing it to transform in unpredictable ways that are typically temporary. If the target fails its initial saving throw, roll on the Warpwave Effect table and apply the resulting condition, critical hit effect, or spell effect to the target. If the target is immune to this selected effect, roll a second time and apply the second effect instead (if it’s also immune to the second effect, it’s unaffected by the spell).\n" +
              "\n" +
              "The effects’ durations vary. Those effects marked with a superscript 1 are instantaneous, whereas those marked with a superscript 2 are effects for which the target can attempt a new saving throw at the end of each of its turns to end the effect early. For effects marked with a superscript 3, each minute an affected creature can attempt a new saving throw to end that effect early. Unannotated effects follow their normal rules for duration. Except for baleful polymorph, a warpwave’s effects cannot be dispelled, but they can be removed by break enchantment, remove affliction, and any effect that specifically removes the imposed condition.\n" +
              "\n" +
              "D12 - Warpwave Effect\n" +
              "1 - Severe wound1 (caster chooses the wound)\n" +
              "2 - Paralyzed2\n" +
              "3 - Wound1\n" +
              "4 - Baleful polymorph (3rd level)\n" +
              "5 - Bleeding, Burning, or Corrode 3d6\n" +
              "6 - Nauseated2\n" +
              "7 - Blinded2\n" +
              "8 - Staggered2\n" +
              "9 - Shaken3\n" +
              "10 - Sickened3\n" +
              "11 - Off-target3\n" +
              "12 - Dazzled3",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5"),
      spellClassesWithLevelPreview = listOf("Myst 5"),
      spellTitle = "Wave of Warning",
      spellPreviewDescription = "Attempt a ranged attack against up to three creatures to deal 10d8 nonlethal bludgeoning damage and cause them to be shaken.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "87",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "evocation (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to three creatures that are no more than 30 ft. apart from each other",
      spellArea = "",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "Will partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "Maraquoi spellcasters developed this spell to deter sapient aggressors from bloodshed. You thrust a wave of mental determination at up to three targets, attempting a ranged attack against each target's KAC to deal 10d8 nonlethal bludgeoning damage. Each creature damaged by this spell is shaken for 5 rounds, or 1 round if they succeed at a Will saving throw.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5"),
      spellTitle = "Waves of Fatigue",
      spellPreviewDescription = "Several targets become fatigued.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "385",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "cone-shaped burst",
      spellEffect = "",
      spellDuration = "instantaneous",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "Waves of negative energy render all living creatures in the spell’s area fatigued. This spell has no effect on a creature that is already fatigued.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 5","Precog 5","Witchwarper 5"),
      spellClassesWithLevelPreview = listOf("Myst 5","Prcg 5","WtchW 5"),
      spellTitle = "Weight of Ages",
      spellPreviewDescription = "Deal 10d8 damage to multiple creatures and cause them to become encumbered.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "87",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "up to one living creature/level, no two of which can be more than 30 ft. apart",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Fortitude partial, see text",
      spellResistance = "yes",
      spellDescriptionFull = "You burden the targets with all the aches, pains, and sorrows of a lifetime. The targets take 10d8 damage and become encumbered for the duration, or they become overburdened if already encumbered. Each target can attempt a Fortitude saving throw to halve the damage dealt by this spell and negate the encumbered condition.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 9"),
      spellClassesWithLevelPreview = listOf("Tchn -"),
      spellTitle = "Wish",
      spellPreviewDescription = "Alter reality to better suit you.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "385",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "universal",
      spellCastingTime = "1 standard action",
      spellRange = "see text",
      spellTargets = "see text",
      spellArea = "see text",
      spellEffect = "see text",
      spellDuration = "see text",
      spellSavingThrow = "see text",
      spellResistance = "see text",
      spellDescriptionFull = "By simply speaking aloud, you can alter reality to better suit you. Even wish, however, has its limits. A wish spell can produce any one of the following effects.\n" +
              "\n" +
              "-Duplicate any technomancer spell of 6th level or lower.\n" +
              "\n" +
              "-Duplicate any other spell of 5th level or lower.\n" +
              "\n" +
              "-Undo the harmful effects of certain spells, such as feeblemind.\n" +
              "\n" +
              "-Produce any effect whose power level is in line with the above effects.\n" +
              "\n" +
              "At the GM’s discretion, you may try to use a wish to produce greater effects than these, but doing so may be dangerous or the spell may have only a partial effect.\n" +
              "\n" +
              "A duplicated spell allows saving throws and spell resistance as normal, but the save DCs are the same as for a 7th-level spell. For the purpose of other effects that depend on spell level, wish counts as a 9th-level spell.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1","Witchwarper 1"),
      spellClassesWithLevelPreview = listOf("Myst 1","WtchW 1"),
      spellTitle = "Wisp Ally",
      spellPreviewDescription = "Create wisp of energy that shines light and distracts an enemy.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "385",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "",
      spellEffect = "one distracting, glowing servant",
      spellDuration = "1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You draw forth otherworldly energy to create a small, spherical, floating wisp that can distract your enemies in combat. This wisp can move 60 feet per round in any direction, and you can direct it as a move action on your turn. If the wisp occupies the same space as an enemy, the wisp provides your choice of either harrying fire or covering fire (see pages 246–247) against the enemy each round on your turn, and it follows that enemy within range automatically unless you direct it to change targets. The wisp is made of pure light and energy and can’t be damaged in combat, though it can be dispelled as normal.\n" +
              "\n" +
              "In addition to the function described above, the wisp sheds light in a 20-foot radius in a color of your choice (chosen when you cast the spell).",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Technomancer 4","Witchwarper 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Tchn 4","WtchW 4"),
      spellTitle = "Wonder Warp",
      spellPreviewDescription = "You alter the magical forces in the area near you into an unpredictable field of eldritch entropy, potentially causing a number of effects both positive and negatives for those who find themselves in the area",
      spellSourceBookPreview = "GaExM",
      spellSourcePage = "115",
      spellSourceBookFull = "Galaxy Exploration Manual",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "",
      spellArea = "60-ft.-radius sphere centered on you",
      spellEffect = "",
      spellDuration = "1 round/level (D)",
      spellSavingThrow = "varies, see text",
      spellResistance = "varies, see text",
      spellDescriptionFull = "You alter the magical forces in the area near you into an unpredictable field of eldritch entropy, potentially causing a number of effects both positive and negatives for those who find themselves in the area.\n" +
              "\n" +
              "When you cast this spell, and each time you start your turn during the duration of the spell, roll d% on the following table. Each time there’s a new effect, you can attempt a Will saving throw. If you succeed, you can choose the targets affected by the warped magic. Otherwise, the effect affects all creatures (and sometimes objects) in the area, including you, as described. If the effect is a spell, the spell’s normal parameters (including saves to avoid its effects) apply, except for duration.\n" +
              "\n" +
              "Each effect lasts only until you roll again, or for the duration specified in the effect, whichever is shorter (except on a result of 100; in which case you use the spell’s normal duration). Subject to the GM’s discretion, in a low-magic area, you might have to subtract 10 from your d% rolls for this spell; in a highmagic area, you might have to add 10 instead.\n" +
              "\n" +
              "D%\nEffect\n-------------------------------------\n" +
              "1\nAll magic ceases working, including for you, even if you succeed at the spell’s Will save. Unless you expend a 2nd-level spell slot at the start of your next turn, this spell ends.\n-------------------------------------\n" +
              "2–5\nDecrease the area, damage, duration, and range of spells and spell-like abilities used by half. If you failed the spell’s Will save, that includes the duration of this spell.\n-------------------------------------\n" +
              "6–10\nNo effect.\n-------------------------------------\n" +
              "11–14\nCreatures are affected by the lesser confusion spell.\n-------------------------------------\n" +
              "15–18\nCreatures become vulnerable to one energy type; roll a d10 to determine which: on a 1–2, use acid; on a 3–4, use cold; on a 5–6, use electricity; on a 7–8, use fire; on a 9–10, use sonic. If you succeed at the spell’s Will save, you can choose the type for each target instead.\n-------------------------------------\n" +
              "19–22\nA Medium aeon arrives, as if summoned by a 3rd-level summon creature (Alien Archive 144 ) spell, and it’s hostile to you. Its turn occurs just after yours. If you succeed at the spell’s Will save, the aeon remains when the spell’s effect changes.\n-------------------------------------\n" +
              "23–26\nDreamlike realities appear, customized to each creature; each creature who fails a Will save becomes fascinated.\n-------------------------------------\n" +
              "27–30\nCreatures must attempt a Fortitude save; on a failure, a random technological item they have ceases to function. A technological construct that fails is instead staggered.\n-------------------------------------\n" +
              "31–34\nYou can read the surface thoughts of creatures in the area as if they were affected by the third round of the detect thoughts spell.\n-------------------------------------\n" +
              "35–38\nThe area becomes zero gravity (Core Rulebook 402).\n-------------------------------------\n" +
              "39–42\nCreatures are affected by a 1st-level baleful polymorph (Alien Archive 2 147) spell.\n-------------------------------------\n" +
              "43–46\nCreatures are affected by the grease spell.\n-------------------------------------\n" +
              "47–50\nEach creature is affected by the force blast spell; you can attempt the additional bull rush combat maneuver granted by the spell.\n-------------------------------------\n" +
              "51–54\nCountless Diminutive creatures appear flying in the air and scrambling on the ground, making the area difficult terrain. To move at more than half speed in the area, a creature must succeed at a DC 15 Acrobatics check.\n-------------------------------------\n" +
              "55–58\nChaotic illusions render creatures dazzled.\n-------------------------------------\n" +
              "59–62\nCreatures and objects become invisible.\n-------------------------------------\n" +
              "63–66\nEach creature switches positions with another randomly determined creature (no save). No creature arrives in a place immediately hazardous to it, instead appearing in the closest safe space.\n-------------------------------------\n" +
              "67–70\nCreatures gain a fly speed of 30 feet with average maneuverability. If a creature is airborne when the effect ends, it falls.\n-------------------------------------\n" +
              "71–74\nA random Medium creature arrives, as if summoned by a 3rd-level summon creature (Alien Archive 144 ) spell. If you succeed at wonder warp’s Will save, the creature acts as if you summoned it. Otherwise, it’s hostile to everyone.\n-------------------------------------\n" +
              "75–78\nCreatures gain resistance 5 to one energy type; roll a d10 to determine which: on a 1–2, use acid; on a 3–4, use cold; on a 5–6, use electricity; on a 7–8, use fire; on a 9–10, use sonic. If you succeed at the spell’s Will save, you can choose the type for each target instead.\n-------------------------------------\n" +
              "79–82\nEach creature regains 2d4 Hit Points or Stamina Points (creature’s choice).\n-------------------------------------\n" +
              "83–86\nYou cast magic missile without expending a spell slot. If you take (and have taken) no other actions this turn, you can fire a third missile.\n-------------------------------------\n" +
              "87–90\nYou create one effect of the prescience (Character Operations Manual 139 ) spell.\n-------------------------------------\n" +
              "91–95\nIncrease the area, damage, duration, and range of spells and spell-like abilities used by 50%. That doesn’t include the duration of this spell.\n-------------------------------------\n" +
              "96–99\nRoll two effects, treating 1 and 96–100 as no effect. Each effect affects only targets of your choice.\n-------------------------------------\n" +
              "100\nYou can cast any 1st- or 2nd-level spell you know without expending a spell slot. You must abide by the spell’s normal parameters, and it lasts for its normal duration.\n",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4"),
      spellTitle = "X-Ray Vision",
      spellPreviewDescription = "Grant a creature x-ray vision.",
      spellSourceBookPreview = "Glt Mgc",
      spellSourcePage = "87",
      spellSourceBookFull = "Galactic Magic",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
      spellArea = "",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You confer upon the target sense through (vision) with a range of 60 feet. This ability is blocked by materials one-fifth as dense as those that block normal sense through (2 feet of wood or plastic, 1 foot of stone, 2 inches of common metal, or 1 inch of lead or any starmetal), and it limits the target to black-and-white vision while in use. The target doesn't gain the benefit of any other special visual senses (such as lowlight vision) while using x-ray vision, and the target can't attempt sight-based Perception checks beyond 60 feet.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 2"),
      spellClassesWithLevelPreview = listOf("Myst 2"),
      spellTitle = "Zone of Truth",
      spellPreviewDescription = "Creatures within range can’t lie.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "385",
      spellSourceBookFull = "Core Rulebook",
      spellSchool = "enchantment (compulsion, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "",
      spellArea = "20-ft.-radius emanation",
      spellEffect = "",
      spellDuration = "1 minute/level",
      spellSavingThrow = "Will negates",
      spellResistance = "yes",
      spellDescriptionFull = "Creatures within the emanation area can’t speak any deliberate and intentional lies. Each potentially affected creature can attempt a Will saving throw to avoid the effect when the spell is cast or when that creature first enters the emanation area. Affected creatures are aware of this enchantment, and they can therefore avoid answering questions to which they would normally respond with a lie, or they can be evasive as long as they remain within the boundaries of the truth. Creatures who leave the area are free to speak as they choose.",
  )
)