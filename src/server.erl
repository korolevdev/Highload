-module(server).

-behaviour(gen_server).

-export([start_link/0, code_change/3, handle_call/3, handle_cast/2, handle_info/2, init/1, terminate/2]).


start_link() -> gen_server:start_link({local, ?SERVER}, ?MODULE, [], []).

init([]) -> {ok, State}.

handle_cast(_Msg, State) -> {noreply, State}.
handle_call(_Request, _From, State) -> {noreply, State}.
handle_info(_Info, State) ->  {noreply, State}.
terminate(_Reason, _State) -> ok.
code_change(_OldVsn, State, _Extra) -> {ok, State}.