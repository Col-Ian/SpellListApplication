package com.example.spelllistapplication.data.allspellslist


//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "",
//      spellSourcePage = "",
//      spellSourceBookFull = "",
//      spellSchool = "",
//      spellCastingTime = "",
//      spellRange = "",
//      spellTargets = "",
//      spellDuration = "",
//      spellSavingThrow = "",
//      spellResistance = "",
//      spellDescriptionFull = "",
//  )

// List to pull data from
// For our ID, we will be using the spellTitle


var SpellData = listOf(
    SpellDataModel(
        spellClassWithLevel = listOf("Mystic 0","Technomancer 0","Witchwarper 0"),
        spellClassesWithLevelPreview = listOf("Myst 0","Tchn 0","WtchW 0"),
        spellTitle = "Daze",
        spellPreviewDescription = "Humanoid creature of CR 3 or lower is dazed.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "347",
        spellSourceBookFull = "Starfinder Core Rulebook pg. 347",
        spellSchool = "enchantment (compulsion, mind-affecting)",
        spellCastingTime = "1 standard action",
        spellRange = "close (25 ft. + 5 ft./2 levels)",
        spellTargets = "one humanoid creature of CR 3 or lower",
        spellDuration = "1 round",
        spellSavingThrow = "Will negates",
        spellResistance = "yes",
        spellDescriptionFull = "This spell short-circuits the mind of a humanoid creature with a CR of 3 or lower so that it is dazed (unable to take actions, but taking no penalty to AC). Humanoids of CR 4 or higher are not affected. After a creature has been dazed by this spell, it is immune to it for 1 minute.",
    ), SpellDataModel(
        spellClassWithLevel = listOf("Mystic"),
        spellClassesWithLevelPreview = listOf("Myst"),
        spellTitle = "Detect Magic",
        spellPreviewDescription = "Detect spells and magic items within 60 feet.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "348",
        spellSourceBookFull = "Starfinder Core Rulebook pg. 348",
        spellSchool = "divination",
        spellCastingTime = "1 standard action",
        spellRange = "60 ft.",
        spellTargets = "(Area) cone-shaped emanation",
        spellDuration = " concentration, up to 1 minute/level",
        spellSavingThrow = "none",
        spellResistance = "no",
        spellDescriptionFull = "You detect all magic spells, effects, items, and objects (including those on or affecting creatures you can see), as well as hybrid items, in the area. You can’t detect magical traps in this way, as they are created with additional magic that wards them from this common spell. Each round you concentrate on the same area, you can determine if one magic source you detect is from a spell, magic item, or other effect, and the caster level (or item level) of the effect. You can’t determine if there are magic sources in areas you can’t see, or if there was a magic source in an area at one time but that has since expired.",
    ), SpellDataModel(
        spellClassWithLevel = listOf("Mystic"),
        spellClassesWithLevelPreview = listOf("Myst"),
        spellTitle = "Stabilize",
        spellPreviewDescription = "Cause a dying creature to stabilize.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "378",
        spellSourceBookFull = "Starfinder Core Rulebook pg. 378",
        spellSchool = "conjuration (healing)",
        spellCastingTime = "1 standard action",
        spellRange = "close (25 ft. + 5 ft./2 levels)",
        spellTargets = "one living creature",
        spellDuration = "instantaneous",
        spellSavingThrow = "Will negates (harmless)",
        spellResistance = "yes (harmless)",
        spellDescriptionFull = "If the target of this spell has 0 Hit Points and is dying, it automatically stabilizes. If the creature later takes damage, it is no longer stable.",
    ), SpellDataModel(
        spellClassWithLevel = listOf("Mystic"),
        spellClassesWithLevelPreview = listOf("Myst"),
        spellTitle = "Telepathic Message",
        spellPreviewDescription = "Send a short telepathic message and hear simple telepathic replies.",
        spellSourceBookPreview = "CRB",
        spellSourcePage = "381",
        spellSourceBookFull = "Starfinder Core Rulebook pg. 381",
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
        spellSourceBookFull = "Starfinder Core Rulebook pg. 365",
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
        spellSourceBookFull = "Starfinder Core Rulebook pg. 367",
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
    )
)