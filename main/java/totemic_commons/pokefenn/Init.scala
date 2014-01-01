package totemic_commons.pokefenn

import totemic_commons.pokefenn.block.ModBlocks
import totemic_commons.pokefenn.item.ModItems
import cpw.mods.fml.common.FMLCommonHandler
import totemic_commons.pokefenn.configuration.ConfigurationHandler
import java.io.File
import totemic_commons.pokefenn.lib.Reference
import totemic_commons.pokefenn.fluid.ModFluids
import cpw.mods.fml.common.network.NetworkRegistry
import totemic_commons.pokefenn.CommonProxy
import totemic_commons.pokefenn.recipe.{TotemicRecipes, ChlorophyllSolidifierRecipes}
import totemic_commons.pokefenn.util.OreDictionaryTotemic

/**
 * Created with IntelliJ IDEA.
 * User: Pokefenn
 * Date: 18/12/13
 * Time: 15:51

 */
object PreInit {

    def init() {


        Totemic.logger.setParent(FMLCommonHandler.instance.getFMLLogger)

        Totemic.logger.info("Totemic is Loading")

        //Initiates fluids into the game
        ModFluids.init

        //Initiates totemic blocks into the game
        ModBlocks.init

        //Initiates the mod items into the game
        ModItems.init

    }

}


object Init {

    def init() {

        Totemic.logger.info("Totemic is entering its Initlisation stage")

        OreDictionaryTotemic.init()

        TotemicRecipes.init()

        NetworkRegistry.instance.registerGuiHandler(Totemic.instance, Totemic.proxy)

        Totemic.proxy.registerTileEntities()

        ChlorophyllSolidifierRecipes.addRecipes()


    }


}


object PostInit {

    def init() {


    }


}