package com.example.spelllistapplication.data.allspellslist


//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "CRB","Ch Op","Glt Mgc","AdvP#","NearS","DrftCs","Armory","Int Sp","Alien#","GaExM","Ports",
//      spellSourcePage = "",
//      spellSourceBookFull = "Adventure Path",
//      spellSchool = "",
//      spellCastingTime = "",
//      spellRange = "",
//      spellTargets = "",
//      spellDuration = "",
//      spellSavingThrow = "none",
//      spellResistance = "no",
//      spellDescriptionFull = "",
//  )

// List to pull data from


var SpellData = listOf(
    SpellDataModel(
        spellClassWithLevel = listOf("Mystic 0","Technomancer 0","Witchwarper 0"),
        spellClassesWithLevelPreview = listOf("Myst 0","Tchn 0","WtchW 0"),
        spellTitle = "Daze",
        spellPreviewDescription = "Humanoid creature of CR 3 or lower is dazed.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "347",
        spellSourceBookFull = "Core Rulebook pg. 347",
        spellSchool = "enchantment (compulsion, mind-affecting)",
        spellCastingTime = "1 standard action",
        spellRange = "close (25 ft. + 5 ft./2 levels)",
        spellTargets = "one humanoid creature of CR 3 or lower",
        spellDuration = "1 round",
        spellSavingThrow = "Will negates",
        spellResistance = "yes",
        spellDescriptionFull = "This spell short-circuits the mind of a humanoid creature with a CR of 3 or lower so that it is dazed (unable to take actions, but taking no penalty to AC). Humanoids of CR 4 or higher are not affected. After a creature has been dazed by this spell, it is immune to it for 1 minute.",
    ), SpellDataModel(
        spellClassWithLevel = listOf("Mystic 0"),
        spellClassesWithLevelPreview = listOf("Myst 0"),
        spellTitle = "Detect Magic",
        spellPreviewDescription = "Detect spells and magic items within 60 feet.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "348",
        spellSourceBookFull = "Core Rulebook pg. 348",
        spellSchool = "divination",
        spellCastingTime = "1 standard action",
        spellRange = "60 ft.",
        spellTargets = "(Area) cone-shaped emanation",
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
        spellSourceBookFull = "Core Rulebook pg. 378",
        spellSchool = "conjuration (healing)",
        spellCastingTime = "1 standard action",
        spellRange = "close (25 ft. + 5 ft./2 levels)",
        spellTargets = "one living creature",
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
        spellSourceBookFull = "Core Rulebook pg. 381",
        spellSchool = "divination (language-dependent, mind-affecting)",
        spellCastingTime = "1 standard action",
        spellRange = "medium (100 ft. + 10 ft./level)",
        spellTargets = "up to one creature/level",
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
        spellSourceBookFull = "Core Rulebook pg. 365",
        spellSchool = "divination (mind-affecting)",
        spellCastingTime = "1 standard action",
        spellRange = "close (25 ft. + 5 ft./2 levels)",
        spellTargets = "one creature",
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
        spellSourceBookFull = "Core Rulebook pg. 367",
        spellSchool = "conjuration (healing)",
        spellCastingTime = "1 standard action",
        spellRange = "touch",
        spellTargets = "one living creature",
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
        spellSourceBookFull = "Galactic Magic pg. 67",
        spellSchool = "transmutation",
        spellCastingTime = "1 standard action",
        spellRange = "personal",
        spellTargets = "",
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
      spellSourceBookFull = "Adventure Path #29: The Cradle Infestation pg. 44",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "1 barathu",
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
      spellSourceBookFull = "Galactic Magic pg. 67",
      spellSchool = "conjuration (acid, creation)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "20-ft.-radius spread",
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
      spellSourceBookFull = "Character Operations Manual pg. 133",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "(Area) cylinder (20-ft. radius, 40 ft. high)",
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
      spellSourceBookFull = "Near Space pg. 154",
      spellSchool = "conjuration (acid)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "(Area) 10-ft.-radius spread",
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
      spellSourceBookFull = "Galactic Magic pg. 67",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to three creatures",
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
      spellSourceBookFull = "Galactic Magic pg. 67",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one object",
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
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space pg. 51",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Drift Crisis pg. 139",
      spellSchool = "conjuration (teleportation)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "personal",
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
      spellSourceBookFull = "Adventure Path #23: Hive of Minds pg. 50",
      spellSchool = "divination",
      spellCastingTime = "1 round",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Galactic Magic pg. 67",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "(Area) 20-ft.-radius emanation",
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
      spellSourceBookFull = "Adventure Path  #23: Hive of Minds pg. 50",
      spellSchool = "necromancy",
      spellCastingTime = "1 hour",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Adventure Path #30: Puppets Without Strings pg. 52",
      spellSchool = "divination",
      spellCastingTime = "1 round",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy pg. 51",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "(Area) 20-ft.-radius burst",
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
      spellSourceBookFull = "Adventure Path #25: The Chimera Mystery pg. 45",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one corpse",
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
      spellSourceBookFull = "Near Space pg. 155",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one weapon with at least one weapon fusion or one suit of armor with at least one armor upgrade",
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
      spellSourceBookFull = "Adventure Path #27: Deceivers’ Moon pg. 45",
      spellSchool = "transmutation (polymorph)",
      spellCastingTime = "1 standard action; see text",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Galactic Magic pg. 68",
      spellSchool = "conjuration (summoning)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "immobile object",
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
      spellSourceBookFull = "Armory pg. 156",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "one unattended suit of armor",
      spellDuration = "concentration, up to 1 round/level",
      spellSavingThrow = "none",
      spellResistance = "no",
      spellDescriptionFull = "You temporarily infuse a suit of armor with a magic force that allows it to move on its own and that directs its mechanisms. When you cast this spell, the armor acts and responds to your mental control for as long as you concentrate. Each round on your turn, the armor can perform either a move action or a standard action to attack. The armor can move up to 30 feet (or its listed speed using any of its available modes of movement, if powered armor or containing an armor upgrade that alters movement). When the armor attacks, it can either make an unarmed attack, dealing 4d8 + your caster level bludgeoning damage (or the listed damage plus its Strength modifier, for powered armor) or make an attack with any of the weapons mounted in its weapon slots or weapons with the integrated special property installed in its upgrade slots (if any); this deals the weapon’s base damage for ranged attacks and the weapon’s base damage plus the armor’s Strength modifier for melee attacks. The armor has a bonus to attacks equal to 6 + your caster level. If the armor has no listed Strength score, it can apply a Strength bonus equal to your caster level.\n" +
              "\n" +
              "Should the animated armor be attacked, its EAC and KAC are equal to 10 + the EAC and KAC bonus the armor provides. It uses your saving throw bonuses when it is the target of spells and other targeted effects, and it has the typical hardness and Hit Points for an item of its level. For the purpose of spells and effects that target the armor, it is treated as a construct with the technological and magical subtypes while the spell lasts.\n" +
              "\n" +
              "This spell has no effect if cast on powered armor with a depleted battery or powered armor of an item level that exceeds your caster level.\n",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 4","Precog 4","Technomancer 4"),
      spellClassesWithLevelPreview = listOf("Myst 4","Prcg 4","Tchn 4"),
      spellTitle = "Animate Dead",
      spellPreviewDescription = "Create controlled undead creatures out of target corpses.",
      spellSourceBookPreview = "CRB",
      spellSourcePage = "340",
      spellSourceBookFull = "Core Rulebook pg. 340",
      spellSchool = "necromancy",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one or more corpses",
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
      spellSourceBookFull = "Galactic Magic pg. 68",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "(Area) 20-ft.-radius burst",
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
      spellSourceBookFull = "Character Operations Manual pg. 133",
      spellSchool = "abjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "(Area) 10-ft.-radius spread; see text",
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
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy pg. 51",
      spellSchool = "transmutation (water)",
      spellCastingTime = "1 standard action; see text",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Core Rulebook pg. 340",
      spellSchool = "divination (scrying)",
      spellCastingTime = "10 minutes",
      spellRange = "planetary",
      spellTargets = "(Effect) magical sensor",
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
      spellSourceBookFull = "Core Rulebook pg. 340",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Adventure Path #32: The Starstone Blockade pg. 53",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one computer or secure data module",
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
      spellSourceBookFull = "Core Rulebook pg. 340",
      spellSchool = "evocation (electricity)",
      spellCastingTime = "1 standard action",
      spellRange = "120 ft.",
      spellTargets = "(Area) line-shaped burst",
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
      spellSourceBookFull = "Interstellar Species pg. 115",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "(Area) 20-ft.-line",
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
      spellSourceBookFull = "Adventure Path #29: The Cradle Infestation pg. 44",
      spellSchool = "enchantment (emotion, fear, mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "",
      spellTargets = "all creatures within 30 feet",
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
      spellSourceBookFull = "Core Rulebook pg. 340",
      spellSchool = "divination",
      spellCastingTime = "1 minute",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Galactic Magic pg. 68",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one vehicle",
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
      spellSourceBookFull = "Character Operations Manual pg. 133",
      spellSchool = "transmutation",
      spellCastingTime = "10 minutes",
      spellRange = "touch",
      spellTargets = "one computer",
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
      spellSourceBookFull = "Alien Archive 2 pg. 147",
      spellSchool = "transmutation (polymorph)",
      spellCastingTime = "1 round",
      spellRange = "close",
      spellTargets = "one creature",
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
      spellSourceBookFull = "Alien Archive 2 pg. 148",
      spellSchool = "transmutation (polymorph)",
      spellCastingTime = "1 round",
      spellRange = "close",
      spellTargets = "up to four creatures, no two of which can be more than 30 ft. apart",
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
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space pg. 51",
      spellSchool = "illusion (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
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
      spellSourceBookFull = "Core Rulebook pg. 341",
      spellSchool = "transmutation",
      spellCastingTime = "1 round",
      spellRange = "touch",
      spellTargets = "at least 1 bulk of inert electronic equipment; see text",
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
      spellSourceBookFull = "Galactic Magic pg. 68",
      spellSchool = "evocation (sonic)",
      spellCastingTime = "1 standard action",
      spellRange = "15 ft.",
      spellTargets = "(Area) cone-shaped burst",
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
      spellSourceBookFull = "Adventure Path #20: The Last Refuge pg. 45",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "60 ft.",
      spellTargets = "two creatures",
      spellDuration = "10 minutes/level (D)",
      spellSavingThrow = "Will negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "You create a strong temporary psychic link between two creatures that allows them to act almost as one. This spell works like lesser battlemind link, but the enhancement bonus to initiative rolls is +4, and the spell ends if the targets are more than 500 feet apart, rather than 200 feet apart. In addition, if the targets threaten the same enemy, they are considered to be flanking that foe regardless of their actual positions. When one of the targets hits a foe with a ranged attack, they can, as a reaction, apply the effects of covering fire or harrying fire against that foe for the other target of this spell. Finally, each target gains a +4 enhancement bonus to attacks of opportunity if they both attack the same creature due to the same triggering action on that creature’s part.",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Mystic 1",),
      spellClassesWithLevelPreview = listOf("Myst 1"),
      spellTitle = "Battlemind Link, Lesser",
      spellPreviewDescription = "Creates a psychic link that gives a bonus to initiative.",
      spellSourceBookPreview = "AdvP#20",
      spellSourcePage = "45",
      spellSourceBookFull = "Adventure Path #20: The Last Refuge pg. 45",
      spellSchool = "divination (mind-affecting)",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "two creatures",
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
      spellSourceBookFull = "Adventure Path #48: Masters of Time and Space pg. 51",
      spellSchool = "enchantment (mind-affecting, sense-dependent)",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "(Area) 20-ft.-radius spread",
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
      spellSourceBookFull = "Adventure Path #29: The Cradle Infestation pg. 45",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "1 creature",
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
      spellSourceBookFull = "Core Rulebook pg. 341",
      spellSchool = "necromancy (curse)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature",
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
      spellSourceBookFull = "Adventure Path #23: Hive of Minds pg. 51",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Adventure Path #36: Professional Courtesy pg. 51",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "(Area) 30-ft.-diameter sphere",
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
      spellSourceBookFull = "Galactic Magic pg. 68",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
      spellDuration = "1 hour/level (D)",
      spellSavingThrow = "Fortitude negates (harmless)",
      spellResistance = "yes (harmless)",
      spellDescriptionFull = "As the elves of yore, you attune the target to the surrounding environment or foresee their needs there, altering their coloration and movement to better match the biome (Core Rulebook pg. 396) within which you cast this spell. The target ignores nonmagical difficult terrain typical to that biome and gains a +2 insight bonus to Stealth checks there as well as Survival checks for the tasks endure severe weather, live off the land, and orienteering in that biome.\n",
  ), SpellDataModel(
      spellClassWithLevel = listOf("Technomancer 2"),
      spellClassesWithLevelPreview = listOf("Tchn 2"),
      spellTitle = "Biomechanical Symbiosis",
      spellPreviewDescription = "You energize the target’s natural healing.",
      spellSourceBookPreview = "Int Sp",
      spellSourcePage = "111",
      spellSourceBookFull = "Interstellar Species pg. 111",
      spellSchool = "conjuration (healing)",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "one creature with a biotech, cybernetic, or magitech augmentation",
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
      spellSourceBookFull = "Adventure Path #20: The Last Refuge pg. 45",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Adventure Path #20: The Last Refuge pg. 45",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "0 ft.",
      spellTargets = "(Effect) living taclash",
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
      spellSourceBookFull = "Adventure Path #20: The Last Refuge pg. 45",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 standard action",
      spellRange = "0 ft.",
      spellTargets = "(Effect) living taclash",
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
      spellSourceBookFull = "Character Operations Manual pg. 133",
      spellSchool = "conjuration (creation)",
      spellCastingTime = "1 round",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "(Effect) wall up to 20 feet high, 20 feet wide, and 5 feet thick",
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
      spellSourceBookFull = "Galactic Magic pg. 68",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one living creature",
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
      spellSourceBookFull = "Adventure Path #35: Merchants of the Void pg. 54",
      spellSchool = "illusion",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "two creatures; see text",
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
      spellSourceBookFull = "Adventure Path #12: Heart of Night pg. 53",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "touch",
      spellTargets = "willing creature touched",
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
      spellSourceBookFull = "Core Rulebook pg. 341",
      spellSchool = "abjuration",
      spellCastingTime = "1 minute",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "up to one creature per level, no two of which can be more than 30 ft. apart",
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
      spellSourceBookFull = "Galactic Magic pg. 69",
      spellSchool = "divination (language-dependent, mind-affecting)",
      spellCastingTime = "1 round; see text",
      spellRange = "(Area) emanation with a radius of 100 ft., centered on you; see text",
      spellTargets = "all creatures",
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
      spellSourceBookFull = "Adventure Path #25: The Chimera Mystery pg. 45",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one creature",
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
      spellSourceBookFull = "Adventure Path #18: Assault on the Crucible pg. 53",
      spellSchool = "conjuration (creation, fire)",
      spellCastingTime = "1 standard action",
      spellRange = "medium (100 ft. + 10 ft./level)",
      spellTargets = "Area 20-ft.-radius spread",
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
      spellSourceBookFull = "Galactic Magic pg. 69",
      spellSchool = "divination",
      spellCastingTime = "1 standard action",
      spellRange = "close (25 ft. + 5 ft./2 levels)",
      spellTargets = "one computer, control panel, datapad, or similar digital device",
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
      spellSourceBookFull = "Galaxy Exploration Manual pg. 75",
      spellSchool = "transmutation",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "one living creature",
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
      spellSourceBookFull = "Core Rulebook pg. 342",
      spellSchool = "evocation",
      spellCastingTime = "1 standard action",
      spellRange = "long (400 ft. + 40 ft./level)",
      spellTargets = "(Area) cylinder (20-ft. radius, 40 ft. high)",
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
      spellSourceBookFull = "Galactic Magic pg. 69",
      spellSchool = "enchantment",
      spellCastingTime = "1 standard action",
      spellRange = "personal",
      spellTargets = "",
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
      spellSourceBookFull = "Ports of Call pg. 123",
      spellSchool = "conjuration",
      spellCastingTime = "1 standard action",
      spellRange = "30 ft.",
      spellTargets = "(Area) spherical emanation",
      spellDuration = "1 minute or until expended (D)",
      spellSavingThrow = "none",
      spellResistance = "yes",
      spellDescriptionFull = "You conjure a pack of Tiny whimsical cats that scamper and perch within 30 feet of you wherever you move. These adorable felines are only semi-real and are immune to damage. The cats appear with their own inclinations and don’t meaningfully heed your other instructions: roll 1d6 five times on the table below to determine these inclinations. This can result in multiple inclinations of the same type. As a move action, you can expend one of these inclinations and issue a command to the cats as a move action (for mischief or spite inclinations) or a reaction (for affection), causing the cats to perform the associated action once. Once you’ve expended all of the inclinations, the cats disappear.\n" +
              "D6\tINCLINATION\n" +
              "1–2\tAffection: Cats purr, nuzzle, and perch atop one creature in the emanation. The creature can reroll a saving throw they just failed against a fear, mind-affecting, or pain effect and use the second result.\n" +
              "3–4\tMischief: Cats crowd, distract, and cling to one creature in the emanation, successfully providing your choice of covering fire or harrying fire.\n" +
              "5–6\tSpite: Cats claw and bite one creature in the emanation. Make a melee attack against KAC, for which you can use your caster level in place of your base attack bonus and your spellcasting ability modifier in place of your Strength modifier. The attack deals 4d6 slashing damage.",
  )
//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "CRB","Ch Op","Glt Mgc","AdvP#","NearS","DrftCs","Armory","Int Sp","Alien#",
//      spellSourcePage = "",
//      spellSourceBookFull = "Adventure Path",
//      spellSchool = "",
//      spellCastingTime = "",
//      spellRange = "",
//      spellTargets = "",
//      spellDuration = "",
//      spellSavingThrow = "none",
//      spellResistance = "no",
//      spellDescriptionFull = "",
//  )
//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "CRB","Ch Op","Glt Mgc","AdvP#","NearS","DrftCs","Armory","Int Sp","Alien#",
//      spellSourcePage = "",
//      spellSourceBookFull = "Adventure Path",
//      spellSchool = "",
//      spellCastingTime = "",
//      spellRange = "",
//      spellTargets = "",
//      spellDuration = "",
//      spellSavingThrow = "none",
//      spellResistance = "no",
//      spellDescriptionFull = "",
//  )
//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "CRB","Ch Op","Glt Mgc","AdvP#","NearS","DrftCs","Armory","Int Sp","Alien#",
//      spellSourcePage = "",
//      spellSourceBookFull = "Adventure Path",
//      spellSchool = "",
//      spellCastingTime = "",
//      spellRange = "",
//      spellTargets = "",
//      spellDuration = "",
//      spellSavingThrow = "none",
//      spellResistance = "no",
//      spellDescriptionFull = "",
//  )
//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "CRB","Ch Op","Glt Mgc","AdvP#","NearS","DrftCs","Armory","Int Sp","Alien#",
//      spellSourcePage = "",
//      spellSourceBookFull = "Adventure Path",
//      spellSchool = "",
//      spellCastingTime = "",
//      spellRange = "",
//      spellTargets = "",
//      spellDuration = "",
//      spellSavingThrow = "none",
//      spellResistance = "no",
//      spellDescriptionFull = "",
//  )
//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "CRB","Ch Op","Glt Mgc","AdvP#","NearS","DrftCs","Armory","Int Sp","Alien#",
//      spellSourcePage = "",
//      spellSourceBookFull = "Adventure Path",
//      spellSchool = "",
//      spellCastingTime = "",
//      spellRange = "",
//      spellTargets = "",
//      spellDuration = "",
//      spellSavingThrow = "none",
//      spellResistance = "no",
//      spellDescriptionFull = "",
//  )
//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "CRB","Ch Op","Glt Mgc","AdvP#","NearS","DrftCs","Armory","Int Sp","Alien#",
//      spellSourcePage = "",
//      spellSourceBookFull = "Adventure Path",
//      spellSchool = "",
//      spellCastingTime = "",
//      spellRange = "",
//      spellTargets = "",
//      spellDuration = "",
//      spellSavingThrow = "none",
//      spellResistance = "no",
//      spellDescriptionFull = "",
//  )
)



