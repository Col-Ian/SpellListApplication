package com.example.spelllistapplication.data.allspellslist


//, SpellDataModel(
//      spellClassWithLevel = listOf("Mystic 0","Precog 0","Technomancer 0","Witchwarper 0"),
//      spellClassesWithLevelPreview = listOf("Myst 0","Prcg 0","Tchn 0","WtchW 0"),
//      spellTitle = "",
//      spellPreviewDescription = "",
//      spellSourceBookPreview = "CRB","Ch Op","Glt Mgc","AdvP#","NearS","DrftCs","Armory","Int Sp","Alien#","GaExM","Ports","PactW",
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
              "This spell has no effect if cast on powered armor with a depleted battery or powered armor of an item level that exceeds your caster level.\n",
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
      spellDescriptionFull = "As the elves of yore, you attune the target to the surrounding environment or foresee their needs there, altering their coloration and movement to better match the biome (Core Rulebook pg. 396) within which you cast this spell. The target ignores nonmagical difficult terrain typical to that biome and gains a +2 insight bonus to Stealth checks there as well as Survival checks for the tasks endure severe weather, live off the land, and orienteering in that biome.\n",
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
              "D6\tINCLINATION\n" +
              "1–2\tAffection: Cats purr, nuzzle, and perch atop one creature in the emanation. The creature can reroll a saving throw they just failed against a fear, mind-affecting, or pain effect and use the second result.\n" +
              "3–4\tMischief: Cats crowd, distract, and cling to one creature in the emanation, successfully providing your choice of covering fire or harrying fire.\n" +
              "5–6\tSpite: Cats claw and bite one creature in the emanation. Make a melee attack against KAC, for which you can use your caster level in place of your base attack bonus and your spellcasting ability modifier in place of your Strength modifier. The attack deals 4d6 slashing damage.",
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
              "D%     : Behavior\n" +
              "1–25   : Act normally.\n" +
              "26–50  : Do nothing but babble incoherently.\n" +
              "51–75  : Deal 1d8 + Str modifier damage to self with item in hand.\n" +
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
              "D%     : Behavior\n" +
              "1–25   : Act normally.\n" +
              "26–50  : Do nothing but babble incoherently.\n" +
              "51–75  : Deal 1d8 + Str modifier damage to self with item in hand.\n" +
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
              "Vegetable matter             : 2 hours/level\n" +
              "Stone, crystal, base metals  : 1 hour/level\n" +
              "Precious metals              : 20 minutes/level\n" +
              "Gems                         : 10 minutes/level\n" +
              "Rare metals*                 : 1 round/level\n" +
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
      spellDescriptionFull = "This spell causes living creatures in the area to fall into a magical sleep, gaining the asleep condition (except normal noise doesn’t wake up the sleeping creatures). Creatures with the lowest CR are affected first. Among creatures of equal CR, those who are closest to the spell’s point of origin are affected first. Deep slumber doesn’t affect unconscious creatures, constructs, or undead creatures.\n",
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
      spellDescriptionFull = "The target becomes infused with the resilience of a defrex and sprouts bristling spines. It gains DR/— equal to your caster level, and any creature adjacent to the target that hits it with a melee attack takes piercing damage equal to your caster level.\n",
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
      spellDescriptionFull = "Countermeasures on the target computer are suppressed. If you trigger any suppressed countermeasure, you are still alerted that you have done so, but it activates only after the spell ends.\n",
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
      spellDescriptionFull = "Drawing on the magic of the kasathan Pillar of the Homeworld or similar homey memories, you overwhelm the target with pleasant visions and thoughts of their home, whatever that means to them. If the target fails the saving throw, they become fascinated for the duration. If the target saves, they're fascinated for 1 round instead.\n",
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
  )
)